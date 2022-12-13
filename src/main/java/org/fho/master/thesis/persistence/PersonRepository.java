package org.fho.master.thesis.persistence;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import io.quarkus.panache.common.Parameters;
import io.quarkus.runtime.Startup;
import org.fho.master.thesis.persistence.domain.PersonBo;
import org.fho.master.thesis.persistence.multitenancy.MultiTenantRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class PersonRepository extends MultiTenantRepository<PersonBo> {

    @ApplicationScoped @Startup
    static class Delegate implements PanacheRepositoryBase<PersonBo, String> {}

    public PersonRepository(Delegate delegate) {
        super(delegate);
    }

    public List<PersonBo> findByFirstName(String firstName) {
        return find("firstName", firstName).list();
    }

    public List<PersonBo> findByLastName(String lastName) {
        return find("lastName = :lastName",
                Parameters.with("lastName", lastName)
                        .map()).list();
    }

    public long countByLastName(String lastName) {
        return count("lastName = :lastName",
                Parameters.with("lastName", lastName)
                        .map());
    }

}

