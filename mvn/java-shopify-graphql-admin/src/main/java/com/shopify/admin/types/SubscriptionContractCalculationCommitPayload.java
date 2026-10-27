package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `subscriptionContractCalculationCommit` mutation.
 */
public class SubscriptionContractCalculationCommitPayload {
  /**
   * The contract produced by committing the calculation. A create or update
   * returns a SubscriptionContract; a billing cycle edit returns a
   * SubscriptionBillingCycleEditedContract.
   */
  private SubscriptionCommittedContract contract;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SubscriptionContractCalculationCommitUserError> userErrors;

  public SubscriptionContractCalculationCommitPayload() {
  }

  /**
   * The contract produced by committing the calculation. A create or update
   * returns a SubscriptionContract; a billing cycle edit returns a
   * SubscriptionBillingCycleEditedContract.
   */
  public SubscriptionCommittedContract getContract() {
    return contract;
  }

  public void setContract(SubscriptionCommittedContract contract) {
    this.contract = contract;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<SubscriptionContractCalculationCommitUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SubscriptionContractCalculationCommitUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationCommitPayload{contract='" + contract + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationCommitPayload that = (SubscriptionContractCalculationCommitPayload) o;
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
     * The contract produced by committing the calculation. A create or update
     * returns a SubscriptionContract; a billing cycle edit returns a
     * SubscriptionBillingCycleEditedContract.
     */
    private SubscriptionCommittedContract contract;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SubscriptionContractCalculationCommitUserError> userErrors;

    public SubscriptionContractCalculationCommitPayload build() {
      SubscriptionContractCalculationCommitPayload result = new SubscriptionContractCalculationCommitPayload();
      result.contract = this.contract;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The contract produced by committing the calculation. A create or update
     * returns a SubscriptionContract; a billing cycle edit returns a
     * SubscriptionBillingCycleEditedContract.
     */
    public Builder contract(SubscriptionCommittedContract contract) {
      this.contract = contract;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<SubscriptionContractCalculationCommitUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
