package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class SubscriptionBillingCyclesDateRangeSelector {
  
  private OffsetDateTime startDate;

  
  private OffsetDateTime endDate;

  public SubscriptionBillingCyclesDateRangeSelector() {
  }

  
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingCyclesDateRangeSelector{startDate='" + startDate + "', endDate='" + endDate + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingCyclesDateRangeSelector that = (SubscriptionBillingCyclesDateRangeSelector) o;
    return Objects.equals(startDate, that.startDate) &&
        Objects.equals(endDate, that.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OffsetDateTime startDate;

    
    private OffsetDateTime endDate;

    public SubscriptionBillingCyclesDateRangeSelector build() {
      SubscriptionBillingCyclesDateRangeSelector result = new SubscriptionBillingCyclesDateRangeSelector();
      result.startDate = this.startDate;
      result.endDate = this.endDate;
      return result;
    }

    
    public Builder startDate(OffsetDateTime startDate) {
      this.startDate = startDate;
      return this;
    }

    
    public Builder endDate(OffsetDateTime endDate) {
      this.endDate = endDate;
      return this;
    }
  }
}
