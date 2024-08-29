package fr.cda.tpcitoyen.Services;

import fr.cda.tpcitoyen.Entities.Vote;

public interface VoteService {

    /**
     * Afficher le nombre de vote pour un projet choisi
     * A partir de l'id Project, calculer le nombre de jointure User
     * @return
     */
    Integer getNumberVote(Integer id);

    /**
     * Créer un nouveau vote
     * @param vote
     */
    void addVote(Vote vote);

    /**
     * Supprimer un vote existant à partir de son ID
     * @param id
     */
    void deleteVote(Integer id);

}
