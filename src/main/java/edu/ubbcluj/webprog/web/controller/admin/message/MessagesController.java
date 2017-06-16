package edu.ubbcluj.webprog.web.controller.admin.message;

import edu.ubbcluj.webprog.backend.model.Message;
import edu.ubbcluj.webprog.backend.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kincso on 15.06.2017.
 */
@Controller
@RequestMapping("/admin/message/messages")
public class MessagesController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getEvents(HttpSession session) {
        List<String> list = getMessageList();
        ModelAndView model = new ModelAndView("admin/message/messages");
        model.addObject("list", list);
        return model;
    }

    private List<String> getMessageList() {
        List<Message> messageList = messageService.listMessages();
        List<String> list = new ArrayList<String>();
        for (Message message:messageList) {
            String from = "From: " + message.getFromCustomer().getFirstName() + message.getFromCustomer().getLastName() + "\n";
            //String subject = "Subject: " + message.getSubject() + "\n";
            list.add(from);
        }
        return list;
    }
}
