package com.springProject.LovableProject.service;

import com.springProject.LovableProject.dto.auth.AuthResponse;
import com.springProject.LovableProject.dto.auth.LoginRequest;
import com.springProject.LovableProject.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
