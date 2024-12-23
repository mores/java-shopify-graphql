package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to set inventory quantities using `productSet` mutation.
 */
public class ProductSetInventoryInput {
  /**
   * The ID of the location of the inventory quantity being set.
   */
  private String locationId;

  /**
   * The name of the inventory quantity being set. Must be one of `available` or `on_hand`.
   */
  private String name;

  /**
   * The values to which each quantities will be set.
   */
  private int quantity;

  public ProductSetInventoryInput() {
  }

  /**
   * The ID of the location of the inventory quantity being set.
   */
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  /**
   * The name of the inventory quantity being set. Must be one of `available` or `on_hand`.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The values to which each quantities will be set.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "ProductSetInventoryInput{locationId='" + locationId + "', name='" + name + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductSetInventoryInput that = (ProductSetInventoryInput) o;
    return Objects.equals(locationId, that.locationId) &&
        Objects.equals(name, that.name) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, name, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the location of the inventory quantity being set.
     */
    private String locationId;

    /**
     * The name of the inventory quantity being set. Must be one of `available` or `on_hand`.
     */
    private String name;

    /**
     * The values to which each quantities will be set.
     */
    private int quantity;

    public ProductSetInventoryInput build() {
      ProductSetInventoryInput result = new ProductSetInventoryInput();
      result.locationId = this.locationId;
      result.name = this.name;
      result.quantity = this.quantity;
      return result;
    }

    /**
     * The ID of the location of the inventory quantity being set.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     * The name of the inventory quantity being set. Must be one of `available` or `on_hand`.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The values to which each quantities will be set.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
