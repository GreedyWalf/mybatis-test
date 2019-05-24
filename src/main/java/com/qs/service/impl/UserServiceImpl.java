package com.qs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qs.entity.User;
import com.qs.mapper.UserMapper;
import com.qs.service.UserService;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
