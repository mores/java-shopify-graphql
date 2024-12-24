package com.shopify.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class AppSubscriptionDiscountValueInput {
  
  private Double percentage;

  
  private String amount;

  public AppSubscriptionDiscountValueInput() {
  }

  
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "AppSubscriptionDiscountValueInput{percentage='" + percentage + "', amount='" + amount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppSubscriptionDiscountValueInput that = (AppSubscriptionDiscountValueInput) o;
    return Objects.equals(percentage, that.percentage) &&
        Objects.equals(amount, that.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage, amount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Double percentage;

    
    private String amount;

    public AppSubscriptionDiscountValueInput build() {
      AppSubscriptionDiscountValueInput result = new AppSubscriptionDiscountValueInput();
      result.percentage = this.percentage;
      result.amount = this.amount;
      return result;
    }

    
    public Builder percentage(Double percentage) {
      this.percentage = percentage;
      return this;
    }

    
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }
  }
}
