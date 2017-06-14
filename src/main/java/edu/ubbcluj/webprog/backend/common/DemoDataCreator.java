package edu.ubbcluj.webprog.backend.common;

import edu.ubbcluj.webprog.backend.model.User;
import edu.ubbcluj.webprog.backend.repository.UserRepository;
import edu.ubbcluj.webprog.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * Created by kincso on 13.06.2017.
 */
public class DemoDataCreator {
    @Autowired
    private UserService userService;

    @PostConstruct
    public void createDemoData() {
        createAdmin();
        createUser();
        System.out.println("Demo data has been created successfully!");
    }

    private void createAdmin() {
        User user = new User();
        user.setFirstName("Johny");
        user.setLastName("English");
        user.setUserName("johny");
        user.setPassword("johny");
        user.setRole(1);
        user.setTelephone("0856044588");
        userService.save(user);
    }

    private void createUser() {
        User user = new User();
        user.setFirstName("Kincso");
        user.setLastName("Tuzes");
        user.setUserName("kincso");
        user.setPassword("kincso");
        user.setRole(2);
        user.setTelephone("0856044588");
        userService.save(user);
    }

}
