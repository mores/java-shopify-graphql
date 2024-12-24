package com.shopify.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OrderCreatePercentageDiscountCodeAttributesInput {
  
  private String code;

  
  private Double percentage;

  public OrderCreatePercentageDiscountCodeAttributesInput() {
  }

  
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  @Override
  public String toString() {
    return "OrderCreatePercentageDiscountCodeAttributesInput{code='" + code + "', percentage='" + percentage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreatePercentageDiscountCodeAttributesInput that = (OrderCreatePercentageDiscountCodeAttributesInput) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(percentage, that.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, percentage);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String code;

    
    private Double percentage;

    public OrderCreatePercentageDiscountCodeAttributesInput build() {
      OrderCreatePercentageDiscountCodeAttributesInput result = new OrderCreatePercentageDiscountCodeAttributesInput();
      result.code = this.code;
      result.percentage = this.percentage;
      return result;
    }

    
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    
    public Builder percentage(Double percentage) {
      this.percentage = percentage;
      return this;
    }
  }
}
