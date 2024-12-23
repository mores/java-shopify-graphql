package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to dispose a reverse fulfillment order line item.
 */
public class ReverseFulfillmentOrderDisposeInput {
  /**
   * The ID of the reverse fulfillment order line item.
   */
  private String reverseFulfillmentOrderLineItemId;

  /**
   * The quantity of the reverse fulfillment order line item to dispose.
   */
  private int quantity;

  /**
   * The ID of the location where the reverse fulfillment order line item is to be disposed.
   *         This is required when the disposition type is RESTOCKED.
   */
  private String locationId;

  /**
   * The final arrangement for the reverse fulfillment order line item.
   */
  private ReverseFulfillmentOrderDispositionType dispositionType;

  public ReverseFulfillmentOrderDisposeInput() {
  }

  /**
   * The ID of the reverse fulfillment order line item.
   */
  public String getReverseFulfillmentOrderLineItemId() {
    return reverseFulfillmentOrderLineItemId;
  }

  public void setReverseFulfillmentOrderLineItemId(String reverseFulfillmentOrderLineItemId) {
    this.reverseFulfillmentOrderLineItemId = reverseFulfillmentOrderLineItemId;
  }

  /**
   * The quantity of the reverse fulfillment order line item to dispose.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The ID of the location where the reverse fulfillment order line item is to be disposed.
   *         This is required when the disposition type is RESTOCKED.
   */
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  /**
   * The final arrangement for the reverse fulfillment order line item.
   */
  public ReverseFulfillmentOrderDispositionType getDispositionType() {
    return dispositionType;
  }

  public void setDispositionType(ReverseFulfillmentOrderDispositionType dispositionType) {
    this.dispositionType = dispositionType;
  }

  @Override
  public String toString() {
    return "ReverseFulfillmentOrderDisposeInput{reverseFulfillmentOrderLineItemId='" + reverseFulfillmentOrderLineItemId + "', quantity='" + quantity + "', locationId='" + locationId + "', dispositionType='" + dispositionType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseFulfillmentOrderDisposeInput that = (ReverseFulfillmentOrderDisposeInput) o;
    return Objects.equals(reverseFulfillmentOrderLineItemId, that.reverseFulfillmentOrderLineItemId) &&
        quantity == that.quantity &&
        Objects.equals(locationId, that.locationId) &&
        Objects.equals(dispositionType, that.dispositionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reverseFulfillmentOrderLineItemId, quantity, locationId, dispositionType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the reverse fulfillment order line item.
     */
    private String reverseFulfillmentOrderLineItemId;

    /**
     * The quantity of the reverse fulfillment order line item to dispose.
     */
    private int quantity;

    /**
     * The ID of the location where the reverse fulfillment order line item is to be disposed.
     *         This is required when the disposition type is RESTOCKED.
     */
    private String locationId;

    /**
     * The final arrangement for the reverse fulfillment order line item.
     */
    private ReverseFulfillmentOrderDispositionType dispositionType;

    public ReverseFulfillmentOrderDisposeInput build() {
      ReverseFulfillmentOrderDisposeInput result = new ReverseFulfillmentOrderDisposeInput();
      result.reverseFulfillmentOrderLineItemId = this.reverseFulfillmentOrderLineItemId;
      result.quantity = this.quantity;
      result.locationId = this.locationId;
      result.dispositionType = this.dispositionType;
      return result;
    }

    /**
     * The ID of the reverse fulfillment order line item.
     */
    public Builder reverseFulfillmentOrderLineItemId(String reverseFulfillmentOrderLineItemId) {
      this.reverseFulfillmentOrderLineItemId = reverseFulfillmentOrderLineItemId;
      return this;
    }

    /**
     * The quantity of the reverse fulfillment order line item to dispose.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The ID of the location where the reverse fulfillment order line item is to be disposed.
     *         This is required when the disposition type is RESTOCKED.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     * The final arrangement for the reverse fulfillment order line item.
     */
    public Builder dispositionType(ReverseFulfillmentOrderDispositionType dispositionType) {
      this.dispositionType = dispositionType;
      return this;
    }
  }
}
