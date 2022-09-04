package org.goafabric.model;

import lombok.*;
import org.goafabric.model.generated.EhdBodyTyp;
import org.goafabric.model.generated.EhdHeaderTyp;
import org.joda.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class OpsImportedTuple {

    private EhdHeaderTyp ehdHeaderTyp;
    private EhdBodyTyp ehdBodyTyp;

}
