package com.example.subscriptions.controllers;


import com.example.subscriptions.exceptions.RecordNotFoundException;
import com.example.subscriptions.interfaces.ISubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import com.example.subscriptions.pojos.Subscription;

import java.util.UUID;

@RestController
public class SubscriptionController {

    @Autowired
    ISubscriptionService subscriptionService;

    @RequestMapping(value = {"/subscription"}, method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> createSubscription(@Valid @RequestBody Subscription subscription) {
        subscription.setSubscriptionId(subscriptionService.newSubscription(subscription));

        return ResponseEntity.ok(String.format("{subscriptionId: %s}", subscription.getSubscriptionId()));
    }

    @RequestMapping(value = {"/subscription"}, method = RequestMethod.GET)
    public ResponseEntity<Subscription> getSubscription(@RequestParam("id") UUID subscriptionId) throws RecordNotFoundException {

        Subscription s = subscriptionService.getSubscriptionData(subscriptionId);
        if (s == null) {
            throw new RecordNotFoundException("No record found for id: " + subscriptionId);
        }
        return new ResponseEntity<Subscription>(s, HttpStatus.OK);
    }
}
