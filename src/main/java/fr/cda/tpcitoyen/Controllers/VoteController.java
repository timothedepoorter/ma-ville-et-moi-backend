package fr.cda.tpcitoyen.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.cda.tpcitoyen.DTO.Vote.VoteDto;
import fr.cda.tpcitoyen.Entities.Vote;
import fr.cda.tpcitoyen.Services.VoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/votes")
public class VoteController {
    private final VoteService voteService;
    private final ObjectMapper objectMapper;

    @GetMapping("/{id}")
    public Integer getNumberVote(@PathVariable Integer id){
        return voteService.getNumberVote(id);
    }

    @PostMapping()
    public void addVote(@RequestBody VoteDto vote){
        voteService.addVote(objectMapper.convertValue(vote, Vote.class));
    }

    @PutMapping("/{id}")
    public void updateVote(@PathVariable Integer id){
        voteService.deleteVote(id);
    }


}
