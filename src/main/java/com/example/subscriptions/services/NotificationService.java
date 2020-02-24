package com.example.subscriptions.services;

import com.example.subscriptions.interfaces.INotificationService;
import com.example.subscriptions.pojos.Notification;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.UUID;

@Component
public class NotificationService implements INotificationService {

    private HashMap<UUID, Notification> queuedNotifications = new HashMap<>();

    @Override
    public UUID pushNotification(UUID userInfo, String content) {
        Notification n = new Notification(userInfo, content);
        UUID notificationId = UUID.randomUUID();
        queuedNotifications.put(notificationId, n);
        return notificationId;
    }
}
