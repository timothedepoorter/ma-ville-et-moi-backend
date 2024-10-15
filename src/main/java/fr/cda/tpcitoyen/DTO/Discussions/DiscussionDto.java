package fr.cda.tpcitoyen.DTO.Discussions;

import fr.cda.tpcitoyen.DTO.Users.UserDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DiscussionDto {

    private Integer id;

    private LocalDateTime Date;

    private String content;

    private UserDto userDto;

}
