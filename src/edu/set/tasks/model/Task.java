package edu.set.tasks.model;

import java.util.Objects;

public class Task {
    private final String description;
    private boolean finished;

    public Task(String description) {
        this.description = description;
        this.finished = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "Task{" +
        "description='" + description + '\'' +
        ", finished=" + finished +
        '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Task task)) return false;
        return !task.isFinished() && Objects.equals(
            this.getDescription(),
            task.getDescription()
        );
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(description);
    }
}
