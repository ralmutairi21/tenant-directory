package sa.gov.deem.tenantdirectory.core.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;
@Data
@NoArgsConstructor
@Entity(name = "tenants")
@ToString
public class Tenant {
    @Id
    private UUID id;
    private UUID accountId;
    private String domain;
    private String organizationName;
    private String status;
    @Embedded
    private DeemService deemServices;
}
