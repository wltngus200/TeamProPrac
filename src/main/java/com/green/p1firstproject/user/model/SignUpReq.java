package com.green.p1firstproject.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpReq {
    @JsonIgnore
    private long userId;

    private String uid;
    private String upw;
    private String nm;
}
