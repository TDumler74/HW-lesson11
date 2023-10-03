package tdhellocrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import tdhellocrud.domain.Event;
import tdhellocrud.service.EventService;

import java.util.List;


@Controller
public class EventController {

@Autowired
    private EventService eventService;

    @GetMapping("/")
    public String listForm(Model model){
        List<Event> events = eventService.findAll();
        model.addAttribute("events",events);
        return "listView";
    }
    @GetMapping("/add")
    public String addForm(Model model){
        return "addFormView";
    }
    @PostMapping("/add")
    public String addPost(){
        return null;
    }

}
