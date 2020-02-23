package com.example.subscriptions.interfaces;

import com.example.subscriptions.pojos.Subscription;

import java.util.UUID;

/*
    Subscription Service interface implementation. The specific implementation will make the
    request to the Subscription Service and fetch the json. The one implementation in this code
    is for an in-memory representation.
 */


public interface ISubscriptionService {
    public UUID newSubscription(Subscription s);
    public Subscription getSubscriptionData(UUID id);
}
