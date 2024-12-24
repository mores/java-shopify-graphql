package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountAmount implements DiscountCustomerGetsValue, DiscountEffect {
  
  private MoneyV2 amount;

  
  private boolean appliesOnEachItem;

  public DiscountAmount() {
  }

  
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  
  public boolean getAppliesOnEachItem() {
    return appliesOnEachItem;
  }

  public void setAppliesOnEachItem(boolean appliesOnEachItem) {
    this.appliesOnEachItem = appliesOnEachItem;
  }

  @Override
  public String toString() {
    return "DiscountAmount{amount='" + amount + "', appliesOnEachItem='" + appliesOnEachItem + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAmount that = (DiscountAmount) o;
    return Objects.equals(amount, that.amount) &&
        appliesOnEachItem == that.appliesOnEachItem;
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, appliesOnEachItem);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyV2 amount;

    
    private boolean appliesOnEachItem;

    public DiscountAmount build() {
      DiscountAmount result = new DiscountAmount();
      result.amount = this.amount;
      result.appliesOnEachItem = this.appliesOnEachItem;
      return result;
    }

    
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    
    public Builder appliesOnEachItem(boolean appliesOnEachItem) {
      this.appliesOnEachItem = appliesOnEachItem;
      return this;
    }
  }
}
