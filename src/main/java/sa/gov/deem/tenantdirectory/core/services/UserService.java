package sa.gov.deem.tenantdirectory.core.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sa.gov.deem.tenantdirectory.core.repo.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void mapUserEmailToLdapId(){

    }

    public void mapLdapIdToUserEmail(){

    }
}
