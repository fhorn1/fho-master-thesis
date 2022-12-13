package org.fho.master.thesis.logic;

import org.fho.master.thesis.service.dto.OpHead;
import org.fho.master.thesis.persistence.domain.SdOpsHeadEo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OpsHeadMapper {
    OpHead map(SdOpsHeadEo person);

    SdOpsHeadEo map(OpHead person);

    List<OpHead> map(List<SdOpsHeadEo> countries);
}
