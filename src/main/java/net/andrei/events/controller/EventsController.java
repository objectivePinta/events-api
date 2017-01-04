package net.andrei.events.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import net.andrei.events.data.repository.EventRepository;

@RestController("events")
public class EventsController {

  private final EventRepository eventRepository;

  public EventsController(EventRepository eventRepository) {
    this.eventRepository = eventRepository;
  }

  @PostMapping(path="event",consumes = "application/json",)

}
