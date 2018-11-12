package com.nick.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * User role class
 * Created by nick on 2017/7/18.
 *
 */
@Table(name = "role")
public class Role extends BaseModel {

    @Id
    @GeneratedValue
    private Integer Id;

    @NotNull(message = "Role name is not null!")
    @Column(unique = true)
    private String roleName;

    private String roleDescription;

//    @NotNull(message = "Authority code is not null!")
//    private String authorityCode; //权限代码（关联lookupCode中的code）

    //权限列表
    private List<Permission> permissionList = new LinkedList<Permission>();

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

//    public String getAuthorityCode() {
//        return authorityCode;
//    }
//
//    public void setAuthorityCode(String authorityCode) {
//        this.authorityCode = authorityCode;
//    }

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }
}
