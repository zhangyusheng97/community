package com.first.community.dao;

import com.first.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    public abstract User findUserByUsername(String username);
}
