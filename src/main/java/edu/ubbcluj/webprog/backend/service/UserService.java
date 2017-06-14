package edu.ubbcluj.webprog.backend.service;

import edu.ubbcluj.webprog.backend.model.User;
import edu.ubbcluj.webprog.backend.repository.UserRepository;
import edu.ubbcluj.webprog.backend.util.EncryptData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by kincso on 14.06.2017.
 */
@Service
public class UserService {

   private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public User save(User user) {
        user.setPassword(EncryptData.encrypt(user.getPassword()));
        return this.userRepository.save(user);
    }

    public void delete(User user) {
        this.userRepository.delete(user);
    }

    public Optional<User> getByUsername(String username) {
        return this.userRepository.findByUsername(username);
    }

    public boolean isValidUser(User user) {
        String password = EncryptData.encrypt(user.getPassword());
        Optional<User> authenticatedUser = userRepository
                .getByUserNameAndPassword(user.getUserName(), password);
        return authenticatedUser.isPresent();
    }


}
