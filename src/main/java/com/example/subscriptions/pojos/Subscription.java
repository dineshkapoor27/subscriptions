package com.example.subscriptions.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.UUID;

public class Subscription {

    final String rootURL = "https://www.adidas.com/";

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("gender")
    @Pattern(regexp="^(Male|Female|Other)$", message = "Invalid Gender")
    private String gender;

    @JsonProperty("dateOfBirth")
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy")
    private Date dateOfBirth;

    @JsonProperty("email")
    @NotNull
    @Email(message = "email should be a valid email")
    private String email;

    @JsonProperty("consent")
    @NotNull
    private boolean consent;

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public boolean isConsent() {
        return consent;
    }

    public String getVerificationURL() {
        return rootURL + subscriptionId.toString();
    }

    private UUID subscriptionId;

    public void setSubscriptionId(UUID subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public UUID getSubscriptionId() {
        return this.subscriptionId;
    }
}