package edu.ubbcluj.webprog.backend.repository;

import edu.ubbcluj.webprog.backend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * Created by kincso on 13.06.2017.
 */
public interface TaskRepository extends JpaRepository<Task,Integer> {

}
