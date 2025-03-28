package edu.map.events.model;

public class Event {
    private String name;
    private String description;

    public Event(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Evento{" +
        ", name='" + name + '\'' +
        ", description='" + description + '\'' +
        '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
