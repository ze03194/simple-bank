package com.simplebank.simplebank.controllers;

import com.simplebank.simplebank.models.User;
import com.simplebank.simplebank.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
public class UserController {

    private UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/user/{userName}")
    public Optional<User> getUser(@PathVariable String userName) {
        return userService.getUser(userName);
    }

    @PostMapping("/user")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping("/user")
    public Map<String, User> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/user/{userName}")
    public void deleteUser(@PathVariable String userName){
        userService.deleteUser(userName);
    }

}
