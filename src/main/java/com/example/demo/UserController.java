package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/greeting")
    public String greetings() {
        return "Hello world! Greetings from Spring Boot :)";
    }

    @CrossOrigin
    @GetMapping("/users")
    public List<User> all() {
        return userRepository.findAll();
    }
    
    @CrossOrigin
    @GetMapping("/users/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @CrossOrigin
    @PostMapping(value = "/new-user")
    public User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

}
