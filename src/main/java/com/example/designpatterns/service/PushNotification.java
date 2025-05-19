package com.example.designpatterns.service;

public class PushNotification implements NotificationService {
    @Override
    public String sendNotification(String message) {
        return "Push enviado com a mensagem: " + message;
    }
}