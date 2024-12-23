package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The items in the order that qualify for the discount, their quantities, and the total value of the discount.
 */
public class DiscountCustomerGets {
  /**
   * Whether the discount applies on regular one-time-purchase items.
   */
  private boolean appliesOnOneTimePurchase;

  /**
   * Whether the discount applies on subscription items.
   * [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription-discounts)
   * enable customers to purchase products
   * on a recurring basis.
   */
  private boolean appliesOnSubscription;

  /**
   * The items to which the discount applies.
   */
  private DiscountItems items;

  /**
   * Entitled quantity and the discount value.
   */
  private DiscountCustomerGetsValue value;

  public DiscountCustomerGets() {
  }

  /**
   * Whether the discount applies on regular one-time-purchase items.
   */
  public boolean getAppliesOnOneTimePurchase() {
    return appliesOnOneTimePurchase;
  }

  public void setAppliesOnOneTimePurchase(boolean appliesOnOneTimePurchase) {
    this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
  }

  /**
   * Whether the discount applies on subscription items.
   * [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription-discounts)
   * enable customers to purchase products
   * on a recurring basis.
   */
  public boolean getAppliesOnSubscription() {
    return appliesOnSubscription;
  }

  public void setAppliesOnSubscription(boolean appliesOnSubscription) {
    this.appliesOnSubscription = appliesOnSubscription;
  }

  /**
   * The items to which the discount applies.
   */
  public DiscountItems getItems() {
    return items;
  }

  public void setItems(DiscountItems items) {
    this.items = items;
  }

  /**
   * Entitled quantity and the discount value.
   */
  public DiscountCustomerGetsValue getValue() {
    return value;
  }

  public void setValue(DiscountCustomerGetsValue value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "DiscountCustomerGets{appliesOnOneTimePurchase='" + appliesOnOneTimePurchase + "', appliesOnSubscription='" + appliesOnSubscription + "', items='" + items + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomerGets that = (DiscountCustomerGets) o;
    return appliesOnOneTimePurchase == that.appliesOnOneTimePurchase &&
        appliesOnSubscription == that.appliesOnSubscription &&
        Objects.equals(items, that.items) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliesOnOneTimePurchase, appliesOnSubscription, items, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the discount applies on regular one-time-purchase items.
     */
    private boolean appliesOnOneTimePurchase;

    /**
     * Whether the discount applies on subscription items.
     * [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription-discounts)
     * enable customers to purchase products
     * on a recurring basis.
     */
    private boolean appliesOnSubscription;

    /**
     * The items to which the discount applies.
     */
    private DiscountItems items;

    /**
     * Entitled quantity and the discount value.
     */
    private DiscountCustomerGetsValue value;

    public DiscountCustomerGets build() {
      DiscountCustomerGets result = new DiscountCustomerGets();
      result.appliesOnOneTimePurchase = this.appliesOnOneTimePurchase;
      result.appliesOnSubscription = this.appliesOnSubscription;
      result.items = this.items;
      result.value = this.value;
      return result;
    }

    /**
     * Whether the discount applies on regular one-time-purchase items.
     */
    public Builder appliesOnOneTimePurchase(boolean appliesOnOneTimePurchase) {
      this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
      return this;
    }

    /**
     * Whether the discount applies on subscription items.
     * [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription-discounts)
     * enable customers to purchase products
     * on a recurring basis.
     */
    public Builder appliesOnSubscription(boolean appliesOnSubscription) {
      this.appliesOnSubscription = appliesOnSubscription;
      return this;
    }

    /**
     * The items to which the discount applies.
     */
    public Builder items(DiscountItems items) {
      this.items = items;
      return this;
    }

    /**
     * Entitled quantity and the discount value.
     */
    public Builder value(DiscountCustomerGetsValue value) {
      this.value = value;
      return this;
    }
  }
}
