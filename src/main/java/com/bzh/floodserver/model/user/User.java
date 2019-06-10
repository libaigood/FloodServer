package com.bzh.floodserver.model.user;

import java.util.Date;

/**
 * @Author: libai
 * @Date: 2019/6/3 9:50
 * @Version 1.0
 * @Description:
 */
public class User implements LoginDetail, TokenDetail {

    private String id;
    private String username;
    private String password;
    private String authorities;
    private Date lastPasswordChange;
    private char enable;
    private String token;

    public User() {
    }

    public User(String id, String username, String password, String authorities, Date lastPasswordChange, char enable, String token) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.authorities = authorities;
        this.lastPasswordChange = lastPasswordChange;
        this.enable = enable;
        this.token = token;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public boolean enable() {
        if (this.enable == '1') {
            return true;
        }
        return false;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public Date getLastPasswordChange() {
        return lastPasswordChange;
    }

    public void setLastPasswordChange(Date lastPasswordChange) {
        this.lastPasswordChange = lastPasswordChange;
    }

    public char getEnable() {
        return enable;
    }

    public void setEnable(char enable) {
        this.enable = enable;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", authorities='" + authorities + '\'' +
                ", lastPasswordChange=" + lastPasswordChange +
                ", enable=" + enable +
                ", token='" + token + '\'' +
                '}';
    }
}
