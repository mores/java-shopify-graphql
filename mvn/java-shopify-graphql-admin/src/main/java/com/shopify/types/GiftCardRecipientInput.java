package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class GiftCardRecipientInput {
  
  private String id;

  
  private String preferredName;

  
  private String message;

  
  private OffsetDateTime sendNotificationAt;

  public GiftCardRecipientInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getPreferredName() {
    return preferredName;
  }

  public void setPreferredName(String preferredName) {
    this.preferredName = preferredName;
  }

  
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  
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
    
    private String id;

    
    private String preferredName;

    
    private String message;

    
    private OffsetDateTime sendNotificationAt;

    public GiftCardRecipientInput build() {
      GiftCardRecipientInput result = new GiftCardRecipientInput();
      result.id = this.id;
      result.preferredName = this.preferredName;
      result.message = this.message;
      result.sendNotificationAt = this.sendNotificationAt;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder preferredName(String preferredName) {
      this.preferredName = preferredName;
      return this;
    }

    
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    
    public Builder sendNotificationAt(OffsetDateTime sendNotificationAt) {
      this.sendNotificationAt = sendNotificationAt;
      return this;
    }
  }
}
