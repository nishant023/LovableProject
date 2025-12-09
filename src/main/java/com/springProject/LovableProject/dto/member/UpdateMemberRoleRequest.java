package com.springProject.LovableProject.dto.member;

import com.springProject.LovableProject.enums.ProjectRole;

public record UpdateMemberRoleRequest(
        ProjectRole role
) {
}
