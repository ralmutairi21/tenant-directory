package sa.gov.deem.tenantdirectory.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;
import reactor.netty.resources.ConnectionProvider;

import java.time.Duration;

@Configuration
public class WebClientConfig {
    @Value("${webclient.max.connection:500}")
    private Integer maxConnection;
    @Value("${webclient.max-idle-time:20}")
    private Integer maxIdleTime;
    @Value("${webclient.max-life-time:60}")
    private Integer maxLifeTime;
    @Value("${webclient.pending-acquire-time:60}")
    private Integer pendingAcquireTime;
    @Value("${webclient.evict-in-background:20}")
    private Integer evictInBackground;

    @Bean
    public WebClient integrationServicesWebClient() {
        return WebClient.builder()
                .clientConnector(new ReactorClientHttpConnector(HttpClient.create(ConnectionProvider.builder("fixed")
                        .maxConnections(maxConnection)
                        .maxIdleTime(Duration.ofSeconds(maxIdleTime))
                        .maxLifeTime(Duration.ofSeconds(maxLifeTime))
                        .pendingAcquireTimeout(Duration.ofSeconds(pendingAcquireTime))
                        .evictInBackground(Duration.ofSeconds(evictInBackground)).build())))
                .baseUrl("http://localhost:3001")
                .build();
    }
}
