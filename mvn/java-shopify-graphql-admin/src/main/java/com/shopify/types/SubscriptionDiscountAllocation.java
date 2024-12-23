package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents what a particular discount reduces from a line price.
 */
public class SubscriptionDiscountAllocation {
  /**
   * Allocation amount.
   */
  private MoneyV2 amount;

  /**
   * Discount that created the allocation.
   */
  private SubscriptionDiscount discount;

  public SubscriptionDiscountAllocation() {
  }

  /**
   * Allocation amount.
   */
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  /**
   * Discount that created the allocation.
   */
  public SubscriptionDiscount getDiscount() {
    return discount;
  }

  public void setDiscount(SubscriptionDiscount discount) {
    this.discount = discount;
  }

  @Override
  public String toString() {
    return "SubscriptionDiscountAllocation{amount='" + amount + "', discount='" + discount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDiscountAllocation that = (SubscriptionDiscountAllocation) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(discount, that.discount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, discount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Allocation amount.
     */
    private MoneyV2 amount;

    /**
     * Discount that created the allocation.
     */
    private SubscriptionDiscount discount;

    public SubscriptionDiscountAllocation build() {
      SubscriptionDiscountAllocation result = new SubscriptionDiscountAllocation();
      result.amount = this.amount;
      result.discount = this.discount;
      return result;
    }

    /**
     * Allocation amount.
     */
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Discount that created the allocation.
     */
    public Builder discount(SubscriptionDiscount discount) {
      this.discount = discount;
      return this;
    }
  }
}
