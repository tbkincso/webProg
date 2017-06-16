package edu.ubbcluj.webprog.web.controller.admin.organizer;

import edu.ubbcluj.webprog.backend.model.User;
import edu.ubbcluj.webprog.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kincso on 15.06.2017.
 */
@Controller
@RequestMapping("/admin/organizer")
public class OrganizersController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value="/organizers")
    public ModelAndView getOrganizerList() {
        List<User> list = getOrganizers();
        ModelAndView model = new ModelAndView("/admin/organizer/organizers");
        model.addObject("list", list);
        return model;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ModelAndView view(@PathVariable int id) {
        ModelAndView model = new ModelAndView("/admin/organizer/viewOrganizer");
        model.addObject("organizer", userService.getById(id));
        return model;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/edit/{id}")
    public ModelAndView edit(@PathVariable int id) {
        ModelAndView model = new ModelAndView("/admin/organizer/addOrUpdate");
        model.addObject("organizer", userService.getById(id));
        return model;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/delete/{id}")
    public String delete(@PathVariable int id) {
        userService.delete(userService.getById(id));
        return "redirect:/admin/organizer/organizers";
    }

    private List<User> getOrganizers() {
        List<User> userList = userService.listAllUsers();
        List<User> list = new ArrayList<User>();
        for (User user : userList) {
            if (user.getRole() != 1) {
                list.add(user);
            }
        }
        return list;
    }
}

