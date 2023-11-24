package com.taskmanager.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

// Task.java
import lombok.Data;

@Data
public class Task {
    private String id;
    private String title;
    private boolean completed;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
