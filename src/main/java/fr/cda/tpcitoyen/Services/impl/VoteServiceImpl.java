package fr.cda.tpcitoyen.Services.impl;

import fr.cda.tpcitoyen.Entities.Project;
import fr.cda.tpcitoyen.Entities.User;
import fr.cda.tpcitoyen.Entities.Vote;
import fr.cda.tpcitoyen.Repositories.VoteRepository;
import fr.cda.tpcitoyen.Services.UserService;
import fr.cda.tpcitoyen.Services.VoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class VoteServiceImpl implements VoteService {
    private final VoteRepository voteRepository;

    @Override
    public Integer getNumberVote(Integer id) {
        return voteRepository.countVoteById(id);
    }

    @Override
    public void addVote(Vote vote) {
        voteRepository.saveAndFlush(vote);
    }

    @Override
    public void deleteVote(Integer id) {
        voteRepository.deleteById(id);
    }

}
