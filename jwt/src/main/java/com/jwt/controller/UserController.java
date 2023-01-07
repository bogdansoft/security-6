package com.jwt.controller;

import com.jwt.model.User;
import com.jwt.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {

    private final UserRepository repository;

    @GetMapping
    public List<User> getUsers() {
        return List.of(new User("vasia", "skdjf", "jhgjh", "sjgd"), new User("mykola", "skdjf", "jhgjh", "sjgd"));
    }
}
