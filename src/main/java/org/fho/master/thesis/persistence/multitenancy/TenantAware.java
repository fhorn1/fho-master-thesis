package org.fho.master.thesis.persistence.multitenancy;

import org.fho.master.thesis.crossfunctional.HttpInterceptor;
import org.fho.master.thesis.persistence.audit.AuditJpaListener;

import javax.persistence.*;

@MappedSuperclass
@EntityListeners(AuditJpaListener.class)
public abstract class TenantAware {
    @Access(AccessType.PROPERTY)
    @Column(name = "tenant_id")
    public String getTenantId() {
        return HttpInterceptor.getTenantId(); //this is for save operations only and this should also ensure that setting the wrong tenant is nearly impossible
    }

    public void setTenantId(String tenantId) {}

    public abstract String getId();
}
