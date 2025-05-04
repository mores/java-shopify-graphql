package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The compare-at price and price of a variant sharing a currency.
 */
public class ProductVariantPricePair {
  /**
   * The compare-at price of the variant with associated currency.
   */
  private MoneyV2 compareAtPrice;

  /**
   * The price of the variant with associated currency.
   */
  private MoneyV2 price;

  public ProductVariantPricePair() {
  }

  /**
   * The compare-at price of the variant with associated currency.
   */
  public MoneyV2 getCompareAtPrice() {
    return compareAtPrice;
  }

  public void setCompareAtPrice(MoneyV2 compareAtPrice) {
    this.compareAtPrice = compareAtPrice;
  }

  /**
   * The price of the variant with associated currency.
   */
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "ProductVariantPricePair{compareAtPrice='" + compareAtPrice + "', price='" + price + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantPricePair that = (ProductVariantPricePair) o;
    return Objects.equals(compareAtPrice, that.compareAtPrice) &&
        Objects.equals(price, that.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compareAtPrice, price);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The compare-at price of the variant with associated currency.
     */
    private MoneyV2 compareAtPrice;

    /**
     * The price of the variant with associated currency.
     */
    private MoneyV2 price;

    public ProductVariantPricePair build() {
      ProductVariantPricePair result = new ProductVariantPricePair();
      result.compareAtPrice = this.compareAtPrice;
      result.price = this.price;
      return result;
    }

    /**
     * The compare-at price of the variant with associated currency.
     */
    public Builder compareAtPrice(MoneyV2 compareAtPrice) {
      this.compareAtPrice = compareAtPrice;
      return this;
    }

    /**
     * The price of the variant with associated currency.
     */
    public Builder price(MoneyV2 price) {
      this.price = price;
      return this;
    }
  }
}
