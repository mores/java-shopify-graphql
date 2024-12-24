package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SellingPlanCheckoutCharge {
  
  private SellingPlanCheckoutChargeType type;

  
  private SellingPlanCheckoutChargeValue value;

  public SellingPlanCheckoutCharge() {
  }

  
  public SellingPlanCheckoutChargeType getType() {
    return type;
  }

  public void setType(SellingPlanCheckoutChargeType type) {
    this.type = type;
  }

  
  public SellingPlanCheckoutChargeValue getValue() {
    return value;
  }

  public void setValue(SellingPlanCheckoutChargeValue value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "SellingPlanCheckoutCharge{type='" + type + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanCheckoutCharge that = (SellingPlanCheckoutCharge) o;
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

    
    private SellingPlanCheckoutChargeValue value;

    public SellingPlanCheckoutCharge build() {
      SellingPlanCheckoutCharge result = new SellingPlanCheckoutCharge();
      result.type = this.type;
      result.value = this.value;
      return result;
    }

    
    public Builder type(SellingPlanCheckoutChargeType type) {
      this.type = type;
      return this;
    }

    
    public Builder value(SellingPlanCheckoutChargeValue value) {
      this.value = value;
      return this;
    }
  }
}
