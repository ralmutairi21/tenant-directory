package sa.gov.deem.tenantdirectory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.ldap.repository.config.EnableLdapRepositories;

@SpringBootApplication
@EnableLdapRepositories
public class TenantDirectoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(TenantDirectoryApplication.class, args);
    }

}
