package com.example.todo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ToDoService {
    private final List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        if (task != null && !task.trim().isEmpty()) {
            tasks.add(task.trim());
        }
    }

    public List<String> getAllTasks() {
        return Collections.unmodifiableList(tasks);
    }

    public boolean removeTask(String task) {
        return tasks.remove(Objects.requireNonNull(task).trim());
    }
}