package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A quantity option value related to a componentized product.
 */
public class ProductBundleComponentQuantityOptionValue {
  /**
   * The name of the option value.
   */
  private String name;

  /**
   * The quantity of the option value.
   */
  private int quantity;

  public ProductBundleComponentQuantityOptionValue() {
  }

  /**
   * The name of the option value.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The quantity of the option value.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "ProductBundleComponentQuantityOptionValue{name='" + name + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleComponentQuantityOptionValue that = (ProductBundleComponentQuantityOptionValue) o;
    return Objects.equals(name, that.name) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the option value.
     */
    private String name;

    /**
     * The quantity of the option value.
     */
    private int quantity;

    public ProductBundleComponentQuantityOptionValue build() {
      ProductBundleComponentQuantityOptionValue result = new ProductBundleComponentQuantityOptionValue();
      result.name = this.name;
      result.quantity = this.quantity;
      return result;
    }

    /**
     * The name of the option value.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The quantity of the option value.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
