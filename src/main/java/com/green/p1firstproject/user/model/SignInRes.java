package com.green.p1firstproject.user.model;

import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class SignInRes {
    private long userId;
    private String nm;
    private String createdAt;
    private String updatedAt;
}
