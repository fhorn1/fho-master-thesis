package org.goafabric.personservice.logic;

import org.goafabric.personservice.persistence.domain.SdOpsHeadEo;
import org.goafabric.personservice.service.dto.OpHead;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OpsHeadMapper {
    OpHead map(SdOpsHeadEo person);

    SdOpsHeadEo map(OpHead person);

    List<OpHead> map(List<SdOpsHeadEo> countries);
}
