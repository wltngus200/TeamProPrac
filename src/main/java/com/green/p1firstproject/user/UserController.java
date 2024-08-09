package com.green.p1firstproject.user;

import com.green.p1firstproject.user.model.*;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/user")
@Slf4j
public class UserController {
    private final UserService service;

    @PostMapping("sign-up")
    @Operation(description = "dkadfnajdnfjdanfjnqjnkjndnaknreja")
    public int signUpUser(@ParameterObject @ModelAttribute SignUpReq p){
        log.info("{}", p);
        return service.signUpUser(p);
    }
    @PostMapping("sign-in")
    public SignInRes signInUser(@ParameterObject @ModelAttribute SignInReq p){
        return service.signInUser(p);
    }

    //@PutMapping//pic이 없으니 이게 다네... 폴더 삭제도 해 볼겸 해볼 걸
    //public User updateUser(@ParameterObject @ModelAttribute UpdateReq p){
    //    return service.updateUser(p);
    //}


}
