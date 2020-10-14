package com.first.community;

import com.first.community.dao.UserMapper;
import com.first.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommunityApplicationTests {
    @Autowired
    UserMapper mapper;

    @Test
    void contextLoads() {
        User root = mapper.findUserByUsername("root");
        System.out.println(root);
    }

}
