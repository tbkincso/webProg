package edu.ubbcluj.webprog.web.controller;

import edu.ubbcluj.webprog.backend.model.User;
import edu.ubbcluj.webprog.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Optional;

/**
 * Created by kincso on 14.06.2017.
 */

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String login(HttpSession session) {
        session.setAttribute("authenticated", false);
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String handlePost(@RequestParam("username") String name,
                             @RequestParam("password") String password,
                             ModelMap model,
                             HttpSession session) {
        User user = new User();
        user.setUserName(name);
        user.setPassword(password);

        if (userService.isValidUser(user)) {
            Optional<User> authenticatedUser = userService.getByUsername(user.getUserName());
            session.setAttribute("authenticated", true);
            session.setAttribute("role", authenticatedUser.get().getRole());
            session.setAttribute("name", authenticatedUser.get().getFirstName());
            if (authenticatedUser.get().getRole() == 1) {
                return "redirect:/admin/profile";
            }
            return "redirect:/customer/profile";
        } else {
            model.addAttribute("errorMsg", "Wrong username or password!");
            return "login";
        }
    }

}
