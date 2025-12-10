package com.springProject.LovableProject.service.Impl;

import com.springProject.LovableProject.dto.project.ProjectRequest;
import com.springProject.LovableProject.dto.project.ProjectResponse;
import com.springProject.LovableProject.dto.project.ProjectSummaryResponse;
import com.springProject.LovableProject.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService {
    @Override
    public List<ProjectSummaryResponse> getAllProjects(Long userId) {
        return List.of();
    }

    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
