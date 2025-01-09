package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for specifying the product to delete.
 */
public class ProductDeleteInput {
  /**
   * The ID of the product.
   */
  private String id;

  public ProductDeleteInput() {
  }

  /**
   * The ID of the product.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "ProductDeleteInput{id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductDeleteInput that = (ProductDeleteInput) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the product.
     */
    private String id;

    public ProductDeleteInput build() {
      ProductDeleteInput result = new ProductDeleteInput();
      result.id = this.id;
      return result;
    }

    /**
     * The ID of the product.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
