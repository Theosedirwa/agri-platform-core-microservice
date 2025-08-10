/*package com.agri_platform.agri_core_service.controller;

import org.springframework.web.bind.annotation.*;

import com.agri_platform.agri_core_service.entities.UserModel;
import com.agri_platform.agri_core_service.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<UserModel> getAllUsers() {
        return repository.findAll();
    }

    @PostMapping
    public UserModel createUser(@RequestBody UserModel user) {
        return repository.save(user);
    }
}*/