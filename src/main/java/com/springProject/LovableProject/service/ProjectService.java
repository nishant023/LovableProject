package com.springProject.LovableProject.service;

import com.springProject.LovableProject.dto.project.ProjectRequest;
import com.springProject.LovableProject.dto.project.ProjectResponse;
import com.springProject.LovableProject.dto.project.ProjectSummaryResponse;

import java.util.List;

public interface ProjectService {

    List<ProjectSummaryResponse> getAllProjects(Long userId);

    ProjectResponse getUserProjectById(Long id, Long userId);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);

}
