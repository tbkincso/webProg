package edu.ubbcluj.webprog.backend.repository;

import edu.ubbcluj.webprog.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * Created by kincso on 13.06.2017.
 */
public interface UserRepository extends JpaRepository<User,Integer> {
    @Query("select u from User u where u.userName=:username and u.password=:password")
    public Optional<User> getByUserNameAndPassword(@Param("username") String username, @Param("password") String password);

    @Query("select u from User u where u.userName=:username")
    public Optional<User> findByUsername(@Param("username") String username);
}
