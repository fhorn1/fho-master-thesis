package org.fho.master.thesis.personservice.model;

import lombok.*;
import org.joda.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class OpsImportStatistics {

    private String headId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String internalVersion;
    private int amountOfOpCodeEntries;

}
