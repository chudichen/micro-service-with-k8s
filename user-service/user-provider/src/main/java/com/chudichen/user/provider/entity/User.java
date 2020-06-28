package com.chudichen.user.provider.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Michael Chu
 * @since 2020-06-27 12:57
 */
@Data
@TableName("pe_user")
public class User {

    @TableId
    public Integer id;
    public String username;
    public String password;
    @TableField("real_name")
    public String realName;
    public String mobile;
    public String email;
}
