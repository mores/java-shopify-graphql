package com.shopify.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OrderEditAppliedDiscountInput {
  
  private String description;

  
  private MoneyInput fixedValue;

  
  private Double percentValue;

  public OrderEditAppliedDiscountInput() {
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public MoneyInput getFixedValue() {
    return fixedValue;
  }

  public void setFixedValue(MoneyInput fixedValue) {
    this.fixedValue = fixedValue;
  }

  
  public Double getPercentValue() {
    return percentValue;
  }

  public void setPercentValue(Double percentValue) {
    this.percentValue = percentValue;
  }

  @Override
  public String toString() {
    return "OrderEditAppliedDiscountInput{description='" + description + "', fixedValue='" + fixedValue + "', percentValue='" + percentValue + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderEditAppliedDiscountInput that = (OrderEditAppliedDiscountInput) o;
    return Objects.equals(description, that.description) &&
        Objects.equals(fixedValue, that.fixedValue) &&
        Objects.equals(percentValue, that.percentValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, fixedValue, percentValue);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String description;

    
    private MoneyInput fixedValue;

    
    private Double percentValue;

    public OrderEditAppliedDiscountInput build() {
      OrderEditAppliedDiscountInput result = new OrderEditAppliedDiscountInput();
      result.description = this.description;
      result.fixedValue = this.fixedValue;
      result.percentValue = this.percentValue;
      return result;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder fixedValue(MoneyInput fixedValue) {
      this.fixedValue = fixedValue;
      return this;
    }

    
    public Builder percentValue(Double percentValue) {
      this.percentValue = percentValue;
      return this;
    }
  }
}
