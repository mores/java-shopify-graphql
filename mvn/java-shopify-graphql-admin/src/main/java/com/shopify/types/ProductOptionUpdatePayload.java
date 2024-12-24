package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductOptionUpdatePayload {
  
  private Product product;

  
  private List<ProductOptionUpdateUserError> userErrors;

  public ProductOptionUpdatePayload() {
  }

  
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  
  public List<ProductOptionUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ProductOptionUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductOptionUpdatePayload{product='" + product + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductOptionUpdatePayload that = (ProductOptionUpdatePayload) o;
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

    
    private List<ProductOptionUpdateUserError> userErrors;

    public ProductOptionUpdatePayload build() {
      ProductOptionUpdatePayload result = new ProductOptionUpdatePayload();
      result.product = this.product;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    
    public Builder userErrors(List<ProductOptionUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
