package edu.ubbcluj.webprog.web.controller.admin.event;

import edu.ubbcluj.webprog.backend.model.Event;
import edu.ubbcluj.webprog.backend.service.EventService;
import org.omg.CORBA.Request;
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
@RequestMapping("/admin/event/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getEvents(HttpSession session) {
        List<String> list = getListOfEvents();
        ModelAndView model = new ModelAndView("admin/event/events");
        model.addObject("list", list);
        return model;
    }
    @RequestMapping(method = RequestMethod.POST, params = { "selected" })
    public void selected(@RequestParam("selected") String name, HttpSession session, Model model) {
        System.out.println("SELECTED");
        System.out.println(name);

        //session.setAttribute("selectedEvent", );
    }

   @RequestMapping(method = RequestMethod.POST, params = { "edit" })
    public String edit(HttpSession session, Model model) {
       System.out.println("EDIT");

        //session.setAttribute("selectedEvent", );
        return "redirect:/admin/event/edit";
    }

    @RequestMapping(method = RequestMethod.POST, params = { "delete" })
    public ModelAndView delete(HttpSession session) {
        //session.setAttribute("selectedEvent", );
        System.out.println("DELETE");
        //delete
        List<String> list = getListOfEvents();
        ModelAndView model = new ModelAndView("admin/event/events");
        model.addObject("list", list);
        return model;
    }

    @RequestMapping(method = RequestMethod.POST, params = { "summary" })
    public String summary(HttpSession session, Model model) {
        //session.setAttribute("selectedEvent", );
        System.out.println("SUMMARY");
        return "redirect:/admin/event/summary";
    }

    @RequestMapping(method = RequestMethod.POST, params = { "newEvent" })
    public String newEvent(HttpSession session, Model model) {
        return "redirect:/admin/event/create";
    }

    private List<String> getListOfEvents() {
        List<Event> eventList = eventService.listAllEvents();
        List<String> list = new ArrayList<String>();
        for (Event event:eventList) {
            list.add(event.getTitle());
        }
        return list;
    }
}
