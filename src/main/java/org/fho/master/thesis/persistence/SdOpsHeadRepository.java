package org.fho.master.thesis.persistence;

import org.fho.master.thesis.persistence.domain.SdOpsHeadEo;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SdOpsHeadRepository extends JpaRepository<SdOpsHeadEo, String> {

}
