package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The prerequisite items and prerequisite value that a customer must have on the order for the discount to be applicable.
 */
public class DiscountCustomerBuys {
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
    return "DiscountCustomerBuys{items='" + items + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomerBuys that = (DiscountCustomerBuys) o;
    return Objects.equals(items, that.items) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
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
      result.items = this.items;
      result.value = this.value;
      return result;
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
