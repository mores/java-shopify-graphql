package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductVariantsBulkCreatePayload {
  
  private Product product;

  
  private List<ProductVariant> productVariants;

  
  private List<ProductVariantsBulkCreateUserError> userErrors;

  public ProductVariantsBulkCreatePayload() {
  }

  
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  
  public List<ProductVariant> getProductVariants() {
    return productVariants;
  }

  public void setProductVariants(List<ProductVariant> productVariants) {
    this.productVariants = productVariants;
  }

  
  public List<ProductVariantsBulkCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ProductVariantsBulkCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductVariantsBulkCreatePayload{product='" + product + "', productVariants='" + productVariants + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantsBulkCreatePayload that = (ProductVariantsBulkCreatePayload) o;
    return Objects.equals(product, that.product) &&
        Objects.equals(productVariants, that.productVariants) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, productVariants, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Product product;

    
    private List<ProductVariant> productVariants;

    
    private List<ProductVariantsBulkCreateUserError> userErrors;

    public ProductVariantsBulkCreatePayload build() {
      ProductVariantsBulkCreatePayload result = new ProductVariantsBulkCreatePayload();
      result.product = this.product;
      result.productVariants = this.productVariants;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    
    public Builder productVariants(List<ProductVariant> productVariants) {
      this.productVariants = productVariants;
      return this;
    }

    
    public Builder userErrors(List<ProductVariantsBulkCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
