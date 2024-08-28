package fr.cda.tpcitoyen.Services.impl;

import fr.cda.tpcitoyen.Repositories.DiscussionRepository;
import fr.cda.tpcitoyen.Services.DiscussionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DiscussionServiceImpl implements DiscussionService {
    private final DiscussionRepository discussionRepository;
}
