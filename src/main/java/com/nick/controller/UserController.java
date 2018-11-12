package com.nick.controller;

import com.nick.entity.User;
import com.nick.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Nick.Chen on 2018/10/31 0031.
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("事务指定异常回滚")
    @RequestMapping(value = "/rollBack", method = RequestMethod.POST)
    public User rollback(@RequestBody User user) {
        return userService.saveUserWithRollBack(user);
    }

    @ApiOperation("事务指定异常不回滚")
    @PostMapping(value = "/noRollBack")
    public User noRollback(@RequestBody User user) {
        return userService.saveUserWithNoRollBack(user);
    }
}
