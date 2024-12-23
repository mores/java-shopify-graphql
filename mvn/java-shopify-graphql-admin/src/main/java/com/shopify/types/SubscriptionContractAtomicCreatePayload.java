package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `subscriptionContractAtomicCreate` mutation.
 */
public class SubscriptionContractAtomicCreatePayload {
  /**
   * The new Subscription Contract object.
   */
  private SubscriptionContract contract;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SubscriptionDraftUserError> userErrors;

  public SubscriptionContractAtomicCreatePayload() {
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
  public List<SubscriptionDraftUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SubscriptionDraftUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SubscriptionContractAtomicCreatePayload{contract='" + contract + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractAtomicCreatePayload that = (SubscriptionContractAtomicCreatePayload) o;
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
    private List<SubscriptionDraftUserError> userErrors;

    public SubscriptionContractAtomicCreatePayload build() {
      SubscriptionContractAtomicCreatePayload result = new SubscriptionContractAtomicCreatePayload();
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
    public Builder userErrors(List<SubscriptionDraftUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
