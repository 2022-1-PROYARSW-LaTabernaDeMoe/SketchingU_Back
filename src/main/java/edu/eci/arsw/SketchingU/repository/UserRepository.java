package edu.eci.arsw.SketchingU.repository;

import edu.eci.arsw.SketchingU.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
