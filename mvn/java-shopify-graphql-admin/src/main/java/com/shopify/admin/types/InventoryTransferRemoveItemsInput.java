package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to remove inventory items from a transfer.
 */
public class InventoryTransferRemoveItemsInput {
  /**
   * The ID of the inventory transfer where the items will be removed.
   */
  private String id;

  /**
   * The IDs of the transfer line items to be removed from the transfer.
   */
  private List<String> transferLineItemIds;

  public InventoryTransferRemoveItemsInput() {
  }

  /**
   * The ID of the inventory transfer where the items will be removed.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The IDs of the transfer line items to be removed from the transfer.
   */
  public List<String> getTransferLineItemIds() {
    return transferLineItemIds;
  }

  public void setTransferLineItemIds(List<String> transferLineItemIds) {
    this.transferLineItemIds = transferLineItemIds;
  }

  @Override
  public String toString() {
    return "InventoryTransferRemoveItemsInput{id='" + id + "', transferLineItemIds='" + transferLineItemIds + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryTransferRemoveItemsInput that = (InventoryTransferRemoveItemsInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(transferLineItemIds, that.transferLineItemIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transferLineItemIds);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the inventory transfer where the items will be removed.
     */
    private String id;

    /**
     * The IDs of the transfer line items to be removed from the transfer.
     */
    private List<String> transferLineItemIds;

    public InventoryTransferRemoveItemsInput build() {
      InventoryTransferRemoveItemsInput result = new InventoryTransferRemoveItemsInput();
      result.id = this.id;
      result.transferLineItemIds = this.transferLineItemIds;
      return result;
    }

    /**
     * The ID of the inventory transfer where the items will be removed.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The IDs of the transfer line items to be removed from the transfer.
     */
    public Builder transferLineItemIds(List<String> transferLineItemIds) {
      this.transferLineItemIds = transferLineItemIds;
      return this;
    }
  }
}
