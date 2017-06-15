package edu.ubbcluj.webprog.backend.repository;

import edu.ubbcluj.webprog.backend.model.Event;
import edu.ubbcluj.webprog.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * Created by kincso on 14.06.2017.
 */
public interface EventRepository extends JpaRepository<Event,Integer> {
    @Query("select e from Event e where e.title=:title")
    public Optional<Event> findByTitle(@Param("title") String title);
}
