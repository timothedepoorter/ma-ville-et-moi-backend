package fr.cda.tpcitoyen.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.cda.tpcitoyen.DTO.Users.DiscussionDto;
import fr.cda.tpcitoyen.Entities.Discussion;
import fr.cda.tpcitoyen.Services.DiscussionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/discussion")
public class DiscussionController {
    private final DiscussionService discussionService;
    private final ObjectMapper objectMapper;

    @GetMapping("/id")
    public List<DiscussionDto> getDiscussionsByProjectID(@RequestParam Integer idProject) {
        return discussionService.getDiscussionsByProjectID(idProject)
                .stream()
                .map(discussion -> objectMapper.convertValue(discussion, DiscussionDto.class))
                .toList();
    }

    @PostMapping()
    public void createDiscussion(@RequestBody DiscussionDto discussionDto) {
        discussionService.addDiscussion(objectMapper.convertValue(discussionDto, Discussion.class));
    }

    @PutMapping("/{id}")
    public void updateDiscussion(@PathVariable Integer id, @RequestBody DiscussionDto discussionDto) {
        discussionService.updateDiscussion(id, objectMapper.convertValue(discussionDto, Discussion.class));
    }

    @DeleteMapping("/{id}")
    public void deleteDiscussion(@PathVariable Integer id) {
        discussionService.deleteDiscussion(id);
    }
}
