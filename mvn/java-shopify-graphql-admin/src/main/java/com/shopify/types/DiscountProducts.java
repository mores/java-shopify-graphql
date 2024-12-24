package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountProducts implements DiscountItems {
  
  private ProductVariantConnection productVariants;

  
  private ProductConnection products;

  public DiscountProducts() {
  }

  
  public ProductVariantConnection getProductVariants() {
    return productVariants;
  }

  public void setProductVariants(ProductVariantConnection productVariants) {
    this.productVariants = productVariants;
  }

  
  public ProductConnection getProducts() {
    return products;
  }

  public void setProducts(ProductConnection products) {
    this.products = products;
  }

  @Override
  public String toString() {
    return "DiscountProducts{productVariants='" + productVariants + "', products='" + products + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountProducts that = (DiscountProducts) o;
    return Objects.equals(productVariants, that.productVariants) &&
        Objects.equals(products, that.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVariants, products);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private ProductVariantConnection productVariants;

    
    private ProductConnection products;

    public DiscountProducts build() {
      DiscountProducts result = new DiscountProducts();
      result.productVariants = this.productVariants;
      result.products = this.products;
      return result;
    }

    
    public Builder productVariants(ProductVariantConnection productVariants) {
      this.productVariants = productVariants;
      return this;
    }

    
    public Builder products(ProductConnection products) {
      this.products = products;
      return this;
    }
  }
}
