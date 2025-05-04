package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to set inventory quantities.
 */
public class InventorySetQuantitiesInput {
  /**
   * The reason for the quantity changes. The value must be one of the [possible
   * reasons](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#set-inventory-quantities-on-hand).
   */
  private String reason;

  /**
   * The name of quantities to be changed. The only accepted values are: `available` or `on_hand`.
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
   * The values to which each quantities will be set.
   */
  private List<InventoryQuantityInput> quantities;

  /**
   * Skip the compare quantity check in the quantities field.
   */
  private Boolean ignoreCompareQuantity = false;

  public InventorySetQuantitiesInput() {
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
   * The name of quantities to be changed. The only accepted values are: `available` or `on_hand`.
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
   * The values to which each quantities will be set.
   */
  public List<InventoryQuantityInput> getQuantities() {
    return quantities;
  }

  public void setQuantities(List<InventoryQuantityInput> quantities) {
    this.quantities = quantities;
  }

  /**
   * Skip the compare quantity check in the quantities field.
   */
  public Boolean getIgnoreCompareQuantity() {
    return ignoreCompareQuantity;
  }

  public void setIgnoreCompareQuantity(Boolean ignoreCompareQuantity) {
    this.ignoreCompareQuantity = ignoreCompareQuantity;
  }

  @Override
  public String toString() {
    return "InventorySetQuantitiesInput{reason='" + reason + "', name='" + name + "', referenceDocumentUri='" + referenceDocumentUri + "', quantities='" + quantities + "', ignoreCompareQuantity='" + ignoreCompareQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventorySetQuantitiesInput that = (InventorySetQuantitiesInput) o;
    return Objects.equals(reason, that.reason) &&
        Objects.equals(name, that.name) &&
        Objects.equals(referenceDocumentUri, that.referenceDocumentUri) &&
        Objects.equals(quantities, that.quantities) &&
        Objects.equals(ignoreCompareQuantity, that.ignoreCompareQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, name, referenceDocumentUri, quantities, ignoreCompareQuantity);
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
     * The name of quantities to be changed. The only accepted values are: `available` or `on_hand`.
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
     * The values to which each quantities will be set.
     */
    private List<InventoryQuantityInput> quantities;

    /**
     * Skip the compare quantity check in the quantities field.
     */
    private Boolean ignoreCompareQuantity = false;

    public InventorySetQuantitiesInput build() {
      InventorySetQuantitiesInput result = new InventorySetQuantitiesInput();
      result.reason = this.reason;
      result.name = this.name;
      result.referenceDocumentUri = this.referenceDocumentUri;
      result.quantities = this.quantities;
      result.ignoreCompareQuantity = this.ignoreCompareQuantity;
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
     * The name of quantities to be changed. The only accepted values are: `available` or `on_hand`.
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
     * The values to which each quantities will be set.
     */
    public Builder quantities(List<InventoryQuantityInput> quantities) {
      this.quantities = quantities;
      return this;
    }

    /**
     * Skip the compare quantity check in the quantities field.
     */
    public Builder ignoreCompareQuantity(Boolean ignoreCompareQuantity) {
      this.ignoreCompareQuantity = ignoreCompareQuantity;
      return this;
    }
  }
}
