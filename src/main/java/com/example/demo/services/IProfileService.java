package com.example.demo.services;

import com.example.demo.entities.Profile;

import java.util.List;

public interface IProfileService {
    public List<Profile> getAll();

    Profile getById(Long id);

    void remove(Long id);

    void save(Profile profile);
}
