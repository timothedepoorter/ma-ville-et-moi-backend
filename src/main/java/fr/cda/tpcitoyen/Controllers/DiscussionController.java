package fr.cda.tpcitoyen.Controllers;

import fr.cda.tpcitoyen.Services.DiscussionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class DiscussionController {
    private final DiscussionService discussionService;
}