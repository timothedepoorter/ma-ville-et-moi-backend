package fr.cda.tpcitoyen.Controllers;

import fr.cda.tpcitoyen.Services.VoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class VoteController {
    private final VoteService voteService;
}