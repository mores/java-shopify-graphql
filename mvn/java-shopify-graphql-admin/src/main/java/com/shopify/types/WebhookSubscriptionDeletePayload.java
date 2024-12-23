package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `webhookSubscriptionDelete` mutation.
 */
public class WebhookSubscriptionDeletePayload {
  /**
   * The ID of the deleted webhook subscription.
   */
  private String deletedWebhookSubscriptionId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public WebhookSubscriptionDeletePayload() {
  }

  /**
   * The ID of the deleted webhook subscription.
   */
  public String getDeletedWebhookSubscriptionId() {
    return deletedWebhookSubscriptionId;
  }

  public void setDeletedWebhookSubscriptionId(String deletedWebhookSubscriptionId) {
    this.deletedWebhookSubscriptionId = deletedWebhookSubscriptionId;
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

  @Override
  public String toString() {
    return "WebhookSubscriptionDeletePayload{deletedWebhookSubscriptionId='" + deletedWebhookSubscriptionId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WebhookSubscriptionDeletePayload that = (WebhookSubscriptionDeletePayload) o;
    return Objects.equals(deletedWebhookSubscriptionId, that.deletedWebhookSubscriptionId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedWebhookSubscriptionId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the deleted webhook subscription.
     */
    private String deletedWebhookSubscriptionId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public WebhookSubscriptionDeletePayload build() {
      WebhookSubscriptionDeletePayload result = new WebhookSubscriptionDeletePayload();
      result.deletedWebhookSubscriptionId = this.deletedWebhookSubscriptionId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the deleted webhook subscription.
     */
    public Builder deletedWebhookSubscriptionId(String deletedWebhookSubscriptionId) {
      this.deletedWebhookSubscriptionId = deletedWebhookSubscriptionId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
