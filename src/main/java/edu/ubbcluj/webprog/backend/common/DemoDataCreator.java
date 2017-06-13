package edu.ubbcluj.webprog.backend.common;

import edu.ubbcluj.webprog.backend.model.User;
import edu.ubbcluj.webprog.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * Created by kincso on 13.06.2017.
 */
public class DemoDataCreator {
    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void createDemoData() {
        User user = new User();
        user.setFirstName("Johny");
        user.setLastName("English");
        user.setUserName("johny");
        user.setPassword("johny");
        user.setTelephone("0856044588");
        userRepository.save(user);
        System.out.println("Demo data has been created successfully!");
    }

}
