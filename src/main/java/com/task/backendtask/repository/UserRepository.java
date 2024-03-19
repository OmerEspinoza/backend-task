package com.task.backendtask.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.task.backendtask.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
