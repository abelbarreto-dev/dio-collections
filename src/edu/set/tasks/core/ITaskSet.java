package edu.set.tasks.core;

import edu.set.tasks.model.Task;

import java.util.Set;

public interface ITaskSet {
    void addNewTask(String description);
    void removeTask(String description);
    void showTasks();
    int countTasks();
    Set<Task> getFinishedTasks();
    Set<Task> getPendingTasks();
    void makeTaskFinished(String description);
    void makeTaskPending(String description);
    void clearTaskSet();
}
