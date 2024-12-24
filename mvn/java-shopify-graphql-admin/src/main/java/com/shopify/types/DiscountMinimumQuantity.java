package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountMinimumQuantity implements DiscountMinimumRequirement {
  
  private String greaterThanOrEqualToQuantity;

  public DiscountMinimumQuantity() {
  }

  
  public String getGreaterThanOrEqualToQuantity() {
    return greaterThanOrEqualToQuantity;
  }

  public void setGreaterThanOrEqualToQuantity(String greaterThanOrEqualToQuantity) {
    this.greaterThanOrEqualToQuantity = greaterThanOrEqualToQuantity;
  }

  @Override
  public String toString() {
    return "DiscountMinimumQuantity{greaterThanOrEqualToQuantity='" + greaterThanOrEqualToQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountMinimumQuantity that = (DiscountMinimumQuantity) o;
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

    public DiscountMinimumQuantity build() {
      DiscountMinimumQuantity result = new DiscountMinimumQuantity();
      result.greaterThanOrEqualToQuantity = this.greaterThanOrEqualToQuantity;
      return result;
    }

    
    public Builder greaterThanOrEqualToQuantity(String greaterThanOrEqualToQuantity) {
      this.greaterThanOrEqualToQuantity = greaterThanOrEqualToQuantity;
      return this;
    }
  }
}
