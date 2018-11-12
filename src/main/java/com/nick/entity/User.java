package com.nick.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * Created by nick on 2017/07/06.
 *
 */
@Entity(name = "user")
public class User extends BaseModel {

    //用户ID
    @Id
    @GeneratedValue
    private Integer id;
    //用户名
    @Column(unique = true)
    private String userName;
    //密码
    private String password;
    //性别
    private String userSex;
    //邮箱
    private String userMail;
    //角色
//    private Integer roleId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

 /*   public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }*/

    public User() {
        super();
    }

    public User(String userName, String userSex) {
        this.userName = userName;
        this.userSex = userSex;
    }
}
