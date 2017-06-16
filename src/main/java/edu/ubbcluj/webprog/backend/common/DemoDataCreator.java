package edu.ubbcluj.webprog.backend.common;

import edu.ubbcluj.webprog.backend.model.Event;
import edu.ubbcluj.webprog.backend.model.Task;
import edu.ubbcluj.webprog.backend.model.User;
import edu.ubbcluj.webprog.backend.repository.UserRepository;
import edu.ubbcluj.webprog.backend.service.EventService;
import edu.ubbcluj.webprog.backend.service.TaskService;
import edu.ubbcluj.webprog.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.Random;

/**
 * Created by kincso on 13.06.2017.
 */
public class DemoDataCreator {
    @Autowired
    private UserService userService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private EventService eventService;

    private Random random = new Random();

    @PostConstruct
    public void createDemoData() {
        createAdmin();
        createUser();
        createEvents();
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

    private void createTask(Event event,String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setDeadline(new Date(2017,10,17));
        task.setDescription("Minions ipsum daa tank yuuu! Poopayee poulet tikka masala ti aamoo! Me want bananaaa!");
        task.setEvent(event);
        task.setState(random.nextInt(4));
        taskService.save(task);
    }

    private void createTasks(Event event) {
        createTask(event,"Fenykepezes");
        createTask(event, "Fozes");
        createTask(event,"Hangfelszereles beszerzese");
    }

    private Event createEvent(String title) {
        Event event = new Event();
        event.setTitle(title);
        event.setDescription("La bodaaa poopayee underweaaar po kass tulaliloo pepete poulet tikka masala bee do bee" +
                " do bee do para tú para tú. Potatoooo ti aamoo!");
        return eventService.save(event);
    }

    private void createEvents() {
        createTasks(createEvent("Double Rise"));
        createTasks(createEvent("VOLT fesztival"));
        createTasks(createEvent("Sziget fesztival"));
    }
}
