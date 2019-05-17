package com.zxy.controller.register;

import com.zxy.entity.UserAccountInfo;
import com.zxy.service.register.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RockerBaozi
 * @date 2019/5/16 17:31
 */
@RestController
@RequestMapping("/register")
public class UserRegisterController {

    @Autowired
    private UserRegisterService userRegisterService;

    @RequestMapping("re")
    public String UserRegister(UserAccountInfo accountInfo) {
        if (accountInfo.getUserAccount() == null && accountInfo.getUserPassword() == null) {
            return "Error_NULL_Exception";
        }

        int registerSuccess = userRegisterService.userRegister(accountInfo);

        if (registerSuccess > 0) {
            return "Register success";
        } else {
            return "Error";
        }
    }
}
