package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class AppSubscriptionDiscountInput {
  
  private AppSubscriptionDiscountValueInput value;

  
  private Integer durationLimitInIntervals;

  public AppSubscriptionDiscountInput() {
  }

  
  public AppSubscriptionDiscountValueInput getValue() {
    return value;
  }

  public void setValue(AppSubscriptionDiscountValueInput value) {
    this.value = value;
  }

  
  public Integer getDurationLimitInIntervals() {
    return durationLimitInIntervals;
  }

  public void setDurationLimitInIntervals(Integer durationLimitInIntervals) {
    this.durationLimitInIntervals = durationLimitInIntervals;
  }

  @Override
  public String toString() {
    return "AppSubscriptionDiscountInput{value='" + value + "', durationLimitInIntervals='" + durationLimitInIntervals + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppSubscriptionDiscountInput that = (AppSubscriptionDiscountInput) o;
    return Objects.equals(value, that.value) &&
        Objects.equals(durationLimitInIntervals, that.durationLimitInIntervals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, durationLimitInIntervals);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private AppSubscriptionDiscountValueInput value;

    
    private Integer durationLimitInIntervals;

    public AppSubscriptionDiscountInput build() {
      AppSubscriptionDiscountInput result = new AppSubscriptionDiscountInput();
      result.value = this.value;
      result.durationLimitInIntervals = this.durationLimitInIntervals;
      return result;
    }

    
    public Builder value(AppSubscriptionDiscountValueInput value) {
      this.value = value;
      return this;
    }

    
    public Builder durationLimitInIntervals(Integer durationLimitInIntervals) {
      this.durationLimitInIntervals = durationLimitInIntervals;
      return this;
    }
  }
}
