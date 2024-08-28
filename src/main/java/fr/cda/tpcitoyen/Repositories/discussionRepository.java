package fr.cda.tpcitoyen.Repositories;

import fr.cda.tpcitoyen.Entities.discussion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface discussionRepository extends JpaRepository<discussion, Integer> {
}
