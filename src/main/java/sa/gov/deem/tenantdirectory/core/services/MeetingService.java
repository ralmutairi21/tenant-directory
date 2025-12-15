package sa.gov.deem.tenantdirectory.core.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import sa.gov.deem.tenantdirectory.core.model.Tenant;
import sa.gov.deem.tenantdirectory.core.repo.TenantRepository;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class MeetingService {
    private final TenantRepository tenantRepository;
    private final WebClient webClient;

    public void createMeeting(Object payload, String tenantDomain, UUID ldapId) {
        var tenant = tenantRepository.findTenantByDomainOrAccountId(tenantDomain, null).orElseThrow();
        createOnlineMeetingLink(payload, tenant, ldapId);
    }

    public String createOnlineMeetingLink(Object payload, Tenant tenant, UUID ldapId) {
        return webClient.post()
                .uri("/api/v1/integration/create-meeting")
                .contentType(MediaType.APPLICATION_JSON)
                .header("x-api-key", "70dc69ca-1f79-4433-b512-00c0f6b13359")
                .header("x-tenant-id", String.valueOf(tenant.getAccountId()))
                .header("x-user-id", String.valueOf(ldapId))
                .header("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .bodyValue(payload)
                .retrieve()
                .onStatus(HttpStatusCode::isError, cr ->
                        cr.bodyToMono(String.class).defaultIfEmpty("")
                                .flatMap(body -> {
                                    log.warn("Meet API error: {} body={}", cr.statusCode(), body);
                                    return Mono.error(new RuntimeException(cr.statusCode().toString()));
                                }))
                .bodyToMono(String.class).block();
    }

}
