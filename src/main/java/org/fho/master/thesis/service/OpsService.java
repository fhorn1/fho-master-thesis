package org.fho.master.thesis.service;

import lombok.extern.slf4j.Slf4j;
import org.fho.master.thesis.logic.OpsLogic;
import org.fho.master.thesis.model.OpsImportStatistics;
import org.fho.master.thesis.service.dto.OpCode;
import org.fho.master.thesis.service.dto.OpHead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/ops", produces = "application/json")
@RestController
@Slf4j
public class OpsService {
    @Autowired
    OpsLogic opsLogic;

    @GetMapping("getAllHeads")
    public List<OpHead> getAllHeads() {
        return opsLogic.getAllHeads();
    }

    @GetMapping("getHead/{id}")
    public OpHead getHead(@PathVariable("id") String id) {
        return opsLogic.getHead(id);
    }

    @GetMapping("getAllOpCodesOfHead/{headId}/{limit}")
    public List<OpCode> getAllOpCodesOfHead(@PathVariable("headId") String headId,
                                            @PathVariable("limit") Integer limit) {
        return opsLogic.getAllOpCodesOfHead(headId, limit);
    }

    @GetMapping("getImportStatistics")
    public OpsImportStatistics getImportStatistics(@PathVariable("headId") String headId) {
        return opsLogic.getImportStatistics(headId);
    }

}
