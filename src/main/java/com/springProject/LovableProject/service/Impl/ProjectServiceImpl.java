package com.springProject.LovableProject.service.Impl;

import com.springProject.LovableProject.dto.project.ProjectRequest;
import com.springProject.LovableProject.dto.project.ProjectResponse;
import com.springProject.LovableProject.dto.project.ProjectSummaryResponse;
import com.springProject.LovableProject.entity.Project;
import com.springProject.LovableProject.entity.User;
import com.springProject.LovableProject.mapper.ProjectMapper;
import com.springProject.LovableProject.repository.ProjectRepository;
import com.springProject.LovableProject.repository.UserRepository;
import com.springProject.LovableProject.service.ProjectService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Transactional
public class ProjectServiceImpl implements ProjectService {

    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;


    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {

        User owner = userRepository.findById(userId).orElseThrow();

        Project project = Project.builder()
                .name(request.name())
                .owner(owner)
                .isPublic(false)//although we have set it by default false but builder set all fields
                //again
                .build();

        project = projectRepository.save(project);

        //Entity-> DTO
        //M-1 set all properties manual
        //M-2 use model mapper, but it does not support for record* (added just week before)
        //it used reflection which is slower, model mapper is only for converting one class to other 1class
        //so using map struct
        return projectMapper.toProjectResponse(project);
    }


    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
        //we are getting all projects which are of user
        //and all those projects also where user is a member.
        //this is one of converting to dto
//        return projectRepository.findByAllAccessibleByUser(userId)
//                .stream()
//                .map(project -> projectMapper.toProjectSummaryResponse(project))
//                .collect(Collectors.toList());
        var projects = projectRepository.findByAllAccessibleByUser(userId);
        return projectMapper.toListOfProjectSummaryResponse(projects);
    }

    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
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
