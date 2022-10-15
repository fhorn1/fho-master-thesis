package org.fho.master.thesis.personservice.service.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class OpCode {

    private String id;
    private String headId;
    private String opCode;
    private String description;
    private String startDate;
    private String endDate;
    private boolean medicalMotivation;
    private boolean sideLocation;
    private String category;
    private String categoryInfo;

}
