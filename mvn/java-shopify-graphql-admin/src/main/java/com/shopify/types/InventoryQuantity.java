package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents a quantity of an inventory item at a specific location, for a specific name.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class InventoryQuantity implements com.shopify.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states)
   * that identifies the inventory quantity.
   */
  private String name;

  /**
   * The quantity for the quantity name.
   */
  private int quantity;

  /**
   * When the quantity was last updated.
   */
  private OffsetDateTime updatedAt;

  public InventoryQuantity() {
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states)
   * that identifies the inventory quantity.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The quantity for the quantity name.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * When the quantity was last updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "InventoryQuantity{id='" + id + "', name='" + name + "', quantity='" + quantity + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryQuantity that = (InventoryQuantity) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        quantity == that.quantity &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, quantity, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states)
     * that identifies the inventory quantity.
     */
    private String name;

    /**
     * The quantity for the quantity name.
     */
    private int quantity;

    /**
     * When the quantity was last updated.
     */
    private OffsetDateTime updatedAt;

    public InventoryQuantity build() {
      InventoryQuantity result = new InventoryQuantity();
      result.id = this.id;
      result.name = this.name;
      result.quantity = this.quantity;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states)
     * that identifies the inventory quantity.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The quantity for the quantity name.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * When the quantity was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
