package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductVariantsBulkReorderPayload {
  
  private Product product;

  
  private List<ProductVariantsBulkReorderUserError> userErrors;

  public ProductVariantsBulkReorderPayload() {
  }

  
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  
  public List<ProductVariantsBulkReorderUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ProductVariantsBulkReorderUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductVariantsBulkReorderPayload{product='" + product + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantsBulkReorderPayload that = (ProductVariantsBulkReorderPayload) o;
    return Objects.equals(product, that.product) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Product product;

    
    private List<ProductVariantsBulkReorderUserError> userErrors;

    public ProductVariantsBulkReorderPayload build() {
      ProductVariantsBulkReorderPayload result = new ProductVariantsBulkReorderPayload();
      result.product = this.product;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    
    public Builder userErrors(List<ProductVariantsBulkReorderUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
