package com.example.subscriptions.pojos;

import java.util.UUID;

public class Notification {
    public UUID getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(UUID subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private UUID subscriberId;
    private String content;

    public Notification(UUID subscriberId, String content) {
        this.subscriberId = subscriberId;
        this.content = content;
    }
}
