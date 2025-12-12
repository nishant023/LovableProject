package com.springProject.LovableProject.mapper;

import com.springProject.LovableProject.dto.project.ProjectResponse;
import com.springProject.LovableProject.dto.project.ProjectSummaryResponse;
import com.springProject.LovableProject.entity.Project;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {


    ProjectResponse toProjectResponse(Project project);

    ProjectSummaryResponse toProjectSummaryResponse(Project project);
    List<ProjectSummaryResponse>toListOfProjectSummaryResponse(List<Project> projects);

}
