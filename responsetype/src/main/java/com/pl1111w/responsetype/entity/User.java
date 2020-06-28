package com.pl1111w.responsetype.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private String name;

    private String id;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
