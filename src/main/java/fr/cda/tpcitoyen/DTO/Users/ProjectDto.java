package fr.cda.tpcitoyen.DTO.Users;

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
