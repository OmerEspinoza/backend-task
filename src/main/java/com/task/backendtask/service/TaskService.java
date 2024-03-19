package com.task.backendtask.service;

import java.util.Optional;

import com.task.backendtask.model.Task;

public interface TaskService {

    public Iterable<Task> getAllTasks();

    public Optional<Task> getTaskById(Long id);

    public Task createOrUpdateTask(Task task);

    public void deleteTaskById(Long id);

}
