package edu.ubbcluj.webprog.web.controller.admin.event;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by kincso on 15.06.2017.
 */
@Controller
@RequestMapping("/admin/event/edit")
public class EditController {
    @RequestMapping(method = RequestMethod.GET)
    public String getEvents(HttpSession session) {
        return "admin/event/edit";
    }
}
