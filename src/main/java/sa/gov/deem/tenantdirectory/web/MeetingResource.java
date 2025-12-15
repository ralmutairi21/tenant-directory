package sa.gov.deem.tenantdirectory.web;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.gov.deem.tenantdirectory.core.services.MeetingService;

import java.util.UUID;

@RestController
@RequestMapping("api/meeting")
@RequiredArgsConstructor
public class MeetingResource {
    private final MeetingService meetingService;

    @PostMapping
    public ResponseEntity<String> createMeeting(Object payload, String tenantDomain, UUID ldapId) {
        return ResponseEntity.ok(meetingService.createMeeting(payload, tenantDomain, ldapId));
    }
}
