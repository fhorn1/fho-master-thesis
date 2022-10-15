package org.fho.master.thesis.personservice.logic;

import org.fho.master.thesis.personservice.model.OpsImportStatistics;
import org.fho.master.thesis.personservice.service.dto.OpCode;
import org.fho.master.thesis.personservice.service.dto.OpHead;
import org.fho.master.thesis.personservice.persistence.SdOpsCodeRepository;
import org.fho.master.thesis.personservice.persistence.SdOpsHeadRepository;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class OpsLogic {

    @Autowired
    OpsHeadMapper opsHeadMapper;

    @Autowired
    OpsCodeMapper opsCodeMapper;

    @Autowired
    SdOpsHeadRepository sdOpsHeadRepository;

    @Autowired
    SdOpsCodeRepository sdOpsCodeRepository;

    public OpHead getHead(String headId) {
        return opsHeadMapper.map(
                sdOpsHeadRepository.findById(headId).get());
    }
    public List<OpHead> getAllHeads() {
        return opsHeadMapper.map(
                sdOpsHeadRepository.findAll());
    }

    public List<OpCode> getAllOpCodesOfHead(String headId, Integer limit) {
        return opsCodeMapper.map(
                sdOpsCodeRepository.findAllByHeadId(headId, PageRequest.of(0, limit)));
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
