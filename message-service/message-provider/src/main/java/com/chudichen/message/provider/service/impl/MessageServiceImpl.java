package com.chudichen.message.provider.service.impl;

import com.chudichen.message.provider.service.MessageService;
import org.springframework.stereotype.Service;

/**
 * @author Michael Chu
 * @since 2020-06-27 12:15
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public Boolean sendMessage(String mobile, String message) {
        System.out.println("send message to mobile: " + mobile + ", message: " + message);
        return true;
    }
}
