package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The prerequisite items and prerequisite value that a customer must have on the order for the discount to be applicable.
 */
public class DiscountCustomerBuys {
  /**
   * If the discount is applicable when a customer buys a one-time purchase.
   */
  private boolean isOneTimePurchase;

  /**
   * If the discount is applicable when a customer buys a subscription purchase.
   */
  private boolean isSubscription;

  /**
   * The items required for the discount to be applicable.
   */
  private DiscountItems items;

  /**
   * The prerequisite value.
   */
  private DiscountCustomerBuysValue value;

  public DiscountCustomerBuys() {
  }

  /**
   * If the discount is applicable when a customer buys a one-time purchase.
   */
  public boolean getIsOneTimePurchase() {
    return isOneTimePurchase;
  }

  public void setIsOneTimePurchase(boolean isOneTimePurchase) {
    this.isOneTimePurchase = isOneTimePurchase;
  }

  /**
   * If the discount is applicable when a customer buys a subscription purchase.
   */
  public boolean getIsSubscription() {
    return isSubscription;
  }

  public void setIsSubscription(boolean isSubscription) {
    this.isSubscription = isSubscription;
  }

  /**
   * The items required for the discount to be applicable.
   */
  public DiscountItems getItems() {
    return items;
  }

  public void setItems(DiscountItems items) {
    this.items = items;
  }

  /**
   * The prerequisite value.
   */
  public DiscountCustomerBuysValue getValue() {
    return value;
  }

  public void setValue(DiscountCustomerBuysValue value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "DiscountCustomerBuys{isOneTimePurchase='" + isOneTimePurchase + "', isSubscription='" + isSubscription + "', items='" + items + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomerBuys that = (DiscountCustomerBuys) o;
    return isOneTimePurchase == that.isOneTimePurchase &&
        isSubscription == that.isSubscription &&
        Objects.equals(items, that.items) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isOneTimePurchase, isSubscription, items, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * If the discount is applicable when a customer buys a one-time purchase.
     */
    private boolean isOneTimePurchase;

    /**
     * If the discount is applicable when a customer buys a subscription purchase.
     */
    private boolean isSubscription;

    /**
     * The items required for the discount to be applicable.
     */
    private DiscountItems items;

    /**
     * The prerequisite value.
     */
    private DiscountCustomerBuysValue value;

    public DiscountCustomerBuys build() {
      DiscountCustomerBuys result = new DiscountCustomerBuys();
      result.isOneTimePurchase = this.isOneTimePurchase;
      result.isSubscription = this.isSubscription;
      result.items = this.items;
      result.value = this.value;
      return result;
    }

    /**
     * If the discount is applicable when a customer buys a one-time purchase.
     */
    public Builder isOneTimePurchase(boolean isOneTimePurchase) {
      this.isOneTimePurchase = isOneTimePurchase;
      return this;
    }

    /**
     * If the discount is applicable when a customer buys a subscription purchase.
     */
    public Builder isSubscription(boolean isSubscription) {
      this.isSubscription = isSubscription;
      return this;
    }

    /**
     * The items required for the discount to be applicable.
     */
    public Builder items(DiscountItems items) {
      this.items = items;
      return this;
    }

    /**
     * The prerequisite value.
     */
    public Builder value(DiscountCustomerBuysValue value) {
      this.value = value;
      return this;
    }
  }
}
