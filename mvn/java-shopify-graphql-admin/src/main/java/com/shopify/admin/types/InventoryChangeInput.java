package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the change to be made to an inventory item at a location.
 */
public class InventoryChangeInput {
  /**
   * The amount by which the inventory quantity will be changed.
   */
  private int delta;

  /**
   * Specifies the inventory item to which the change will be applied.
   */
  private String inventoryItemId;

  /**
   * Specifies the location at which the change will be applied.
   */
  private String locationId;

  /**
   * A non-Shopify URI that identifies what specific inventory transaction or
   * ledger entry was changed. Represents the exact inventory movement being
   * referenced, distinct from the business reason for the change.
   *   
   * Preferred format - Global ID (GID): gid://[your-app-name]/[transaction-type]/[id]
   *   
   * Examples:
   * - gid://warehouse-app/InventoryTransaction/TXN-2024-001 (specific transaction)
   * - gid://3pl-system/StockMovement/SM-2024-0125 (stock movement record)
   * - gid://pos-app/InventoryUpdate/UPD-98765 (POS inventory update)
   * - gid://erp-connector/LedgerEntry/LE-2024-11-21-001 (ledger entry)
   *   
   * Requirements: Valid non-Shopify URI with scheme and content. Required for all
   * quantity names except `available`. Cannot use gid://shopify/* format.
   */
  private String ledgerDocumentUri;

  public InventoryChangeInput() {
  }

  /**
   * The amount by which the inventory quantity will be changed.
   */
  public int getDelta() {
    return delta;
  }

  public void setDelta(int delta) {
    this.delta = delta;
  }

  /**
   * Specifies the inventory item to which the change will be applied.
   */
  public String getInventoryItemId() {
    return inventoryItemId;
  }

  public void setInventoryItemId(String inventoryItemId) {
    this.inventoryItemId = inventoryItemId;
  }

  /**
   * Specifies the location at which the change will be applied.
   */
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  /**
   * A non-Shopify URI that identifies what specific inventory transaction or
   * ledger entry was changed. Represents the exact inventory movement being
   * referenced, distinct from the business reason for the change.
   *   
   * Preferred format - Global ID (GID): gid://[your-app-name]/[transaction-type]/[id]
   *   
   * Examples:
   * - gid://warehouse-app/InventoryTransaction/TXN-2024-001 (specific transaction)
   * - gid://3pl-system/StockMovement/SM-2024-0125 (stock movement record)
   * - gid://pos-app/InventoryUpdate/UPD-98765 (POS inventory update)
   * - gid://erp-connector/LedgerEntry/LE-2024-11-21-001 (ledger entry)
   *   
   * Requirements: Valid non-Shopify URI with scheme and content. Required for all
   * quantity names except `available`. Cannot use gid://shopify/* format.
   */
  public String getLedgerDocumentUri() {
    return ledgerDocumentUri;
  }

  public void setLedgerDocumentUri(String ledgerDocumentUri) {
    this.ledgerDocumentUri = ledgerDocumentUri;
  }

  @Override
  public String toString() {
    return "InventoryChangeInput{delta='" + delta + "', inventoryItemId='" + inventoryItemId + "', locationId='" + locationId + "', ledgerDocumentUri='" + ledgerDocumentUri + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryChangeInput that = (InventoryChangeInput) o;
    return delta == that.delta &&
        Objects.equals(inventoryItemId, that.inventoryItemId) &&
        Objects.equals(locationId, that.locationId) &&
        Objects.equals(ledgerDocumentUri, that.ledgerDocumentUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delta, inventoryItemId, locationId, ledgerDocumentUri);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount by which the inventory quantity will be changed.
     */
    private int delta;

    /**
     * Specifies the inventory item to which the change will be applied.
     */
    private String inventoryItemId;

    /**
     * Specifies the location at which the change will be applied.
     */
    private String locationId;

    /**
     * A non-Shopify URI that identifies what specific inventory transaction or
     * ledger entry was changed. Represents the exact inventory movement being
     * referenced, distinct from the business reason for the change.
     *   
     * Preferred format - Global ID (GID): gid://[your-app-name]/[transaction-type]/[id]
     *   
     * Examples:
     * - gid://warehouse-app/InventoryTransaction/TXN-2024-001 (specific transaction)
     * - gid://3pl-system/StockMovement/SM-2024-0125 (stock movement record)
     * - gid://pos-app/InventoryUpdate/UPD-98765 (POS inventory update)
     * - gid://erp-connector/LedgerEntry/LE-2024-11-21-001 (ledger entry)
     *   
     * Requirements: Valid non-Shopify URI with scheme and content. Required for all
     * quantity names except `available`. Cannot use gid://shopify/* format.
     */
    private String ledgerDocumentUri;

    public InventoryChangeInput build() {
      InventoryChangeInput result = new InventoryChangeInput();
      result.delta = this.delta;
      result.inventoryItemId = this.inventoryItemId;
      result.locationId = this.locationId;
      result.ledgerDocumentUri = this.ledgerDocumentUri;
      return result;
    }

    /**
     * The amount by which the inventory quantity will be changed.
     */
    public Builder delta(int delta) {
      this.delta = delta;
      return this;
    }

    /**
     * Specifies the inventory item to which the change will be applied.
     */
    public Builder inventoryItemId(String inventoryItemId) {
      this.inventoryItemId = inventoryItemId;
      return this;
    }

    /**
     * Specifies the location at which the change will be applied.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     * A non-Shopify URI that identifies what specific inventory transaction or
     * ledger entry was changed. Represents the exact inventory movement being
     * referenced, distinct from the business reason for the change.
     *   
     * Preferred format - Global ID (GID): gid://[your-app-name]/[transaction-type]/[id]
     *   
     * Examples:
     * - gid://warehouse-app/InventoryTransaction/TXN-2024-001 (specific transaction)
     * - gid://3pl-system/StockMovement/SM-2024-0125 (stock movement record)
     * - gid://pos-app/InventoryUpdate/UPD-98765 (POS inventory update)
     * - gid://erp-connector/LedgerEntry/LE-2024-11-21-001 (ledger entry)
     *   
     * Requirements: Valid non-Shopify URI with scheme and content. Required for all
     * quantity names except `available`. Cannot use gid://shopify/* format.
     */
    public Builder ledgerDocumentUri(String ledgerDocumentUri) {
      this.ledgerDocumentUri = ledgerDocumentUri;
      return this;
    }
  }
}
