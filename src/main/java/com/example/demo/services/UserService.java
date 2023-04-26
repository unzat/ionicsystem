package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserService{
    @Autowired
    private UserRepository repository;
    @Override
    public List<User> getAll() {
        return (List<User>) repository.findAll();
    }

    @Override
    public User getById(Long id) {
        return (User) repository.findById(id).get();
    }
    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
    @Override
    public void save(User user) {
        repository.save(user);
    }
}
