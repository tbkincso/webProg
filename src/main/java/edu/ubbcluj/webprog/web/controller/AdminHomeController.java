package edu.ubbcluj.webprog.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kincso on 14.06.2017.
 */
@Controller
@RequestMapping("/adminHome")
public class AdminHomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        // model.addAttribute("message", " message");
        return "adminHome";
    }
}
