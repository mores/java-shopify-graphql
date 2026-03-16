package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Records how many units of an [`OrderLineItem`](https://shopify.dev/docs/api/storefront/current/objects/OrderLineItem)
 * were included in a [`Fulfillment`](https://shopify.dev/docs/api/storefront/current/objects/Fulfillment).
 * Each order line item has at most one fulfillment line item per fulfillment.
 */
public class FulfillmentLineItem {
  /**
   * The associated order's line item.
   */
  private OrderLineItem lineItem;

  /**
   * The amount fulfilled in this fulfillment.
   */
  private int quantity;

  public FulfillmentLineItem() {
  }

  /**
   * The associated order's line item.
   */
  public OrderLineItem getLineItem() {
    return lineItem;
  }

  public void setLineItem(OrderLineItem lineItem) {
    this.lineItem = lineItem;
  }

  /**
   * The amount fulfilled in this fulfillment.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "FulfillmentLineItem{lineItem='" + lineItem + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentLineItem that = (FulfillmentLineItem) o;
    return Objects.equals(lineItem, that.lineItem) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItem, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The associated order's line item.
     */
    private OrderLineItem lineItem;

    /**
     * The amount fulfilled in this fulfillment.
     */
    private int quantity;

    public FulfillmentLineItem build() {
      FulfillmentLineItem result = new FulfillmentLineItem();
      result.lineItem = this.lineItem;
      result.quantity = this.quantity;
      return result;
    }

    /**
     * The associated order's line item.
     */
    public Builder lineItem(OrderLineItem lineItem) {
      this.lineItem = lineItem;
      return this;
    }

    /**
     * The amount fulfilled in this fulfillment.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
