package edu.ubbcluj.webprog.web.controller.admin.organizer;

import edu.ubbcluj.webprog.backend.model.User;
import edu.ubbcluj.webprog.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by kincso on 15.06.2017.
 */
@Controller
@RequestMapping("/admin/organizer/addOrUpdate")
public class AddOrUpdateController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String handleGet(HttpSession session) {
        return "/admin/organizer/addOrUpdate";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String handlePost(@RequestParam("id") String idString,
                             @RequestParam("username") String username,
                             @RequestParam("firstname") String firstname,
                             @RequestParam("lastname") String lastname,
                             @RequestParam("password") String password,
                             @RequestParam("telephone") String telephone,
                             ModelMap model) {
        if (username.equals("") || firstname.equals("") || lastname.equals("") || password.equals("")) {
            model.addAttribute("errorMsg", "The fields marked with * must be filled!");
            return "/admin/organizer/addOrUpdate";
        }
        if (telephone.length() != 10 && telephone.length() != 0) {
            model.addAttribute("errorMsg", "Incorrect phone number (it must contain 10 numbers, ex. 0744056888!");
            return "/admin/organizer/addOrUpdate";
        }
        if (!telephone.matches("[0-9]*")) {
            model.addAttribute("errorMsg", "Incorrect phone number, it must contain olny numbers!");
            return "/admin/organizer/addOrUpdate";
        }

        int id;
        try {
            id = Integer.parseInt(idString);    //in this case update
        } catch (NumberFormatException ex) {
            id = 0;                             //in this case it will save
        }

        User user = new User();
        user.setId(id);
        user.setUserName(username);
        user.setLastName(lastname);
        user.setFirstName(firstname);
        user.setPassword(password);
        user.setRole(2);
        if (!telephone.equals("")) {
            user.setTelephone(telephone);
        }
        userService.save(user);
        return "redirect:/admin/organizer/organizers";
    }
}
