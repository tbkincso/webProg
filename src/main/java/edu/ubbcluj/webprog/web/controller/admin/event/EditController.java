package edu.ubbcluj.webprog.web.controller.admin.event;

import edu.ubbcluj.webprog.backend.model.Event;
import edu.ubbcluj.webprog.backend.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by kincso on 15.06.2017.
 */
@Controller
@RequestMapping("/admin/event/edit")
public class EditController {
    @Autowired
    private EventService eventService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getEvents(HttpSession session) {
        int eventId = (int)session.getAttribute("selectedEvent");
        Event event = eventService.getById(eventId);
        ModelAndView model = new ModelAndView("admin/event/edit");
        model.addObject("title", event.getTitle());
        model.addObject("description", event.getDescription());
        return model;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String handlePost(@RequestParam("title") String title,
                             @RequestParam("description") String description,
                             ModelMap model,
                             HttpSession session) {
        if(description.length() > 256) {
            model.addAttribute("errorMsg", "Description length must be less than 256 characters!");
            return "admin/event/edit";
        }
        Event event = new Event();
        event.setTitle(title);
        event.setDescription(description);
        eventService.save(event);
        return "redirect:/admin/event/events";
    }
}
