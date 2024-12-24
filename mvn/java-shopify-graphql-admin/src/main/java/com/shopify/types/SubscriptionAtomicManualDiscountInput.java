package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SubscriptionAtomicManualDiscountInput {
  
  private String title;

  
  private SubscriptionManualDiscountValueInput value;

  
  private Integer recurringCycleLimit;

  public SubscriptionAtomicManualDiscountInput() {
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public SubscriptionManualDiscountValueInput getValue() {
    return value;
  }

  public void setValue(SubscriptionManualDiscountValueInput value) {
    this.value = value;
  }

  
  public Integer getRecurringCycleLimit() {
    return recurringCycleLimit;
  }

  public void setRecurringCycleLimit(Integer recurringCycleLimit) {
    this.recurringCycleLimit = recurringCycleLimit;
  }

  @Override
  public String toString() {
    return "SubscriptionAtomicManualDiscountInput{title='" + title + "', value='" + value + "', recurringCycleLimit='" + recurringCycleLimit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionAtomicManualDiscountInput that = (SubscriptionAtomicManualDiscountInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(value, that.value) &&
        Objects.equals(recurringCycleLimit, that.recurringCycleLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, value, recurringCycleLimit);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String title;

    
    private SubscriptionManualDiscountValueInput value;

    
    private Integer recurringCycleLimit;

    public SubscriptionAtomicManualDiscountInput build() {
      SubscriptionAtomicManualDiscountInput result = new SubscriptionAtomicManualDiscountInput();
      result.title = this.title;
      result.value = this.value;
      result.recurringCycleLimit = this.recurringCycleLimit;
      return result;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder value(SubscriptionManualDiscountValueInput value) {
      this.value = value;
      return this;
    }

    
    public Builder recurringCycleLimit(Integer recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
      return this;
    }
  }
}
