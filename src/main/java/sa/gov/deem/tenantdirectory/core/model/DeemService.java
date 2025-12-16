package sa.gov.deem.tenantdirectory.core.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import sa.gov.deem.tenantdirectory.core.enums.ServiceName;

@Data
@Embeddable
public class DeemService {
    private ServiceName serviceName;
    private String baseURL;
}
