package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A payment-related error that occurred during a subscription billing attempt.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionBillingAttemptPaymentError implements SubscriptionBillingAttemptError {
  /**
   * The error code for the payment failure.
   */
  private SubscriptionBillingAttemptPaymentErrorCode code;

  public SubscriptionBillingAttemptPaymentError() {
  }

  /**
   * The error code for the payment failure.
   */
  public SubscriptionBillingAttemptPaymentErrorCode getCode() {
    return code;
  }

  public void setCode(SubscriptionBillingAttemptPaymentErrorCode code) {
    this.code = code;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingAttemptPaymentError{code='" + code + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingAttemptPaymentError that = (SubscriptionBillingAttemptPaymentError) o;
    return Objects.equals(code, that.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The error code for the payment failure.
     */
    private SubscriptionBillingAttemptPaymentErrorCode code;

    public SubscriptionBillingAttemptPaymentError build() {
      SubscriptionBillingAttemptPaymentError result = new SubscriptionBillingAttemptPaymentError();
      result.code = this.code;
      return result;
    }

    /**
     * The error code for the payment failure.
     */
    public Builder code(SubscriptionBillingAttemptPaymentErrorCode code) {
      this.code = code;
      return this;
    }
  }
}
