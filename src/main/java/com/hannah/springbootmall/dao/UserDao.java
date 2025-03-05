package com.hannah.springbootmall.dao;

import com.hannah.springbootmall.dto.UserRegisterRequest;
import com.hannah.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);
    User getUserByEmail(String email);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
