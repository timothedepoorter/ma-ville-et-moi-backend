package fr.cda.tpcitoyen.Services.impl;

import fr.cda.tpcitoyen.Entities.Discussion;
import fr.cda.tpcitoyen.Repositories.DiscussionRepository;
import fr.cda.tpcitoyen.Repositories.ProjectRepository;
import fr.cda.tpcitoyen.Services.DiscussionService;
import fr.cda.tpcitoyen.Services.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DiscussionServiceImpl implements DiscussionService {
    private final DiscussionRepository discussionRepository;

    @Override
    public List<Discussion> getDiscussionsByProjectID(Integer idProject) {
        return discussionRepository.findAllByProjectIdOrderByDateDesc(idProject);
    }

    @Override
    public void addDiscussion(Discussion discussion) {
        discussionRepository.saveAndFlush(discussion);
    }

    @Override
    public void updateDiscussion(Integer id, Discussion discussion) {
        this.getDiscussionById(id);
        discussion.setId(id);
        discussionRepository.saveAndFlush(discussion);
    }

    @Override
    public void deleteDiscussion(Integer id) {
        discussionRepository.deleteById(id);
    }

    private Discussion getDiscussionById(Integer id) {
        return discussionRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Discussion introuvable pour l'id : " + id
                ));
    }
}
