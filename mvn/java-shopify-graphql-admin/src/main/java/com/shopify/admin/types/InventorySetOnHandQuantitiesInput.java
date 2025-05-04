package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to set inventory on hand quantities.
 */
public class InventorySetOnHandQuantitiesInput {
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
   * The value to which the on hand quantity will be set.
   */
  private List<InventorySetQuantityInput> setQuantities;

  public InventorySetOnHandQuantitiesInput() {
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
   * The value to which the on hand quantity will be set.
   */
  public List<InventorySetQuantityInput> getSetQuantities() {
    return setQuantities;
  }

  public void setSetQuantities(List<InventorySetQuantityInput> setQuantities) {
    this.setQuantities = setQuantities;
  }

  @Override
  public String toString() {
    return "InventorySetOnHandQuantitiesInput{reason='" + reason + "', referenceDocumentUri='" + referenceDocumentUri + "', setQuantities='" + setQuantities + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventorySetOnHandQuantitiesInput that = (InventorySetOnHandQuantitiesInput) o;
    return Objects.equals(reason, that.reason) &&
        Objects.equals(referenceDocumentUri, that.referenceDocumentUri) &&
        Objects.equals(setQuantities, that.setQuantities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, referenceDocumentUri, setQuantities);
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
     * The value to which the on hand quantity will be set.
     */
    private List<InventorySetQuantityInput> setQuantities;

    public InventorySetOnHandQuantitiesInput build() {
      InventorySetOnHandQuantitiesInput result = new InventorySetOnHandQuantitiesInput();
      result.reason = this.reason;
      result.referenceDocumentUri = this.referenceDocumentUri;
      result.setQuantities = this.setQuantities;
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
     * The value to which the on hand quantity will be set.
     */
    public Builder setQuantities(List<InventorySetQuantityInput> setQuantities) {
      this.setQuantities = setQuantities;
      return this;
    }
  }
}
