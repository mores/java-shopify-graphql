package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The billing attempt state that requires an action to resolve.
 * Must complete the action required for the billing attempt to continue being processed.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionBillingAttemptActionRequiredState implements SubscriptionBillingAttemptState {
  /**
   * The action required to resolve the billing attempt.
   */
  private SubscriptionBillingAttemptAction action;

  public SubscriptionBillingAttemptActionRequiredState() {
  }

  /**
   * The action required to resolve the billing attempt.
   */
  public SubscriptionBillingAttemptAction getAction() {
    return action;
  }

  public void setAction(SubscriptionBillingAttemptAction action) {
    this.action = action;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingAttemptActionRequiredState{action='" + action + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingAttemptActionRequiredState that = (SubscriptionBillingAttemptActionRequiredState) o;
    return Objects.equals(action, that.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The action required to resolve the billing attempt.
     */
    private SubscriptionBillingAttemptAction action;

    public SubscriptionBillingAttemptActionRequiredState build() {
      SubscriptionBillingAttemptActionRequiredState result = new SubscriptionBillingAttemptActionRequiredState();
      result.action = this.action;
      return result;
    }

    /**
     * The action required to resolve the billing attempt.
     */
    public Builder action(SubscriptionBillingAttemptAction action) {
      this.action = action;
      return this;
    }
  }
}
