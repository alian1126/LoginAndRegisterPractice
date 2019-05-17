package com.zxy.mapper.login;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

/**
 * @author RockerBaozi
 * @date 2019/5/17 11:53
 */
@Repository
public interface UserLoginMapper {
    /**
     * 登录校验
     *
     * @param userAccount
     * @param userPassword
     * @return
     */
    HashMap loginCheck(String userAccount, String userPassword);
}
