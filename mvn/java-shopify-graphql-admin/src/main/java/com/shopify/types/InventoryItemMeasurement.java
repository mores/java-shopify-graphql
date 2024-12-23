package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the packaged dimension for an inventory item.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class InventoryItemMeasurement implements com.shopify.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The weight of the inventory item.
   */
  private Weight weight;

  public InventoryItemMeasurement() {
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
   * The weight of the inventory item.
   */
  public Weight getWeight() {
    return weight;
  }

  public void setWeight(Weight weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "InventoryItemMeasurement{id='" + id + "', weight='" + weight + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryItemMeasurement that = (InventoryItemMeasurement) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(weight, that.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weight);
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
     * The weight of the inventory item.
     */
    private Weight weight;

    public InventoryItemMeasurement build() {
      InventoryItemMeasurement result = new InventoryItemMeasurement();
      result.id = this.id;
      result.weight = this.weight;
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
     * The weight of the inventory item.
     */
    public Builder weight(Weight weight) {
      this.weight = weight;
      return this;
    }
  }
}
