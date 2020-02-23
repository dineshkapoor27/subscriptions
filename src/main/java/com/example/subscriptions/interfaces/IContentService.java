package com.example.subscriptions.interfaces;

import java.util.HashMap;
import java.util.UUID;

/*
    Interface to content service, other implementation will query a separate content service to
    get notification data. This is an in-memory representation of the same.
 */
public interface IContentService {

     public enum newletterType {
        VERIFY_EMAIL,
        WEEKLY_UPDATE
    }

    public String getNewsLetterContent(newletterType n, String[] k);
}
