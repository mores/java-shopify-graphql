package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `subscriptionBillingCycleEditsDelete` mutation.
 */
public class SubscriptionBillingCycleEditsDeletePayload {
  /**
   * The list of updated billing cycles.
   */
  private List<SubscriptionBillingCycle> billingCycles;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SubscriptionBillingCycleUserError> userErrors;

  public SubscriptionBillingCycleEditsDeletePayload() {
  }

  /**
   * The list of updated billing cycles.
   */
  public List<SubscriptionBillingCycle> getBillingCycles() {
    return billingCycles;
  }

  public void setBillingCycles(List<SubscriptionBillingCycle> billingCycles) {
    this.billingCycles = billingCycles;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<SubscriptionBillingCycleUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SubscriptionBillingCycleUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingCycleEditsDeletePayload{billingCycles='" + billingCycles + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingCycleEditsDeletePayload that = (SubscriptionBillingCycleEditsDeletePayload) o;
    return Objects.equals(billingCycles, that.billingCycles) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingCycles, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of updated billing cycles.
     */
    private List<SubscriptionBillingCycle> billingCycles;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SubscriptionBillingCycleUserError> userErrors;

    public SubscriptionBillingCycleEditsDeletePayload build() {
      SubscriptionBillingCycleEditsDeletePayload result = new SubscriptionBillingCycleEditsDeletePayload();
      result.billingCycles = this.billingCycles;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The list of updated billing cycles.
     */
    public Builder billingCycles(List<SubscriptionBillingCycle> billingCycles) {
      this.billingCycles = billingCycles;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<SubscriptionBillingCycleUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
