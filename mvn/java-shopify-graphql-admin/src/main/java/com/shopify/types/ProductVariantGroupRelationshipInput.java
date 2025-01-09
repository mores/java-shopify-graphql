package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the bundle components for core.
 */
public class ProductVariantGroupRelationshipInput {
  /**
   * The ID of the product variant that's a component of the bundle.
   */
  private String id;

  /**
   * The number of units of the product variant required to construct one unit of the bundle.
   */
  private int quantity;

  public ProductVariantGroupRelationshipInput() {
  }

  /**
   * The ID of the product variant that's a component of the bundle.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The number of units of the product variant required to construct one unit of the bundle.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "ProductVariantGroupRelationshipInput{id='" + id + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantGroupRelationshipInput that = (ProductVariantGroupRelationshipInput) o;
    return Objects.equals(id, that.id) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the product variant that's a component of the bundle.
     */
    private String id;

    /**
     * The number of units of the product variant required to construct one unit of the bundle.
     */
    private int quantity;

    public ProductVariantGroupRelationshipInput build() {
      ProductVariantGroupRelationshipInput result = new ProductVariantGroupRelationshipInput();
      result.id = this.id;
      result.quantity = this.quantity;
      return result;
    }

    /**
     * The ID of the product variant that's a component of the bundle.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The number of units of the product variant required to construct one unit of the bundle.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
