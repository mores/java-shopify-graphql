package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields representing the change to be made to an inventory item at a location.
 */
public class InventoryMoveQuantityTerminalInput {
  /**
   * Specifies the location at which the change will be applied.
   */
  private String locationId;

  /**
   * The quantity
   * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states) to be
   * moved.
   */
  private String name;

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

  public InventoryMoveQuantityTerminalInput() {
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
   * The quantity
   * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states) to be
   * moved.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
    return "InventoryMoveQuantityTerminalInput{locationId='" + locationId + "', name='" + name + "', ledgerDocumentUri='" + ledgerDocumentUri + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryMoveQuantityTerminalInput that = (InventoryMoveQuantityTerminalInput) o;
    return Objects.equals(locationId, that.locationId) &&
        Objects.equals(name, that.name) &&
        Objects.equals(ledgerDocumentUri, that.ledgerDocumentUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, name, ledgerDocumentUri);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Specifies the location at which the change will be applied.
     */
    private String locationId;

    /**
     * The quantity
     * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states) to be
     * moved.
     */
    private String name;

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

    public InventoryMoveQuantityTerminalInput build() {
      InventoryMoveQuantityTerminalInput result = new InventoryMoveQuantityTerminalInput();
      result.locationId = this.locationId;
      result.name = this.name;
      result.ledgerDocumentUri = this.ledgerDocumentUri;
      return result;
    }

    /**
     * Specifies the location at which the change will be applied.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     * The quantity
     * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states) to be
     * moved.
     */
    public Builder name(String name) {
      this.name = name;
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
