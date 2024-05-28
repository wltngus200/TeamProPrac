package com.green.p1firstproject.user;

import com.green.p1firstproject.user.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
@Slf4j
public class UserService {
    private final UserMapper mapper;

    int signUpUser(SignUpReq p){
        String hashPass=BCrypt.hashpw(p.getUpw(),BCrypt.gensalt());
        log.info("{}", p);
        p.setUpw(hashPass);
        log.info("{}", p);
        return mapper.signUpUser(p);
    }
    SignInRes signInUser(SignInReq p){
        User user=mapper.findUserByUid(p.getUid());
        if(user==null){throw new RuntimeException("일치하는 회원을 찾을 수 없습니다");}
        if(!BCrypt.checkpw(p.getUpw(), user.getUpw())){
            throw new RuntimeException("비밀번호가 일치하지 않습니다");
        }
        return SignInRes.builder()
                .userId(user.getUserId())
                .nm(user.getNm())
                .createdAt(user.getCreatedAt())
                .updatedAt(user.getUpdatedAt())
                .build();
    }
//    @Transactional
//    User updateUser(UpdateReq p){
//        SignInReq req=SignInReq.builder().uid(p.getUid()).upw(p.getUpw()).build();
//        SignInRes res=signInUser(); //오류 던지고 아이디, 비번 외 정보 리턴
//        long signedUserId=res.getUserId();
//        return mapper.updateUser(signedUserId,p);
//    }

}
