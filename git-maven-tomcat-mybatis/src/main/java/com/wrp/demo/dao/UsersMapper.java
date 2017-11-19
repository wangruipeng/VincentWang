package com.wrp.demo.dao;

import com.wrp.demo.model.Users;

public interface UsersMapper {
    int insert(Users record);

    int insertSelective(Users record);
    
    Users findById(String id);
}