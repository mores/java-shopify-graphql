package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a reverse delivery line item.
 */
public class ReverseDeliveryLineItemInput {
  /**
   * The ID of the related reverse fulfillment order line item.
   */
  private String reverseFulfillmentOrderLineItemId;

  /**
   * The quantity of the item to be included in the delivery.
   */
  private int quantity;

  public ReverseDeliveryLineItemInput() {
  }

  /**
   * The ID of the related reverse fulfillment order line item.
   */
  public String getReverseFulfillmentOrderLineItemId() {
    return reverseFulfillmentOrderLineItemId;
  }

  public void setReverseFulfillmentOrderLineItemId(String reverseFulfillmentOrderLineItemId) {
    this.reverseFulfillmentOrderLineItemId = reverseFulfillmentOrderLineItemId;
  }

  /**
   * The quantity of the item to be included in the delivery.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "ReverseDeliveryLineItemInput{reverseFulfillmentOrderLineItemId='" + reverseFulfillmentOrderLineItemId + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseDeliveryLineItemInput that = (ReverseDeliveryLineItemInput) o;
    return Objects.equals(reverseFulfillmentOrderLineItemId, that.reverseFulfillmentOrderLineItemId) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(reverseFulfillmentOrderLineItemId, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the related reverse fulfillment order line item.
     */
    private String reverseFulfillmentOrderLineItemId;

    /**
     * The quantity of the item to be included in the delivery.
     */
    private int quantity;

    public ReverseDeliveryLineItemInput build() {
      ReverseDeliveryLineItemInput result = new ReverseDeliveryLineItemInput();
      result.reverseFulfillmentOrderLineItemId = this.reverseFulfillmentOrderLineItemId;
      result.quantity = this.quantity;
      return result;
    }

    /**
     * The ID of the related reverse fulfillment order line item.
     */
    public Builder reverseFulfillmentOrderLineItemId(String reverseFulfillmentOrderLineItemId) {
      this.reverseFulfillmentOrderLineItemId = reverseFulfillmentOrderLineItemId;
      return this;
    }

    /**
     * The quantity of the item to be included in the delivery.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
