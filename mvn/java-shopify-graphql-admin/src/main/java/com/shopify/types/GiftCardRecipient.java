package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class GiftCardRecipient {
  
  private String message;

  
  private String preferredName;

  
  private Customer recipient;

  
  private OffsetDateTime sendNotificationAt;

  public GiftCardRecipient() {
  }

  
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  
  public String getPreferredName() {
    return preferredName;
  }

  public void setPreferredName(String preferredName) {
    this.preferredName = preferredName;
  }

  
  public Customer getRecipient() {
    return recipient;
  }

  public void setRecipient(Customer recipient) {
    this.recipient = recipient;
  }

  
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
    
    private String message;

    
    private String preferredName;

    
    private Customer recipient;

    
    private OffsetDateTime sendNotificationAt;

    public GiftCardRecipient build() {
      GiftCardRecipient result = new GiftCardRecipient();
      result.message = this.message;
      result.preferredName = this.preferredName;
      result.recipient = this.recipient;
      result.sendNotificationAt = this.sendNotificationAt;
      return result;
    }

    
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    
    public Builder preferredName(String preferredName) {
      this.preferredName = preferredName;
      return this;
    }

    
    public Builder recipient(Customer recipient) {
      this.recipient = recipient;
      return this;
    }

    
    public Builder sendNotificationAt(OffsetDateTime sendNotificationAt) {
      this.sendNotificationAt = sendNotificationAt;
      return this;
    }
  }
}
