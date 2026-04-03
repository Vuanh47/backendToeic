package org.example.backend.dto.response;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
@Getter
@Setter
public class PracticeSetResponse {
    private Long id;
    private String title;
    private String description;
    private Integer partNo;
    private Integer targetScore;
    private Boolean published;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
