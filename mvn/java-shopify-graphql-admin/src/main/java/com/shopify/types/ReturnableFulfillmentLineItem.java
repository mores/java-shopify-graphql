package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A returnable fulfillment line item.
 */
public class ReturnableFulfillmentLineItem {
  /**
   * The fulfillment line item that can be returned.
   */
  private FulfillmentLineItem fulfillmentLineItem;

  /**
   * The quantity available to be returned.
   */
  private int quantity;

  public ReturnableFulfillmentLineItem() {
  }

  /**
   * The fulfillment line item that can be returned.
   */
  public FulfillmentLineItem getFulfillmentLineItem() {
    return fulfillmentLineItem;
  }

  public void setFulfillmentLineItem(FulfillmentLineItem fulfillmentLineItem) {
    this.fulfillmentLineItem = fulfillmentLineItem;
  }

  /**
   * The quantity available to be returned.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "ReturnableFulfillmentLineItem{fulfillmentLineItem='" + fulfillmentLineItem + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnableFulfillmentLineItem that = (ReturnableFulfillmentLineItem) o;
    return Objects.equals(fulfillmentLineItem, that.fulfillmentLineItem) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentLineItem, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The fulfillment line item that can be returned.
     */
    private FulfillmentLineItem fulfillmentLineItem;

    /**
     * The quantity available to be returned.
     */
    private int quantity;

    public ReturnableFulfillmentLineItem build() {
      ReturnableFulfillmentLineItem result = new ReturnableFulfillmentLineItem();
      result.fulfillmentLineItem = this.fulfillmentLineItem;
      result.quantity = this.quantity;
      return result;
    }

    /**
     * The fulfillment line item that can be returned.
     */
    public Builder fulfillmentLineItem(FulfillmentLineItem fulfillmentLineItem) {
      this.fulfillmentLineItem = fulfillmentLineItem;
      return this;
    }

    /**
     * The quantity available to be returned.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
