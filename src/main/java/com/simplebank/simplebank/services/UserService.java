package com.simplebank.simplebank.services;

import com.simplebank.simplebank.models.User;
import com.simplebank.simplebank.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {
    UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public Optional<User> getUser(String userName) {

        return userRepository.findById(userName);
    }

    public Map<String, User> getAllUsers() {
        Map<String, User> userHashMap = new HashMap<>();
        userRepository.findAll().forEach((user) -> {
            userHashMap.put(user.getUserName(), user);
        });
        return userHashMap;

    }

    public void deleteUser(String userName){
        userRepository.deleteById(userName);
    }

}
