package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Failure determining available shipping options for delivery of a subscription contract.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionShippingOptionResultFailure implements SubscriptionShippingOptionResult {
  /**
   * Failure reason.
   */
  private String message;

  public SubscriptionShippingOptionResultFailure() {
  }

  /**
   * Failure reason.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "SubscriptionShippingOptionResultFailure{message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionShippingOptionResultFailure that = (SubscriptionShippingOptionResultFailure) o;
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
    /**
     * Failure reason.
     */
    private String message;

    public SubscriptionShippingOptionResultFailure build() {
      SubscriptionShippingOptionResultFailure result = new SubscriptionShippingOptionResultFailure();
      result.message = this.message;
      return result;
    }

    /**
     * Failure reason.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
