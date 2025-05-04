package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The price of a product in a specific country.
 * Prices vary between countries.
 * Refer to [Product](https://shopify.dev/docs/api/admin-graphql/latest/queries/product?example=Get+the+price+range+for+a+product+for+buyers+from+Canada)
 * for more information on how to use this object.
 */
public class ProductContextualPricing {
  /**
   * The number of fixed quantity rules for the product's variants on the price list.
   */
  private int fixedQuantityRulesCount;

  /**
   * The pricing of the variant with the highest price in the given context.
   */
  private ProductVariantContextualPricing maxVariantPricing;

  /**
   * The pricing of the variant with the lowest price in the given context.
   */
  private ProductVariantContextualPricing minVariantPricing;

  /**
   * The minimum and maximum prices of a product, expressed in decimal numbers.
   * For example, if the product is priced between $10.00 and $50.00,
   * then the price range is $10.00 - $50.00.
   */
  private ProductPriceRangeV2 priceRange;

  public ProductContextualPricing() {
  }

  /**
   * The number of fixed quantity rules for the product's variants on the price list.
   */
  public int getFixedQuantityRulesCount() {
    return fixedQuantityRulesCount;
  }

  public void setFixedQuantityRulesCount(int fixedQuantityRulesCount) {
    this.fixedQuantityRulesCount = fixedQuantityRulesCount;
  }

  /**
   * The pricing of the variant with the highest price in the given context.
   */
  public ProductVariantContextualPricing getMaxVariantPricing() {
    return maxVariantPricing;
  }

  public void setMaxVariantPricing(ProductVariantContextualPricing maxVariantPricing) {
    this.maxVariantPricing = maxVariantPricing;
  }

  /**
   * The pricing of the variant with the lowest price in the given context.
   */
  public ProductVariantContextualPricing getMinVariantPricing() {
    return minVariantPricing;
  }

  public void setMinVariantPricing(ProductVariantContextualPricing minVariantPricing) {
    this.minVariantPricing = minVariantPricing;
  }

  /**
   * The minimum and maximum prices of a product, expressed in decimal numbers.
   * For example, if the product is priced between $10.00 and $50.00,
   * then the price range is $10.00 - $50.00.
   */
  public ProductPriceRangeV2 getPriceRange() {
    return priceRange;
  }

  public void setPriceRange(ProductPriceRangeV2 priceRange) {
    this.priceRange = priceRange;
  }

  @Override
  public String toString() {
    return "ProductContextualPricing{fixedQuantityRulesCount='" + fixedQuantityRulesCount + "', maxVariantPricing='" + maxVariantPricing + "', minVariantPricing='" + minVariantPricing + "', priceRange='" + priceRange + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductContextualPricing that = (ProductContextualPricing) o;
    return fixedQuantityRulesCount == that.fixedQuantityRulesCount &&
        Objects.equals(maxVariantPricing, that.maxVariantPricing) &&
        Objects.equals(minVariantPricing, that.minVariantPricing) &&
        Objects.equals(priceRange, that.priceRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fixedQuantityRulesCount, maxVariantPricing, minVariantPricing, priceRange);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The number of fixed quantity rules for the product's variants on the price list.
     */
    private int fixedQuantityRulesCount;

    /**
     * The pricing of the variant with the highest price in the given context.
     */
    private ProductVariantContextualPricing maxVariantPricing;

    /**
     * The pricing of the variant with the lowest price in the given context.
     */
    private ProductVariantContextualPricing minVariantPricing;

    /**
     * The minimum and maximum prices of a product, expressed in decimal numbers.
     * For example, if the product is priced between $10.00 and $50.00,
     * then the price range is $10.00 - $50.00.
     */
    private ProductPriceRangeV2 priceRange;

    public ProductContextualPricing build() {
      ProductContextualPricing result = new ProductContextualPricing();
      result.fixedQuantityRulesCount = this.fixedQuantityRulesCount;
      result.maxVariantPricing = this.maxVariantPricing;
      result.minVariantPricing = this.minVariantPricing;
      result.priceRange = this.priceRange;
      return result;
    }

    /**
     * The number of fixed quantity rules for the product's variants on the price list.
     */
    public Builder fixedQuantityRulesCount(int fixedQuantityRulesCount) {
      this.fixedQuantityRulesCount = fixedQuantityRulesCount;
      return this;
    }

    /**
     * The pricing of the variant with the highest price in the given context.
     */
    public Builder maxVariantPricing(ProductVariantContextualPricing maxVariantPricing) {
      this.maxVariantPricing = maxVariantPricing;
      return this;
    }

    /**
     * The pricing of the variant with the lowest price in the given context.
     */
    public Builder minVariantPricing(ProductVariantContextualPricing minVariantPricing) {
      this.minVariantPricing = minVariantPricing;
      return this;
    }

    /**
     * The minimum and maximum prices of a product, expressed in decimal numbers.
     * For example, if the product is priced between $10.00 and $50.00,
     * then the price range is $10.00 - $50.00.
     */
    public Builder priceRange(ProductPriceRangeV2 priceRange) {
      this.priceRange = priceRange;
      return this;
    }
  }
}
