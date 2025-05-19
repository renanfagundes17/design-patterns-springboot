package com.example.designpatterns.factory;

import com.example.designpatterns.service.*;

public class NotificationFactory {

    public static NotificationService getService(String type) {
        return switch (type.toLowerCase()) {
            case "email" -> new EmailNotification();
            case "sms" -> new SMSNotification();
            case "push" -> new PushNotification();
            default -> null;
        };
    }
}