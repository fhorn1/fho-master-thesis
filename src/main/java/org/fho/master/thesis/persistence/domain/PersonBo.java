package org.fho.master.thesis.persistence.domain;

import lombok.*;
import org.fho.master.thesis.persistence.multitenancy.TenantAware;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

import jakarta.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "person")
@Where(clause = TenantAware.TENANT_FILTER)
public class PersonBo extends TenantAware {
    @Id
    @GeneratedValue(generator = "uuid") @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String firstName;

    private String lastName;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    @NonNull
    private AddressBo address;

    @Version //optimistic locking
    private Long version;
}
