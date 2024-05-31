package com.riwi.Simulacro_Spring_Boot.api.dto.request;

import javax.management.relation.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {
    @NotBlank(message = "El nombre del usuario es requerido")
    private String nameUser;
    @NotBlank(message = "El email del usuario es requerido")
    @Email
    private String emailUser;
    @NotBlank(message = "La contraseña del usuario es requerido")
    private String passwwordUser;
    private String fullName;
    @NotBlank(message = "El rol del usuario es requerido")
    private Role role;
    
    private Long enrollmentId;
    private Long courseId;
    private Long submissionId;
    private Long messageId;
}
