package com.example.admin.sevice;

import com.example.admin.model.UserInfo;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}