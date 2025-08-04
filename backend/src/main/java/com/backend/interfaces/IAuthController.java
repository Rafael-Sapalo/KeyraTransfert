package com.backend.interfaces;

import com.backend.dto.AuthResponse;
import com.backend.dto.LoginRequest;
import org.springframework.http.ResponseEntity;

public interface IAuthController {
    ResponseEntity<AuthResponse> login(LoginRequest request);
    ResponseEntity<AuthResponse> refreshToken(String refreshToken);
    ResponseEntity<?> logout(String accessToken);
}
