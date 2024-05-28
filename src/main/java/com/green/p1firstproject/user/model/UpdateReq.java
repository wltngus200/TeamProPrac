package com.green.p1firstproject.user.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateReq {
    private String newNm;
    private String newPw;

    private String uid;
    private String upw;

}
