package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ShopifyPaymentsPayoutSchedule {
  
  private ShopifyPaymentsPayoutInterval interval;

  
  private Integer monthlyAnchor;

  
  private DayOfTheWeek weeklyAnchor;

  public ShopifyPaymentsPayoutSchedule() {
  }

  
  public ShopifyPaymentsPayoutInterval getInterval() {
    return interval;
  }

  public void setInterval(ShopifyPaymentsPayoutInterval interval) {
    this.interval = interval;
  }

  
  public Integer getMonthlyAnchor() {
    return monthlyAnchor;
  }

  public void setMonthlyAnchor(Integer monthlyAnchor) {
    this.monthlyAnchor = monthlyAnchor;
  }

  
  public DayOfTheWeek getWeeklyAnchor() {
    return weeklyAnchor;
  }

  public void setWeeklyAnchor(DayOfTheWeek weeklyAnchor) {
    this.weeklyAnchor = weeklyAnchor;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsPayoutSchedule{interval='" + interval + "', monthlyAnchor='" + monthlyAnchor + "', weeklyAnchor='" + weeklyAnchor + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsPayoutSchedule that = (ShopifyPaymentsPayoutSchedule) o;
    return Objects.equals(interval, that.interval) &&
        Objects.equals(monthlyAnchor, that.monthlyAnchor) &&
        Objects.equals(weeklyAnchor, that.weeklyAnchor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, monthlyAnchor, weeklyAnchor);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private ShopifyPaymentsPayoutInterval interval;

    
    private Integer monthlyAnchor;

    
    private DayOfTheWeek weeklyAnchor;

    public ShopifyPaymentsPayoutSchedule build() {
      ShopifyPaymentsPayoutSchedule result = new ShopifyPaymentsPayoutSchedule();
      result.interval = this.interval;
      result.monthlyAnchor = this.monthlyAnchor;
      result.weeklyAnchor = this.weeklyAnchor;
      return result;
    }

    
    public Builder interval(ShopifyPaymentsPayoutInterval interval) {
      this.interval = interval;
      return this;
    }

    
    public Builder monthlyAnchor(Integer monthlyAnchor) {
      this.monthlyAnchor = monthlyAnchor;
      return this;
    }

    
    public Builder weeklyAnchor(DayOfTheWeek weeklyAnchor) {
      this.weeklyAnchor = weeklyAnchor;
      return this;
    }
  }
}
