package fr.cda.tpcitoyen.DTO.Users;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DiscussionDto {

    private Integer id;

    private LocalDateTime Date;

    private String content;

    private UserDto userDto;

}
