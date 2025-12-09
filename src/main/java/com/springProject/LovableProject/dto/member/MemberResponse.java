package com.springProject.LovableProject.dto.member;

import com.springProject.LovableProject.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse (
        Long id,
        String email,
        String name,
        String avatarUrl,
        ProjectRole role,
        Instant invitedAt
){
}
