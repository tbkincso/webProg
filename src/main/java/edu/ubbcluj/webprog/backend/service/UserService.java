package edu.ubbcluj.webprog.backend.service;

import edu.ubbcluj.webprog.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by kincso on 14.06.2017.
 */
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }
}
