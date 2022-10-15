package org.fho.master.thesis.personservice.logic;

import org.fho.master.thesis.personservice.service.dto.OpCode;
import org.fho.master.thesis.personservice.persistence.domain.SdOpsCodeEo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OpsCodeMapper {
    OpCode map(SdOpsCodeEo person);

    SdOpsCodeEo map(OpCode person);

    List<OpCode> map(List<SdOpsCodeEo> countries);
}
