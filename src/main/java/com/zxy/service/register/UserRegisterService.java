package com.zxy.service.register;

import com.zxy.entity.UserAccountInfo;
import com.zxy.mapper.register.UserRegisterMapper;
import com.zxy.tool.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author RockerBaozi
 * @date 2019/5/16 17:28
 */
@Service
public class UserRegisterService {

    @Autowired
    private UserRegisterMapper userRegisterMapper;

    public int userRegister(UserAccountInfo accountInfo) {

        MD5 md5 = new MD5();
        String transferPassword = md5.transferToMD5(accountInfo.getUserPassword());
        accountInfo.setUserPassword(transferPassword);

        return userRegisterMapper.userRegister(accountInfo);
    }
}
