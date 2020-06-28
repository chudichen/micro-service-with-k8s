package com.chudichen.user.provider.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chudichen.user.facade.vo.UserVO;
import com.chudichen.user.provider.entity.User;
import com.chudichen.user.provider.mapper.UserMapper;
import com.chudichen.user.provider.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * 用户服务
 *
 * @author Michael Chu
 * @since 2020-06-27 12:15
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public UserVO getUserByName(String name) {
        User user = userMapper.selectOne(new QueryWrapper<User>().lambda().select().eq(User::getUsername, name));
        UserVO userVO = new UserVO();
        if (user == null) {
            user = new User();
        }
        BeanUtils.copyProperties(user, userVO);
        return userVO;
    }

}
