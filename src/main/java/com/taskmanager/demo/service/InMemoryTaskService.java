package com.taskmanager.demo.service;

// InMemoryTaskService.java
import com.taskmanager.demo.model.Task;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class InMemoryTaskService implements TaskService {

    private final List<Task> tasks = new ArrayList<>();

    @Override
    public Flux<Task> getAllTasks() {
        return Flux.fromIterable(tasks);
    }

    @Override
    public Mono<Task> createTask(Task task) {
        task.setId(UUID.randomUUID().toString());
        tasks.add(task);
        return Mono.just(task);
    }

    @Override
    public Mono<Task> completeTask(String taskId) {
        return Mono.defer(() -> {
            for (Task task : tasks) {
                if (task.getId().equals(taskId)) {
                    task.setCompleted(true);
                    return Mono.just(task);
                }
            }
            return Mono.empty();
        });
    }
}

