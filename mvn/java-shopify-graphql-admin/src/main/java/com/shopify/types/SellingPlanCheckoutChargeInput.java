package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SellingPlanCheckoutChargeInput {
  
  private SellingPlanCheckoutChargeType type;

  
  private SellingPlanCheckoutChargeValueInput value;

  public SellingPlanCheckoutChargeInput() {
  }

  
  public SellingPlanCheckoutChargeType getType() {
    return type;
  }

  public void setType(SellingPlanCheckoutChargeType type) {
    this.type = type;
  }

  
  public SellingPlanCheckoutChargeValueInput getValue() {
    return value;
  }

  public void setValue(SellingPlanCheckoutChargeValueInput value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "SellingPlanCheckoutChargeInput{type='" + type + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanCheckoutChargeInput that = (SellingPlanCheckoutChargeInput) o;
    return Objects.equals(type, that.type) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SellingPlanCheckoutChargeType type;

    
    private SellingPlanCheckoutChargeValueInput value;

    public SellingPlanCheckoutChargeInput build() {
      SellingPlanCheckoutChargeInput result = new SellingPlanCheckoutChargeInput();
      result.type = this.type;
      result.value = this.value;
      return result;
    }

    
    public Builder type(SellingPlanCheckoutChargeType type) {
      this.type = type;
      return this;
    }

    
    public Builder value(SellingPlanCheckoutChargeValueInput value) {
      this.value = value;
      return this;
    }
  }
}
