package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields required to create a Subscription Contract.
 */
public class SubscriptionContractCreateInput {
  /**
   * The actor who initiated a subscription action.
   */
  private SubscriptionActor actor;

  /**
   * The ID of the customer to associate with the subscription contract.
   */
  private String customerId;

  /**
   * The next billing date for the subscription contract.
   */
  private OffsetDateTime nextBillingDate;

  /**
   * The currency used for the subscription contract.
   */
  private CurrencyCode currencyCode;

  /**
   * The attributes used as input for the Subscription Draft.
   */
  private SubscriptionDraftInput contract;

  public SubscriptionContractCreateInput() {
  }

  /**
   * The actor who initiated a subscription action.
   */
  public SubscriptionActor getActor() {
    return actor;
  }

  public void setActor(SubscriptionActor actor) {
    this.actor = actor;
  }

  /**
   * The ID of the customer to associate with the subscription contract.
   */
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  /**
   * The next billing date for the subscription contract.
   */
  public OffsetDateTime getNextBillingDate() {
    return nextBillingDate;
  }

  public void setNextBillingDate(OffsetDateTime nextBillingDate) {
    this.nextBillingDate = nextBillingDate;
  }

  /**
   * The currency used for the subscription contract.
   */
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * The attributes used as input for the Subscription Draft.
   */
  public SubscriptionDraftInput getContract() {
    return contract;
  }

  public void setContract(SubscriptionDraftInput contract) {
    this.contract = contract;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCreateInput{actor='" + actor + "', customerId='" + customerId + "', nextBillingDate='" + nextBillingDate + "', currencyCode='" + currencyCode + "', contract='" + contract + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCreateInput that = (SubscriptionContractCreateInput) o;
    return Objects.equals(actor, that.actor) &&
        Objects.equals(customerId, that.customerId) &&
        Objects.equals(nextBillingDate, that.nextBillingDate) &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(contract, that.contract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actor, customerId, nextBillingDate, currencyCode, contract);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The actor who initiated a subscription action.
     */
    private SubscriptionActor actor;

    /**
     * The ID of the customer to associate with the subscription contract.
     */
    private String customerId;

    /**
     * The next billing date for the subscription contract.
     */
    private OffsetDateTime nextBillingDate;

    /**
     * The currency used for the subscription contract.
     */
    private CurrencyCode currencyCode;

    /**
     * The attributes used as input for the Subscription Draft.
     */
    private SubscriptionDraftInput contract;

    public SubscriptionContractCreateInput build() {
      SubscriptionContractCreateInput result = new SubscriptionContractCreateInput();
      result.actor = this.actor;
      result.customerId = this.customerId;
      result.nextBillingDate = this.nextBillingDate;
      result.currencyCode = this.currencyCode;
      result.contract = this.contract;
      return result;
    }

    /**
     * The actor who initiated a subscription action.
     */
    public Builder actor(SubscriptionActor actor) {
      this.actor = actor;
      return this;
    }

    /**
     * The ID of the customer to associate with the subscription contract.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    /**
     * The next billing date for the subscription contract.
     */
    public Builder nextBillingDate(OffsetDateTime nextBillingDate) {
      this.nextBillingDate = nextBillingDate;
      return this;
    }

    /**
     * The currency used for the subscription contract.
     */
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    /**
     * The attributes used as input for the Subscription Draft.
     */
    public Builder contract(SubscriptionDraftInput contract) {
      this.contract = contract;
      return this;
    }
  }
}
