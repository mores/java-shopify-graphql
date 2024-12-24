package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DiscountMinimumQuantityInput {
  
  private String greaterThanOrEqualToQuantity;

  public DiscountMinimumQuantityInput() {
  }

  
  public String getGreaterThanOrEqualToQuantity() {
    return greaterThanOrEqualToQuantity;
  }

  public void setGreaterThanOrEqualToQuantity(String greaterThanOrEqualToQuantity) {
    this.greaterThanOrEqualToQuantity = greaterThanOrEqualToQuantity;
  }

  @Override
  public String toString() {
    return "DiscountMinimumQuantityInput{greaterThanOrEqualToQuantity='" + greaterThanOrEqualToQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountMinimumQuantityInput that = (DiscountMinimumQuantityInput) o;
    return Objects.equals(greaterThanOrEqualToQuantity, that.greaterThanOrEqualToQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(greaterThanOrEqualToQuantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String greaterThanOrEqualToQuantity;

    public DiscountMinimumQuantityInput build() {
      DiscountMinimumQuantityInput result = new DiscountMinimumQuantityInput();
      result.greaterThanOrEqualToQuantity = this.greaterThanOrEqualToQuantity;
      return result;
    }

    
    public Builder greaterThanOrEqualToQuantity(String greaterThanOrEqualToQuantity) {
      this.greaterThanOrEqualToQuantity = greaterThanOrEqualToQuantity;
      return this;
    }
  }
}
