package com.green.p1firstproject.user;

import com.green.p1firstproject.user.model.SignInReq;
import com.green.p1firstproject.user.model.SignUpReq;
import com.green.p1firstproject.user.model.UpdateReq;
import com.green.p1firstproject.user.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int signUpUser(SignUpReq p);

    User findUserByUid(String uid);

    User updateUser(long signedUserId, UpdateReq p);
}
