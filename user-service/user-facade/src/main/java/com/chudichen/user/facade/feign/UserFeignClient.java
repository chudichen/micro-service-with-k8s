package com.chudichen.user.facade.feign;

import com.chudichen.user.facade.fallback.UserFeignClientFallback;
import com.chudichen.user.facade.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Michael Chu
 * @since 2020-06-27 13:24
 */
@RequestMapping("/user")
@FeignClient(name="user-service", fallback = UserFeignClientFallback.class)
public interface UserFeignClient {

    /**
     * 通过用户名字
     *
     * @param username 用户名
     * @return 用户
     */
    @GetMapping("/{username}")
    UserVO getByUsername(@PathVariable String username);
}
