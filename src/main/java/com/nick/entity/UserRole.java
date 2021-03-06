package com.nick.entity;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * 用户角色关系表
 *
 * Created by nick on 9/20/2017.
 *
 */
@Table(name = "user_role")
public class UserRole {

    private Integer id;

    private Integer userId;

    private Integer roleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public UserRole(Integer userId, Integer roleId){
        super();
        this.userId = userId;
        this.roleId = roleId;
    }

    public UserRole(){
        super();
    }
}
