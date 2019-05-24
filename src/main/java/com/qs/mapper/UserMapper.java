package com.qs.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qs.entity.User;

public interface UserMapper extends BaseMapper<User> {

    User getUserById(String userId);
}