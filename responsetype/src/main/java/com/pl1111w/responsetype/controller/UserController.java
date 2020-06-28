package com.pl1111w.responsetype.controller;

import com.pl1111w.responsetype.entity.User;
import com.pl1111w.responsetype.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("user/query")
    public Mono<User> queryById(){
       return userService.getById("1");
    }

    @PostMapping("user/delete")
    public Mono<User> deleteById(String id){
        return userService.removeById(id);
    }

    @GetMapping(value = "user/list",produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<User> queryList(){
        return userService.userList().delayElements(Duration.ofSeconds(2));
    }


}
