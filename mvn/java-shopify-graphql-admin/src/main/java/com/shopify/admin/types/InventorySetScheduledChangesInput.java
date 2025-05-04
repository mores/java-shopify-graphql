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
   * A freeform URI that represents why the inventory change happened. This can be the entity adjusting inventory
   * quantities or the Shopify resource that's associated with the inventory adjustment. For example, a unit in a
   * draft order might have been previously reserved, and a merchant later creates an order from the draft order.
   * In this case, the `referenceDocumentUri` for the inventory adjustment is a URI referencing the order ID.
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
   * A freeform URI that represents why the inventory change happened. This can be the entity adjusting inventory
   * quantities or the Shopify resource that's associated with the inventory adjustment. For example, a unit in a
   * draft order might have been previously reserved, and a merchant later creates an order from the draft order.
   * In this case, the `referenceDocumentUri` for the inventory adjustment is a URI referencing the order ID.
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
     * A freeform URI that represents why the inventory change happened. This can be the entity adjusting inventory
     * quantities or the Shopify resource that's associated with the inventory adjustment. For example, a unit in a
     * draft order might have been previously reserved, and a merchant later creates an order from the draft order.
     * In this case, the `referenceDocumentUri` for the inventory adjustment is a URI referencing the order ID.
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
     * A freeform URI that represents why the inventory change happened. This can be the entity adjusting inventory
     * quantities or the Shopify resource that's associated with the inventory adjustment. For example, a unit in a
     * draft order might have been previously reserved, and a merchant later creates an order from the draft order.
     * In this case, the `referenceDocumentUri` for the inventory adjustment is a URI referencing the order ID.
     */
    public Builder referenceDocumentUri(String referenceDocumentUri) {
      this.referenceDocumentUri = referenceDocumentUri;
      return this;
    }
  }
}
