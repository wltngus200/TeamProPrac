package com.green.p1firstproject.user.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private long userId;
    private String uid;
    private String upw;
    private String nm;
    private String createdAt;
    private String updatedAt;
}
