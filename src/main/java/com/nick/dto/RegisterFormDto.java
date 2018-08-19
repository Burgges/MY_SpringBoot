package com.nick.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 注册表单实体
 * Created by Nick on 2018/8/19.
 */
public class RegisterFormDto {

    @NotNull
    @Size(min = 4, max = 10)
    private String userName;

    @NotNull
    @Size(min = 6, max = 16)
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
