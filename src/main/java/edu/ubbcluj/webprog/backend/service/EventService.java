package edu.ubbcluj.webprog.backend.service;

import edu.ubbcluj.webprog.backend.model.Event;
import edu.ubbcluj.webprog.backend.model.User;
import edu.ubbcluj.webprog.backend.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by kincso on 14.06.2017.
 */
@Service
public class EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {

        this.eventRepository = eventRepository;
    }

    public EventRepository getEventRepository() {

        return eventRepository;
    }

    public Event save(Event event) {
        return eventRepository.save(event);
    }

   /* public Event update(Event event) {

    }*/

    public void delete(Event event) {
        eventRepository.delete(event);
    }

    public List<Event> listAllEvents() {
        return eventRepository.findAll();
    }

    public Optional<Event> getByTitle(String title) {
        return this.eventRepository.findByTitle(title);
    }

    public Event getById(int id) {
        return eventRepository.findOne(id);
    }
}
