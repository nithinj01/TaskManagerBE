package com.taskmanager.demo.controller;

// TaskController.java
import com.taskmanager.demo.model.Task;
import com.taskmanager.demo.service.TaskService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

// TaskController.java


@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "http://localhost:3000") // Adjust the origin based on your frontend URL


public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    @CrossOrigin(origins = "http://localhost:3000") // Adjust the origin based on your frontend URL
    public Flux<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    @CrossOrigin(origins = "http://localhost:3000") // Adjust the origin based on your frontend URL
    public Mono<Task> createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PostMapping("/{taskId}/complete")
    @CrossOrigin(origins = "http://localhost:3000") // Adjust the origin based on your frontend URL
    public Mono<Task> completeTask(@PathVariable String taskId) {
        return taskService.completeTask(taskId);
    }
}
