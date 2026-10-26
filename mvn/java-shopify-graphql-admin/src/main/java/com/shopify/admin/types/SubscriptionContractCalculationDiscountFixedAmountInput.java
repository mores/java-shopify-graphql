package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for fixed amount discount in the calculate API.
 */
public class SubscriptionContractCalculationDiscountFixedAmountInput {
  /**
   * Whether the fixed amount applies to each item or the total.
   */
  private boolean appliesOnEachItem;

  /**
   * The fixed discount amount. The amount must be greater than or equal to 0.
   */
  private MoneyInput amount;

  public SubscriptionContractCalculationDiscountFixedAmountInput() {
  }

  /**
   * Whether the fixed amount applies to each item or the total.
   */
  public boolean getAppliesOnEachItem() {
    return appliesOnEachItem;
  }

  public void setAppliesOnEachItem(boolean appliesOnEachItem) {
    this.appliesOnEachItem = appliesOnEachItem;
  }

  /**
   * The fixed discount amount. The amount must be greater than or equal to 0.
   */
  public MoneyInput getAmount() {
    return amount;
  }

  public void setAmount(MoneyInput amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationDiscountFixedAmountInput{appliesOnEachItem='" + appliesOnEachItem + "', amount='" + amount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationDiscountFixedAmountInput that = (SubscriptionContractCalculationDiscountFixedAmountInput) o;
    return appliesOnEachItem == that.appliesOnEachItem &&
        Objects.equals(amount, that.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliesOnEachItem, amount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the fixed amount applies to each item or the total.
     */
    private boolean appliesOnEachItem;

    /**
     * The fixed discount amount. The amount must be greater than or equal to 0.
     */
    private MoneyInput amount;

    public SubscriptionContractCalculationDiscountFixedAmountInput build() {
      SubscriptionContractCalculationDiscountFixedAmountInput result = new SubscriptionContractCalculationDiscountFixedAmountInput();
      result.appliesOnEachItem = this.appliesOnEachItem;
      result.amount = this.amount;
      return result;
    }

    /**
     * Whether the fixed amount applies to each item or the total.
     */
    public Builder appliesOnEachItem(boolean appliesOnEachItem) {
      this.appliesOnEachItem = appliesOnEachItem;
      return this;
    }

    /**
     * The fixed discount amount. The amount must be greater than or equal to 0.
     */
    public Builder amount(MoneyInput amount) {
      this.amount = amount;
      return this;
    }
  }
}
