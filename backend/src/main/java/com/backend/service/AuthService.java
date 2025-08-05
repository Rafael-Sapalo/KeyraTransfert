package com.backend.service;

import com.backend.dto.AuthResponse;
import com.backend.dto.LoginRequest;
import com.backend.exception.ResourceNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    // This service can be used to handle authentication logic, such as validating credentials,
    // generating tokens, and managing user sessions. Currently, it is empty and can be expanded
    // as needed for the application's requirements.

    // Example methods could include:
    // - validateCredentials(String email, String password)
    // - generateAccessToken(String userId)
    // - refreshAccessToken(String refreshToken)
    // - invalidateToken(String token)
    // - checkUserSession(String userId)
    // - etc.

    public final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    public String passwordHash = "$2a$10$eImiTMZG4T5x0l9j6b8OeO7z1Z3f5h5k5f5k5f5k5f5k5f5k5f5k5"; // Example hash

    public AuthResponse login(LoginRequest request) {
        try {
            if (!this.passwordEncoder.matches(request.getPassword(), request.getPassword())) {
                throw new ResourceNotFoundException("Invalid credentials");
            }
            return new AuthResponse(passwordHash);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage());
        }
    }

    public AuthResponse refreshToken(String refreshToken) {
        // Logic to refresh the token using the provided refresh token
        return new AuthResponse("newAccessToken");
    }

    public String logout(String accessToken) {
        // Logic to invalidate the access token
        return "Logged out successfully";
    }
}
