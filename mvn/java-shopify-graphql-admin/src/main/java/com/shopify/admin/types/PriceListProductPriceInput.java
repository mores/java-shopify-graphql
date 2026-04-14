package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields representing the price for all variants of a product.
 */
public class PriceListProductPriceInput {
  /**
   * Specifies the ID of the product to update its variants for.
   */
  private String productId;

  /**
   * Specifies the price and currency to apply to the product's variants on the price list.
   */
  private MoneyInput price;

  /**
   * Specifies the compare-at price and currency to apply to the product's variants on the price list.
   */
  private MoneyInput compareAtPrice;

  public PriceListProductPriceInput() {
  }

  /**
   * Specifies the ID of the product to update its variants for.
   */
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * Specifies the price and currency to apply to the product's variants on the price list.
   */
  public MoneyInput getPrice() {
    return price;
  }

  public void setPrice(MoneyInput price) {
    this.price = price;
  }

  /**
   * Specifies the compare-at price and currency to apply to the product's variants on the price list.
   */
  public MoneyInput getCompareAtPrice() {
    return compareAtPrice;
  }

  public void setCompareAtPrice(MoneyInput compareAtPrice) {
    this.compareAtPrice = compareAtPrice;
  }

  @Override
  public String toString() {
    return "PriceListProductPriceInput{productId='" + productId + "', price='" + price + "', compareAtPrice='" + compareAtPrice + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListProductPriceInput that = (PriceListProductPriceInput) o;
    return Objects.equals(productId, that.productId) &&
        Objects.equals(price, that.price) &&
        Objects.equals(compareAtPrice, that.compareAtPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, price, compareAtPrice);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Specifies the ID of the product to update its variants for.
     */
    private String productId;

    /**
     * Specifies the price and currency to apply to the product's variants on the price list.
     */
    private MoneyInput price;

    /**
     * Specifies the compare-at price and currency to apply to the product's variants on the price list.
     */
    private MoneyInput compareAtPrice;

    public PriceListProductPriceInput build() {
      PriceListProductPriceInput result = new PriceListProductPriceInput();
      result.productId = this.productId;
      result.price = this.price;
      result.compareAtPrice = this.compareAtPrice;
      return result;
    }

    /**
     * Specifies the ID of the product to update its variants for.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * Specifies the price and currency to apply to the product's variants on the price list.
     */
    public Builder price(MoneyInput price) {
      this.price = price;
      return this;
    }

    /**
     * Specifies the compare-at price and currency to apply to the product's variants on the price list.
     */
    public Builder compareAtPrice(MoneyInput compareAtPrice) {
      this.compareAtPrice = compareAtPrice;
      return this;
    }
  }
}
