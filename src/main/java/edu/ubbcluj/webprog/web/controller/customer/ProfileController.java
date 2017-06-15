package edu.ubbcluj.webprog.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by kincso on 14.06.2017.
 */
@Controller
@RequestMapping("/customer/profile")
public class ProfileController {
    @RequestMapping(method = RequestMethod.GET)
    public String getProfile(ModelMap model,HttpSession session) {
        model.addAttribute("name", session.getAttribute("name"));
        return "customer/profile";
    }
}
