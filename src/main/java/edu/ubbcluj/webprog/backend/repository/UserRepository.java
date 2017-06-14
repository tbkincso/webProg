package edu.ubbcluj.webprog.backend.repository;

import edu.ubbcluj.webprog.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by kincso on 13.06.2017.
 */
public interface UserRepository extends JpaRepository<User,Integer> {

    /*@Query("select u from User u left join fetch u.roles r where u.username=:username")
    public User findByUsername(@Param("username") String username);

    public boolean validate();*/
}
