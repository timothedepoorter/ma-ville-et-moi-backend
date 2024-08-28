package fr.cda.tpcitoyen.Services.impl;

import fr.cda.tpcitoyen.Repositories.VoteRepository;
import fr.cda.tpcitoyen.Services.VoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VoteServiceImpl implements VoteService {
    private final VoteRepository voteRepository;
}
