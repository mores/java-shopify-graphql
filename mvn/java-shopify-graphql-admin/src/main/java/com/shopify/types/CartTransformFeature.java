package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CartTransformFeature {
  
  private CartTransformEligibleOperations eligibleOperations;

  public CartTransformFeature() {
  }

  
  public CartTransformEligibleOperations getEligibleOperations() {
    return eligibleOperations;
  }

  public void setEligibleOperations(CartTransformEligibleOperations eligibleOperations) {
    this.eligibleOperations = eligibleOperations;
  }

  @Override
  public String toString() {
    return "CartTransformFeature{eligibleOperations='" + eligibleOperations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartTransformFeature that = (CartTransformFeature) o;
    return Objects.equals(eligibleOperations, that.eligibleOperations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligibleOperations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CartTransformEligibleOperations eligibleOperations;

    public CartTransformFeature build() {
      CartTransformFeature result = new CartTransformFeature();
      result.eligibleOperations = this.eligibleOperations;
      return result;
    }

    
    public Builder eligibleOperations(CartTransformEligibleOperations eligibleOperations) {
      this.eligibleOperations = eligibleOperations;
      return this;
    }
  }
}
