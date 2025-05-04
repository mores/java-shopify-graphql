package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `eventBridgeWebhookSubscriptionUpdate` mutation.
 */
public class EventBridgeWebhookSubscriptionUpdatePayload {
  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  /**
   * The webhook subscription that was updated.
   */
  private WebhookSubscription webhookSubscription;

  public EventBridgeWebhookSubscriptionUpdatePayload() {
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  /**
   * The webhook subscription that was updated.
   */
  public WebhookSubscription getWebhookSubscription() {
    return webhookSubscription;
  }

  public void setWebhookSubscription(WebhookSubscription webhookSubscription) {
    this.webhookSubscription = webhookSubscription;
  }

  @Override
  public String toString() {
    return "EventBridgeWebhookSubscriptionUpdatePayload{userErrors='" + userErrors + "', webhookSubscription='" + webhookSubscription + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EventBridgeWebhookSubscriptionUpdatePayload that = (EventBridgeWebhookSubscriptionUpdatePayload) o;
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
    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    /**
     * The webhook subscription that was updated.
     */
    private WebhookSubscription webhookSubscription;

    public EventBridgeWebhookSubscriptionUpdatePayload build() {
      EventBridgeWebhookSubscriptionUpdatePayload result = new EventBridgeWebhookSubscriptionUpdatePayload();
      result.userErrors = this.userErrors;
      result.webhookSubscription = this.webhookSubscription;
      return result;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }

    /**
     * The webhook subscription that was updated.
     */
    public Builder webhookSubscription(WebhookSubscription webhookSubscription) {
      this.webhookSubscription = webhookSubscription;
      return this;
    }
  }
}
