package com.example.springboot_realtime_notifications_websocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


@Controller
public class NotificationController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/notifications")
    public String sendMessage(String message) {
        System.out.println("Message sent: " + message);
        return message;
    }
}
