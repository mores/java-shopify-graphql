package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a single quantity option value related to a component product.
 */
public class ProductBundleComponentQuantityOptionValueInput {
  /**
   * The name associated with the option, e.g. one-pack, two-pack.
   */
  private String name;

  /**
   * How many of the variant will be included for the option value (e.g. two-pack has quantity 2).
   */
  private int quantity;

  public ProductBundleComponentQuantityOptionValueInput() {
  }

  /**
   * The name associated with the option, e.g. one-pack, two-pack.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * How many of the variant will be included for the option value (e.g. two-pack has quantity 2).
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "ProductBundleComponentQuantityOptionValueInput{name='" + name + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleComponentQuantityOptionValueInput that = (ProductBundleComponentQuantityOptionValueInput) o;
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
     * The name associated with the option, e.g. one-pack, two-pack.
     */
    private String name;

    /**
     * How many of the variant will be included for the option value (e.g. two-pack has quantity 2).
     */
    private int quantity;

    public ProductBundleComponentQuantityOptionValueInput build() {
      ProductBundleComponentQuantityOptionValueInput result = new ProductBundleComponentQuantityOptionValueInput();
      result.name = this.name;
      result.quantity = this.quantity;
      return result;
    }

    /**
     * The name associated with the option, e.g. one-pack, two-pack.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * How many of the variant will be included for the option value (e.g. two-pack has quantity 2).
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
