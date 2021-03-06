package pl.sda.jira.calendar.rest;

import org.springframework.web.bind.annotation.*;
import pl.sda.jira.calendar.domain.service.CalendarService;

@RestController
@RequestMapping("/calendar")
public class CalendarController {
    private CalendarService calendarService;


    public CalendarController(CalendarService calendarService) {
        this.calendarService = calendarService;
    }

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello hello!";
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public String get(@PathVariable String id) {
        return "Retrieved: " + id;
    }

    @RequestMapping(path="/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable String id) {
        return "Removed: " + id;
    }

}
