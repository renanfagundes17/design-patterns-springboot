package com.example.designpatterns.service;

public class SMSNotification implements NotificationService {
    @Override
    public String sendNotification(String message) {
        return "SMS enviado com a mensagem: " + message;
    }
}