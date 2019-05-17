package com.zxy.service.login;

import com.zxy.mapper.login.UserLoginMapper;
import com.zxy.tool.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @author RockerBaozi
 * @date 2019/5/17 11:55
 */
@Service
public class UserLoginService {
    @Autowired
    UserLoginMapper userLoginMapper;

    public HashMap loginCheck(String userAccount, String userPassword) {

        MD5 md5 = new MD5();
        String transferPassword = md5.transferToMD5(userPassword);

        return userLoginMapper.loginCheck(userAccount, transferPassword);
    }
}
