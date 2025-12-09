package sa.gov.deem.tenantdirectory.core.repo;

import org.springframework.data.ldap.repository.LdapRepository;
import org.springframework.stereotype.Repository;
import sa.gov.deem.tenantdirectory.core.model.User;

import java.util.List;

@Repository
public interface UserRepository extends LdapRepository<User> {

}
