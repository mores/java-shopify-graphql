package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Specifies the items that will be discounted, the quantity of items that will be discounted, and the value of discount.
 */
public class DiscountCustomerGetsInput {
  /**
   * The quantity of items discounted and the discount value.
   */
  private DiscountCustomerGetsValueInput value;

  /**
   * The IDs of the items that the customer gets. The items can be either collections or products.
   */
  private DiscountItemsInput items;

  /**
   * Whether the discount applies on regular one-time-purchase items.
   */
  private Boolean appliesOnOneTimePurchase;

  /**
   * Whether the discount applies on subscription items.
   * [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription-discounts)
   * enable customers to purchase products
   * on a recurring basis.
   */
  private Boolean appliesOnSubscription;

  public DiscountCustomerGetsInput() {
  }

  /**
   * The quantity of items discounted and the discount value.
   */
  public DiscountCustomerGetsValueInput getValue() {
    return value;
  }

  public void setValue(DiscountCustomerGetsValueInput value) {
    this.value = value;
  }

  /**
   * The IDs of the items that the customer gets. The items can be either collections or products.
   */
  public DiscountItemsInput getItems() {
    return items;
  }

  public void setItems(DiscountItemsInput items) {
    this.items = items;
  }

  /**
   * Whether the discount applies on regular one-time-purchase items.
   */
  public Boolean getAppliesOnOneTimePurchase() {
    return appliesOnOneTimePurchase;
  }

  public void setAppliesOnOneTimePurchase(Boolean appliesOnOneTimePurchase) {
    this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
  }

  /**
   * Whether the discount applies on subscription items.
   * [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription-discounts)
   * enable customers to purchase products
   * on a recurring basis.
   */
  public Boolean getAppliesOnSubscription() {
    return appliesOnSubscription;
  }

  public void setAppliesOnSubscription(Boolean appliesOnSubscription) {
    this.appliesOnSubscription = appliesOnSubscription;
  }

  @Override
  public String toString() {
    return "DiscountCustomerGetsInput{value='" + value + "', items='" + items + "', appliesOnOneTimePurchase='" + appliesOnOneTimePurchase + "', appliesOnSubscription='" + appliesOnSubscription + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomerGetsInput that = (DiscountCustomerGetsInput) o;
    return Objects.equals(value, that.value) &&
        Objects.equals(items, that.items) &&
        Objects.equals(appliesOnOneTimePurchase, that.appliesOnOneTimePurchase) &&
        Objects.equals(appliesOnSubscription, that.appliesOnSubscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, items, appliesOnOneTimePurchase, appliesOnSubscription);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The quantity of items discounted and the discount value.
     */
    private DiscountCustomerGetsValueInput value;

    /**
     * The IDs of the items that the customer gets. The items can be either collections or products.
     */
    private DiscountItemsInput items;

    /**
     * Whether the discount applies on regular one-time-purchase items.
     */
    private Boolean appliesOnOneTimePurchase;

    /**
     * Whether the discount applies on subscription items.
     * [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription-discounts)
     * enable customers to purchase products
     * on a recurring basis.
     */
    private Boolean appliesOnSubscription;

    public DiscountCustomerGetsInput build() {
      DiscountCustomerGetsInput result = new DiscountCustomerGetsInput();
      result.value = this.value;
      result.items = this.items;
      result.appliesOnOneTimePurchase = this.appliesOnOneTimePurchase;
      result.appliesOnSubscription = this.appliesOnSubscription;
      return result;
    }

    /**
     * The quantity of items discounted and the discount value.
     */
    public Builder value(DiscountCustomerGetsValueInput value) {
      this.value = value;
      return this;
    }

    /**
     * The IDs of the items that the customer gets. The items can be either collections or products.
     */
    public Builder items(DiscountItemsInput items) {
      this.items = items;
      return this;
    }

    /**
     * Whether the discount applies on regular one-time-purchase items.
     */
    public Builder appliesOnOneTimePurchase(Boolean appliesOnOneTimePurchase) {
      this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
      return this;
    }

    /**
     * Whether the discount applies on subscription items.
     * [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription-discounts)
     * enable customers to purchase products
     * on a recurring basis.
     */
    public Builder appliesOnSubscription(Boolean appliesOnSubscription) {
      this.appliesOnSubscription = appliesOnSubscription;
      return this;
    }
  }
}
