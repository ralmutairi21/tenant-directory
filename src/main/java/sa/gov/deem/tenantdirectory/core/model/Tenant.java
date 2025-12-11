package sa.gov.deem.tenantdirectory.core.model;

import java.util.UUID;

public class Tenant {
    private UUID id;
    private UUID account_id;
    private String domain;
    private String organizationName;
    private String status;
    private DeemService deemServices;
}
