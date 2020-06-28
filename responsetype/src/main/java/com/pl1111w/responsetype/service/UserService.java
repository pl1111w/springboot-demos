package com.pl1111w.responsetype.service;

import com.pl1111w.responsetype.entity.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String,User> dataMap = new HashMap<>();
    static {
        dataMap.put("1",new User("1","aaa"));
        dataMap.put("2",new User("1","bbb"));
        dataMap.put("3",new User("1","ccc"));
        dataMap.put("4",new User("1","fff"));
        dataMap.put("5",new User("1","eee"));

    }

    public Flux<User> userList(){
        Collection<User> list = UserService.dataMap.values();
        return Flux.fromIterable(list);
    }

    public Mono<User> getById(final String id){
        return Mono.justOrEmpty(UserService.dataMap.get(id));
    }

    public Mono<User> removeById(final String id){
        return Mono.justOrEmpty(UserService.dataMap.remove(id));
    }
}
