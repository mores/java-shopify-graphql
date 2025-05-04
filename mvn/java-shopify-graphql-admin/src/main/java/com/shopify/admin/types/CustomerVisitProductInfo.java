package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * This type returns the information about the product and product variant from a customer visit.
 */
public class CustomerVisitProductInfo {
  /**
   * The product information. If `null`, then the product was deleted from the store.
   */
  private Product product;

  /**
   * The quantity of the product that the customer requested.
   */
  private int quantity;

  /**
   * The product variant information, if the product variant exists.
   */
  private ProductVariant variant;

  public CustomerVisitProductInfo() {
  }

  /**
   * The product information. If `null`, then the product was deleted from the store.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * The quantity of the product that the customer requested.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The product variant information, if the product variant exists.
   */
  public ProductVariant getVariant() {
    return variant;
  }

  public void setVariant(ProductVariant variant) {
    this.variant = variant;
  }

  @Override
  public String toString() {
    return "CustomerVisitProductInfo{product='" + product + "', quantity='" + quantity + "', variant='" + variant + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerVisitProductInfo that = (CustomerVisitProductInfo) o;
    return Objects.equals(product, that.product) &&
        quantity == that.quantity &&
        Objects.equals(variant, that.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, quantity, variant);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The product information. If `null`, then the product was deleted from the store.
     */
    private Product product;

    /**
     * The quantity of the product that the customer requested.
     */
    private int quantity;

    /**
     * The product variant information, if the product variant exists.
     */
    private ProductVariant variant;

    public CustomerVisitProductInfo build() {
      CustomerVisitProductInfo result = new CustomerVisitProductInfo();
      result.product = this.product;
      result.quantity = this.quantity;
      result.variant = this.variant;
      return result;
    }

    /**
     * The product information. If `null`, then the product was deleted from the store.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * The quantity of the product that the customer requested.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The product variant information, if the product variant exists.
     */
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }
  }
}
