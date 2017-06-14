package edu.ubbcluj.webprog.backend.repository;

import edu.ubbcluj.webprog.backend.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by kincso on 14.06.2017.
 */
public interface EventReport extends JpaRepository<Event,Integer> {

}
