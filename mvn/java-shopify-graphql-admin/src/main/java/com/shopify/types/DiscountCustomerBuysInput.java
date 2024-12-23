package com.shopify.types;

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

  @Override
  public String toString() {
    return "DiscountCustomerBuysInput{value='" + value + "', items='" + items + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomerBuysInput that = (DiscountCustomerBuysInput) o;
    return Objects.equals(value, that.value) &&
        Objects.equals(items, that.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, items);
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

    public DiscountCustomerBuysInput build() {
      DiscountCustomerBuysInput result = new DiscountCustomerBuysInput();
      result.value = this.value;
      result.items = this.items;
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
  }
}
