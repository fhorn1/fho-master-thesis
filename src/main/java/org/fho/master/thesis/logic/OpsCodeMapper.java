package org.fho.master.thesis.logic;

import org.fho.master.thesis.persistence.domain.SdOpsCodeEo;
import org.fho.master.thesis.service.dto.OpCode;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "cdi")
public interface OpsCodeMapper {
    OpCode map(SdOpsCodeEo person);

    SdOpsCodeEo map(OpCode person);

    List<OpCode> map(List<SdOpsCodeEo> countries);
}
