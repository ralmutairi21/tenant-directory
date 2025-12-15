package sa.gov.deem.tenantdirectory.core.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sa.gov.deem.tenantdirectory.core.model.Tenant;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TenantRepository extends CrudRepository<Tenant, UUID> {

    Optional<Tenant> findTenantByDomainOrAccountId(String tenantDomain, UUID accountId);

}
