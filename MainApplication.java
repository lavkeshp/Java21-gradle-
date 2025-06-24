package com.example.todo;

public class MainApplication {
    public static void main(String[] args) {
        ToDoService todoService = new ToDoService();
        todoService.addTask("Learn DevSecOps");
        todoService.addTask("Integrate SonarQube");
        todoService.getAllTasks().forEach(System.out::println);
    }
}