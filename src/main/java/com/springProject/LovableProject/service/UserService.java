package com.springProject.LovableProject.service;

import com.springProject.LovableProject.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long id);
}
