package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DiscountCustomerBuysValueInput {
  
  private String quantity;

  
  private String amount;

  public DiscountCustomerBuysValueInput() {
  }

  
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "DiscountCustomerBuysValueInput{quantity='" + quantity + "', amount='" + amount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomerBuysValueInput that = (DiscountCustomerBuysValueInput) o;
    return Objects.equals(quantity, that.quantity) &&
        Objects.equals(amount, that.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, amount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String quantity;

    
    private String amount;

    public DiscountCustomerBuysValueInput build() {
      DiscountCustomerBuysValueInput result = new DiscountCustomerBuysValueInput();
      result.quantity = this.quantity;
      result.amount = this.amount;
      return result;
    }

    
    public Builder quantity(String quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }
  }
}
