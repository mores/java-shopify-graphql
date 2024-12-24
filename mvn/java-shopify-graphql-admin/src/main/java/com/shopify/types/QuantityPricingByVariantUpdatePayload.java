package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class QuantityPricingByVariantUpdatePayload {
  
  private List<ProductVariant> productVariants;

  
  private List<QuantityPricingByVariantUserError> userErrors;

  public QuantityPricingByVariantUpdatePayload() {
  }

  
  public List<ProductVariant> getProductVariants() {
    return productVariants;
  }

  public void setProductVariants(List<ProductVariant> productVariants) {
    this.productVariants = productVariants;
  }

  
  public List<QuantityPricingByVariantUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<QuantityPricingByVariantUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "QuantityPricingByVariantUpdatePayload{productVariants='" + productVariants + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuantityPricingByVariantUpdatePayload that = (QuantityPricingByVariantUpdatePayload) o;
    return Objects.equals(productVariants, that.productVariants) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVariants, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<ProductVariant> productVariants;

    
    private List<QuantityPricingByVariantUserError> userErrors;

    public QuantityPricingByVariantUpdatePayload build() {
      QuantityPricingByVariantUpdatePayload result = new QuantityPricingByVariantUpdatePayload();
      result.productVariants = this.productVariants;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder productVariants(List<ProductVariant> productVariants) {
      this.productVariants = productVariants;
      return this;
    }

    
    public Builder userErrors(List<QuantityPricingByVariantUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
