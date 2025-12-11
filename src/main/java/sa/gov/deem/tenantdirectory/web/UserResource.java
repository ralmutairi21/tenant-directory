package sa.gov.deem.tenantdirectory.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.gov.deem.tenantdirectory.core.model.User;
import sa.gov.deem.tenantdirectory.core.repo.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserResource {
    private final UserRepository userRepository;
    @GetMapping
    public List<User> findAll(){
        return userRepository.findAll();
    }
}
