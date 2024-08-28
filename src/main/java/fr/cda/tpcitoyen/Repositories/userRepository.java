package fr.cda.tpcitoyen.Repositories;

import fr.cda.tpcitoyen.Entities.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<user, Integer> {

}
