package sa.gov.deem.tenantdirectory.core.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sa.gov.deem.tenantdirectory.core.model.Tenant;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TenantService {

    public Tenant getTenantSubscription(UUID accountID) {
        return null;
    }

    public Tenant getTenantSubscriptionByDomain(String domain) {
        var accountId = mapDomainToAccountId(domain);
        return null;
    }

    public UUID mapDomainToAccountId(String domain) {
        return UUID.randomUUID();
    }

    //TODO 1. setup the source of this info, 2. how to store?
}
