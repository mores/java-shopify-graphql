package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The compare-at price range of the product.
 */
public class ProductCompareAtPriceRange {
  /**
   * The highest variant's compare-at price.
   */
  private MoneyV2 maxVariantCompareAtPrice;

  /**
   * The lowest variant's compare-at price.
   */
  private MoneyV2 minVariantCompareAtPrice;

  public ProductCompareAtPriceRange() {
  }

  /**
   * The highest variant's compare-at price.
   */
  public MoneyV2 getMaxVariantCompareAtPrice() {
    return maxVariantCompareAtPrice;
  }

  public void setMaxVariantCompareAtPrice(MoneyV2 maxVariantCompareAtPrice) {
    this.maxVariantCompareAtPrice = maxVariantCompareAtPrice;
  }

  /**
   * The lowest variant's compare-at price.
   */
  public MoneyV2 getMinVariantCompareAtPrice() {
    return minVariantCompareAtPrice;
  }

  public void setMinVariantCompareAtPrice(MoneyV2 minVariantCompareAtPrice) {
    this.minVariantCompareAtPrice = minVariantCompareAtPrice;
  }

  @Override
  public String toString() {
    return "ProductCompareAtPriceRange{maxVariantCompareAtPrice='" + maxVariantCompareAtPrice + "', minVariantCompareAtPrice='" + minVariantCompareAtPrice + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductCompareAtPriceRange that = (ProductCompareAtPriceRange) o;
    return Objects.equals(maxVariantCompareAtPrice, that.maxVariantCompareAtPrice) &&
        Objects.equals(minVariantCompareAtPrice, that.minVariantCompareAtPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxVariantCompareAtPrice, minVariantCompareAtPrice);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The highest variant's compare-at price.
     */
    private MoneyV2 maxVariantCompareAtPrice;

    /**
     * The lowest variant's compare-at price.
     */
    private MoneyV2 minVariantCompareAtPrice;

    public ProductCompareAtPriceRange build() {
      ProductCompareAtPriceRange result = new ProductCompareAtPriceRange();
      result.maxVariantCompareAtPrice = this.maxVariantCompareAtPrice;
      result.minVariantCompareAtPrice = this.minVariantCompareAtPrice;
      return result;
    }

    /**
     * The highest variant's compare-at price.
     */
    public Builder maxVariantCompareAtPrice(MoneyV2 maxVariantCompareAtPrice) {
      this.maxVariantCompareAtPrice = maxVariantCompareAtPrice;
      return this;
    }

    /**
     * The lowest variant's compare-at price.
     */
    public Builder minVariantCompareAtPrice(MoneyV2 minVariantCompareAtPrice) {
      this.minVariantCompareAtPrice = minVariantCompareAtPrice;
      return this;
    }
  }
}
