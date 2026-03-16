package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to the InventoryTransferSetItems mutation.
 */
public class InventoryTransferSetItemsInput {
  /**
   * The ID of the inventory transfer where the items will be set.
   */
  private String id;

  /**
   * The line items to be set on the Transfer.
   */
  private List<InventoryTransferLineItemInput> lineItems;

  public InventoryTransferSetItemsInput() {
  }

  /**
   * The ID of the inventory transfer where the items will be set.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The line items to be set on the Transfer.
   */
  public List<InventoryTransferLineItemInput> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<InventoryTransferLineItemInput> lineItems) {
    this.lineItems = lineItems;
  }

  @Override
  public String toString() {
    return "InventoryTransferSetItemsInput{id='" + id + "', lineItems='" + lineItems + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryTransferSetItemsInput that = (InventoryTransferSetItemsInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(lineItems, that.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lineItems);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the inventory transfer where the items will be set.
     */
    private String id;

    /**
     * The line items to be set on the Transfer.
     */
    private List<InventoryTransferLineItemInput> lineItems;

    public InventoryTransferSetItemsInput build() {
      InventoryTransferSetItemsInput result = new InventoryTransferSetItemsInput();
      result.id = this.id;
      result.lineItems = this.lineItems;
      return result;
    }

    /**
     * The ID of the inventory transfer where the items will be set.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The line items to be set on the Transfer.
     */
    public Builder lineItems(List<InventoryTransferLineItemInput> lineItems) {
      this.lineItems = lineItems;
      return this;
    }
  }
}
