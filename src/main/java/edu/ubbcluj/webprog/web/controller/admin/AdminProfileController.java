package edu.ubbcluj.webprog.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kincso on 14.06.2017.
 */
@Controller
@RequestMapping("/admin/profile")
public class AdminProfileController {
    @RequestMapping(method = RequestMethod.GET)
    public String getProfile() {
        return "admin/profile";
    }
}
