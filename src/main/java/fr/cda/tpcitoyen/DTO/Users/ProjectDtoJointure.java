package fr.cda.tpcitoyen.DTO.Users;

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
