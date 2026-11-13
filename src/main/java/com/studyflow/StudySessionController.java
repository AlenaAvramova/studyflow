package com.studyflow;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/sessions")
public class StudySessionController {

    @GetMapping("/demo")
    public Map<String, Object> getDemoSession() {
        return Map.of(
                "id", 1,
                "subject", "Java",
                "durationMinutes", 50,
                "status", "ACTIVE"
        );
    }
    @GetMapping("/status")
    public Map<String, String> getStatus() {
        return Map.of(
                "application", "StudyFlow",
                "backend", "Spring Boot",
                "status", "RUNNING"
        );
    }

}
