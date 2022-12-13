package org.fho.master.thesis.persistence;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Parameters;
import io.quarkus.panache.common.Sort;
import org.fho.master.thesis.persistence.domain.SdOpsHeadEo;
import org.joda.time.LocalDate;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class SdOpsHeadRepository implements PanacheRepository<SdOpsHeadEo> {

    /**
     * get {@link SdOpsHeadEo} by {@code id}
     *
     * @param id - non null
     * @return List of {@link SdOpsHeadEo}
     */
    public SdOpsHeadEo getById(String id) {
        return find("id = :id",
                Parameters.with("id", id)
                        .map()).firstResult();

    }

    /**
     * get {@link SdOpsHeadEo} by {@code internalVersion}
     *
     * @param internalVersion- non null
     * @return List of {@link SdOpsHeadEo}
     */
    public List<SdOpsHeadEo> getByInternalVersion(String internalVersion) {
        return find("internalVersion = :internalVersion",
                Parameters.with("internalVersion", internalVersion)
                        .map()).list();

    }

    /**
     * get all {@link SdOpsHeadEo} sort by internal version
     * latest version is first in return value
     *
     * @return Optional of {@link SdOpsHeadEo}
     */
    public Optional<SdOpsHeadEo> findTopByOrderByInternalVersionDesc() {
        return Optional.ofNullable(find("", Sort.by("internalVersion").descending(), new HashMap<>())
                .firstResult());
    }

    /**
     * get all {@link SdOpsHeadEo} by {@code date} sort by internal version
     * latest version is first in return value
     *
     * @return Optional of {@link SdOpsHeadEo}
     */
    public Optional<SdOpsHeadEo> findTopByStartDateLessThanEqualOrderByInternalVersionDesc(LocalDate date) {
        return Optional.ofNullable(find("startDate <= :date",
                Sort.by("internalVersion").ascending(),
                Parameters.with("date", date)
                        .map())
                .firstResult());
    }

}
