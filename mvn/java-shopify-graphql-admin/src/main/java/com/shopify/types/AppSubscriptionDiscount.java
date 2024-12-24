package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class AppSubscriptionDiscount {
  
  private Integer durationLimitInIntervals;

  
  private MoneyV2 priceAfterDiscount;

  
  private Integer remainingDurationInIntervals;

  
  private AppSubscriptionDiscountValue value;

  public AppSubscriptionDiscount() {
  }

  
  public Integer getDurationLimitInIntervals() {
    return durationLimitInIntervals;
  }

  public void setDurationLimitInIntervals(Integer durationLimitInIntervals) {
    this.durationLimitInIntervals = durationLimitInIntervals;
  }

  
  public MoneyV2 getPriceAfterDiscount() {
    return priceAfterDiscount;
  }

  public void setPriceAfterDiscount(MoneyV2 priceAfterDiscount) {
    this.priceAfterDiscount = priceAfterDiscount;
  }

  
  public Integer getRemainingDurationInIntervals() {
    return remainingDurationInIntervals;
  }

  public void setRemainingDurationInIntervals(Integer remainingDurationInIntervals) {
    this.remainingDurationInIntervals = remainingDurationInIntervals;
  }

  
  public AppSubscriptionDiscountValue getValue() {
    return value;
  }

  public void setValue(AppSubscriptionDiscountValue value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "AppSubscriptionDiscount{durationLimitInIntervals='" + durationLimitInIntervals + "', priceAfterDiscount='" + priceAfterDiscount + "', remainingDurationInIntervals='" + remainingDurationInIntervals + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppSubscriptionDiscount that = (AppSubscriptionDiscount) o;
    return Objects.equals(durationLimitInIntervals, that.durationLimitInIntervals) &&
        Objects.equals(priceAfterDiscount, that.priceAfterDiscount) &&
        Objects.equals(remainingDurationInIntervals, that.remainingDurationInIntervals) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationLimitInIntervals, priceAfterDiscount, remainingDurationInIntervals, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Integer durationLimitInIntervals;

    
    private MoneyV2 priceAfterDiscount;

    
    private Integer remainingDurationInIntervals;

    
    private AppSubscriptionDiscountValue value;

    public AppSubscriptionDiscount build() {
      AppSubscriptionDiscount result = new AppSubscriptionDiscount();
      result.durationLimitInIntervals = this.durationLimitInIntervals;
      result.priceAfterDiscount = this.priceAfterDiscount;
      result.remainingDurationInIntervals = this.remainingDurationInIntervals;
      result.value = this.value;
      return result;
    }

    
    public Builder durationLimitInIntervals(Integer durationLimitInIntervals) {
      this.durationLimitInIntervals = durationLimitInIntervals;
      return this;
    }

    
    public Builder priceAfterDiscount(MoneyV2 priceAfterDiscount) {
      this.priceAfterDiscount = priceAfterDiscount;
      return this;
    }

    
    public Builder remainingDurationInIntervals(Integer remainingDurationInIntervals) {
      this.remainingDurationInIntervals = remainingDurationInIntervals;
      return this;
    }

    
    public Builder value(AppSubscriptionDiscountValue value) {
      this.value = value;
      return this;
    }
  }
}
