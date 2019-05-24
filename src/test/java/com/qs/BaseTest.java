package com.qs;

import com.qs.entity.User;
import com.qs.mapper.UserMapper;
import com.qs.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mybatis-plus.xml")
public class BaseTest {

    @Resource
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        System.out.println("--->>>userService=" + userService);
        System.out.println("---->>>>userMapper=" + userMapper);
    }


    @Test
    public void test2() {
        User user = userMapper.selectById("1111");
        System.out.println("---->>>user=" + user);
    }


    @Test
    public void test3(){
        User user = userMapper.getUserById("1111");
        System.out.println("---->>>user=" + user);
    }

}
