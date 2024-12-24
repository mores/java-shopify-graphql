package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SubscriptionBillingCyclesIndexRangeSelector {
  
  private int startIndex;

  
  private int endIndex;

  public SubscriptionBillingCyclesIndexRangeSelector() {
  }

  
  public int getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(int startIndex) {
    this.startIndex = startIndex;
  }

  
  public int getEndIndex() {
    return endIndex;
  }

  public void setEndIndex(int endIndex) {
    this.endIndex = endIndex;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingCyclesIndexRangeSelector{startIndex='" + startIndex + "', endIndex='" + endIndex + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingCyclesIndexRangeSelector that = (SubscriptionBillingCyclesIndexRangeSelector) o;
    return startIndex == that.startIndex &&
        endIndex == that.endIndex;
  }

  @Override
  public int hashCode() {
    return Objects.hash(startIndex, endIndex);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int startIndex;

    
    private int endIndex;

    public SubscriptionBillingCyclesIndexRangeSelector build() {
      SubscriptionBillingCyclesIndexRangeSelector result = new SubscriptionBillingCyclesIndexRangeSelector();
      result.startIndex = this.startIndex;
      result.endIndex = this.endIndex;
      return result;
    }

    
    public Builder startIndex(int startIndex) {
      this.startIndex = startIndex;
      return this;
    }

    
    public Builder endIndex(int endIndex) {
      this.endIndex = endIndex;
      return this;
    }
  }
}
