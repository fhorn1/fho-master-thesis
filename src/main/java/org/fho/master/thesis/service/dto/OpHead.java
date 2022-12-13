package org.fho.master.thesis.service.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class OpHead {

    private String id;

    private String startDate;

    private String endDate;

    private String internalVersion;

    private String kbvVersion;

}
