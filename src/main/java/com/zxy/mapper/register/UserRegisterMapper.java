package com.zxy.mapper.register;

import com.zxy.entity.UserAccountInfo;
import org.springframework.stereotype.Repository;

/**
 * @author RockerBaozi
 * @date 2019/5/16 17:15
 */
@Repository
public interface UserRegisterMapper {
    /**
     * 用户注册功能
     *
     * @param accountInfo
     * @return
     */
    int userRegister(UserAccountInfo accountInfo);
}
