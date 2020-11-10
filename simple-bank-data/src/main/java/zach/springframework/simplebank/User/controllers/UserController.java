package zach.springframework.simplebank.User.controllers;

import zach.springframework.simplebank.User.models.User;
import zach.springframework.simplebank.User.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
public class UserController {

    private UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/user")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping("/user/{name}")
    public Optional<User> getUser(@PathVariable String name) {
        return userService.getUser(name);
    }

    @GetMapping("/user")
    public Map<String, User> getAllUsers() {
        return userService.getAllUsers();
    }


    @DeleteMapping("/user/{userName}")
    public void deleteUser(@PathVariable String name) {
        userService.deleteUser(name);
    }

}
