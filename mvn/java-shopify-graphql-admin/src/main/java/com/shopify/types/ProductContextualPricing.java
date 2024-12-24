package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ProductContextualPricing {
  
  private int fixedQuantityRulesCount;

  
  private ProductVariantContextualPricing maxVariantPricing;

  
  private ProductVariantContextualPricing minVariantPricing;

  
  private ProductPriceRangeV2 priceRange;

  public ProductContextualPricing() {
  }

  
  public int getFixedQuantityRulesCount() {
    return fixedQuantityRulesCount;
  }

  public void setFixedQuantityRulesCount(int fixedQuantityRulesCount) {
    this.fixedQuantityRulesCount = fixedQuantityRulesCount;
  }

  
  public ProductVariantContextualPricing getMaxVariantPricing() {
    return maxVariantPricing;
  }

  public void setMaxVariantPricing(ProductVariantContextualPricing maxVariantPricing) {
    this.maxVariantPricing = maxVariantPricing;
  }

  
  public ProductVariantContextualPricing getMinVariantPricing() {
    return minVariantPricing;
  }

  public void setMinVariantPricing(ProductVariantContextualPricing minVariantPricing) {
    this.minVariantPricing = minVariantPricing;
  }

  
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
    
    private int fixedQuantityRulesCount;

    
    private ProductVariantContextualPricing maxVariantPricing;

    
    private ProductVariantContextualPricing minVariantPricing;

    
    private ProductPriceRangeV2 priceRange;

    public ProductContextualPricing build() {
      ProductContextualPricing result = new ProductContextualPricing();
      result.fixedQuantityRulesCount = this.fixedQuantityRulesCount;
      result.maxVariantPricing = this.maxVariantPricing;
      result.minVariantPricing = this.minVariantPricing;
      result.priceRange = this.priceRange;
      return result;
    }

    
    public Builder fixedQuantityRulesCount(int fixedQuantityRulesCount) {
      this.fixedQuantityRulesCount = fixedQuantityRulesCount;
      return this;
    }

    
    public Builder maxVariantPricing(ProductVariantContextualPricing maxVariantPricing) {
      this.maxVariantPricing = maxVariantPricing;
      return this;
    }

    
    public Builder minVariantPricing(ProductVariantContextualPricing minVariantPricing) {
      this.minVariantPricing = minVariantPricing;
      return this;
    }

    
    public Builder priceRange(ProductPriceRangeV2 priceRange) {
      this.priceRange = priceRange;
      return this;
    }
  }
}
