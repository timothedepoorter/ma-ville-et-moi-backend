package fr.cda.tpcitoyen.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.cda.tpcitoyen.DTO.Projects.ProjectDto;
import fr.cda.tpcitoyen.DTO.Projects.ProjectDtoJointure;
import fr.cda.tpcitoyen.Entities.Project;
import fr.cda.tpcitoyen.Services.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/projects")
public class ProjectController {
    private final ProjectService projectService;
    private final ObjectMapper objectMapper;

    @GetMapping("/valid")
    @CrossOrigin(origins = "*")
    public List<ProjectDto> getProjectsValidated(){
        return projectService.getProjectsValidated()
                .stream()
                .map(project -> objectMapper.convertValue(project, ProjectDto.class)
                ).toList();
    }

    @GetMapping("/admin")
    @CrossOrigin(origins = "*")
    public List<ProjectDto> getProjectsToValidate(){
        return projectService.getProjectsToValidate()
                .stream()
                .map(project -> objectMapper.convertValue(project, ProjectDto.class)
                ).toList();
    }

    @GetMapping("/{id}")
    public ProjectDtoJointure getProjectById(@PathVariable Integer id){
        return objectMapper.convertValue(projectService.getProjectsById(id), ProjectDtoJointure.class);
    }

    @PostMapping()
    public void createProject(@RequestBody ProjectDto projectDto){
        projectService.addProject(objectMapper.convertValue(projectDto, Project.class));
    }

    @PutMapping("/{id}")
    public void updateProject(@PathVariable Integer id, @RequestBody ProjectDto projectDto){
        projectService.updateProject(id, objectMapper.convertValue(projectDto, Project.class));

    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Integer id){
        projectService.deleteProject(id);
    }
}
