package edu.ubbcluj.webprog.web.controller.admin.organizer;

import edu.ubbcluj.webprog.backend.model.User;
import edu.ubbcluj.webprog.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kincso on 15.06.2017.
 */
@Controller
@RequestMapping("/admin/organizer/organizers")
public class OrganizersController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getOrganizers(HttpSession session) {
        List<String> list = getOrganizerNames();
        ModelAndView model = new ModelAndView("/admin/organizer/organizers");
        model.addObject("list", list);
        return model;
    }

    /*@RequestMapping(method = RequestMethod.POST, params = { "edit" })
    public String edit(HttpSession session, Model model) {
        System.out.println("EDIT");

        //session.setAttribute("selectedEvent", );
        return "redirect:/admin/organizer/modify";
    }

    @RequestMapping(method = RequestMethod.POST, params = { "delete" })
    public ModelAndView delete(HttpSession session) {
        //session.setAttribute("selectedEvent", );
        System.out.println("DELETE");
        //delete
        List<String> list = getOrganizerNames();
        ModelAndView model = new ModelAndView("admin/event/events");
        model.addObject("nameList", list);
        return model;
    }*/

    @RequestMapping(method = RequestMethod.POST, params = { "newOrganizer" })
    public String newEvent(HttpSession session, Model model) {
        return "redirect:/admin/organizer/add";
    }

    private List<String> getOrganizerNames() {
        List<User> userList = userService.listAllUsers();
        List<String> list = new ArrayList<String>();
        for (User user : userList) {

            if (user.getRole() != 1) {
                list.add(user.getFirstName() + " " + user.getLastName());
            }
        }
        return list;
    }

}

