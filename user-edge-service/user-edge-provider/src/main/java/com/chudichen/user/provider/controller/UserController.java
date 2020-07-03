package com.chudichen.user.provider.controller;

import com.chudichen.user.facade.feign.UserFeignClient;
import com.chudichen.user.facade.vo.UserVO;
import com.chudichen.user.provider.vo.LoginResponse;
import com.chudichen.user.provider.vo.Response;
import org.apache.tomcat.util.buf.HexUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Random;

/**
 * @author Michael Chu
 * @since 2020-06-27 12:12
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static final String KEY = "0123456789abcdefghijklmnopqrstuvwxyz";
    private static final int SIZE = 32;
    private final UserFeignClient userFeignClient;
    private static final Random RANDOM = new Random();

    public UserController(UserFeignClient userFeignClient) {
        this.userFeignClient = userFeignClient;
    }

    @GetMapping(value="/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    public Response login(@RequestParam("username") String username,
                          @RequestParam("password") String password) {

        //1. 验证用户名密码
        UserVO userInfo;
        try {
            userInfo = userFeignClient.getByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
            return Response.USERNAME_PASSWORD_INVALID;
        }
        if (userInfo == null) {
            return Response.USERNAME_PASSWORD_INVALID;
        }
        if (!userInfo.getPassword().equalsIgnoreCase(md5(password))) {
            return Response.USERNAME_PASSWORD_INVALID;
        }

        //2. 生成token
        String token = genToken();

        //3. 缓存用户
        return new LoginResponse(token);
    }

    private String genToken() {
        return randomCode();
    }

    private String randomCode() {
        StringBuilder result = new StringBuilder(SIZE);


        for (int i = 0; i < SIZE; i++) {
            int loc = RANDOM.nextInt(KEY.length());
            result.append(KEY.charAt(loc));
        }
        return result.toString();
    }

    private String md5(String password) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] md5Bytes = md5.digest(password.getBytes(StandardCharsets.UTF_8));
            return HexUtils.toHexString(md5Bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
