package com.shopify.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DiscountCustomerGetsValueInput {
  
  private DiscountOnQuantityInput discountOnQuantity;

  
  private Double percentage;

  
  private DiscountAmountInput discountAmount;

  public DiscountCustomerGetsValueInput() {
  }

  
  public DiscountOnQuantityInput getDiscountOnQuantity() {
    return discountOnQuantity;
  }

  public void setDiscountOnQuantity(DiscountOnQuantityInput discountOnQuantity) {
    this.discountOnQuantity = discountOnQuantity;
  }

  
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  
  public DiscountAmountInput getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(DiscountAmountInput discountAmount) {
    this.discountAmount = discountAmount;
  }

  @Override
  public String toString() {
    return "DiscountCustomerGetsValueInput{discountOnQuantity='" + discountOnQuantity + "', percentage='" + percentage + "', discountAmount='" + discountAmount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomerGetsValueInput that = (DiscountCustomerGetsValueInput) o;
    return Objects.equals(discountOnQuantity, that.discountOnQuantity) &&
        Objects.equals(percentage, that.percentage) &&
        Objects.equals(discountAmount, that.discountAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountOnQuantity, percentage, discountAmount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DiscountOnQuantityInput discountOnQuantity;

    
    private Double percentage;

    
    private DiscountAmountInput discountAmount;

    public DiscountCustomerGetsValueInput build() {
      DiscountCustomerGetsValueInput result = new DiscountCustomerGetsValueInput();
      result.discountOnQuantity = this.discountOnQuantity;
      result.percentage = this.percentage;
      result.discountAmount = this.discountAmount;
      return result;
    }

    
    public Builder discountOnQuantity(DiscountOnQuantityInput discountOnQuantity) {
      this.discountOnQuantity = discountOnQuantity;
      return this;
    }

    
    public Builder percentage(Double percentage) {
      this.percentage = percentage;
      return this;
    }

    
    public Builder discountAmount(DiscountAmountInput discountAmount) {
      this.discountAmount = discountAmount;
      return this;
    }
  }
}
