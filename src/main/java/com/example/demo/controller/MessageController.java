package com.example.demo.controller;

import com.example.demo.model.Message;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
    public Message send(String content) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Message(content);
    }
}
