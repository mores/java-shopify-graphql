package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents an update to a single transfer line item.
 */
public class InventoryTransferLineItemUpdate {
  /**
   * The delta quantity for the transfer line item.
   */
  private Integer deltaQuantity;

  /**
   * The inventory item ID for the transfer line item.
   */
  private String inventoryItemId;

  /**
   * The new quantity for the transfer line item.
   */
  private Integer newQuantity;

  public InventoryTransferLineItemUpdate() {
  }

  /**
   * The delta quantity for the transfer line item.
   */
  public Integer getDeltaQuantity() {
    return deltaQuantity;
  }

  public void setDeltaQuantity(Integer deltaQuantity) {
    this.deltaQuantity = deltaQuantity;
  }

  /**
   * The inventory item ID for the transfer line item.
   */
  public String getInventoryItemId() {
    return inventoryItemId;
  }

  public void setInventoryItemId(String inventoryItemId) {
    this.inventoryItemId = inventoryItemId;
  }

  /**
   * The new quantity for the transfer line item.
   */
  public Integer getNewQuantity() {
    return newQuantity;
  }

  public void setNewQuantity(Integer newQuantity) {
    this.newQuantity = newQuantity;
  }

  @Override
  public String toString() {
    return "InventoryTransferLineItemUpdate{deltaQuantity='" + deltaQuantity + "', inventoryItemId='" + inventoryItemId + "', newQuantity='" + newQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryTransferLineItemUpdate that = (InventoryTransferLineItemUpdate) o;
    return Objects.equals(deltaQuantity, that.deltaQuantity) &&
        Objects.equals(inventoryItemId, that.inventoryItemId) &&
        Objects.equals(newQuantity, that.newQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaQuantity, inventoryItemId, newQuantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The delta quantity for the transfer line item.
     */
    private Integer deltaQuantity;

    /**
     * The inventory item ID for the transfer line item.
     */
    private String inventoryItemId;

    /**
     * The new quantity for the transfer line item.
     */
    private Integer newQuantity;

    public InventoryTransferLineItemUpdate build() {
      InventoryTransferLineItemUpdate result = new InventoryTransferLineItemUpdate();
      result.deltaQuantity = this.deltaQuantity;
      result.inventoryItemId = this.inventoryItemId;
      result.newQuantity = this.newQuantity;
      return result;
    }

    /**
     * The delta quantity for the transfer line item.
     */
    public Builder deltaQuantity(Integer deltaQuantity) {
      this.deltaQuantity = deltaQuantity;
      return this;
    }

    /**
     * The inventory item ID for the transfer line item.
     */
    public Builder inventoryItemId(String inventoryItemId) {
      this.inventoryItemId = inventoryItemId;
      return this;
    }

    /**
     * The new quantity for the transfer line item.
     */
    public Builder newQuantity(Integer newQuantity) {
      this.newQuantity = newQuantity;
      return this;
    }
  }
}
