package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DiscountAmountInput {
  
  private String amount;

  
  private Boolean appliesOnEachItem;

  public DiscountAmountInput() {
  }

  
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  
  public Boolean getAppliesOnEachItem() {
    return appliesOnEachItem;
  }

  public void setAppliesOnEachItem(Boolean appliesOnEachItem) {
    this.appliesOnEachItem = appliesOnEachItem;
  }

  @Override
  public String toString() {
    return "DiscountAmountInput{amount='" + amount + "', appliesOnEachItem='" + appliesOnEachItem + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAmountInput that = (DiscountAmountInput) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(appliesOnEachItem, that.appliesOnEachItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, appliesOnEachItem);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String amount;

    
    private Boolean appliesOnEachItem;

    public DiscountAmountInput build() {
      DiscountAmountInput result = new DiscountAmountInput();
      result.amount = this.amount;
      result.appliesOnEachItem = this.appliesOnEachItem;
      return result;
    }

    
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }

    
    public Builder appliesOnEachItem(Boolean appliesOnEachItem) {
      this.appliesOnEachItem = appliesOnEachItem;
      return this;
    }
  }
}
