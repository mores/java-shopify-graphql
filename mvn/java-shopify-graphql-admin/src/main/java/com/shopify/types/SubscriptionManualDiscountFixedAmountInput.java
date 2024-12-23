package com.shopify.types;

import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the fixed amount value of the discount and distribution on the lines.
 */
public class SubscriptionManualDiscountFixedAmountInput {
  /**
   * Fixed amount value.
   */
  private Double amount;

  /**
   * Whether the amount is intended per line item or once per subscription.
   */
  private Boolean appliesOnEachItem;

  public SubscriptionManualDiscountFixedAmountInput() {
  }

  /**
   * Fixed amount value.
   */
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  /**
   * Whether the amount is intended per line item or once per subscription.
   */
  public Boolean getAppliesOnEachItem() {
    return appliesOnEachItem;
  }

  public void setAppliesOnEachItem(Boolean appliesOnEachItem) {
    this.appliesOnEachItem = appliesOnEachItem;
  }

  @Override
  public String toString() {
    return "SubscriptionManualDiscountFixedAmountInput{amount='" + amount + "', appliesOnEachItem='" + appliesOnEachItem + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionManualDiscountFixedAmountInput that = (SubscriptionManualDiscountFixedAmountInput) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(appliesOnEachItem, that.appliesOnEachItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, appliesOnEachItem);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Fixed amount value.
     */
    private Double amount;

    /**
     * Whether the amount is intended per line item or once per subscription.
     */
    private Boolean appliesOnEachItem;

    public SubscriptionManualDiscountFixedAmountInput build() {
      SubscriptionManualDiscountFixedAmountInput result = new SubscriptionManualDiscountFixedAmountInput();
      result.amount = this.amount;
      result.appliesOnEachItem = this.appliesOnEachItem;
      return result;
    }

    /**
     * Fixed amount value.
     */
    public Builder amount(Double amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Whether the amount is intended per line item or once per subscription.
     */
    public Builder appliesOnEachItem(Boolean appliesOnEachItem) {
      this.appliesOnEachItem = appliesOnEachItem;
      return this;
    }
  }
}
