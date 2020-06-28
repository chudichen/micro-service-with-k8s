package com.chudichen.user.facade.fallback;

import com.chudichen.user.facade.feign.UserFeignClient;
import com.chudichen.user.facade.vo.UserVO;

/**
 * @author Michael Chu
 * @since 2020-06-27 13:35
 */
public class UserFeignClientFallback implements UserFeignClient {

    @Override
    public UserVO getByUsername(String username) {
        return new UserVO();
    }
}
