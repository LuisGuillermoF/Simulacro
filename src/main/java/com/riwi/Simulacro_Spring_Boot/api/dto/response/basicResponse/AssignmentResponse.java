package com.riwi.Simulacro_Spring_Boot.api.dto.response.basicResponse;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AssignmentResponse {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime data;
}
