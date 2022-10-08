package org.goafabric.personservice.logic;

import org.goafabric.model.OpsImportStatistics;
import org.goafabric.personservice.crossfunctional.DurationLog;
import org.goafabric.personservice.persistence.SdOpsCodeRepository;
import org.goafabric.personservice.persistence.SdOpsHeadRepository;
import org.goafabric.personservice.service.dto.OpCode;
import org.goafabric.personservice.service.dto.OpHead;
import org.joda.time.LocalDate;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
@DurationLog
public class OpsLogic {

    @Inject
    OpsHeadMapper opsHeadMapper;

    @Inject
    OpsCodeMapper opsCodeMapper;

    @Inject
    SdOpsHeadRepository sdOpsHeadRepository;

    @Inject
    SdOpsCodeRepository sdOpsCodeRepository;

    public OpHead getHead(String headId) {
        return opsHeadMapper.map(
                sdOpsHeadRepository.getById(headId));
    }
    public List<OpHead> getAllHeads() {
        return opsHeadMapper.map(
                sdOpsHeadRepository.findAll().list());
    }

    public List<OpCode> getAllOpCodesOfHead(String headId, Integer limit) {
        return opsCodeMapper.map(
                sdOpsCodeRepository.getByHeadId(headId, limit));
    }

    public OpsImportStatistics getImportStatistics(String headId) {
        OpHead head = getHead(headId);
        Long allCodesInCatalog = sdOpsCodeRepository.countAllByHeadId(headId);
        return OpsImportStatistics.builder()
                .headId(head.getId())
                .startDate(new LocalDate(head.getStartDate()))
                .endDate(new LocalDate(head.getEndDate()))
                .internalVersion(head.getInternalVersion())
                .amountOfOpCodeEntries(allCodesInCatalog.intValue())
                .build();
    }

}
