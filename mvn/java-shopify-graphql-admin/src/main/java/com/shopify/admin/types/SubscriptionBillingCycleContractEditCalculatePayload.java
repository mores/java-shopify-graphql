package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `subscriptionBillingCycleContractEditCalculate` mutation.
 */
public class SubscriptionBillingCycleContractEditCalculatePayload {
  /**
   * The result of the subscription contract calculation operation.
   */
  private SubscriptionContractCalculation subscriptionContractCalculation;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SubscriptionBillingCycleContractEditCalculateUserError> userErrors;

  public SubscriptionBillingCycleContractEditCalculatePayload() {
  }

  /**
   * The result of the subscription contract calculation operation.
   */
  public SubscriptionContractCalculation getSubscriptionContractCalculation() {
    return subscriptionContractCalculation;
  }

  public void setSubscriptionContractCalculation(
      SubscriptionContractCalculation subscriptionContractCalculation) {
    this.subscriptionContractCalculation = subscriptionContractCalculation;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<SubscriptionBillingCycleContractEditCalculateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(
      List<SubscriptionBillingCycleContractEditCalculateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingCycleContractEditCalculatePayload{subscriptionContractCalculation='" + subscriptionContractCalculation + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingCycleContractEditCalculatePayload that = (SubscriptionBillingCycleContractEditCalculatePayload) o;
    return Objects.equals(subscriptionContractCalculation, that.subscriptionContractCalculation) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionContractCalculation, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The result of the subscription contract calculation operation.
     */
    private SubscriptionContractCalculation subscriptionContractCalculation;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SubscriptionBillingCycleContractEditCalculateUserError> userErrors;

    public SubscriptionBillingCycleContractEditCalculatePayload build() {
      SubscriptionBillingCycleContractEditCalculatePayload result = new SubscriptionBillingCycleContractEditCalculatePayload();
      result.subscriptionContractCalculation = this.subscriptionContractCalculation;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The result of the subscription contract calculation operation.
     */
    public Builder subscriptionContractCalculation(
        SubscriptionContractCalculation subscriptionContractCalculation) {
      this.subscriptionContractCalculation = subscriptionContractCalculation;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(
        List<SubscriptionBillingCycleContractEditCalculateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
