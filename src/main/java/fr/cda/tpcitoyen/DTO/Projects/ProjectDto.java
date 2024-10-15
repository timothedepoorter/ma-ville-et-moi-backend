package fr.cda.tpcitoyen.DTO.Projects;

import fr.cda.tpcitoyen.DTO.Users.UserDto;
import lombok.Data;

@Data
public class ProjectDto {

    private Integer id;

    private String title;

    private String content;

    private boolean isValid;

    private boolean isStatutorily;

    private UserDto userDto;
}
