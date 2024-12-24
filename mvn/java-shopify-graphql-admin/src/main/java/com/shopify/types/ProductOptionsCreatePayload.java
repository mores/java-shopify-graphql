package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductOptionsCreatePayload {
  
  private Product product;

  
  private List<ProductOptionsCreateUserError> userErrors;

  public ProductOptionsCreatePayload() {
  }

  
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  
  public List<ProductOptionsCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ProductOptionsCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductOptionsCreatePayload{product='" + product + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductOptionsCreatePayload that = (ProductOptionsCreatePayload) o;
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

    
    private List<ProductOptionsCreateUserError> userErrors;

    public ProductOptionsCreatePayload build() {
      ProductOptionsCreatePayload result = new ProductOptionsCreatePayload();
      result.product = this.product;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    
    public Builder userErrors(List<ProductOptionsCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
