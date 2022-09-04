package org.goafabric.personservice.persistence;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import io.quarkus.panache.common.Parameters;
import io.quarkus.runtime.Startup;
import org.goafabric.personservice.persistence.domain.PersonBo;
import org.goafabric.personservice.persistence.domain.SdOpsCodeEo;
import org.goafabric.personservice.persistence.multitenancy.MultiTenantRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class SdOpsCodeRepository implements PanacheRepository<SdOpsCodeEo> {

    /**
     * get {@link SdOpsCodeEo} by {@code headId}
     *
     * @param headId non null
     * @return List of {@link SdOpsCodeEo}
     */
    public List<SdOpsCodeEo> getByHeadId(String headId) {
        return find("headId = :headId",
                Parameters.with("headId", headId)
                        .map()).list();
    }

    /**
     * get {@link SdOpsCodeEo} by {@code code} and {@code headId}
     *
     * @param opCode - non null
     * @param headId - non null
     * @return List of {@link SdOpsCodeEo}
     */
    public SdOpsCodeEo getByOpCodeAndHeadId(String opCode, String headId) {
        return find("headId = :headId and opCode = :opCode",
                Parameters.with("headId", headId)
                        .and("opCode", opCode)
                        .map()).firstResult();
    }

    /**
     * Amount of {@link SdOpsCodeEo} for a requested head id.
     *
     * @param catalogId - non null
     */
    public long countAllByHeadId(String catalogId) {
        return count("catalogId = :catalogId",
                Parameters.with("catalogId", catalogId)
                        .map());
    }

    /**
     * get {@link SdOpsCodeEo} by {@code headId} and starts with {@code opCode}
     *
     * @param headId - non null
     * @param opCode - non null
     * @return List of {@link SdOpsCodeEo}
     */
    public List<SdOpsCodeEo> getAllByHeadIdAndOpCodeStartingWith(String headId, String opCode) {
        return find("headId = :headId and opCode = :opCode",
                Parameters.with("headId", headId)
                        .and("opCode", opCode)
                        .map()).list();

    }
}
