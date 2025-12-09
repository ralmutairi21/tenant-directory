package sa.gov.deem.tenantdirectory.core.model;

import lombok.Data;
import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

import javax.naming.Name;
@Entry(objectClasses = {"mailPerson"}, base = "ou=domain,o=deem-mail")
@Data
public class User {
    @Id
    private Name dn;
    private @Attribute(name = "cn") String email;
    private @Attribute(name = "sn") String name;
}
