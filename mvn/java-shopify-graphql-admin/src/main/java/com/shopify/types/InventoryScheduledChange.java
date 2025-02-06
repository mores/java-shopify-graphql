package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Returns the scheduled changes to inventory states related to the ledger document.
 */
public class InventoryScheduledChange {
  /**
   * The date and time that the scheduled change is expected to happen.
   */
  private OffsetDateTime expectedAt;

  /**
   * The quantity
   * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#move-inventory-quantities-between-states)
   * to transition from.
   */
  private String fromName;

  /**
   * The quantities of an inventory item that are related to a specific location.
   */
  private InventoryLevel inventoryLevel;

  /**
   * A freeform URI that represents what changed the inventory quantities.
   */
  private String ledgerDocumentUri;

  /**
   * The quantity of the scheduled change associated with the ledger document in the `fromName` state.
   */
  private int quantity;

  /**
   * The quantity
   * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#move-inventory-quantities-between-states)
   * to transition to.
   */
  private String toName;

  public InventoryScheduledChange() {
  }

  /**
   * The date and time that the scheduled change is expected to happen.
   */
  public OffsetDateTime getExpectedAt() {
    return expectedAt;
  }

  public void setExpectedAt(OffsetDateTime expectedAt) {
    this.expectedAt = expectedAt;
  }

  /**
   * The quantity
   * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#move-inventory-quantities-between-states)
   * to transition from.
   */
  public String getFromName() {
    return fromName;
  }

  public void setFromName(String fromName) {
    this.fromName = fromName;
  }

  /**
   * The quantities of an inventory item that are related to a specific location.
   */
  public InventoryLevel getInventoryLevel() {
    return inventoryLevel;
  }

  public void setInventoryLevel(InventoryLevel inventoryLevel) {
    this.inventoryLevel = inventoryLevel;
  }

  /**
   * A freeform URI that represents what changed the inventory quantities.
   */
  public String getLedgerDocumentUri() {
    return ledgerDocumentUri;
  }

  public void setLedgerDocumentUri(String ledgerDocumentUri) {
    this.ledgerDocumentUri = ledgerDocumentUri;
  }

  /**
   * The quantity of the scheduled change associated with the ledger document in the `fromName` state.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The quantity
   * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#move-inventory-quantities-between-states)
   * to transition to.
   */
  public String getToName() {
    return toName;
  }

  public void setToName(String toName) {
    this.toName = toName;
  }

  @Override
  public String toString() {
    return "InventoryScheduledChange{expectedAt='" + expectedAt + "', fromName='" + fromName + "', inventoryLevel='" + inventoryLevel + "', ledgerDocumentUri='" + ledgerDocumentUri + "', quantity='" + quantity + "', toName='" + toName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryScheduledChange that = (InventoryScheduledChange) o;
    return Objects.equals(expectedAt, that.expectedAt) &&
        Objects.equals(fromName, that.fromName) &&
        Objects.equals(inventoryLevel, that.inventoryLevel) &&
        Objects.equals(ledgerDocumentUri, that.ledgerDocumentUri) &&
        quantity == that.quantity &&
        Objects.equals(toName, that.toName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedAt, fromName, inventoryLevel, ledgerDocumentUri, quantity, toName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time that the scheduled change is expected to happen.
     */
    private OffsetDateTime expectedAt;

    /**
     * The quantity
     * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#move-inventory-quantities-between-states)
     * to transition from.
     */
    private String fromName;

    /**
     * The quantities of an inventory item that are related to a specific location.
     */
    private InventoryLevel inventoryLevel;

    /**
     * A freeform URI that represents what changed the inventory quantities.
     */
    private String ledgerDocumentUri;

    /**
     * The quantity of the scheduled change associated with the ledger document in the `fromName` state.
     */
    private int quantity;

    /**
     * The quantity
     * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#move-inventory-quantities-between-states)
     * to transition to.
     */
    private String toName;

    public InventoryScheduledChange build() {
      InventoryScheduledChange result = new InventoryScheduledChange();
      result.expectedAt = this.expectedAt;
      result.fromName = this.fromName;
      result.inventoryLevel = this.inventoryLevel;
      result.ledgerDocumentUri = this.ledgerDocumentUri;
      result.quantity = this.quantity;
      result.toName = this.toName;
      return result;
    }

    /**
     * The date and time that the scheduled change is expected to happen.
     */
    public Builder expectedAt(OffsetDateTime expectedAt) {
      this.expectedAt = expectedAt;
      return this;
    }

    /**
     * The quantity
     * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#move-inventory-quantities-between-states)
     * to transition from.
     */
    public Builder fromName(String fromName) {
      this.fromName = fromName;
      return this;
    }

    /**
     * The quantities of an inventory item that are related to a specific location.
     */
    public Builder inventoryLevel(InventoryLevel inventoryLevel) {
      this.inventoryLevel = inventoryLevel;
      return this;
    }

    /**
     * A freeform URI that represents what changed the inventory quantities.
     */
    public Builder ledgerDocumentUri(String ledgerDocumentUri) {
      this.ledgerDocumentUri = ledgerDocumentUri;
      return this;
    }

    /**
     * The quantity of the scheduled change associated with the ledger document in the `fromName` state.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The quantity
     * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#move-inventory-quantities-between-states)
     * to transition to.
     */
    public Builder toName(String toName) {
      this.toName = toName;
      return this;
    }
  }
}
