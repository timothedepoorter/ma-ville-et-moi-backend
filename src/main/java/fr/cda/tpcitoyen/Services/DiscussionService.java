package fr.cda.tpcitoyen.Services;

import fr.cda.tpcitoyen.Entities.Discussion;

import java.util.List;

public interface DiscussionService {

    /**
     * Afficher la liste des Discussions, à partir de l'ID du Projet
     * @param idProject
     * @return
     */
    List<Discussion> getDiscussionsByProjectID(Integer idProject);

    /**
     * Créer une nouvelle discussion
     * @param discussion
     */
    void addDiscussion(Discussion discussion);

    /**
     * Modifier une discussion existante, à partir de son ID
     * @param id
     * @param discussion
     */
    void updateDiscussion(Integer id, Discussion discussion);

    /**
     * Afficher une discussion existante, à partir de son ID
     * @param id
     */
    void deleteDiscussion(Integer id);

}
