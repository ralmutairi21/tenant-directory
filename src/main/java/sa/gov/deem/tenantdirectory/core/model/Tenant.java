package sa.gov.deem.tenantdirectory.core.model;

import java.util.List;
import java.util.UUID;

public class Tenant {
    private UUID id;
    private UUID account_id;
    private String domain;
    private List<String> url;
}
