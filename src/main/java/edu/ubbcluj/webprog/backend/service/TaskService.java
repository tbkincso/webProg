package edu.ubbcluj.webprog.backend.service;

import edu.ubbcluj.webprog.backend.model.Task;
import edu.ubbcluj.webprog.backend.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kincso on 14.06.2017.
 */
@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {

        this.taskRepository = taskRepository;
    }

    public TaskRepository getTaskRepository() {

        return taskRepository;
    }

    public void save(Task task) {
        taskRepository.save(task);
    }

    public void delete(Task task) {
        taskRepository.delete(task);
    }

    /*public void deleteEventTasks(int eventId) {
        taskRepository.deleteEventTasks(eventId);
    }*/
}
