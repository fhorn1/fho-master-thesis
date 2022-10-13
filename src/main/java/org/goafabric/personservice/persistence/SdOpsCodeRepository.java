package org.goafabric.personservice.persistence;

import org.goafabric.personservice.persistence.domain.SdOpsCodeEo;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SdOpsCodeRepository extends JpaRepository<SdOpsCodeEo, String> {

    List<SdOpsCodeEo> findAllByHeadId(String headId, Pageable pageable);

    Long countAllByHeadId(String headId);

}
