package fr.cda.tpcitoyen.Repositories;

import fr.cda.tpcitoyen.Entities.Discussion;
import fr.cda.tpcitoyen.Entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiscussionRepository extends JpaRepository<Discussion, Integer> {

    List<Discussion> findAllByProjectIdOrderByDateDesc(Integer idProject);
}
