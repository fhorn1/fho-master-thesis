package org.goafabric.personservice.logic;

import org.goafabric.model.OpsImportStatistics;
import org.goafabric.model.OpsImportedTuple;
import org.goafabric.personservice.crossfunctional.DurationLog;
import org.goafabric.personservice.logic.opsimporter.OpCodeImporter;
import org.goafabric.personservice.logic.opsimporter.OpsHeadImporter;
import org.goafabric.personservice.logic.opsimporter.OpsXmlImporter;
import org.goafabric.personservice.persistence.SdOpsCodeRepository;
import org.goafabric.personservice.persistence.SdOpsHeadRepository;
import org.goafabric.personservice.persistence.domain.SdOpsCodeEo;
import org.goafabric.personservice.persistence.domain.SdOpsHeadEo;
import org.joda.time.LocalDate;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@ApplicationScoped
@Transactional
@DurationLog
public class OpsImportLogic {

    @Inject
    OpsXmlImporter opsXmlImporter;
    @Inject
    OpsHeadImporter opsHeadImporter;
    @Inject
    OpCodeImporter opCodeImporter;
    @Inject
    SdOpsHeadRepository sdOpsHeadRepository;

    @Inject
    SdOpsCodeRepository sdOpsCodeRepository;

    public OpsImportStatistics importStaticFile() throws IOException {
        // TODO file is not im native image
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("SDOPS_01.00_74_tf+2022q1_nr+2.xml")) {
             return startImport(inputStream);
        }
    }

    public OpsImportStatistics startImport(InputStream inputStream) {
        OpsImportedTuple opsImportedTuple = opsXmlImporter.startImport(inputStream);

        SdOpsHeadEo opsHeadEo = opsHeadImporter.startImport(opsImportedTuple);
        sdOpsHeadRepository.persist(opsHeadEo);

        List<SdOpsCodeEo> opCodeList = opCodeImporter.startImport(opsImportedTuple, opsHeadEo);
        sdOpsCodeRepository.persist(opCodeList);

        return OpsImportStatistics.builder()
                .headId(opsHeadEo.getId())
                .startDate(new LocalDate(opsHeadEo.getStartDate()))
                .endDate(new LocalDate(opsHeadEo.getEndDate()))
                .internalVersion(opsHeadEo.getInternalVersion())
                .amountOfOpCodeEntries(opCodeList.size())
                .build();
    }

}
