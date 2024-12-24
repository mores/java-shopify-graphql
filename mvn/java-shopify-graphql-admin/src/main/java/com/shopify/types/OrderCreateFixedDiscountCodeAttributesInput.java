package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OrderCreateFixedDiscountCodeAttributesInput {
  
  private String code;

  
  private MoneyBagInput amountSet;

  public OrderCreateFixedDiscountCodeAttributesInput() {
  }

  
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  
  public MoneyBagInput getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBagInput amountSet) {
    this.amountSet = amountSet;
  }

  @Override
  public String toString() {
    return "OrderCreateFixedDiscountCodeAttributesInput{code='" + code + "', amountSet='" + amountSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateFixedDiscountCodeAttributesInput that = (OrderCreateFixedDiscountCodeAttributesInput) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(amountSet, that.amountSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, amountSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String code;

    
    private MoneyBagInput amountSet;

    public OrderCreateFixedDiscountCodeAttributesInput build() {
      OrderCreateFixedDiscountCodeAttributesInput result = new OrderCreateFixedDiscountCodeAttributesInput();
      result.code = this.code;
      result.amountSet = this.amountSet;
      return result;
    }

    
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    
    public Builder amountSet(MoneyBagInput amountSet) {
      this.amountSet = amountSet;
      return this;
    }
  }
}
