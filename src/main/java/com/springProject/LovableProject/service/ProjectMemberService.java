package com.springProject.LovableProject.service;

import com.springProject.LovableProject.dto.member.InviteMemberRequest;
import com.springProject.LovableProject.dto.member.MemberResponse;
import com.springProject.LovableProject.dto.member.UpdateMemberRoleRequest;
import com.springProject.LovableProject.entity.ProjectMember;

import java.util.List;

public interface ProjectMemberService {
    List<ProjectMember> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
