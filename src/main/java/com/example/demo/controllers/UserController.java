package com.example.demo.controllers;

import com.example.demo.entities.User;
import com.example.demo.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserService service;
    @GetMapping("/api/users")
    public List<User> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/users/{id}")
    public User getById(@PathVariable String id) {
        return service.getById(Long.parseLong(id));
    }
    @DeleteMapping("/api/users/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Long.parseLong(id));
    }
    @PostMapping ("/api/users")
    public void save(@RequestBody User user) {
        service.save(user);
    }
}
