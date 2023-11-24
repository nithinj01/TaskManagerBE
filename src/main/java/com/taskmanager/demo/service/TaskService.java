package com.taskmanager.demo.service;

// TaskService.java
import com.taskmanager.demo.model.Task;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TaskService {
    Flux<Task> getAllTasks();
    Mono<Task> createTask(Task task);
    Mono<Task> completeTask(String taskId);
}

