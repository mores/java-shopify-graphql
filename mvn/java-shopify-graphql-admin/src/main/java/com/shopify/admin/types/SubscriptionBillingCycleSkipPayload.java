package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `subscriptionBillingCycleSkip` mutation.
 */
public class SubscriptionBillingCycleSkipPayload {
  /**
   * The updated billing cycle.
   */
  private SubscriptionBillingCycle billingCycle;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SubscriptionBillingCycleSkipUserError> userErrors;

  public SubscriptionBillingCycleSkipPayload() {
  }

  /**
   * The updated billing cycle.
   */
  public SubscriptionBillingCycle getBillingCycle() {
    return billingCycle;
  }

  public void setBillingCycle(SubscriptionBillingCycle billingCycle) {
    this.billingCycle = billingCycle;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<SubscriptionBillingCycleSkipUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SubscriptionBillingCycleSkipUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingCycleSkipPayload{billingCycle='" + billingCycle + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingCycleSkipPayload that = (SubscriptionBillingCycleSkipPayload) o;
    return Objects.equals(billingCycle, that.billingCycle) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingCycle, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The updated billing cycle.
     */
    private SubscriptionBillingCycle billingCycle;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SubscriptionBillingCycleSkipUserError> userErrors;

    public SubscriptionBillingCycleSkipPayload build() {
      SubscriptionBillingCycleSkipPayload result = new SubscriptionBillingCycleSkipPayload();
      result.billingCycle = this.billingCycle;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated billing cycle.
     */
    public Builder billingCycle(SubscriptionBillingCycle billingCycle) {
      this.billingCycle = billingCycle;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<SubscriptionBillingCycleSkipUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
