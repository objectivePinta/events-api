package net.andrei.events.data.repository;

import net.andrei.events.data.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event,Long> {

}
