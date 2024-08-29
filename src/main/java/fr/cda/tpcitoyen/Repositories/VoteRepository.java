package fr.cda.tpcitoyen.Repositories;

import fr.cda.tpcitoyen.Entities.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Integer> {

    Integer countVoteById(Integer id);
}
