package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The billing attempt is currently being processed.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionBillingAttemptPendingState implements SubscriptionBillingAttemptState {
  /**
   * Always true when the billing attempt is pending.
   */
  private boolean processing;

  public SubscriptionBillingAttemptPendingState() {
  }

  /**
   * Always true when the billing attempt is pending.
   */
  public boolean getProcessing() {
    return processing;
  }

  public void setProcessing(boolean processing) {
    this.processing = processing;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingAttemptPendingState{processing='" + processing + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingAttemptPendingState that = (SubscriptionBillingAttemptPendingState) o;
    return processing == that.processing;
  }

  @Override
  public int hashCode() {
    return Objects.hash(processing);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Always true when the billing attempt is pending.
     */
    private boolean processing;

    public SubscriptionBillingAttemptPendingState build() {
      SubscriptionBillingAttemptPendingState result = new SubscriptionBillingAttemptPendingState();
      result.processing = this.processing;
      return result;
    }

    /**
     * Always true when the billing attempt is pending.
     */
    public Builder processing(boolean processing) {
      this.processing = processing;
      return this;
    }
  }
}
