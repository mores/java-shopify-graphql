package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `subscriptionBillingCycleContractDraftCommit` mutation.
 */
public class SubscriptionBillingCycleContractDraftCommitPayload {
  /**
   * The committed Subscription Billing Cycle Edited Contract object.
   */
  private SubscriptionBillingCycleEditedContract contract;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SubscriptionDraftUserError> userErrors;

  public SubscriptionBillingCycleContractDraftCommitPayload() {
  }

  /**
   * The committed Subscription Billing Cycle Edited Contract object.
   */
  public SubscriptionBillingCycleEditedContract getContract() {
    return contract;
  }

  public void setContract(SubscriptionBillingCycleEditedContract contract) {
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
    return "SubscriptionBillingCycleContractDraftCommitPayload{contract='" + contract + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingCycleContractDraftCommitPayload that = (SubscriptionBillingCycleContractDraftCommitPayload) o;
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
     * The committed Subscription Billing Cycle Edited Contract object.
     */
    private SubscriptionBillingCycleEditedContract contract;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SubscriptionDraftUserError> userErrors;

    public SubscriptionBillingCycleContractDraftCommitPayload build() {
      SubscriptionBillingCycleContractDraftCommitPayload result = new SubscriptionBillingCycleContractDraftCommitPayload();
      result.contract = this.contract;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The committed Subscription Billing Cycle Edited Contract object.
     */
    public Builder contract(SubscriptionBillingCycleEditedContract contract) {
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
