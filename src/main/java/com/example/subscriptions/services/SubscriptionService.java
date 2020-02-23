package com.example.subscriptions.services;

import com.example.subscriptions.interfaces.ISubscriptionService;
import com.example.subscriptions.pojos.Subscription;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.UUID;

@Component
public class SubscriptionService implements ISubscriptionService {

    private HashMap<UUID, Subscription> subscriptionData;

    public SubscriptionService() {
        subscriptionData = new HashMap<UUID, Subscription>();
    }

    @Override
    public UUID newSubscription(Subscription subscription) {
        UUID subscriptionId = UUID.randomUUID();
        subscriptionData.put(subscriptionId, subscription);
        return subscriptionId;
    }

    @Override
    public Subscription getSubscriptionData(UUID id) {
        return subscriptionData.get(id);
    }
}
