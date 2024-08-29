package fr.cda.tpcitoyen.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.cda.tpcitoyen.DTO.Users.ProjectDto;
import fr.cda.tpcitoyen.DTO.Users.ProjectDtoJointure;
import fr.cda.tpcitoyen.Entities.Project;
import fr.cda.tpcitoyen.Services.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/project")
public class ProjectController {
    private final ProjectService projectService;
    private final ObjectMapper objectMapper;

    @GetMapping()
    public List<ProjectDto> getProjects(){
        return projectService.getProjects()
                .stream()
                .map(project -> objectMapper.convertValue(project, ProjectDto.class)
                ).toList();
    }

    @GetMapping("/id")
    public ProjectDtoJointure getProjectById(@RequestParam Integer id){
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
