package edu.ubbcluj.webprog.backend.repository;

import edu.ubbcluj.webprog.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by kincso on 13.06.2017.
 */
public interface UserRepository extends JpaRepository<User,Integer> {

}
