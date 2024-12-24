package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ProductClaimOwnershipInput {
  
  private Boolean bundles;

  public ProductClaimOwnershipInput() {
  }

  
  public Boolean getBundles() {
    return bundles;
  }

  public void setBundles(Boolean bundles) {
    this.bundles = bundles;
  }

  @Override
  public String toString() {
    return "ProductClaimOwnershipInput{bundles='" + bundles + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductClaimOwnershipInput that = (ProductClaimOwnershipInput) o;
    return Objects.equals(bundles, that.bundles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundles);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Boolean bundles;

    public ProductClaimOwnershipInput build() {
      ProductClaimOwnershipInput result = new ProductClaimOwnershipInput();
      result.bundles = this.bundles;
      return result;
    }

    
    public Builder bundles(Boolean bundles) {
      this.bundles = bundles;
      return this;
    }
  }
}
