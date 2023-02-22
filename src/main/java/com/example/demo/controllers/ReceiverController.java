package com.example.demo.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ReceiverController {
    @MessageMapping("/sent")
    public void messageReceiver(String message) throws Exception {
        System.out.println(message);
    }
}