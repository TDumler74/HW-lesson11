package tdhellocrud.repository;

import org.springframework.stereotype.Repository;
import tdhellocrud.domain.Event;
import java.util.Arrays;
import java.util.List;

@Repository
public class EventRepository {
    static List<Event> events = Arrays.asList(
            new Event("Concert","Berlin"),
            new Event("Ice Show","Prague"),
            new Event("Dance Show","Paris")
    );
    public List<Event> findAll(){
        return events;
    }

    public void save(Event event) {
        events.add(event);
    }
}
