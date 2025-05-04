package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to move inventory quantities.
 */
public class InventoryMoveQuantitiesInput {
  /**
   * The reason for the quantity changes. The value must be one of the [possible 
   * reasons](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#set-inventory-quantities-on-hand).
   */
  private String reason;

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
  private List<InventoryMoveQuantityChange> changes;

  public InventoryMoveQuantitiesInput() {
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
  public List<InventoryMoveQuantityChange> getChanges() {
    return changes;
  }

  public void setChanges(List<InventoryMoveQuantityChange> changes) {
    this.changes = changes;
  }

  @Override
  public String toString() {
    return "InventoryMoveQuantitiesInput{reason='" + reason + "', referenceDocumentUri='" + referenceDocumentUri + "', changes='" + changes + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryMoveQuantitiesInput that = (InventoryMoveQuantitiesInput) o;
    return Objects.equals(reason, that.reason) &&
        Objects.equals(referenceDocumentUri, that.referenceDocumentUri) &&
        Objects.equals(changes, that.changes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, referenceDocumentUri, changes);
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
     * A freeform URI that represents why the inventory change happened. This can be the entity adjusting inventory
     * quantities or the Shopify resource that's associated with the inventory adjustment. For example, a unit in a
     * draft order might have been previously reserved, and a merchant later creates an order from the draft order.
     * In this case, the `referenceDocumentUri` for the inventory adjustment is a URI referencing the order ID.
     */
    private String referenceDocumentUri;

    /**
     * The quantity changes of items at locations to be made.
     */
    private List<InventoryMoveQuantityChange> changes;

    public InventoryMoveQuantitiesInput build() {
      InventoryMoveQuantitiesInput result = new InventoryMoveQuantitiesInput();
      result.reason = this.reason;
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
    public Builder changes(List<InventoryMoveQuantityChange> changes) {
      this.changes = changes;
      return this;
    }
  }
}
