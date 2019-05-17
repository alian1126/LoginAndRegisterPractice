package com.zxy.controller.login;

import com.zxy.service.login.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author RockerBaozi
 * @date 2019/5/17 11:58
 */
@RestController
@RequestMapping("/login")
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping("check")
    public String loginCheck(String userAccount, String userPassword) {

        if (userAccount == null && userPassword == null) {
            return "Error_NULL Exception";
        }

        HashMap userList = userLoginService.loginCheck(userAccount, userPassword);

        if (userList != null) {
            return "success";
        }

        return "false";
    }
}
