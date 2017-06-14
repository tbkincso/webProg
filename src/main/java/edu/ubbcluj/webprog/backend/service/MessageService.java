package edu.ubbcluj.webprog.backend.service;

import edu.ubbcluj.webprog.backend.model.Message;
import edu.ubbcluj.webprog.backend.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kincso on 14.06.2017.
 */
@Service
public class MessageService {
    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {

        this.messageRepository = messageRepository;
    }

    public MessageRepository getMessageRepository() {

        return messageRepository;
    }

    public void save(Message message) {
        messageRepository.save(message);
    }

    public void delete(Message message) {
        messageRepository.delete(message);
    }
}
