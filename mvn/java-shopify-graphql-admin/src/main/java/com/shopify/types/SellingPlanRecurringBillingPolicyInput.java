package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SellingPlanRecurringBillingPolicyInput {
  
  private SellingPlanInterval interval;

  
  private Integer intervalCount;

  
  private List<SellingPlanAnchorInput> anchors;

  
  private Integer minCycles;

  
  private Integer maxCycles;

  public SellingPlanRecurringBillingPolicyInput() {
  }

  
  public SellingPlanInterval getInterval() {
    return interval;
  }

  public void setInterval(SellingPlanInterval interval) {
    this.interval = interval;
  }

  
  public Integer getIntervalCount() {
    return intervalCount;
  }

  public void setIntervalCount(Integer intervalCount) {
    this.intervalCount = intervalCount;
  }

  
  public List<SellingPlanAnchorInput> getAnchors() {
    return anchors;
  }

  public void setAnchors(List<SellingPlanAnchorInput> anchors) {
    this.anchors = anchors;
  }

  
  public Integer getMinCycles() {
    return minCycles;
  }

  public void setMinCycles(Integer minCycles) {
    this.minCycles = minCycles;
  }

  
  public Integer getMaxCycles() {
    return maxCycles;
  }

  public void setMaxCycles(Integer maxCycles) {
    this.maxCycles = maxCycles;
  }

  @Override
  public String toString() {
    return "SellingPlanRecurringBillingPolicyInput{interval='" + interval + "', intervalCount='" + intervalCount + "', anchors='" + anchors + "', minCycles='" + minCycles + "', maxCycles='" + maxCycles + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanRecurringBillingPolicyInput that = (SellingPlanRecurringBillingPolicyInput) o;
    return Objects.equals(interval, that.interval) &&
        Objects.equals(intervalCount, that.intervalCount) &&
        Objects.equals(anchors, that.anchors) &&
        Objects.equals(minCycles, that.minCycles) &&
        Objects.equals(maxCycles, that.maxCycles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, intervalCount, anchors, minCycles, maxCycles);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SellingPlanInterval interval;

    
    private Integer intervalCount;

    
    private List<SellingPlanAnchorInput> anchors;

    
    private Integer minCycles;

    
    private Integer maxCycles;

    public SellingPlanRecurringBillingPolicyInput build() {
      SellingPlanRecurringBillingPolicyInput result = new SellingPlanRecurringBillingPolicyInput();
      result.interval = this.interval;
      result.intervalCount = this.intervalCount;
      result.anchors = this.anchors;
      result.minCycles = this.minCycles;
      result.maxCycles = this.maxCycles;
      return result;
    }

    
    public Builder interval(SellingPlanInterval interval) {
      this.interval = interval;
      return this;
    }

    
    public Builder intervalCount(Integer intervalCount) {
      this.intervalCount = intervalCount;
      return this;
    }

    
    public Builder anchors(List<SellingPlanAnchorInput> anchors) {
      this.anchors = anchors;
      return this;
    }

    
    public Builder minCycles(Integer minCycles) {
      this.minCycles = minCycles;
      return this;
    }

    
    public Builder maxCycles(Integer maxCycles) {
      this.maxCycles = maxCycles;
      return this;
    }
  }
}
