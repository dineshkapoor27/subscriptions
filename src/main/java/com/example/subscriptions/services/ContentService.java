package com.example.subscriptions.services;

import com.example.subscriptions.interfaces.IContentService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

@Component
public class ContentService implements IContentService {

    private HashMap<newletterType, String> contentData = new HashMap<>();


    public ContentService() {
        contentData.put(newletterType.VERIFY_EMAIL, "Hi {first_name}! Please verify your email address by clicking the link here: {link}");
        contentData.put(newletterType.WEEKLY_UPDATE, "Hi {first_name}!, We have got good deals for you in this week.");
    }

    @Override
    public String getNewsLetterContent(newletterType n, String[] variables) {
        String template =  contentData.get(n);
        return String.format(template, (Object []) (variables));

    }
}
