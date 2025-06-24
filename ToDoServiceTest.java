package com.example.todo;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ToDoServiceTest {

    @Test
    public void testAddAndRetrieveTasks() {
        ToDoService service = new ToDoService();
        service.addTask("Test Task");
        List<String> tasks = service.getAllTasks();
        assertEquals(1, tasks.size());
        assertEquals("Test Task", tasks.get(0));
    }

    @Test
    public void testRemoveTask() {
        ToDoService service = new ToDoService();
        service.addTask("Remove Me");
        assertTrue(service.removeTask("Remove Me"));
        assertTrue(service.getAllTasks().isEmpty());
    }
}