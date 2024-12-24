package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionDeliveryOptionResultFailure implements SubscriptionDeliveryOptionResult {
  
  private String message;

  public SubscriptionDeliveryOptionResultFailure() {
  }

  
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryOptionResultFailure{message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryOptionResultFailure that = (SubscriptionDeliveryOptionResultFailure) o;
    return Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String message;

    public SubscriptionDeliveryOptionResultFailure build() {
      SubscriptionDeliveryOptionResultFailure result = new SubscriptionDeliveryOptionResultFailure();
      result.message = this.message;
      return result;
    }

    
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
