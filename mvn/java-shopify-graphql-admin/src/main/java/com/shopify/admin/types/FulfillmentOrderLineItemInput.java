package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to include the quantity of the fulfillment order line item that should be fulfilled.
 */
public class FulfillmentOrderLineItemInput {
  /**
   * The ID of the fulfillment order line item.
   */
  private String id;

  /**
   * The quantity of the fulfillment order line item.
   */
  private int quantity;

  public FulfillmentOrderLineItemInput() {
  }

  /**
   * The ID of the fulfillment order line item.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The quantity of the fulfillment order line item.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderLineItemInput{id='" + id + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderLineItemInput that = (FulfillmentOrderLineItemInput) o;
    return Objects.equals(id, that.id) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the fulfillment order line item.
     */
    private String id;

    /**
     * The quantity of the fulfillment order line item.
     */
    private int quantity;

    public FulfillmentOrderLineItemInput build() {
      FulfillmentOrderLineItemInput result = new FulfillmentOrderLineItemInput();
      result.id = this.id;
      result.quantity = this.quantity;
      return result;
    }

    /**
     * The ID of the fulfillment order line item.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The quantity of the fulfillment order line item.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
