package com.shopify.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SellingPlanCheckoutChargeValueInput {
  
  private Double percentage;

  
  private String fixedValue;

  public SellingPlanCheckoutChargeValueInput() {
  }

  
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  
  public String getFixedValue() {
    return fixedValue;
  }

  public void setFixedValue(String fixedValue) {
    this.fixedValue = fixedValue;
  }

  @Override
  public String toString() {
    return "SellingPlanCheckoutChargeValueInput{percentage='" + percentage + "', fixedValue='" + fixedValue + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanCheckoutChargeValueInput that = (SellingPlanCheckoutChargeValueInput) o;
    return Objects.equals(percentage, that.percentage) &&
        Objects.equals(fixedValue, that.fixedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage, fixedValue);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Double percentage;

    
    private String fixedValue;

    public SellingPlanCheckoutChargeValueInput build() {
      SellingPlanCheckoutChargeValueInput result = new SellingPlanCheckoutChargeValueInput();
      result.percentage = this.percentage;
      result.fixedValue = this.fixedValue;
      return result;
    }

    
    public Builder percentage(Double percentage) {
      this.percentage = percentage;
      return this;
    }

    
    public Builder fixedValue(String fixedValue) {
      this.fixedValue = fixedValue;
      return this;
    }
  }
}
