package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to adjust inventory quantities.
 */
public class InventoryAdjustQuantitiesInput {
  /**
   * The reason for the quantity changes. The value must be one of the [possible 
   * reasons](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#set-inventory-quantities-on-hand).
   */
  private String reason;

  /**
   * The quantity [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states)
   * to be adjusted.
   */
  private String name;

  /**
   * A freeform URI that represents why the inventory change happened. This can be the entity adjusting inventory
   * quantities or the Shopify resource that's associated with the inventory adjustment. For example, a unit in a
   * draft order might have been previously reserved, and a merchant later creates an order from the draft order.
   * In this case, the `referenceDocumentUri` for the inventory adjustment is a URI referencing the order ID.
   */
  private String referenceDocumentUri;

  /**
   * The quantity changes of items at locations to be made.
   */
  private List<InventoryChangeInput> changes;

  public InventoryAdjustQuantitiesInput() {
  }

  /**
   * The reason for the quantity changes. The value must be one of the [possible 
   * reasons](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#set-inventory-quantities-on-hand).
   */
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * The quantity [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states)
   * to be adjusted.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  /**
   * The quantity changes of items at locations to be made.
   */
  public List<InventoryChangeInput> getChanges() {
    return changes;
  }

  public void setChanges(List<InventoryChangeInput> changes) {
    this.changes = changes;
  }

  @Override
  public String toString() {
    return "InventoryAdjustQuantitiesInput{reason='" + reason + "', name='" + name + "', referenceDocumentUri='" + referenceDocumentUri + "', changes='" + changes + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryAdjustQuantitiesInput that = (InventoryAdjustQuantitiesInput) o;
    return Objects.equals(reason, that.reason) &&
        Objects.equals(name, that.name) &&
        Objects.equals(referenceDocumentUri, that.referenceDocumentUri) &&
        Objects.equals(changes, that.changes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, name, referenceDocumentUri, changes);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The reason for the quantity changes. The value must be one of the [possible 
     * reasons](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#set-inventory-quantities-on-hand).
     */
    private String reason;

    /**
     * The quantity [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states)
     * to be adjusted.
     */
    private String name;

    /**
     * A freeform URI that represents why the inventory change happened. This can be the entity adjusting inventory
     * quantities or the Shopify resource that's associated with the inventory adjustment. For example, a unit in a
     * draft order might have been previously reserved, and a merchant later creates an order from the draft order.
     * In this case, the `referenceDocumentUri` for the inventory adjustment is a URI referencing the order ID.
     */
    private String referenceDocumentUri;

    /**
     * The quantity changes of items at locations to be made.
     */
    private List<InventoryChangeInput> changes;

    public InventoryAdjustQuantitiesInput build() {
      InventoryAdjustQuantitiesInput result = new InventoryAdjustQuantitiesInput();
      result.reason = this.reason;
      result.name = this.name;
      result.referenceDocumentUri = this.referenceDocumentUri;
      result.changes = this.changes;
      return result;
    }

    /**
     * The reason for the quantity changes. The value must be one of the [possible 
     * reasons](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#set-inventory-quantities-on-hand).
     */
    public Builder reason(String reason) {
      this.reason = reason;
      return this;
    }

    /**
     * The quantity [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states)
     * to be adjusted.
     */
    public Builder name(String name) {
      this.name = name;
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

    /**
     * The quantity changes of items at locations to be made.
     */
    public Builder changes(List<InventoryChangeInput> changes) {
      this.changes = changes;
      return this;
    }
  }
}
