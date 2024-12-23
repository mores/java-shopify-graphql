package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to reimburse line items on a refund.
 */
public class RefundLineItemInput {
  /**
   * The ID of the line item in the refund.
   */
  private String lineItemId;

  /**
   * The quantity of the associated line item to be refunded.
   */
  private int quantity;

  /**
   * The type of restock for this line item.
   */
  private RefundLineItemRestockType restockType;

  /**
   * The intended location for restocking. If the `restockType` is set to `NO_RESTOCK`, then this value is empty.
   */
  private String locationId;

  public RefundLineItemInput() {
  }

  /**
   * The ID of the line item in the refund.
   */
  public String getLineItemId() {
    return lineItemId;
  }

  public void setLineItemId(String lineItemId) {
    this.lineItemId = lineItemId;
  }

  /**
   * The quantity of the associated line item to be refunded.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The type of restock for this line item.
   */
  public RefundLineItemRestockType getRestockType() {
    return restockType;
  }

  public void setRestockType(RefundLineItemRestockType restockType) {
    this.restockType = restockType;
  }

  /**
   * The intended location for restocking. If the `restockType` is set to `NO_RESTOCK`, then this value is empty.
   */
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  @Override
  public String toString() {
    return "RefundLineItemInput{lineItemId='" + lineItemId + "', quantity='" + quantity + "', restockType='" + restockType + "', locationId='" + locationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RefundLineItemInput that = (RefundLineItemInput) o;
    return Objects.equals(lineItemId, that.lineItemId) &&
        quantity == that.quantity &&
        Objects.equals(restockType, that.restockType) &&
        Objects.equals(locationId, that.locationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItemId, quantity, restockType, locationId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the line item in the refund.
     */
    private String lineItemId;

    /**
     * The quantity of the associated line item to be refunded.
     */
    private int quantity;

    /**
     * The type of restock for this line item.
     */
    private RefundLineItemRestockType restockType;

    /**
     * The intended location for restocking. If the `restockType` is set to `NO_RESTOCK`, then this value is empty.
     */
    private String locationId;

    public RefundLineItemInput build() {
      RefundLineItemInput result = new RefundLineItemInput();
      result.lineItemId = this.lineItemId;
      result.quantity = this.quantity;
      result.restockType = this.restockType;
      result.locationId = this.locationId;
      return result;
    }

    /**
     * The ID of the line item in the refund.
     */
    public Builder lineItemId(String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
    }

    /**
     * The quantity of the associated line item to be refunded.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The type of restock for this line item.
     */
    public Builder restockType(RefundLineItemRestockType restockType) {
      this.restockType = restockType;
      return this;
    }

    /**
     * The intended location for restocking. If the `restockType` is set to `NO_RESTOCK`, then this value is empty.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }
  }
}
