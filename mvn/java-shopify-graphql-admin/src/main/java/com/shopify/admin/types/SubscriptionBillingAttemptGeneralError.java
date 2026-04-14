package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An error that occurred during a subscription billing attempt that doesn't fit other categories.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionBillingAttemptGeneralError implements SubscriptionBillingAttemptError {
  /**
   * The error code for the failure.
   */
  private SubscriptionBillingAttemptGeneralErrorCode code;

  public SubscriptionBillingAttemptGeneralError() {
  }

  /**
   * The error code for the failure.
   */
  public SubscriptionBillingAttemptGeneralErrorCode getCode() {
    return code;
  }

  public void setCode(SubscriptionBillingAttemptGeneralErrorCode code) {
    this.code = code;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingAttemptGeneralError{code='" + code + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingAttemptGeneralError that = (SubscriptionBillingAttemptGeneralError) o;
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
     * The error code for the failure.
     */
    private SubscriptionBillingAttemptGeneralErrorCode code;

    public SubscriptionBillingAttemptGeneralError build() {
      SubscriptionBillingAttemptGeneralError result = new SubscriptionBillingAttemptGeneralError();
      result.code = this.code;
      return result;
    }

    /**
     * The error code for the failure.
     */
    public Builder code(SubscriptionBillingAttemptGeneralErrorCode code) {
      this.code = code;
      return this;
    }
  }
}
