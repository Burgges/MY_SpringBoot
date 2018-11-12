package com.nick.service.impl;

import com.nick.entity.User;
import com.nick.mapper.UserMapper;
import com.nick.service.UserService;
import com.nick.utils.RunException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Nick.Chen on 2018/10/31 0031.
 *
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private UserMapper userMapper;

    @Override
    @Transactional //(rollbackFor = {IllegalArgumentException.class})
    public User saveUserWithRollBack(User user) {

        userMapper.save(user);

//        if ("nick".equals(user.getUserName())) {
//            throw new RunException("数据异常，数据将回滚!");
//        }

        if ("jack6".equals(user.getUserName())) {
            throw new RunException("异常");
        }

        String numStr = "1,0";
        Integer num = Integer.parseInt(numStr);
        LOGGER.info("num: {}", num);
        return null;
    }

    @Override
    @Transactional(noRollbackFor = {RunException.class})
    public User saveUserWithNoRollBack(User user) {
        userMapper.save(user);

        if ("nick".equals(user.getUserName())) {
            throw new RunException("数据异常，数据不回滚!");
        }

        if ("jack5".equals(user.getUserName())) {
            throw new IllegalArgumentException("异常");
        }

        return null;
    }
}
