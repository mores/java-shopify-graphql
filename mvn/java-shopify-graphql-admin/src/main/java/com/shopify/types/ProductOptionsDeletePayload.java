package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductOptionsDeletePayload {
  
  private List<String> deletedOptionsIds;

  
  private Product product;

  
  private List<ProductOptionsDeleteUserError> userErrors;

  public ProductOptionsDeletePayload() {
  }

  
  public List<String> getDeletedOptionsIds() {
    return deletedOptionsIds;
  }

  public void setDeletedOptionsIds(List<String> deletedOptionsIds) {
    this.deletedOptionsIds = deletedOptionsIds;
  }

  
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  
  public List<ProductOptionsDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ProductOptionsDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductOptionsDeletePayload{deletedOptionsIds='" + deletedOptionsIds + "', product='" + product + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductOptionsDeletePayload that = (ProductOptionsDeletePayload) o;
    return Objects.equals(deletedOptionsIds, that.deletedOptionsIds) &&
        Objects.equals(product, that.product) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedOptionsIds, product, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<String> deletedOptionsIds;

    
    private Product product;

    
    private List<ProductOptionsDeleteUserError> userErrors;

    public ProductOptionsDeletePayload build() {
      ProductOptionsDeletePayload result = new ProductOptionsDeletePayload();
      result.deletedOptionsIds = this.deletedOptionsIds;
      result.product = this.product;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedOptionsIds(List<String> deletedOptionsIds) {
      this.deletedOptionsIds = deletedOptionsIds;
      return this;
    }

    
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    
    public Builder userErrors(List<ProductOptionsDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
