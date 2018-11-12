package com.nick.service;

import com.nick.entity.User;

/**
 * Created by Nick.Chen on 2018/10/31 0031.
 *
 */
public interface UserService {

    /**
     * 根据指定异常回滚（事务）
     * @param user 用户
     * @return 保存之后的用户
     */
    User saveUserWithRollBack(User user);

    /**
     * 指定异常不回滚（事务）
     * @param user 用户
     * @return 保存之后的用户
     */
    User saveUserWithNoRollBack(User user);

}
