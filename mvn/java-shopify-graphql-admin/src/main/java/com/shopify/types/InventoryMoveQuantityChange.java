package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class InventoryMoveQuantityChange {
  
  private String inventoryItemId;

  
  private int quantity;

  
  private InventoryMoveQuantityTerminalInput from;

  
  private InventoryMoveQuantityTerminalInput to;

  public InventoryMoveQuantityChange() {
  }

  
  public String getInventoryItemId() {
    return inventoryItemId;
  }

  public void setInventoryItemId(String inventoryItemId) {
    this.inventoryItemId = inventoryItemId;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public InventoryMoveQuantityTerminalInput getFrom() {
    return from;
  }

  public void setFrom(InventoryMoveQuantityTerminalInput from) {
    this.from = from;
  }

  
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
    
    private String inventoryItemId;

    
    private int quantity;

    
    private InventoryMoveQuantityTerminalInput from;

    
    private InventoryMoveQuantityTerminalInput to;

    public InventoryMoveQuantityChange build() {
      InventoryMoveQuantityChange result = new InventoryMoveQuantityChange();
      result.inventoryItemId = this.inventoryItemId;
      result.quantity = this.quantity;
      result.from = this.from;
      result.to = this.to;
      return result;
    }

    
    public Builder inventoryItemId(String inventoryItemId) {
      this.inventoryItemId = inventoryItemId;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder from(InventoryMoveQuantityTerminalInput from) {
      this.from = from;
      return this;
    }

    
    public Builder to(InventoryMoveQuantityTerminalInput to) {
      this.to = to;
      return this;
    }
  }
}
