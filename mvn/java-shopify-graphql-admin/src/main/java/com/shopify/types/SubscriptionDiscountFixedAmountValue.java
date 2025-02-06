package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The value of the discount and how it will be applied.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionDiscountFixedAmountValue implements SubscriptionDiscountValue {
  /**
   * The fixed amount value of the discount.
   */
  private MoneyV2 amount;

  /**
   * Whether the amount is applied per item.
   */
  private boolean appliesOnEachItem;

  public SubscriptionDiscountFixedAmountValue() {
  }

  /**
   * The fixed amount value of the discount.
   */
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  /**
   * Whether the amount is applied per item.
   */
  public boolean getAppliesOnEachItem() {
    return appliesOnEachItem;
  }

  public void setAppliesOnEachItem(boolean appliesOnEachItem) {
    this.appliesOnEachItem = appliesOnEachItem;
  }

  @Override
  public String toString() {
    return "SubscriptionDiscountFixedAmountValue{amount='" + amount + "', appliesOnEachItem='" + appliesOnEachItem + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDiscountFixedAmountValue that = (SubscriptionDiscountFixedAmountValue) o;
    return Objects.equals(amount, that.amount) &&
        appliesOnEachItem == that.appliesOnEachItem;
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
     * The fixed amount value of the discount.
     */
    private MoneyV2 amount;

    /**
     * Whether the amount is applied per item.
     */
    private boolean appliesOnEachItem;

    public SubscriptionDiscountFixedAmountValue build() {
      SubscriptionDiscountFixedAmountValue result = new SubscriptionDiscountFixedAmountValue();
      result.amount = this.amount;
      result.appliesOnEachItem = this.appliesOnEachItem;
      return result;
    }

    /**
     * The fixed amount value of the discount.
     */
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Whether the amount is applied per item.
     */
    public Builder appliesOnEachItem(boolean appliesOnEachItem) {
      this.appliesOnEachItem = appliesOnEachItem;
      return this;
    }
  }
}
