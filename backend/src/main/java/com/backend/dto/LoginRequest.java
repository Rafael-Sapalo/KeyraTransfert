package com.backend.dto;

import lombok.*;

@Getter @Setter
@AllArgsConstructor
public class LoginRequest {
    private final String email;
    private final String password;
}
