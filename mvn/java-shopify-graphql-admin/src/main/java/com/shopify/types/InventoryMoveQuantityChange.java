package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the change to be made to an inventory item at a location.
 * The change can either involve the same quantity name between different locations,
 * or involve different quantity names between the same location.
 */
public class InventoryMoveQuantityChange {
  /**
   * Specifies the inventory item to which the change will be applied.
   */
  private String inventoryItemId;

  /**
   * The amount by which the inventory quantity will be changed.
   */
  private int quantity;

  /**
   * Details about where the move will be made from.
   */
  private InventoryMoveQuantityTerminalInput from;

  /**
   * Details about where the move will be made to.
   */
  private InventoryMoveQuantityTerminalInput to;

  public InventoryMoveQuantityChange() {
  }

  /**
   * Specifies the inventory item to which the change will be applied.
   */
  public String getInventoryItemId() {
    return inventoryItemId;
  }

  public void setInventoryItemId(String inventoryItemId) {
    this.inventoryItemId = inventoryItemId;
  }

  /**
   * The amount by which the inventory quantity will be changed.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * Details about where the move will be made from.
   */
  public InventoryMoveQuantityTerminalInput getFrom() {
    return from;
  }

  public void setFrom(InventoryMoveQuantityTerminalInput from) {
    this.from = from;
  }

  /**
   * Details about where the move will be made to.
   */
  public InventoryMoveQuantityTerminalInput getTo() {
    return to;
  }

  public void setTo(InventoryMoveQuantityTerminalInput to) {
    this.to = to;
  }

  @Override
  public String toString() {
    return "InventoryMoveQuantityChange{inventoryItemId='" + inventoryItemId + "', quantity='" + quantity + "', from='" + from + "', to='" + to + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryMoveQuantityChange that = (InventoryMoveQuantityChange) o;
    return Objects.equals(inventoryItemId, that.inventoryItemId) &&
        quantity == that.quantity &&
        Objects.equals(from, that.from) &&
        Objects.equals(to, that.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryItemId, quantity, from, to);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Specifies the inventory item to which the change will be applied.
     */
    private String inventoryItemId;

    /**
     * The amount by which the inventory quantity will be changed.
     */
    private int quantity;

    /**
     * Details about where the move will be made from.
     */
    private InventoryMoveQuantityTerminalInput from;

    /**
     * Details about where the move will be made to.
     */
    private InventoryMoveQuantityTerminalInput to;

    public InventoryMoveQuantityChange build() {
      InventoryMoveQuantityChange result = new InventoryMoveQuantityChange();
      result.inventoryItemId = this.inventoryItemId;
      result.quantity = this.quantity;
      result.from = this.from;
      result.to = this.to;
      return result;
    }

    /**
     * Specifies the inventory item to which the change will be applied.
     */
    public Builder inventoryItemId(String inventoryItemId) {
      this.inventoryItemId = inventoryItemId;
      return this;
    }

    /**
     * The amount by which the inventory quantity will be changed.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * Details about where the move will be made from.
     */
    public Builder from(InventoryMoveQuantityTerminalInput from) {
      this.from = from;
      return this;
    }

    /**
     * Details about where the move will be made to.
     */
    public Builder to(InventoryMoveQuantityTerminalInput to) {
      this.to = to;
      return this;
    }
  }
}
