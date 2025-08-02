package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents an inventory shipment.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class InventoryShipment implements com.shopify.admin.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The total quantity of all items in the shipment.
   */
  private int lineItemTotalQuantity;

  /**
   * The line items included in this shipment.
   */
  private InventoryShipmentLineItemConnection lineItems;

  /**
   * The number of line items associated with the inventory shipment. Limited to a maximum of 10000 by default.
   */
  private Count lineItemsCount;

  /**
   * The name of the inventory shipment.
   */
  private String name;

  /**
   * The current status of the shipment.
   */
  private InventoryShipmentStatus status;

  /**
   * The total quantity of items accepted across all line items in this shipment.
   */
  private int totalAcceptedQuantity;

  /**
   * The total quantity of items received (both accepted and rejected) across all line items in this shipment.
   */
  private int totalReceivedQuantity;

  /**
   * The total quantity of items rejected across all line items in this shipment.
   */
  private int totalRejectedQuantity;

  /**
   * The tracking information for the shipment.
   */
  private InventoryShipmentTracking tracking;

  public InventoryShipment() {
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The total quantity of all items in the shipment.
   */
  public int getLineItemTotalQuantity() {
    return lineItemTotalQuantity;
  }

  public void setLineItemTotalQuantity(int lineItemTotalQuantity) {
    this.lineItemTotalQuantity = lineItemTotalQuantity;
  }

  /**
   * The line items included in this shipment.
   */
  public InventoryShipmentLineItemConnection getLineItems() {
    return lineItems;
  }

  public void setLineItems(InventoryShipmentLineItemConnection lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * The number of line items associated with the inventory shipment. Limited to a maximum of 10000 by default.
   */
  public Count getLineItemsCount() {
    return lineItemsCount;
  }

  public void setLineItemsCount(Count lineItemsCount) {
    this.lineItemsCount = lineItemsCount;
  }

  /**
   * The name of the inventory shipment.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The current status of the shipment.
   */
  public InventoryShipmentStatus getStatus() {
    return status;
  }

  public void setStatus(InventoryShipmentStatus status) {
    this.status = status;
  }

  /**
   * The total quantity of items accepted across all line items in this shipment.
   */
  public int getTotalAcceptedQuantity() {
    return totalAcceptedQuantity;
  }

  public void setTotalAcceptedQuantity(int totalAcceptedQuantity) {
    this.totalAcceptedQuantity = totalAcceptedQuantity;
  }

  /**
   * The total quantity of items received (both accepted and rejected) across all line items in this shipment.
   */
  public int getTotalReceivedQuantity() {
    return totalReceivedQuantity;
  }

  public void setTotalReceivedQuantity(int totalReceivedQuantity) {
    this.totalReceivedQuantity = totalReceivedQuantity;
  }

  /**
   * The total quantity of items rejected across all line items in this shipment.
   */
  public int getTotalRejectedQuantity() {
    return totalRejectedQuantity;
  }

  public void setTotalRejectedQuantity(int totalRejectedQuantity) {
    this.totalRejectedQuantity = totalRejectedQuantity;
  }

  /**
   * The tracking information for the shipment.
   */
  public InventoryShipmentTracking getTracking() {
    return tracking;
  }

  public void setTracking(InventoryShipmentTracking tracking) {
    this.tracking = tracking;
  }

  @Override
  public String toString() {
    return "InventoryShipment{id='" + id + "', lineItemTotalQuantity='" + lineItemTotalQuantity + "', lineItems='" + lineItems + "', lineItemsCount='" + lineItemsCount + "', name='" + name + "', status='" + status + "', totalAcceptedQuantity='" + totalAcceptedQuantity + "', totalReceivedQuantity='" + totalReceivedQuantity + "', totalRejectedQuantity='" + totalRejectedQuantity + "', tracking='" + tracking + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryShipment that = (InventoryShipment) o;
    return Objects.equals(id, that.id) &&
        lineItemTotalQuantity == that.lineItemTotalQuantity &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(lineItemsCount, that.lineItemsCount) &&
        Objects.equals(name, that.name) &&
        Objects.equals(status, that.status) &&
        totalAcceptedQuantity == that.totalAcceptedQuantity &&
        totalReceivedQuantity == that.totalReceivedQuantity &&
        totalRejectedQuantity == that.totalRejectedQuantity &&
        Objects.equals(tracking, that.tracking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lineItemTotalQuantity, lineItems, lineItemsCount, name, status, totalAcceptedQuantity, totalReceivedQuantity, totalRejectedQuantity, tracking);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The total quantity of all items in the shipment.
     */
    private int lineItemTotalQuantity;

    /**
     * The line items included in this shipment.
     */
    private InventoryShipmentLineItemConnection lineItems;

    /**
     * The number of line items associated with the inventory shipment. Limited to a maximum of 10000 by default.
     */
    private Count lineItemsCount;

    /**
     * The name of the inventory shipment.
     */
    private String name;

    /**
     * The current status of the shipment.
     */
    private InventoryShipmentStatus status;

    /**
     * The total quantity of items accepted across all line items in this shipment.
     */
    private int totalAcceptedQuantity;

    /**
     * The total quantity of items received (both accepted and rejected) across all line items in this shipment.
     */
    private int totalReceivedQuantity;

    /**
     * The total quantity of items rejected across all line items in this shipment.
     */
    private int totalRejectedQuantity;

    /**
     * The tracking information for the shipment.
     */
    private InventoryShipmentTracking tracking;

    public InventoryShipment build() {
      InventoryShipment result = new InventoryShipment();
      result.id = this.id;
      result.lineItemTotalQuantity = this.lineItemTotalQuantity;
      result.lineItems = this.lineItems;
      result.lineItemsCount = this.lineItemsCount;
      result.name = this.name;
      result.status = this.status;
      result.totalAcceptedQuantity = this.totalAcceptedQuantity;
      result.totalReceivedQuantity = this.totalReceivedQuantity;
      result.totalRejectedQuantity = this.totalRejectedQuantity;
      result.tracking = this.tracking;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The total quantity of all items in the shipment.
     */
    public Builder lineItemTotalQuantity(int lineItemTotalQuantity) {
      this.lineItemTotalQuantity = lineItemTotalQuantity;
      return this;
    }

    /**
     * The line items included in this shipment.
     */
    public Builder lineItems(InventoryShipmentLineItemConnection lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * The number of line items associated with the inventory shipment. Limited to a maximum of 10000 by default.
     */
    public Builder lineItemsCount(Count lineItemsCount) {
      this.lineItemsCount = lineItemsCount;
      return this;
    }

    /**
     * The name of the inventory shipment.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The current status of the shipment.
     */
    public Builder status(InventoryShipmentStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The total quantity of items accepted across all line items in this shipment.
     */
    public Builder totalAcceptedQuantity(int totalAcceptedQuantity) {
      this.totalAcceptedQuantity = totalAcceptedQuantity;
      return this;
    }

    /**
     * The total quantity of items received (both accepted and rejected) across all line items in this shipment.
     */
    public Builder totalReceivedQuantity(int totalReceivedQuantity) {
      this.totalReceivedQuantity = totalReceivedQuantity;
      return this;
    }

    /**
     * The total quantity of items rejected across all line items in this shipment.
     */
    public Builder totalRejectedQuantity(int totalRejectedQuantity) {
      this.totalRejectedQuantity = totalRejectedQuantity;
      return this;
    }

    /**
     * The tracking information for the shipment.
     */
    public Builder tracking(InventoryShipmentTracking tracking) {
      this.tracking = tracking;
      return this;
    }
  }
}
