package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class PubSubWebhookSubscriptionCreatePayload {
  
  private List<PubSubWebhookSubscriptionCreateUserError> userErrors;

  
  private WebhookSubscription webhookSubscription;

  public PubSubWebhookSubscriptionCreatePayload() {
  }

  
  public List<PubSubWebhookSubscriptionCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PubSubWebhookSubscriptionCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  
  public WebhookSubscription getWebhookSubscription() {
    return webhookSubscription;
  }

  public void setWebhookSubscription(WebhookSubscription webhookSubscription) {
    this.webhookSubscription = webhookSubscription;
  }

  @Override
  public String toString() {
    return "PubSubWebhookSubscriptionCreatePayload{userErrors='" + userErrors + "', webhookSubscription='" + webhookSubscription + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PubSubWebhookSubscriptionCreatePayload that = (PubSubWebhookSubscriptionCreatePayload) o;
    return Objects.equals(userErrors, that.userErrors) &&
        Objects.equals(webhookSubscription, that.webhookSubscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userErrors, webhookSubscription);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<PubSubWebhookSubscriptionCreateUserError> userErrors;

    
    private WebhookSubscription webhookSubscription;

    public PubSubWebhookSubscriptionCreatePayload build() {
      PubSubWebhookSubscriptionCreatePayload result = new PubSubWebhookSubscriptionCreatePayload();
      result.userErrors = this.userErrors;
      result.webhookSubscription = this.webhookSubscription;
      return result;
    }

    
    public Builder userErrors(List<PubSubWebhookSubscriptionCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }

    
    public Builder webhookSubscription(WebhookSubscription webhookSubscription) {
      this.webhookSubscription = webhookSubscription;
      return this;
    }
  }
}
