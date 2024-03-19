package com.task.backendtask.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.task.backendtask.model.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {

}
