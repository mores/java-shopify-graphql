package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the quantity to be set for an inventory item at a location.
 */
public class InventoryQuantityInput {
  /**
   * Specifies the inventory item to which the quantity will be set.
   */
  private String inventoryItemId;

  /**
   * Specifies the location at which the quantity will be set.
   */
  private String locationId;

  /**
   * The quantity to which the inventory quantity will be set.
   */
  private int quantity;

  /**
   * The quantity currently expected at this location, before setting the new quantity.
   *   
   * This field enables a compare-and-swap (CAS) safety check. If the location’s
   * current quantity doesn't match the value you provide, then the mutation fails
   * with a `CHANGE_FROM_QUANTITY_STALE` error. This helps prevent unintended
   * overwrites when the request is based on stale inventory data.
   *   
   * To skip the CAS check, pass `null`. Use this only when your system is the
   * source of truth for this inventory and you don’t need to protect against
   * concurrent updates.
   * This field is mandatory: you must explicitly pass in a value, even if that
   * value is `null`, or the mutation returns an error.
   *   
   * For more information, refer to the [compare and swap documentation](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states#compare-and-swap).
   */
  private Integer changeFromQuantity;

  public InventoryQuantityInput() {
  }

  /**
   * Specifies the inventory item to which the quantity will be set.
   */
  public String getInventoryItemId() {
    return inventoryItemId;
  }

  public void setInventoryItemId(String inventoryItemId) {
    this.inventoryItemId = inventoryItemId;
  }

  /**
   * Specifies the location at which the quantity will be set.
   */
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  /**
   * The quantity to which the inventory quantity will be set.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The quantity currently expected at this location, before setting the new quantity.
   *   
   * This field enables a compare-and-swap (CAS) safety check. If the location’s
   * current quantity doesn't match the value you provide, then the mutation fails
   * with a `CHANGE_FROM_QUANTITY_STALE` error. This helps prevent unintended
   * overwrites when the request is based on stale inventory data.
   *   
   * To skip the CAS check, pass `null`. Use this only when your system is the
   * source of truth for this inventory and you don’t need to protect against
   * concurrent updates.
   * This field is mandatory: you must explicitly pass in a value, even if that
   * value is `null`, or the mutation returns an error.
   *   
   * For more information, refer to the [compare and swap documentation](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states#compare-and-swap).
   */
  public Integer getChangeFromQuantity() {
    return changeFromQuantity;
  }

  public void setChangeFromQuantity(Integer changeFromQuantity) {
    this.changeFromQuantity = changeFromQuantity;
  }

  @Override
  public String toString() {
    return "InventoryQuantityInput{inventoryItemId='" + inventoryItemId + "', locationId='" + locationId + "', quantity='" + quantity + "', changeFromQuantity='" + changeFromQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryQuantityInput that = (InventoryQuantityInput) o;
    return Objects.equals(inventoryItemId, that.inventoryItemId) &&
        Objects.equals(locationId, that.locationId) &&
        quantity == that.quantity &&
        Objects.equals(changeFromQuantity, that.changeFromQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryItemId, locationId, quantity, changeFromQuantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Specifies the inventory item to which the quantity will be set.
     */
    private String inventoryItemId;

    /**
     * Specifies the location at which the quantity will be set.
     */
    private String locationId;

    /**
     * The quantity to which the inventory quantity will be set.
     */
    private int quantity;

    /**
     * The quantity currently expected at this location, before setting the new quantity.
     *   
     * This field enables a compare-and-swap (CAS) safety check. If the location’s
     * current quantity doesn't match the value you provide, then the mutation fails
     * with a `CHANGE_FROM_QUANTITY_STALE` error. This helps prevent unintended
     * overwrites when the request is based on stale inventory data.
     *   
     * To skip the CAS check, pass `null`. Use this only when your system is the
     * source of truth for this inventory and you don’t need to protect against
     * concurrent updates.
     * This field is mandatory: you must explicitly pass in a value, even if that
     * value is `null`, or the mutation returns an error.
     *   
     * For more information, refer to the [compare and swap documentation](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states#compare-and-swap).
     */
    private Integer changeFromQuantity;

    public InventoryQuantityInput build() {
      InventoryQuantityInput result = new InventoryQuantityInput();
      result.inventoryItemId = this.inventoryItemId;
      result.locationId = this.locationId;
      result.quantity = this.quantity;
      result.changeFromQuantity = this.changeFromQuantity;
      return result;
    }

    /**
     * Specifies the inventory item to which the quantity will be set.
     */
    public Builder inventoryItemId(String inventoryItemId) {
      this.inventoryItemId = inventoryItemId;
      return this;
    }

    /**
     * Specifies the location at which the quantity will be set.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     * The quantity to which the inventory quantity will be set.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The quantity currently expected at this location, before setting the new quantity.
     *   
     * This field enables a compare-and-swap (CAS) safety check. If the location’s
     * current quantity doesn't match the value you provide, then the mutation fails
     * with a `CHANGE_FROM_QUANTITY_STALE` error. This helps prevent unintended
     * overwrites when the request is based on stale inventory data.
     *   
     * To skip the CAS check, pass `null`. Use this only when your system is the
     * source of truth for this inventory and you don’t need to protect against
     * concurrent updates.
     * This field is mandatory: you must explicitly pass in a value, even if that
     * value is `null`, or the mutation returns an error.
     *   
     * For more information, refer to the [compare and swap documentation](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states#compare-and-swap).
     */
    public Builder changeFromQuantity(Integer changeFromQuantity) {
      this.changeFromQuantity = changeFromQuantity;
      return this;
    }
  }
}
