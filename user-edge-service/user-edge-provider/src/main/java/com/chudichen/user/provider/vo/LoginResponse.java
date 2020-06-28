package com.chudichen.user.provider.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Michael Chu
 * @since 2020-06-27 14:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse extends Response {

    private String token;
}
