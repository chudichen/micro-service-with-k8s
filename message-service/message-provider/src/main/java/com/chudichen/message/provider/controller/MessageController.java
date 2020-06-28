package com.chudichen.message.provider.controller;

import com.chudichen.message.provider.service.MessageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Michael Chu
 * @since 2020-06-27 12:12
 */
@RestController
@RequestMapping("/message")
public class MessageController {


    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/send")
    public Boolean sendMessage(@RequestParam String mobile, @RequestParam String message) {
        return messageService.sendMessage(mobile, message);
    }
}
