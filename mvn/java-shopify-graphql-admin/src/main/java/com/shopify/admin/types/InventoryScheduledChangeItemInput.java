package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for the inventory item associated with the scheduled changes that need to be applied.
 */
public class InventoryScheduledChangeItemInput {
  /**
   * The ID of the inventory item.
   */
  private String inventoryItemId;

  /**
   * The ID of the location.
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
   * Requirements: Valid non-Shopify URI with scheme and content. Cannot use gid://shopify/* format.
   */
  private String ledgerDocumentUri;

  /**
   * An array of all the scheduled changes for the item.
   */
  private List<InventoryScheduledChangeInput> scheduledChanges;

  public InventoryScheduledChangeItemInput() {
  }

  /**
   * The ID of the inventory item.
   */
  public String getInventoryItemId() {
    return inventoryItemId;
  }

  public void setInventoryItemId(String inventoryItemId) {
    this.inventoryItemId = inventoryItemId;
  }

  /**
   * The ID of the location.
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
   * Requirements: Valid non-Shopify URI with scheme and content. Cannot use gid://shopify/* format.
   */
  public String getLedgerDocumentUri() {
    return ledgerDocumentUri;
  }

  public void setLedgerDocumentUri(String ledgerDocumentUri) {
    this.ledgerDocumentUri = ledgerDocumentUri;
  }

  /**
   * An array of all the scheduled changes for the item.
   */
  public List<InventoryScheduledChangeInput> getScheduledChanges() {
    return scheduledChanges;
  }

  public void setScheduledChanges(List<InventoryScheduledChangeInput> scheduledChanges) {
    this.scheduledChanges = scheduledChanges;
  }

  @Override
  public String toString() {
    return "InventoryScheduledChangeItemInput{inventoryItemId='" + inventoryItemId + "', locationId='" + locationId + "', ledgerDocumentUri='" + ledgerDocumentUri + "', scheduledChanges='" + scheduledChanges + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryScheduledChangeItemInput that = (InventoryScheduledChangeItemInput) o;
    return Objects.equals(inventoryItemId, that.inventoryItemId) &&
        Objects.equals(locationId, that.locationId) &&
        Objects.equals(ledgerDocumentUri, that.ledgerDocumentUri) &&
        Objects.equals(scheduledChanges, that.scheduledChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryItemId, locationId, ledgerDocumentUri, scheduledChanges);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the inventory item.
     */
    private String inventoryItemId;

    /**
     * The ID of the location.
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
     * Requirements: Valid non-Shopify URI with scheme and content. Cannot use gid://shopify/* format.
     */
    private String ledgerDocumentUri;

    /**
     * An array of all the scheduled changes for the item.
     */
    private List<InventoryScheduledChangeInput> scheduledChanges;

    public InventoryScheduledChangeItemInput build() {
      InventoryScheduledChangeItemInput result = new InventoryScheduledChangeItemInput();
      result.inventoryItemId = this.inventoryItemId;
      result.locationId = this.locationId;
      result.ledgerDocumentUri = this.ledgerDocumentUri;
      result.scheduledChanges = this.scheduledChanges;
      return result;
    }

    /**
     * The ID of the inventory item.
     */
    public Builder inventoryItemId(String inventoryItemId) {
      this.inventoryItemId = inventoryItemId;
      return this;
    }

    /**
     * The ID of the location.
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
     * Requirements: Valid non-Shopify URI with scheme and content. Cannot use gid://shopify/* format.
     */
    public Builder ledgerDocumentUri(String ledgerDocumentUri) {
      this.ledgerDocumentUri = ledgerDocumentUri;
      return this;
    }

    /**
     * An array of all the scheduled changes for the item.
     */
    public Builder scheduledChanges(List<InventoryScheduledChangeInput> scheduledChanges) {
      this.scheduledChanges = scheduledChanges;
      return this;
    }
  }
}
