package com.riwi.Simulacro_Spring_Boot.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseRequest {
    private Long id;
    @NotBlank(message = "El nombre del curso es requerido")
    private String name;
    @NotBlank(message = "La descrion del curso es requerido")
    private String description;
    private Long intructorId;
    private Long lessonId;
    
}