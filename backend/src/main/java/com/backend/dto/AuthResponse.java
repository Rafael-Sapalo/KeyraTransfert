package com.backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter @Setter
@AllArgsConstructor @RequiredArgsConstructor
public class AuthResponse {
    @JsonProperty("access_token")
    private final String accessToken;

    @JsonProperty("token_type")
    private String tokenType = "Bearer";
}
