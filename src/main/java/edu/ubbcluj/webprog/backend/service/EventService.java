package edu.ubbcluj.webprog.backend.service;

import edu.ubbcluj.webprog.backend.model.Event;
import edu.ubbcluj.webprog.backend.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public void delete(Event event) {
        eventRepository.delete(event);
    }

    public List<Event> listAllEvents() {
        return eventRepository.findAll();
    }
}
