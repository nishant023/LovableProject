package com.springProject.LovableProject.controller;

import com.springProject.LovableProject.dto.auth.*;
import com.springProject.LovableProject.service.AuthService;
import com.springProject.LovableProject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;
    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signUp(SignupRequest request) {
        //here we are not manually creating object of response entity, spring will create by the help
        // of the ok() method.
        return ResponseEntity.ok(authService.signup(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }

    @GetMapping("me")
    public ResponseEntity<UserProfileResponse> getProfile() {//here I will not provide the id bcs id will
        // be got by the spring security.
        Long userId = 1L;
        return ResponseEntity.ok(userService.getProfile(userId));
    }


}
