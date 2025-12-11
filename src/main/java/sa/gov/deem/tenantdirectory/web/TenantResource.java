package sa.gov.deem.tenantdirectory.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/tenant")
@RequiredArgsConstructor
public class TenantResource {
    /**
     * GET /tenants/resolve?domain=acme.com

     → {
     "globalTenantId": "T-123",
     "primaryDomain": "acme.com",
     "deemServices": [
     {
     "serviceName": "EMAIL",
     "baseUrl": "https://email.deem.sa/EMAIL-44"
     },
     {
     "serviceName": "MEET",
     "baseUrl": "https://meet.deem.sa/MEET-99"
     }
     ]
     }
     **/
}
