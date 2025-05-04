package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The price of a product variant in a specific country.
 * Prices vary between countries.
 */
public class ProductVariantContextualPricing {
  /**
   * The final compare-at price after all adjustments are applied.
   */
  private MoneyV2 compareAtPrice;

  /**
   * The final price after all adjustments are applied.
   */
  private MoneyV2 price;

  /**
   * A list of quantity breaks for the product variant.
   */
  private QuantityPriceBreakConnection quantityPriceBreaks;

  /**
   * The quantity rule applied for a given context.
   */
  private QuantityRule quantityRule;

  public ProductVariantContextualPricing() {
  }

  /**
   * The final compare-at price after all adjustments are applied.
   */
  public MoneyV2 getCompareAtPrice() {
    return compareAtPrice;
  }

  public void setCompareAtPrice(MoneyV2 compareAtPrice) {
    this.compareAtPrice = compareAtPrice;
  }

  /**
   * The final price after all adjustments are applied.
   */
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
  }

  /**
   * A list of quantity breaks for the product variant.
   */
  public QuantityPriceBreakConnection getQuantityPriceBreaks() {
    return quantityPriceBreaks;
  }

  public void setQuantityPriceBreaks(QuantityPriceBreakConnection quantityPriceBreaks) {
    this.quantityPriceBreaks = quantityPriceBreaks;
  }

  /**
   * The quantity rule applied for a given context.
   */
  public QuantityRule getQuantityRule() {
    return quantityRule;
  }

  public void setQuantityRule(QuantityRule quantityRule) {
    this.quantityRule = quantityRule;
  }

  @Override
  public String toString() {
    return "ProductVariantContextualPricing{compareAtPrice='" + compareAtPrice + "', price='" + price + "', quantityPriceBreaks='" + quantityPriceBreaks + "', quantityRule='" + quantityRule + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantContextualPricing that = (ProductVariantContextualPricing) o;
    return Objects.equals(compareAtPrice, that.compareAtPrice) &&
        Objects.equals(price, that.price) &&
        Objects.equals(quantityPriceBreaks, that.quantityPriceBreaks) &&
        Objects.equals(quantityRule, that.quantityRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compareAtPrice, price, quantityPriceBreaks, quantityRule);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The final compare-at price after all adjustments are applied.
     */
    private MoneyV2 compareAtPrice;

    /**
     * The final price after all adjustments are applied.
     */
    private MoneyV2 price;

    /**
     * A list of quantity breaks for the product variant.
     */
    private QuantityPriceBreakConnection quantityPriceBreaks;

    /**
     * The quantity rule applied for a given context.
     */
    private QuantityRule quantityRule;

    public ProductVariantContextualPricing build() {
      ProductVariantContextualPricing result = new ProductVariantContextualPricing();
      result.compareAtPrice = this.compareAtPrice;
      result.price = this.price;
      result.quantityPriceBreaks = this.quantityPriceBreaks;
      result.quantityRule = this.quantityRule;
      return result;
    }

    /**
     * The final compare-at price after all adjustments are applied.
     */
    public Builder compareAtPrice(MoneyV2 compareAtPrice) {
      this.compareAtPrice = compareAtPrice;
      return this;
    }

    /**
     * The final price after all adjustments are applied.
     */
    public Builder price(MoneyV2 price) {
      this.price = price;
      return this;
    }

    /**
     * A list of quantity breaks for the product variant.
     */
    public Builder quantityPriceBreaks(QuantityPriceBreakConnection quantityPriceBreaks) {
      this.quantityPriceBreaks = quantityPriceBreaks;
      return this;
    }

    /**
     * The quantity rule applied for a given context.
     */
    public Builder quantityRule(QuantityRule quantityRule) {
      this.quantityRule = quantityRule;
      return this;
    }
  }
}
