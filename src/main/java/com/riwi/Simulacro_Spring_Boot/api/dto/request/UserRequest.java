package com.riwi.Simulacro_Spring_Boot.api.dto.request;

import javax.management.relation.Role;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {
    @NotNull
    private String nameUser;
    private String emailUser;
    private String passwwordUser;
    private String fullName;
    private Role role;
}
