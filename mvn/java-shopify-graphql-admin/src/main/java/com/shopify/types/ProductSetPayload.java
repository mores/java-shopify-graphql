package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductSetPayload {
  
  private Product product;

  
  private ProductSetOperation productSetOperation;

  
  private List<ProductSetUserError> userErrors;

  public ProductSetPayload() {
  }

  
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  
  public ProductSetOperation getProductSetOperation() {
    return productSetOperation;
  }

  public void setProductSetOperation(ProductSetOperation productSetOperation) {
    this.productSetOperation = productSetOperation;
  }

  
  public List<ProductSetUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ProductSetUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductSetPayload{product='" + product + "', productSetOperation='" + productSetOperation + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductSetPayload that = (ProductSetPayload) o;
    return Objects.equals(product, that.product) &&
        Objects.equals(productSetOperation, that.productSetOperation) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, productSetOperation, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Product product;

    
    private ProductSetOperation productSetOperation;

    
    private List<ProductSetUserError> userErrors;

    public ProductSetPayload build() {
      ProductSetPayload result = new ProductSetPayload();
      result.product = this.product;
      result.productSetOperation = this.productSetOperation;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    
    public Builder productSetOperation(ProductSetOperation productSetOperation) {
      this.productSetOperation = productSetOperation;
      return this;
    }

    
    public Builder userErrors(List<ProductSetUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
