package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `subscriptionBillingCycleUnskip` mutation.
 */
public class SubscriptionBillingCycleUnskipPayload {
  /**
   * The updated billing cycle.
   */
  private SubscriptionBillingCycle billingCycle;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SubscriptionBillingCycleUnskipUserError> userErrors;

  public SubscriptionBillingCycleUnskipPayload() {
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
  public List<SubscriptionBillingCycleUnskipUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SubscriptionBillingCycleUnskipUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingCycleUnskipPayload{billingCycle='" + billingCycle + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingCycleUnskipPayload that = (SubscriptionBillingCycleUnskipPayload) o;
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
    private List<SubscriptionBillingCycleUnskipUserError> userErrors;

    public SubscriptionBillingCycleUnskipPayload build() {
      SubscriptionBillingCycleUnskipPayload result = new SubscriptionBillingCycleUnskipPayload();
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
    public Builder userErrors(List<SubscriptionBillingCycleUnskipUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
