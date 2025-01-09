package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The price range of the product.
 */
public class ProductPriceRange {
  /**
   * The highest variant's price.
   */
  private MoneyV2 maxVariantPrice;

  /**
   * The lowest variant's price.
   */
  private MoneyV2 minVariantPrice;

  public ProductPriceRange() {
  }

  /**
   * The highest variant's price.
   */
  public MoneyV2 getMaxVariantPrice() {
    return maxVariantPrice;
  }

  public void setMaxVariantPrice(MoneyV2 maxVariantPrice) {
    this.maxVariantPrice = maxVariantPrice;
  }

  /**
   * The lowest variant's price.
   */
  public MoneyV2 getMinVariantPrice() {
    return minVariantPrice;
  }

  public void setMinVariantPrice(MoneyV2 minVariantPrice) {
    this.minVariantPrice = minVariantPrice;
  }

  @Override
  public String toString() {
    return "ProductPriceRange{maxVariantPrice='" + maxVariantPrice + "', minVariantPrice='" + minVariantPrice + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductPriceRange that = (ProductPriceRange) o;
    return Objects.equals(maxVariantPrice, that.maxVariantPrice) &&
        Objects.equals(minVariantPrice, that.minVariantPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxVariantPrice, minVariantPrice);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The highest variant's price.
     */
    private MoneyV2 maxVariantPrice;

    /**
     * The lowest variant's price.
     */
    private MoneyV2 minVariantPrice;

    public ProductPriceRange build() {
      ProductPriceRange result = new ProductPriceRange();
      result.maxVariantPrice = this.maxVariantPrice;
      result.minVariantPrice = this.minVariantPrice;
      return result;
    }

    /**
     * The highest variant's price.
     */
    public Builder maxVariantPrice(MoneyV2 maxVariantPrice) {
      this.maxVariantPrice = maxVariantPrice;
      return this;
    }

    /**
     * The lowest variant's price.
     */
    public Builder minVariantPrice(MoneyV2 minVariantPrice) {
      this.minVariantPrice = minVariantPrice;
      return this;
    }
  }
}
