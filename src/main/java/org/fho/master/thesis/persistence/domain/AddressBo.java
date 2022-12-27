package org.fho.master.thesis.persistence.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.fho.master.thesis.persistence.multitenancy.TenantAware;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

import jakarta.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="address")
@Where(clause = TenantAware.TENANT_FILTER)
public class AddressBo extends TenantAware {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String street;
    private String city;

    @Version //optimistic locking
    private Long version;
}
