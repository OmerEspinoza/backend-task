package com.task.backendtask.service;

import java.util.Optional;

import com.task.backendtask.model.User;

public interface UserService {

    public Iterable<User> getAllUsers();

    public Optional<User> getUserById(Long id);

    public User createOrUpdateUser(User user);

    public void deleteUserById(Long id);
}
