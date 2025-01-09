package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `subscriptionContractProductChange` mutation.
 */
public class SubscriptionContractProductChangePayload {
  /**
   * The new Subscription Contract object.
   */
  private SubscriptionContract contract;

  /**
   * The updated Subscription Line.
   */
  private SubscriptionLine lineUpdated;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SubscriptionDraftUserError> userErrors;

  public SubscriptionContractProductChangePayload() {
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
   * The updated Subscription Line.
   */
  public SubscriptionLine getLineUpdated() {
    return lineUpdated;
  }

  public void setLineUpdated(SubscriptionLine lineUpdated) {
    this.lineUpdated = lineUpdated;
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
    return "SubscriptionContractProductChangePayload{contract='" + contract + "', lineUpdated='" + lineUpdated + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractProductChangePayload that = (SubscriptionContractProductChangePayload) o;
    return Objects.equals(contract, that.contract) &&
        Objects.equals(lineUpdated, that.lineUpdated) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, lineUpdated, userErrors);
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
     * The updated Subscription Line.
     */
    private SubscriptionLine lineUpdated;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SubscriptionDraftUserError> userErrors;

    public SubscriptionContractProductChangePayload build() {
      SubscriptionContractProductChangePayload result = new SubscriptionContractProductChangePayload();
      result.contract = this.contract;
      result.lineUpdated = this.lineUpdated;
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
     * The updated Subscription Line.
     */
    public Builder lineUpdated(SubscriptionLine lineUpdated) {
      this.lineUpdated = lineUpdated;
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
