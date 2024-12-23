package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `subscriptionContractCancel` mutation.
 */
public class SubscriptionContractCancelPayload {
  /**
   * The new Subscription Contract object.
   */
  private SubscriptionContract contract;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SubscriptionContractStatusUpdateUserError> userErrors;

  public SubscriptionContractCancelPayload() {
  }

  /**
   * The new Subscription Contract object.
   */
  public SubscriptionContract getContract() {
    return contract;
  }

  public void setContract(SubscriptionContract contract) {
    this.contract = contract;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<SubscriptionContractStatusUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SubscriptionContractStatusUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCancelPayload{contract='" + contract + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCancelPayload that = (SubscriptionContractCancelPayload) o;
    return Objects.equals(contract, that.contract) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The new Subscription Contract object.
     */
    private SubscriptionContract contract;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SubscriptionContractStatusUpdateUserError> userErrors;

    public SubscriptionContractCancelPayload build() {
      SubscriptionContractCancelPayload result = new SubscriptionContractCancelPayload();
      result.contract = this.contract;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The new Subscription Contract object.
     */
    public Builder contract(SubscriptionContract contract) {
      this.contract = contract;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<SubscriptionContractStatusUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
