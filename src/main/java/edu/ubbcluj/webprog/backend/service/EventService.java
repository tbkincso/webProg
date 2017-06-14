package edu.ubbcluj.webprog.backend.service;

import edu.ubbcluj.webprog.backend.model.Event;
import edu.ubbcluj.webprog.backend.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void insert(Event task) {

    }

    public void delete(Event task) {

    }
}
