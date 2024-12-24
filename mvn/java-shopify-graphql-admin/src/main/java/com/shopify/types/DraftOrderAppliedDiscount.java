package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DraftOrderAppliedDiscount {
  
  private String amount;

  
  private MoneyBag amountSet;

  
  private MoneyV2 amountV2;

  
  private String description;

  
  private String title;

  
  private double value;

  
  private DraftOrderAppliedDiscountType valueType;

  public DraftOrderAppliedDiscount() {
  }

  
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  
  public MoneyBag getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBag amountSet) {
    this.amountSet = amountSet;
  }

  
  public MoneyV2 getAmountV2() {
    return amountV2;
  }

  public void setAmountV2(MoneyV2 amountV2) {
    this.amountV2 = amountV2;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  
  public DraftOrderAppliedDiscountType getValueType() {
    return valueType;
  }

  public void setValueType(DraftOrderAppliedDiscountType valueType) {
    this.valueType = valueType;
  }

  @Override
  public String toString() {
    return "DraftOrderAppliedDiscount{amount='" + amount + "', amountSet='" + amountSet + "', amountV2='" + amountV2 + "', description='" + description + "', title='" + title + "', value='" + value + "', valueType='" + valueType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderAppliedDiscount that = (DraftOrderAppliedDiscount) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(amountSet, that.amountSet) &&
        Objects.equals(amountV2, that.amountV2) &&
        Objects.equals(description, that.description) &&
        Objects.equals(title, that.title) &&
        value == that.value &&
        Objects.equals(valueType, that.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, amountSet, amountV2, description, title, value, valueType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String amount;

    
    private MoneyBag amountSet;

    
    private MoneyV2 amountV2;

    
    private String description;

    
    private String title;

    
    private double value;

    
    private DraftOrderAppliedDiscountType valueType;

    public DraftOrderAppliedDiscount build() {
      DraftOrderAppliedDiscount result = new DraftOrderAppliedDiscount();
      result.amount = this.amount;
      result.amountSet = this.amountSet;
      result.amountV2 = this.amountV2;
      result.description = this.description;
      result.title = this.title;
      result.value = this.value;
      result.valueType = this.valueType;
      return result;
    }

    
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }

    
    public Builder amountSet(MoneyBag amountSet) {
      this.amountSet = amountSet;
      return this;
    }

    
    public Builder amountV2(MoneyV2 amountV2) {
      this.amountV2 = amountV2;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder value(double value) {
      this.value = value;
      return this;
    }

    
    public Builder valueType(DraftOrderAppliedDiscountType valueType) {
      this.valueType = valueType;
      return this;
    }
  }
}
