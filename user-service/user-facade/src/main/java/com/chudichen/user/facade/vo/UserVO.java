package com.chudichen.user.facade.vo;

import lombok.Data;

/**
 * @author Michael Chu
 * @since 2020-06-27 12:53
 */
@Data
public class UserVO {

    public Integer id;
    public String username;
    public String password;
    public String realName;
    public String mobile;
    public String email;
}
