package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a component of a bundle variant.
 */
public class ProductVariantComponent {
  /**
   * The product variant object that the component belongs to.
   */
  private ProductVariant productVariant;

  /**
   * The quantity of component present in the bundle.
   */
  private int quantity;

  public ProductVariantComponent() {
  }

  /**
   * The product variant object that the component belongs to.
   */
  public ProductVariant getProductVariant() {
    return productVariant;
  }

  public void setProductVariant(ProductVariant productVariant) {
    this.productVariant = productVariant;
  }

  /**
   * The quantity of component present in the bundle.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "ProductVariantComponent{productVariant='" + productVariant + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantComponent that = (ProductVariantComponent) o;
    return Objects.equals(productVariant, that.productVariant) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVariant, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The product variant object that the component belongs to.
     */
    private ProductVariant productVariant;

    /**
     * The quantity of component present in the bundle.
     */
    private int quantity;

    public ProductVariantComponent build() {
      ProductVariantComponent result = new ProductVariantComponent();
      result.productVariant = this.productVariant;
      result.quantity = this.quantity;
      return result;
    }

    /**
     * The product variant object that the component belongs to.
     */
    public Builder productVariant(ProductVariant productVariant) {
      this.productVariant = productVariant;
      return this;
    }

    /**
     * The quantity of component present in the bundle.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
