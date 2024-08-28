package fr.cda.tpcitoyen.Repositories;

import fr.cda.tpcitoyen.Entities.Discussion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscussionRepository extends JpaRepository<Discussion, Integer> {
}
