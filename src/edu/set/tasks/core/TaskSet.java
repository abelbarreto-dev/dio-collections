package edu.set.tasks.core;

import edu.set.tasks.model.Task;

import java.util.HashSet;
import java.util.Set;

public class TaskSet implements ITaskSet {
    private final Set<Task> tasks;

    public TaskSet() {
        this.tasks = new HashSet<>();
    }

    protected Set<Task> getTasks() {
        return tasks;
    }

    @Override
    public void addNewTask(String description) {
        var task = new Task(description);

        if (!this.getTasks().add(task)) {
            System.out.println("warning: task already exists.");
            return;
        }

        System.out.println("success: task created.");
    }

    @Override
    public void removeTask(String description) {
        Task task = this.getTasks().stream().filter(
            (Task t) -> t.getDescription().equalsIgnoreCase(description)
        ).findFirst().orElse(null);

        if (task == null)
            System.out.println("error: task not found.");
        else {
            this.getTasks().remove(task);
            System.out.println("success: task removed.");
        }
    }

    @Override
    public void showTasks() {
        if (this.getTasks().isEmpty()) {
            System.out.println("warning: tasks set is empty.");
            return;
        }

        this.getTasks().forEach(System.out::println);
    }

    @Override
    public int countTasks() {
        return this.getTasks().size();
    }

    @Override
    public Set<Task> getFinishedTasks() {
        Set<Task> taskFinished = new HashSet<>();

        for (Task task : this.getTasks())
            if (task.isFinished())
                taskFinished.add(task);

        return taskFinished;
    }

    @Override
    public Set<Task> getPendingTasks() {
        Set<Task> taskPending = new HashSet<>();

        for (Task task : this.getTasks())
            if (!task.isFinished())
                taskPending.add(task);

        return taskPending;
    }

    @Override
    public void makeTaskFinished(String description) {
        Task foundTask = null;

        for (Task task : this.getTasks()) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                foundTask = task;
                break;
            }
        }

        if (foundTask == null)
            System.out.println("error: task not found.");
        else if (foundTask.isFinished())
            System.out.println("warning: task has ever finished.");
        else {
            foundTask.setFinished(true);
            System.out.println("success: task has finished.");
        }
    }

    @Override
    public void makeTaskPending(String description) {
        Task foundTask = null;

        for (Task task : this.getTasks()) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                foundTask = task;
                break;
            }
        }

        if (foundTask == null)
            System.out.println("error: task not found.");
        else if (!foundTask.isFinished())
            System.out.println("warning: task has ever pending.");
        else {
            foundTask.setFinished(false);
            System.out.println("success: task has pending.");
        }
    }

    @Override
    public void clearTaskSet() {
        this.getTasks().clear();

        System.out.println("success: tasks set cleaned.");
    }
}
