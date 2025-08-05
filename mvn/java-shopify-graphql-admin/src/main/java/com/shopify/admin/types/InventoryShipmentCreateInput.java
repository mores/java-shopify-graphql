package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to add a shipment.
 */
public class InventoryShipmentCreateInput {
  /**
   * The ID of the inventory movement (transfer or purchase order) this shipment belongs to.
   */
  private String movementId;

  /**
   * The tracking information for the shipment.
   */
  private InventoryShipmentTrackingInput trackingInput;

  /**
   * The list of line items for the inventory shipment.
   */
  private List<InventoryShipmentLineItemInput> lineItems;

  public InventoryShipmentCreateInput() {
  }

  /**
   * The ID of the inventory movement (transfer or purchase order) this shipment belongs to.
   */
  public String getMovementId() {
    return movementId;
  }

  public void setMovementId(String movementId) {
    this.movementId = movementId;
  }

  /**
   * The tracking information for the shipment.
   */
  public InventoryShipmentTrackingInput getTrackingInput() {
    return trackingInput;
  }

  public void setTrackingInput(InventoryShipmentTrackingInput trackingInput) {
    this.trackingInput = trackingInput;
  }

  /**
   * The list of line items for the inventory shipment.
   */
  public List<InventoryShipmentLineItemInput> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<InventoryShipmentLineItemInput> lineItems) {
    this.lineItems = lineItems;
  }

  @Override
  public String toString() {
    return "InventoryShipmentCreateInput{movementId='" + movementId + "', trackingInput='" + trackingInput + "', lineItems='" + lineItems + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryShipmentCreateInput that = (InventoryShipmentCreateInput) o;
    return Objects.equals(movementId, that.movementId) &&
        Objects.equals(trackingInput, that.trackingInput) &&
        Objects.equals(lineItems, that.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movementId, trackingInput, lineItems);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the inventory movement (transfer or purchase order) this shipment belongs to.
     */
    private String movementId;

    /**
     * The tracking information for the shipment.
     */
    private InventoryShipmentTrackingInput trackingInput;

    /**
     * The list of line items for the inventory shipment.
     */
    private List<InventoryShipmentLineItemInput> lineItems;

    public InventoryShipmentCreateInput build() {
      InventoryShipmentCreateInput result = new InventoryShipmentCreateInput();
      result.movementId = this.movementId;
      result.trackingInput = this.trackingInput;
      result.lineItems = this.lineItems;
      return result;
    }

    /**
     * The ID of the inventory movement (transfer or purchase order) this shipment belongs to.
     */
    public Builder movementId(String movementId) {
      this.movementId = movementId;
      return this;
    }

    /**
     * The tracking information for the shipment.
     */
    public Builder trackingInput(InventoryShipmentTrackingInput trackingInput) {
      this.trackingInput = trackingInput;
      return this;
    }

    /**
     * The list of line items for the inventory shipment.
     */
    public Builder lineItems(List<InventoryShipmentLineItemInput> lineItems) {
      this.lineItems = lineItems;
      return this;
    }
  }
}
