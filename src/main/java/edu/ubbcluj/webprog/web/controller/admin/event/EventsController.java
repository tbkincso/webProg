package edu.ubbcluj.webprog.web.controller.admin.event;

import edu.ubbcluj.webprog.backend.common.dto.DataPoints;
import edu.ubbcluj.webprog.backend.common.dto.Point;
import edu.ubbcluj.webprog.backend.model.Event;
import edu.ubbcluj.webprog.backend.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by kincso on 15.06.2017.
 */
@Controller
@RequestMapping("/admin/event")
public class EventsController {

    @Autowired
    private EventService eventService;

    @RequestMapping(method = RequestMethod.GET, value="/events")
    public ModelAndView getEvents() {
        List<Event> eventList = eventService.listAllEvents();
        ModelAndView model = new ModelAndView("/admin/event/events");
        model.addObject("list", eventList);
        return model;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ModelAndView view(@PathVariable int id) {
        ModelAndView model = new ModelAndView("/admin/event/view");
        model.addObject("event", eventService.getById(id));
        return model;
    }

   @RequestMapping(method = RequestMethod.GET, value = "/edit/{id}")
    public ModelAndView edit(@PathVariable int id) {
       ModelAndView model = new ModelAndView("/admin/event/createOrUpdate");
       model.addObject("event", eventService.getById(id));
       return model;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/delete/{id}")
    public String delete(@PathVariable int id) {
        eventService.delete(eventService.getById(id));
        return "redirect:/admin/event/events";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/summary/{id}")
    public ModelAndView summary(@PathVariable int id) {
        ModelAndView model = new ModelAndView("/admin/event/summary");
        model.addObject("event", eventService.getById(id));
        return model;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/summaryData/{id}")
    public @ResponseBody
    DataPoints getSummaryData(@PathVariable int id) {
        Event event = eventService.getById(id);
        DataPoints dataPoints = new DataPoints();
        for (int i=0; i < event.getTaskList().size(); i++) {
            dataPoints.addPoint(new Point(i, event.getTaskList().get(i).getState()));
        }
        return dataPoints;
    }
}
