package com.example.subscriptions.interfaces;

import java.util.UUID;

public interface INotificationService {
    public UUID pushNotification(UUID userInfo, String content);
}
