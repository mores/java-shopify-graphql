package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to create a Subscription Contract.
 */
public class SubscriptionContractAtomicCreateInput {
  /**
   * The ID of the customer to associate with the subscription contract.
   */
  private String customerId;

  /**
   * The next billing date for the subscription contract.This field is independent
   * of billing cycles.It stores metadata set by the apps, and thus not managed by
   * Shopify.It can be queried from subscriptionContract.nextBillingDate.
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

  /**
   * A list of new Subscription Lines.
   */
  private List<SubscriptionAtomicLineInput> lines;

  /**
   * A list of discount redeem codes to apply to the subscription contract.
   */
  private List<String> discountCodes = Collections.emptyList();

  public SubscriptionContractAtomicCreateInput() {
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
   * The next billing date for the subscription contract.This field is independent
   * of billing cycles.It stores metadata set by the apps, and thus not managed by
   * Shopify.It can be queried from subscriptionContract.nextBillingDate.
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

  /**
   * A list of new Subscription Lines.
   */
  public List<SubscriptionAtomicLineInput> getLines() {
    return lines;
  }

  public void setLines(List<SubscriptionAtomicLineInput> lines) {
    this.lines = lines;
  }

  /**
   * A list of discount redeem codes to apply to the subscription contract.
   */
  public List<String> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(List<String> discountCodes) {
    this.discountCodes = discountCodes;
  }

  @Override
  public String toString() {
    return "SubscriptionContractAtomicCreateInput{customerId='" + customerId + "', nextBillingDate='" + nextBillingDate + "', currencyCode='" + currencyCode + "', contract='" + contract + "', lines='" + lines + "', discountCodes='" + discountCodes + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractAtomicCreateInput that = (SubscriptionContractAtomicCreateInput) o;
    return Objects.equals(customerId, that.customerId) &&
        Objects.equals(nextBillingDate, that.nextBillingDate) &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(contract, that.contract) &&
        Objects.equals(lines, that.lines) &&
        Objects.equals(discountCodes, that.discountCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, nextBillingDate, currencyCode, contract, lines, discountCodes);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the customer to associate with the subscription contract.
     */
    private String customerId;

    /**
     * The next billing date for the subscription contract.This field is independent
     * of billing cycles.It stores metadata set by the apps, and thus not managed by
     * Shopify.It can be queried from subscriptionContract.nextBillingDate.
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

    /**
     * A list of new Subscription Lines.
     */
    private List<SubscriptionAtomicLineInput> lines;

    /**
     * A list of discount redeem codes to apply to the subscription contract.
     */
    private List<String> discountCodes = Collections.emptyList();

    public SubscriptionContractAtomicCreateInput build() {
      SubscriptionContractAtomicCreateInput result = new SubscriptionContractAtomicCreateInput();
      result.customerId = this.customerId;
      result.nextBillingDate = this.nextBillingDate;
      result.currencyCode = this.currencyCode;
      result.contract = this.contract;
      result.lines = this.lines;
      result.discountCodes = this.discountCodes;
      return result;
    }

    /**
     * The ID of the customer to associate with the subscription contract.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    /**
     * The next billing date for the subscription contract.This field is independent
     * of billing cycles.It stores metadata set by the apps, and thus not managed by
     * Shopify.It can be queried from subscriptionContract.nextBillingDate.
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

    /**
     * A list of new Subscription Lines.
     */
    public Builder lines(List<SubscriptionAtomicLineInput> lines) {
      this.lines = lines;
      return this;
    }

    /**
     * A list of discount redeem codes to apply to the subscription contract.
     */
    public Builder discountCodes(List<String> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
    }
  }
}
