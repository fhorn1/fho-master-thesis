package org.fho.master.thesis.persistence;

import io.quarkus.runtime.Quarkus;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.fho.master.thesis.crossfunctional.HttpInterceptor;
import org.fho.master.thesis.persistence.domain.AddressBo;
import org.fho.master.thesis.persistence.domain.PersonBo;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
@Slf4j
public class DatabaseProvisioning {
    @ConfigProperty(name = "database.provisioning.goals", defaultValue = " ")
    String goals;

    @Inject
    PersonRepository personRepository;

    public void run() {
        if (goals.contains("-import-demo-data")) {
            log.info("Importing demo data ...");
            importDemoData();
        }

        if (goals.contains("-terminate")) {
            log.info("Terminating app ...");
            Quarkus.asyncExit();
        }
    }

    public void importDemoData() {
        if (personRepository.findAll().list().isEmpty()) {
            HttpInterceptor.setTenantId("0");
            insertData();
            HttpInterceptor.setTenantId("5a2f");
            insertData();        }
    }

    private void insertData() {
        personRepository.save(PersonBo.builder()
                .firstName("Homer").lastName("Simpson")
                .address(createAddress("Evergreen Terrace 1"))
                .build());

        personRepository.save(PersonBo.builder()
                .firstName("Bart").lastName("Simpson")
                .address(createAddress("Everblue Terrace 1"))
                .build());

        personRepository.save(PersonBo.builder()
                .firstName("Monty").lastName("Burns")
                .address(createAddress("Monty Mansion"))
                .build());
    }

    private AddressBo createAddress(String street) {
        return AddressBo.builder()
                .street(street).city("Springfield " + HttpInterceptor.getTenantId())
                .build();
    }

}
