package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents a recipient who will receive the issued gift card.
 */
public class GiftCardRecipient {
  /**
   * The message sent with the gift card.
   */
  private String message;

  /**
   * The preferred name of the recipient who will receive the gift card.
   */
  private String preferredName;

  /**
   * The recipient who will receive the gift card.
   */
  private Customer recipient;

  /**
   * The scheduled datetime on which the gift card will be sent to the recipient.
   * The gift card will be sent within an hour of the specified datetime.
   */
  private OffsetDateTime sendNotificationAt;

  public GiftCardRecipient() {
  }

  /**
   * The message sent with the gift card.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * The preferred name of the recipient who will receive the gift card.
   */
  public String getPreferredName() {
    return preferredName;
  }

  public void setPreferredName(String preferredName) {
    this.preferredName = preferredName;
  }

  /**
   * The recipient who will receive the gift card.
   */
  public Customer getRecipient() {
    return recipient;
  }

  public void setRecipient(Customer recipient) {
    this.recipient = recipient;
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
    return "GiftCardRecipient{message='" + message + "', preferredName='" + preferredName + "', recipient='" + recipient + "', sendNotificationAt='" + sendNotificationAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardRecipient that = (GiftCardRecipient) o;
    return Objects.equals(message, that.message) &&
        Objects.equals(preferredName, that.preferredName) &&
        Objects.equals(recipient, that.recipient) &&
        Objects.equals(sendNotificationAt, that.sendNotificationAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, preferredName, recipient, sendNotificationAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The message sent with the gift card.
     */
    private String message;

    /**
     * The preferred name of the recipient who will receive the gift card.
     */
    private String preferredName;

    /**
     * The recipient who will receive the gift card.
     */
    private Customer recipient;

    /**
     * The scheduled datetime on which the gift card will be sent to the recipient.
     * The gift card will be sent within an hour of the specified datetime.
     */
    private OffsetDateTime sendNotificationAt;

    public GiftCardRecipient build() {
      GiftCardRecipient result = new GiftCardRecipient();
      result.message = this.message;
      result.preferredName = this.preferredName;
      result.recipient = this.recipient;
      result.sendNotificationAt = this.sendNotificationAt;
      return result;
    }

    /**
     * The message sent with the gift card.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    /**
     * The preferred name of the recipient who will receive the gift card.
     */
    public Builder preferredName(String preferredName) {
      this.preferredName = preferredName;
      return this;
    }

    /**
     * The recipient who will receive the gift card.
     */
    public Builder recipient(Customer recipient) {
      this.recipient = recipient;
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
