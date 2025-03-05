package com.hannah.springbootmall.service.impl;

import com.hannah.springbootmall.dao.UserDao;
import com.hannah.springbootmall.dto.UserRegisterRequest;
import com.hannah.springbootmall.model.User;
import com.hannah.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
