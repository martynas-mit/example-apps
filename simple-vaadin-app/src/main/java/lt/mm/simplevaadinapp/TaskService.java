package lt.mm.simplevaadinapp;

import java.util.ArrayList;
import java.util.List;

public class TaskService {

    private static TaskService instance;

    private List<Task> tasks = new ArrayList<>();

    public static TaskService getInstance() {
        if (instance == null) {
            instance = new TaskService();
        }
        return instance;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> findAll() {
        return tasks;
    }

}
