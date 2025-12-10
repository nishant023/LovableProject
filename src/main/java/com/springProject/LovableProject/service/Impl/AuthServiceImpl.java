package com.springProject.LovableProject.service.Impl;

import com.springProject.LovableProject.dto.auth.AuthResponse;
import com.springProject.LovableProject.dto.auth.LoginRequest;
import com.springProject.LovableProject.dto.auth.SignupRequest;
import com.springProject.LovableProject.service.AuthService;
import org.springframework.stereotype.Service;


@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
