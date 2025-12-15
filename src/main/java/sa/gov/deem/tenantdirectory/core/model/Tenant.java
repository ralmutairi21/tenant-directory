package sa.gov.deem.tenantdirectory.core.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;
@Data
@NoArgsConstructor
@Entity(name = "dashboard")
@ToString
public class Tenant {
    @Id
    private UUID id;
    private UUID accountId;
    private String domain;
    private String organizationName;
    private String status;
    private DeemService deemServices;
}
