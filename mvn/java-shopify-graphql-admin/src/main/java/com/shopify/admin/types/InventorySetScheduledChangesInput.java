package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for setting up scheduled changes of inventory items.
 */
public class InventorySetScheduledChangesInput {
  /**
   * The reason for setting up the scheduled changes.
   */
  private String reason;

  /**
   * The list of all the items on which the scheduled changes need to be applied.
   */
  private List<InventoryScheduledChangeItemInput> items;

  /**
   * A URI that represents why the inventory change happened, identifying the
   * source system and document that caused this adjustment. Enables complete audit
   * trails and brand visibility in Shopify admin inventory history.
   *   
   * Preferred format - Global ID (GID): gid://[your-app-name]/[entity-type]/[id]
   *   
   * Examples:
   * - gid://warehouse-app/PurchaseOrder/PO-2024-001 (stock received)
   * - gid://3pl-system/CycleCount/CC-2024-0125 (cycle count adjustment)
   * - gid://pos-app/Transaction/TXN-98765 (in-store sale)
   * - gid://erp-connector/SyncJob/SYNC-2024-11-21-001 (ERP sync)
   * - gid://shopify/Order/1234567890 (Shopify order reference)
   *   
   * Benefits: Your app name appears directly in merchant inventory history,
   * reducing support tickets and providing clear audit trails for compliance.
   *   
   * Alternative formats (also supported): https://myapp.com/documents/12345, custom-scheme://identifier
   *   
   * Requirements: Valid URI with scheme and content. For GID format, all components (app, entity, id) must be present.
   */
  private String referenceDocumentUri;

  public InventorySetScheduledChangesInput() {
  }

  /**
   * The reason for setting up the scheduled changes.
   */
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * The list of all the items on which the scheduled changes need to be applied.
   */
  public List<InventoryScheduledChangeItemInput> getItems() {
    return items;
  }

  public void setItems(List<InventoryScheduledChangeItemInput> items) {
    this.items = items;
  }

  /**
   * A URI that represents why the inventory change happened, identifying the
   * source system and document that caused this adjustment. Enables complete audit
   * trails and brand visibility in Shopify admin inventory history.
   *   
   * Preferred format - Global ID (GID): gid://[your-app-name]/[entity-type]/[id]
   *   
   * Examples:
   * - gid://warehouse-app/PurchaseOrder/PO-2024-001 (stock received)
   * - gid://3pl-system/CycleCount/CC-2024-0125 (cycle count adjustment)
   * - gid://pos-app/Transaction/TXN-98765 (in-store sale)
   * - gid://erp-connector/SyncJob/SYNC-2024-11-21-001 (ERP sync)
   * - gid://shopify/Order/1234567890 (Shopify order reference)
   *   
   * Benefits: Your app name appears directly in merchant inventory history,
   * reducing support tickets and providing clear audit trails for compliance.
   *   
   * Alternative formats (also supported): https://myapp.com/documents/12345, custom-scheme://identifier
   *   
   * Requirements: Valid URI with scheme and content. For GID format, all components (app, entity, id) must be present.
   */
  public String getReferenceDocumentUri() {
    return referenceDocumentUri;
  }

  public void setReferenceDocumentUri(String referenceDocumentUri) {
    this.referenceDocumentUri = referenceDocumentUri;
  }

  @Override
  public String toString() {
    return "InventorySetScheduledChangesInput{reason='" + reason + "', items='" + items + "', referenceDocumentUri='" + referenceDocumentUri + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventorySetScheduledChangesInput that = (InventorySetScheduledChangesInput) o;
    return Objects.equals(reason, that.reason) &&
        Objects.equals(items, that.items) &&
        Objects.equals(referenceDocumentUri, that.referenceDocumentUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, items, referenceDocumentUri);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The reason for setting up the scheduled changes.
     */
    private String reason;

    /**
     * The list of all the items on which the scheduled changes need to be applied.
     */
    private List<InventoryScheduledChangeItemInput> items;

    /**
     * A URI that represents why the inventory change happened, identifying the
     * source system and document that caused this adjustment. Enables complete audit
     * trails and brand visibility in Shopify admin inventory history.
     *   
     * Preferred format - Global ID (GID): gid://[your-app-name]/[entity-type]/[id]
     *   
     * Examples:
     * - gid://warehouse-app/PurchaseOrder/PO-2024-001 (stock received)
     * - gid://3pl-system/CycleCount/CC-2024-0125 (cycle count adjustment)
     * - gid://pos-app/Transaction/TXN-98765 (in-store sale)
     * - gid://erp-connector/SyncJob/SYNC-2024-11-21-001 (ERP sync)
     * - gid://shopify/Order/1234567890 (Shopify order reference)
     *   
     * Benefits: Your app name appears directly in merchant inventory history,
     * reducing support tickets and providing clear audit trails for compliance.
     *   
     * Alternative formats (also supported): https://myapp.com/documents/12345, custom-scheme://identifier
     *   
     * Requirements: Valid URI with scheme and content. For GID format, all components (app, entity, id) must be present.
     */
    private String referenceDocumentUri;

    public InventorySetScheduledChangesInput build() {
      InventorySetScheduledChangesInput result = new InventorySetScheduledChangesInput();
      result.reason = this.reason;
      result.items = this.items;
      result.referenceDocumentUri = this.referenceDocumentUri;
      return result;
    }

    /**
     * The reason for setting up the scheduled changes.
     */
    public Builder reason(String reason) {
      this.reason = reason;
      return this;
    }

    /**
     * The list of all the items on which the scheduled changes need to be applied.
     */
    public Builder items(List<InventoryScheduledChangeItemInput> items) {
      this.items = items;
      return this;
    }

    /**
     * A URI that represents why the inventory change happened, identifying the
     * source system and document that caused this adjustment. Enables complete audit
     * trails and brand visibility in Shopify admin inventory history.
     *   
     * Preferred format - Global ID (GID): gid://[your-app-name]/[entity-type]/[id]
     *   
     * Examples:
     * - gid://warehouse-app/PurchaseOrder/PO-2024-001 (stock received)
     * - gid://3pl-system/CycleCount/CC-2024-0125 (cycle count adjustment)
     * - gid://pos-app/Transaction/TXN-98765 (in-store sale)
     * - gid://erp-connector/SyncJob/SYNC-2024-11-21-001 (ERP sync)
     * - gid://shopify/Order/1234567890 (Shopify order reference)
     *   
     * Benefits: Your app name appears directly in merchant inventory history,
     * reducing support tickets and providing clear audit trails for compliance.
     *   
     * Alternative formats (also supported): https://myapp.com/documents/12345, custom-scheme://identifier
     *   
     * Requirements: Valid URI with scheme and content. For GID format, all components (app, entity, id) must be present.
     */
    public Builder referenceDocumentUri(String referenceDocumentUri) {
      this.referenceDocumentUri = referenceDocumentUri;
      return this;
    }
  }
}
