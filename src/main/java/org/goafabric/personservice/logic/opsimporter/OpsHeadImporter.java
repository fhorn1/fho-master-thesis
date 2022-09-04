package org.goafabric.personservice.logic.opsimporter;

import lombok.NonNull;
import org.goafabric.model.OpsImportedTuple;
import org.goafabric.model.VersionHelper;
import org.goafabric.model.generated.EhdHeaderTyp;
import org.goafabric.personservice.persistence.SdOpsHeadRepository;
import org.goafabric.personservice.persistence.domain.SdOpsHeadEo;
import org.joda.time.LocalDate;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

@ApplicationScoped
public class OpsHeadImporter {

    @Inject
    private SdOpsHeadRepository sdOpsHeadRepository;

    /**
     * create head of read ops file
     *
     * @param opsImportedTuple non null
     * @return OpsHead (for Catalog) and OpsBody (for Ops Codes)
     */
    public SdOpsHeadEo startImport(
            @NonNull final OpsImportedTuple opsImportedTuple) {
        EhdHeaderTyp header = opsImportedTuple.getEhdHeaderTyp();

        LocalDate validFrom = VersionHelper.extractStartDate(header.getServiceTmr().getV());
        LocalDate validTo = VersionHelper.extractEndDate(header.getServiceTmr().getV());

        SdOpsHeadEo opsHeadEo = SdOpsHeadEo.builder()
            .startDate(validFrom.toString())
            .endDate(validTo != null ? validTo.toString() : null)
            .internalVersion(VersionHelper.versionFromDate(validFrom))
            .kbvVersion(header.getInterface().getVersion().getV())
            .build();

        setVersion(opsHeadEo);

        return opsHeadEo;
    }

    // set internal version of catalog
    private void setVersion(SdOpsHeadEo opsHead) {
        List<SdOpsHeadEo> headBos = sdOpsHeadRepository
            .findAll()
            .stream()
            .filter(head -> head.getStartDate().equals(opsHead.getStartDate()) && head.getEndDate().equals(opsHead.getEndDate()))
            .collect(Collectors.toList());

        if (headBos.isEmpty()) { // ok its new -> just save
            opsHead.setInternalVersion(VersionHelper.versionFromDate(new LocalDate(opsHead.getStartDate())) + ".1"); // e.g. 2019.Q2.1
        } else {
            OptionalInt max = headBos
                .stream()
                .map(SdOpsHeadEo::getInternalVersion)
                .map(t -> t.split("\\.")[2])
                .mapToInt(Integer::valueOf)
                .max();
            int i = max.getAsInt();
            opsHead.setInternalVersion(VersionHelper.versionFromDate(new LocalDate(opsHead.getStartDate())) + "." + (i + 1)); // e.g. 2019.Q2.2
        }
    }
}
