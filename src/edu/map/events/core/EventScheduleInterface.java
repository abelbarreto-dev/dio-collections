package edu.map.events.core;

import java.time.LocalDate;

public interface EventScheduleInterface {
    void addNewEvent(LocalDate date, String name, String description);
    void showSchedule();
    void getNextEvent();
}
