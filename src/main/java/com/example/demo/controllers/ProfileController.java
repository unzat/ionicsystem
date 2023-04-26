package com.example.demo.controllers;

import com.example.demo.entities.Profile;
import com.example.demo.services.IProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProfileController {
    @Autowired
    private IProfileService service;
    @GetMapping("/api/profiles")
    public List<Profile> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/profiles/{id}")
    public Profile getById(@PathVariable String id) {
        return service.getById(Long.parseLong(id));
    }
    @DeleteMapping("/api/profiles/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Long.parseLong(id));
    }
    @PostMapping ("/api/profiles")
    public void save(@RequestBody Profile profile) {
        service.save(profile);
    }
}
