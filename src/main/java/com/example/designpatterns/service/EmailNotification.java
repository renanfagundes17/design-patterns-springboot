package com.example.designpatterns.service;

public class EmailNotification implements NotificationService {
    @Override
    public String sendNotification(String message) {
        return "Email enviado com a mensagem: " + message;
    }
}