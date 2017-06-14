package edu.ubbcluj.webprog.backend.service;

import edu.ubbcluj.webprog.backend.model.User;
import edu.ubbcluj.webprog.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by kincso on 14.06.2017.
 */
public class UserService {

   /* private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    public UserRepository getUserRepository() {

        return userRepository;
    }

    public User getByUserName(String username) {
        return this.userRepository.findByUsername(username);
    }


    public User insert(User user) {
        return this.userRepository.save(user);
    }

    public void delete(User user) {
        this.userRepository.delete(user);
    }

    //modify minden adatbazisbeli mezore?

    public boolean validateUser(User user) { //??

        return false;
    }*/
}
