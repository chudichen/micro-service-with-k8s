package com.chudichen.user.provider.controller;

import com.chudichen.user.facade.vo.UserVO;
import com.chudichen.user.provider.service.UserService;
import org.springframework.web.bind.annotation.*;

/**
 * @author Michael Chu
 * @since 2020-06-27 12:12
 */
@RestController
@RequestMapping("/user")
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{username}")
    public UserVO getByUsername(@PathVariable String username) {
        return userService.getUserByName(username);
    }
}
