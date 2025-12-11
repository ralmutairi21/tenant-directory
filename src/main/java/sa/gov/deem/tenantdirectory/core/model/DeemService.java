package sa.gov.deem.tenantdirectory.core.model;

import lombok.Data;
import sa.gov.deem.tenantdirectory.core.enums.ServiceName;
@Data
public class DeemService {
    private ServiceName serviceName;
    private String baseURL;
}
