package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class SubscriptionBillingPolicyInput {
  
  private SellingPlanInterval interval;

  
  private int intervalCount;

  
  private Integer minCycles;

  
  private Integer maxCycles;

  
  private List<SellingPlanAnchorInput> anchors = Collections.emptyList();

  public SubscriptionBillingPolicyInput() {
  }

  
  public SellingPlanInterval getInterval() {
    return interval;
  }

  public void setInterval(SellingPlanInterval interval) {
    this.interval = interval;
  }

  
  public int getIntervalCount() {
    return intervalCount;
  }

  public void setIntervalCount(int intervalCount) {
    this.intervalCount = intervalCount;
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

  
  public List<SellingPlanAnchorInput> getAnchors() {
    return anchors;
  }

  public void setAnchors(List<SellingPlanAnchorInput> anchors) {
    this.anchors = anchors;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingPolicyInput{interval='" + interval + "', intervalCount='" + intervalCount + "', minCycles='" + minCycles + "', maxCycles='" + maxCycles + "', anchors='" + anchors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingPolicyInput that = (SubscriptionBillingPolicyInput) o;
    return Objects.equals(interval, that.interval) &&
        intervalCount == that.intervalCount &&
        Objects.equals(minCycles, that.minCycles) &&
        Objects.equals(maxCycles, that.maxCycles) &&
        Objects.equals(anchors, that.anchors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, intervalCount, minCycles, maxCycles, anchors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SellingPlanInterval interval;

    
    private int intervalCount;

    
    private Integer minCycles;

    
    private Integer maxCycles;

    
    private List<SellingPlanAnchorInput> anchors = Collections.emptyList();

    public SubscriptionBillingPolicyInput build() {
      SubscriptionBillingPolicyInput result = new SubscriptionBillingPolicyInput();
      result.interval = this.interval;
      result.intervalCount = this.intervalCount;
      result.minCycles = this.minCycles;
      result.maxCycles = this.maxCycles;
      result.anchors = this.anchors;
      return result;
    }

    
    public Builder interval(SellingPlanInterval interval) {
      this.interval = interval;
      return this;
    }

    
    public Builder intervalCount(int intervalCount) {
      this.intervalCount = intervalCount;
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

    
    public Builder anchors(List<SellingPlanAnchorInput> anchors) {
      this.anchors = anchors;
      return this;
    }
  }
}
