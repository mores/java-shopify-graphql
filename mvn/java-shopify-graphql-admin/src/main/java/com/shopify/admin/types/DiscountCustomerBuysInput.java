package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for prerequisite items and quantity for the discount.
 */
public class DiscountCustomerBuysInput {
  /**
   * The quantity of prerequisite items.
   */
  private DiscountCustomerBuysValueInput value;

  /**
   * The IDs of items that the customer buys. The items can be either collections or products.
   */
  private DiscountItemsInput items;

  /**
   * If the discount is applicable when a customer buys a one-time purchase.
   */
  private Boolean isOneTimePurchase = true;

  /**
   * If the discount is applicable when a customer buys a subscription purchase.
   */
  private Boolean isSubscription = false;

  public DiscountCustomerBuysInput() {
  }

  /**
   * The quantity of prerequisite items.
   */
  public DiscountCustomerBuysValueInput getValue() {
    return value;
  }

  public void setValue(DiscountCustomerBuysValueInput value) {
    this.value = value;
  }

  /**
   * The IDs of items that the customer buys. The items can be either collections or products.
   */
  public DiscountItemsInput getItems() {
    return items;
  }

  public void setItems(DiscountItemsInput items) {
    this.items = items;
  }

  /**
   * If the discount is applicable when a customer buys a one-time purchase.
   */
  public Boolean getIsOneTimePurchase() {
    return isOneTimePurchase;
  }

  public void setIsOneTimePurchase(Boolean isOneTimePurchase) {
    this.isOneTimePurchase = isOneTimePurchase;
  }

  /**
   * If the discount is applicable when a customer buys a subscription purchase.
   */
  public Boolean getIsSubscription() {
    return isSubscription;
  }

  public void setIsSubscription(Boolean isSubscription) {
    this.isSubscription = isSubscription;
  }

  @Override
  public String toString() {
    return "DiscountCustomerBuysInput{value='" + value + "', items='" + items + "', isOneTimePurchase='" + isOneTimePurchase + "', isSubscription='" + isSubscription + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomerBuysInput that = (DiscountCustomerBuysInput) o;
    return Objects.equals(value, that.value) &&
        Objects.equals(items, that.items) &&
        Objects.equals(isOneTimePurchase, that.isOneTimePurchase) &&
        Objects.equals(isSubscription, that.isSubscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, items, isOneTimePurchase, isSubscription);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The quantity of prerequisite items.
     */
    private DiscountCustomerBuysValueInput value;

    /**
     * The IDs of items that the customer buys. The items can be either collections or products.
     */
    private DiscountItemsInput items;

    /**
     * If the discount is applicable when a customer buys a one-time purchase.
     */
    private Boolean isOneTimePurchase = true;

    /**
     * If the discount is applicable when a customer buys a subscription purchase.
     */
    private Boolean isSubscription = false;

    public DiscountCustomerBuysInput build() {
      DiscountCustomerBuysInput result = new DiscountCustomerBuysInput();
      result.value = this.value;
      result.items = this.items;
      result.isOneTimePurchase = this.isOneTimePurchase;
      result.isSubscription = this.isSubscription;
      return result;
    }

    /**
     * The quantity of prerequisite items.
     */
    public Builder value(DiscountCustomerBuysValueInput value) {
      this.value = value;
      return this;
    }

    /**
     * The IDs of items that the customer buys. The items can be either collections or products.
     */
    public Builder items(DiscountItemsInput items) {
      this.items = items;
      return this;
    }

    /**
     * If the discount is applicable when a customer buys a one-time purchase.
     */
    public Builder isOneTimePurchase(Boolean isOneTimePurchase) {
      this.isOneTimePurchase = isOneTimePurchase;
      return this;
    }

    /**
     * If the discount is applicable when a customer buys a subscription purchase.
     */
    public Builder isSubscription(Boolean isSubscription) {
      this.isSubscription = isSubscription;
      return this;
    }
  }
}
