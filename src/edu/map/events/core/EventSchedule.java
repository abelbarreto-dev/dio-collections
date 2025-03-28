package edu.map.events.core;

import edu.map.events.model.Event;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EventSchedule implements EventScheduleInterface {
    private final Map<LocalDate, Event> events;

    public EventSchedule() {
        this.events = new HashMap<>();
    }

    protected Map<LocalDate, Event> getEvents() {
        return events;
    }

    @Override
    public void addNewEvent(LocalDate date, String name, String description) {
        System.out.println("create new event".toUpperCase());
        var event = new Event(name, description);

        if (this.getEvents().put(date, event) != null)
            throw new RuntimeException("error: date already exists at map.");

        System.out.println("success: event added.");
    }

    @Override
    public void showSchedule() {
        System.out.println("show events schedule".toUpperCase());
        this.checkMapEventsEmpty();

        Map<LocalDate, Event> orderedEvent = new TreeMap<>(this.getEvents());

        orderedEvent.forEach(
            (LocalDate date, Event event) -> {
                System.out.println("{ 'date'='" + date + "', 'event'='" + event + "' }");
            }
        );
    }

    @Override
    public void getNextEvent() {
        System.out.println("the next event".toUpperCase());
        this.checkMapEventsEmpty();

        Event event = null;
        LocalDate currentDate = LocalDate.now();
        LocalDate nextEvent = null;

        for (LocalDate date : this.getEvents().keySet()) {
            if (date.isAfter(currentDate)) {
                event = this.getEvents().get(date);
                nextEvent = date;
                break;
            }
        }

        if (event == null)
            throw new RuntimeException("error: event not found.");

        System.out.println("{ 'date'='" + nextEvent + "', 'event'='" + event + "' }");
    }

    protected void checkMapEventsEmpty() {
        if (this.getEvents().isEmpty())
            throw new RuntimeException("error: events map is empty.");
    }
}
