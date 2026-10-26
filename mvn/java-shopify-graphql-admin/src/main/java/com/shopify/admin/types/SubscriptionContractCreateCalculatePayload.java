package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `subscriptionContractCreateCalculate` mutation.
 */
public class SubscriptionContractCreateCalculatePayload {
  /**
   * The result of the subscription contract calculation operation.
   */
  private SubscriptionContractCalculation subscriptionContractCalculation;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SubscriptionContractCreateCalculateUserError> userErrors;

  public SubscriptionContractCreateCalculatePayload() {
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
  public List<SubscriptionContractCreateCalculateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SubscriptionContractCreateCalculateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCreateCalculatePayload{subscriptionContractCalculation='" + subscriptionContractCalculation + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCreateCalculatePayload that = (SubscriptionContractCreateCalculatePayload) o;
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
    private List<SubscriptionContractCreateCalculateUserError> userErrors;

    public SubscriptionContractCreateCalculatePayload build() {
      SubscriptionContractCreateCalculatePayload result = new SubscriptionContractCreateCalculatePayload();
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
    public Builder userErrors(List<SubscriptionContractCreateCalculateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
