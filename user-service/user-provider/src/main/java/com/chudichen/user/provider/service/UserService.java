package com.chudichen.user.provider.service;

import com.chudichen.user.facade.vo.UserVO;

/**
 * 消息服务
 *
 * @author Michael Chu
 * @since 2020-06-27 12:12
 */
public interface UserService {

    UserVO getUserByName(String name);
}
