package org.fho.master.thesis.persistence.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sdops_head")
public class SdOpsHeadEo {

    @Id
    @GeneratedValue(generator = "uuid") @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(nullable = false, name = "start_date")
    private String startDate;

    @Column(nullable = false, name = "end_date")
    private String endDate;

    @Column(nullable = false, name = "internal_version")
    private String internalVersion;

    @Column(nullable = false, name = "kbv_version")
    private String kbvVersion;

}
