package zach.springframework.simplebank.User.services;

import zach.springframework.simplebank.User.models.User;
import zach.springframework.simplebank.User.repositories.UserRepository;
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

    public Optional<User> getUser(String name) {

        return userRepository.findById(name);
    }

    public Map<String, User> getAllUsers() {
        Map<String, User> userHashMap = new HashMap<>();
        userRepository.findAll().forEach((user) -> {
            userHashMap.put(user.getUserName(), user);
        });
        return userHashMap;

    }

    public void deleteUser(String name){
        userRepository.deleteById(name);
    }

}
