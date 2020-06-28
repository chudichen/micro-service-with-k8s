package com.chudichen.message.provider.service;

/**
 * 消息服务
 *
 * @author Michael Chu
 * @since 2020-06-27 12:12
 */
public interface MessageService {

    Boolean sendMessage(String mobile, String message);
}
