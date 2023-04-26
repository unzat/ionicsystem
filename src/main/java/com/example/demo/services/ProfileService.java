package com.example.demo.services;

import com.example.demo.entities.Profile;
import com.example.demo.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProfileService implements IProfileService{
    @Autowired
    private ProfileRepository repository;
    @Override
    public List<Profile> getAll() {
        return (List<Profile>) repository.findAll();
    }

    @Override
    public Profile getById(Long id) {
        return (Profile) repository.findById(id).get();
    }
    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
    @Override
    public void save(Profile profile) {
        repository.save(profile);
    }
}
