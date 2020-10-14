package com.first.community.service;

import com.first.community.dao.UserMapper;
import com.first.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper mapper;

    public User findByUsername(String username){
        return mapper.findUserByUsername(username);
    }
}
