package edu.set.tasks;

import edu.set.tasks.core.ITaskSet;
import edu.set.tasks.core.TaskSet;

public class App {
    private static void countTasks(ITaskSet taskSet) {
        System.out.println("tasks: " + taskSet.countTasks());
    }

    public static void main(String[] args) {
        ITaskSet taskSet = new TaskSet();

        taskSet.addNewTask("estudar csharp");
        taskSet.addNewTask("estudar java");
        taskSet.addNewTask("estudar python");

        countTasks(taskSet);

        taskSet.showTasks();

        taskSet.removeTask("estudar python");

        taskSet.showTasks();

        taskSet.makeTaskFinished("estudar csharp");
        taskSet.makeTaskFinished("estudar csharp");

        taskSet.showTasks();

        taskSet.makeTaskPending("estudar csharp");
        taskSet.makeTaskPending("estudar csharp");
        taskSet.addNewTask("estudar lua");
        taskSet.addNewTask("estudar python");

        taskSet.showTasks();

        taskSet.makeTaskFinished("estudar csharp");
        taskSet.makeTaskFinished("estudar java");

        taskSet.showTasks();

        System.out.println(taskSet.getFinishedTasks());
        System.out.println(taskSet.getPendingTasks());

        countTasks(taskSet);

        taskSet.clearTaskSet();

        countTasks(taskSet);

        taskSet.showTasks();
    }
}
