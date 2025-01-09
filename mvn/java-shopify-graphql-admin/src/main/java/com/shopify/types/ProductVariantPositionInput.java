package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields representing a product variant position.
 */
public class ProductVariantPositionInput {
  /**
   * Specifies the ID of the product variant to update.
   */
  private String id;

  /**
   * The order of the product variant in the list of product variants. The first position in the list is 1.
   */
  private int position;

  public ProductVariantPositionInput() {
  }

  /**
   * Specifies the ID of the product variant to update.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The order of the product variant in the list of product variants. The first position in the list is 1.
   */
  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  @Override
  public String toString() {
    return "ProductVariantPositionInput{id='" + id + "', position='" + position + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantPositionInput that = (ProductVariantPositionInput) o;
    return Objects.equals(id, that.id) &&
        position == that.position;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, position);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Specifies the ID of the product variant to update.
     */
    private String id;

    /**
     * The order of the product variant in the list of product variants. The first position in the list is 1.
     */
    private int position;

    public ProductVariantPositionInput build() {
      ProductVariantPositionInput result = new ProductVariantPositionInput();
      result.id = this.id;
      result.position = this.position;
      return result;
    }

    /**
     * Specifies the ID of the product variant to update.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The order of the product variant in the list of product variants. The first position in the list is 1.
     */
    public Builder position(int position) {
      this.position = position;
      return this;
    }
  }
}
