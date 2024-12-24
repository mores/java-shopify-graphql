package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductBundleCreatePayload {
  
  private ProductBundleOperation productBundleOperation;

  
  private List<UserError> userErrors;

  public ProductBundleCreatePayload() {
  }

  
  public ProductBundleOperation getProductBundleOperation() {
    return productBundleOperation;
  }

  public void setProductBundleOperation(ProductBundleOperation productBundleOperation) {
    this.productBundleOperation = productBundleOperation;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductBundleCreatePayload{productBundleOperation='" + productBundleOperation + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleCreatePayload that = (ProductBundleCreatePayload) o;
    return Objects.equals(productBundleOperation, that.productBundleOperation) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productBundleOperation, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private ProductBundleOperation productBundleOperation;

    
    private List<UserError> userErrors;

    public ProductBundleCreatePayload build() {
      ProductBundleCreatePayload result = new ProductBundleCreatePayload();
      result.productBundleOperation = this.productBundleOperation;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder productBundleOperation(ProductBundleOperation productBundleOperation) {
      this.productBundleOperation = productBundleOperation;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
