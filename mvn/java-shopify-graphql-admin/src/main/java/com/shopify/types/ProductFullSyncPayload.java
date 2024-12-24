package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductFullSyncPayload {
  
  private List<ProductFullSyncUserError> userErrors;

  public ProductFullSyncPayload() {
  }

  
  public List<ProductFullSyncUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ProductFullSyncUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductFullSyncPayload{userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductFullSyncPayload that = (ProductFullSyncPayload) o;
    return Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<ProductFullSyncUserError> userErrors;

    public ProductFullSyncPayload build() {
      ProductFullSyncPayload result = new ProductFullSyncPayload();
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder userErrors(List<ProductFullSyncUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
