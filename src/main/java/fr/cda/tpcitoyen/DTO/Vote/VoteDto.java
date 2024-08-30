package fr.cda.tpcitoyen.DTO.Vote;

import fr.cda.tpcitoyen.DTO.Users.UserDto;
import lombok.Data;

@Data
public class VoteDto {

    private Integer numberVoters;

    private UserDto userDto;

}
