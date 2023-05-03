package com.xavier.config.client.web;

import com.xavier.config.client.dao.UserRepository;
import com.xavier.config.client.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserRepository userRepository;

    @GetMapping("/getAll")
    public Flux<UserEntity> getAllUser() {
        return userRepository.findAll();
    }

    @PostMapping("/add")
    public Mono<UserEntity> addUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
