package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DraftOrderAppliedDiscountInput {
  
  private MoneyInput amountWithCurrency;

  
  private String description;

  
  private String title;

  
  private double value;

  
  private DraftOrderAppliedDiscountType valueType;

  public DraftOrderAppliedDiscountInput() {
  }

  
  public MoneyInput getAmountWithCurrency() {
    return amountWithCurrency;
  }

  public void setAmountWithCurrency(MoneyInput amountWithCurrency) {
    this.amountWithCurrency = amountWithCurrency;
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
    return "DraftOrderAppliedDiscountInput{amountWithCurrency='" + amountWithCurrency + "', description='" + description + "', title='" + title + "', value='" + value + "', valueType='" + valueType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderAppliedDiscountInput that = (DraftOrderAppliedDiscountInput) o;
    return Objects.equals(amountWithCurrency, that.amountWithCurrency) &&
        Objects.equals(description, that.description) &&
        Objects.equals(title, that.title) &&
        value == that.value &&
        Objects.equals(valueType, that.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountWithCurrency, description, title, value, valueType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyInput amountWithCurrency;

    
    private String description;

    
    private String title;

    
    private double value;

    
    private DraftOrderAppliedDiscountType valueType;

    public DraftOrderAppliedDiscountInput build() {
      DraftOrderAppliedDiscountInput result = new DraftOrderAppliedDiscountInput();
      result.amountWithCurrency = this.amountWithCurrency;
      result.description = this.description;
      result.title = this.title;
      result.value = this.value;
      result.valueType = this.valueType;
      return result;
    }

    
    public Builder amountWithCurrency(MoneyInput amountWithCurrency) {
      this.amountWithCurrency = amountWithCurrency;
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
