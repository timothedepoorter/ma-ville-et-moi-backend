package fr.cda.tpcitoyen.Services.impl;

import fr.cda.tpcitoyen.DTO.Users.ProjectDto;
import fr.cda.tpcitoyen.DTO.Users.ProjectDtoJointure;
import fr.cda.tpcitoyen.Entities.Project;
import fr.cda.tpcitoyen.Repositories.ProjectRepository;
import fr.cda.tpcitoyen.Services.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;

    @Override
    public List<Project> getProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Project getProjectsById(Integer id) {
        return projectRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Projet introuvable pour l'id : " + id
                ));
    }

    @Override
    public void addProject(Project project) {
        projectRepository.saveAndFlush(project);
    }

    @Override
    public void updateProject(Integer id, Project project) {
        this.getProjectsById(id);
        project.setId(id);
        projectRepository.saveAndFlush(project);

    }

    @Override
    public void deleteProject(Integer id) {
        this.getProjectsById(id);
        projectRepository.deleteById(id);
    }

}
