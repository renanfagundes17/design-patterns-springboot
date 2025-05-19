package com.example.designpatterns.controller;

import com.example.designpatterns.factory.NotificationFactory;
import com.example.designpatterns.service.NotificationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notify")
public class NotificationController {

    @PostMapping("/{type}")
    public String sendNotification(@PathVariable String type, @RequestParam String message) {
        NotificationService service = NotificationFactory.getService(type);
        if (service == null) {
            return "Tipo de notificação inválido.";
        }
        return service.sendNotification(message);
    }
}