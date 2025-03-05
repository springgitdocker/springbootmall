package com.hannah.springbootmall.service;

import com.hannah.springbootmall.dto.UserRegisterRequest;
import com.hannah.springbootmall.model.User;

public interface UserService {
    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);
}
