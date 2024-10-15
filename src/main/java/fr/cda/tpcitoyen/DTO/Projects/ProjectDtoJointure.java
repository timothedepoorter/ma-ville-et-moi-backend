package fr.cda.tpcitoyen.DTO.Projects;

import fr.cda.tpcitoyen.DTO.Discussions.DiscussionDto;
import fr.cda.tpcitoyen.DTO.Users.UserDto;
import fr.cda.tpcitoyen.DTO.Vote.VoteDto;
import lombok.Data;

import java.util.List;

@Data
public class ProjectDtoJointure {

    private Integer id;

    private String title;

    private String content;

    private boolean isValid;

    private boolean isStatutorily;

    private UserDto userDto;

    private List<DiscussionDto> discussionsList;

    private List<VoteDto> votesList;
}
