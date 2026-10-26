package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A purchase order represents an agreement from a merchant to buy goods or services from a supplier.
 * While the agreement is captured on the merchant's side as a purchase order, it’s recorded as a sales order
 * on the supplier side.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class InventoryPurchaseOrder implements com.shopify.admin.types.Node {
  /**
   * The date and time the purchase order was archived.
   */
  private OffsetDateTime archivedAt;

  /**
   * The currency for the purchase order's cost values.
   * The shop's currency will be used if one isn't provided during creation.
   */
  private CurrencyCode currency;

  /**
   * The date and time the purchase order was placed.
   */
  private OffsetDateTime dateCreated;

  /**
   * The target containing the destination location of the purchase order.
   */
  private LocationSnapshot destination;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * A list of the purchase order's line items.
   */
  private InventoryPurchaseOrderLineItemConnection lineItems;

  /**
   * The name of the purchase order.
   */
  private String name;

  /**
   * The date and time the purchase order was confirmed with the supplier.
   */
  private OffsetDateTime orderedAt;

  /**
   * The supplier snapshot where the purchase order originates from.
   */
  private InventorySupplierSnapshot origin;

  /**
   * The current status of the inventory purchase order.
   */
  private InventoryPurchaseOrderStatus status;

  /**
   * The inventory transfers linked to this purchase order.
   */
  private InventoryTransferConnection transfers;

  public InventoryPurchaseOrder() {
  }

  /**
   * The date and time the purchase order was archived.
   */
  public OffsetDateTime getArchivedAt() {
    return archivedAt;
  }

  public void setArchivedAt(OffsetDateTime archivedAt) {
    this.archivedAt = archivedAt;
  }

  /**
   * The currency for the purchase order's cost values.
   * The shop's currency will be used if one isn't provided during creation.
   */
  public CurrencyCode getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyCode currency) {
    this.currency = currency;
  }

  /**
   * The date and time the purchase order was placed.
   */
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   * The target containing the destination location of the purchase order.
   */
  public LocationSnapshot getDestination() {
    return destination;
  }

  public void setDestination(LocationSnapshot destination) {
    this.destination = destination;
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
   * A list of the purchase order's line items.
   */
  public InventoryPurchaseOrderLineItemConnection getLineItems() {
    return lineItems;
  }

  public void setLineItems(InventoryPurchaseOrderLineItemConnection lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * The name of the purchase order.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The date and time the purchase order was confirmed with the supplier.
   */
  public OffsetDateTime getOrderedAt() {
    return orderedAt;
  }

  public void setOrderedAt(OffsetDateTime orderedAt) {
    this.orderedAt = orderedAt;
  }

  /**
   * The supplier snapshot where the purchase order originates from.
   */
  public InventorySupplierSnapshot getOrigin() {
    return origin;
  }

  public void setOrigin(InventorySupplierSnapshot origin) {
    this.origin = origin;
  }

  /**
   * The current status of the inventory purchase order.
   */
  public InventoryPurchaseOrderStatus getStatus() {
    return status;
  }

  public void setStatus(InventoryPurchaseOrderStatus status) {
    this.status = status;
  }

  /**
   * The inventory transfers linked to this purchase order.
   */
  public InventoryTransferConnection getTransfers() {
    return transfers;
  }

  public void setTransfers(InventoryTransferConnection transfers) {
    this.transfers = transfers;
  }

  @Override
  public String toString() {
    return "InventoryPurchaseOrder{archivedAt='" + archivedAt + "', currency='" + currency + "', dateCreated='" + dateCreated + "', destination='" + destination + "', id='" + id + "', lineItems='" + lineItems + "', name='" + name + "', orderedAt='" + orderedAt + "', origin='" + origin + "', status='" + status + "', transfers='" + transfers + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryPurchaseOrder that = (InventoryPurchaseOrder) o;
    return Objects.equals(archivedAt, that.archivedAt) &&
        Objects.equals(currency, that.currency) &&
        Objects.equals(dateCreated, that.dateCreated) &&
        Objects.equals(destination, that.destination) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(name, that.name) &&
        Objects.equals(orderedAt, that.orderedAt) &&
        Objects.equals(origin, that.origin) &&
        Objects.equals(status, that.status) &&
        Objects.equals(transfers, that.transfers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archivedAt, currency, dateCreated, destination, id, lineItems, name, orderedAt, origin, status, transfers);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time the purchase order was archived.
     */
    private OffsetDateTime archivedAt;

    /**
     * The currency for the purchase order's cost values.
     * The shop's currency will be used if one isn't provided during creation.
     */
    private CurrencyCode currency;

    /**
     * The date and time the purchase order was placed.
     */
    private OffsetDateTime dateCreated;

    /**
     * The target containing the destination location of the purchase order.
     */
    private LocationSnapshot destination;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * A list of the purchase order's line items.
     */
    private InventoryPurchaseOrderLineItemConnection lineItems;

    /**
     * The name of the purchase order.
     */
    private String name;

    /**
     * The date and time the purchase order was confirmed with the supplier.
     */
    private OffsetDateTime orderedAt;

    /**
     * The supplier snapshot where the purchase order originates from.
     */
    private InventorySupplierSnapshot origin;

    /**
     * The current status of the inventory purchase order.
     */
    private InventoryPurchaseOrderStatus status;

    /**
     * The inventory transfers linked to this purchase order.
     */
    private InventoryTransferConnection transfers;

    public InventoryPurchaseOrder build() {
      InventoryPurchaseOrder result = new InventoryPurchaseOrder();
      result.archivedAt = this.archivedAt;
      result.currency = this.currency;
      result.dateCreated = this.dateCreated;
      result.destination = this.destination;
      result.id = this.id;
      result.lineItems = this.lineItems;
      result.name = this.name;
      result.orderedAt = this.orderedAt;
      result.origin = this.origin;
      result.status = this.status;
      result.transfers = this.transfers;
      return result;
    }

    /**
     * The date and time the purchase order was archived.
     */
    public Builder archivedAt(OffsetDateTime archivedAt) {
      this.archivedAt = archivedAt;
      return this;
    }

    /**
     * The currency for the purchase order's cost values.
     * The shop's currency will be used if one isn't provided during creation.
     */
    public Builder currency(CurrencyCode currency) {
      this.currency = currency;
      return this;
    }

    /**
     * The date and time the purchase order was placed.
     */
    public Builder dateCreated(OffsetDateTime dateCreated) {
      this.dateCreated = dateCreated;
      return this;
    }

    /**
     * The target containing the destination location of the purchase order.
     */
    public Builder destination(LocationSnapshot destination) {
      this.destination = destination;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * A list of the purchase order's line items.
     */
    public Builder lineItems(InventoryPurchaseOrderLineItemConnection lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * The name of the purchase order.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The date and time the purchase order was confirmed with the supplier.
     */
    public Builder orderedAt(OffsetDateTime orderedAt) {
      this.orderedAt = orderedAt;
      return this;
    }

    /**
     * The supplier snapshot where the purchase order originates from.
     */
    public Builder origin(InventorySupplierSnapshot origin) {
      this.origin = origin;
      return this;
    }

    /**
     * The current status of the inventory purchase order.
     */
    public Builder status(InventoryPurchaseOrderStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The inventory transfers linked to this purchase order.
     */
    public Builder transfers(InventoryTransferConnection transfers) {
      this.transfers = transfers;
      return this;
    }
  }
}
