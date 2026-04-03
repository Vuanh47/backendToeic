package org.example.backend.dto.response;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
@Getter
@Setter
public class UserPracticeAttemptResponse {
    private Long id;
    private Long userId;
    private Long practiceSetId;
    private LocalDateTime startedAt;
    private LocalDateTime submittedAt;
    private Double score;
    private Integer correctCount;
    private Integer totalQuestions;
    private Integer durationSeconds;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
