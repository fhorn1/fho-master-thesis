package org.fho.master.thesis.persistence.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sdops_code")
public class SdOpsCodeEo {

    @Id
    @GeneratedValue(generator = "uuid") @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(nullable = false, name = "head_id")
    private String headId;

    @Column(nullable = false, name = "op_code")
    private String opCode;

    @Column(nullable = false, name = "description")
    private String description;

    @Column(nullable = false, name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;

    @Column(name = "medical_motivation")
    private boolean medicalMotivation;

    @Column(nullable = false, name = "side_location")
    private boolean sideLocation;

    @Column(name = "category")
    private String category;

    @Column(name = "category_info")
    private String categoryInfo;

}
