package org.goafabric.personservice.logic;

import org.goafabric.personservice.persistence.domain.SdOpsCodeEo;
import org.goafabric.personservice.service.dto.OpCode;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OpsCodeMapper {
    OpCode map(SdOpsCodeEo person);

    SdOpsCodeEo map(OpCode person);

    List<OpCode> map(List<SdOpsCodeEo> countries);
}
