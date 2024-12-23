package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields to add a recipient to a gift card.
 */
public class GiftCardRecipientInput {
  /**
   * The ID of the customer who will be the recipient of the gift card. Requires `write_customers` access_scope.
   */
  private String id;

  /**
   * The preferred name of the recipient.
   */
  private String preferredName;

  /**
   * The personalized message intended for the recipient.
   */
  private String message;

  /**
   * The scheduled datetime on which the gift card will be sent to the recipient.
   * The gift card will be sent within an hour of the specified datetime.
   */
  private OffsetDateTime sendNotificationAt;

  public GiftCardRecipientInput() {
  }

  /**
   * The ID of the customer who will be the recipient of the gift card. Requires `write_customers` access_scope.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The preferred name of the recipient.
   */
  public String getPreferredName() {
    return preferredName;
  }

  public void setPreferredName(String preferredName) {
    this.preferredName = preferredName;
  }

  /**
   * The personalized message intended for the recipient.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * The scheduled datetime on which the gift card will be sent to the recipient.
   * The gift card will be sent within an hour of the specified datetime.
   */
  public OffsetDateTime getSendNotificationAt() {
    return sendNotificationAt;
  }

  public void setSendNotificationAt(OffsetDateTime sendNotificationAt) {
    this.sendNotificationAt = sendNotificationAt;
  }

  @Override
  public String toString() {
    return "GiftCardRecipientInput{id='" + id + "', preferredName='" + preferredName + "', message='" + message + "', sendNotificationAt='" + sendNotificationAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardRecipientInput that = (GiftCardRecipientInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(preferredName, that.preferredName) &&
        Objects.equals(message, that.message) &&
        Objects.equals(sendNotificationAt, that.sendNotificationAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, preferredName, message, sendNotificationAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the customer who will be the recipient of the gift card. Requires `write_customers` access_scope.
     */
    private String id;

    /**
     * The preferred name of the recipient.
     */
    private String preferredName;

    /**
     * The personalized message intended for the recipient.
     */
    private String message;

    /**
     * The scheduled datetime on which the gift card will be sent to the recipient.
     * The gift card will be sent within an hour of the specified datetime.
     */
    private OffsetDateTime sendNotificationAt;

    public GiftCardRecipientInput build() {
      GiftCardRecipientInput result = new GiftCardRecipientInput();
      result.id = this.id;
      result.preferredName = this.preferredName;
      result.message = this.message;
      result.sendNotificationAt = this.sendNotificationAt;
      return result;
    }

    /**
     * The ID of the customer who will be the recipient of the gift card. Requires `write_customers` access_scope.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The preferred name of the recipient.
     */
    public Builder preferredName(String preferredName) {
      this.preferredName = preferredName;
      return this;
    }

    /**
     * The personalized message intended for the recipient.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    /**
     * The scheduled datetime on which the gift card will be sent to the recipient.
     * The gift card will be sent within an hour of the specified datetime.
     */
    public Builder sendNotificationAt(OffsetDateTime sendNotificationAt) {
      this.sendNotificationAt = sendNotificationAt;
      return this;
    }
  }
}
