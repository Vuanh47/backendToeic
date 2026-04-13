package org.example.backend.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class JwtRoleTestController {

    @GetMapping("/test/ping")
    @PreAuthorize("hasAuthority('USER_LESSON_VIEW')")
    public Map<String, Object> userPing(Authentication authentication) {
        return buildPayload("USER_LESSON_VIEW", authentication);
    }

    @GetMapping("/admin/test/ping")
    @PreAuthorize("hasAuthority('ADMIN_PERMISSION_VIEW')")
    public Map<String, Object> adminPing(Authentication authentication) {
        return buildPayload("ADMIN_PERMISSION_VIEW", authentication);
    }

    private Map<String, Object> buildPayload(String permission, Authentication authentication) {
        Map<String, Object> payload = new HashMap<>();
        payload.put("message", "pong");
        payload.put("permission", permission);
        payload.put("principal", authentication == null ? null : authentication.getName());
        payload.put("authorities", authentication == null ? null : authentication.getAuthorities());
        return payload;
    }
}

