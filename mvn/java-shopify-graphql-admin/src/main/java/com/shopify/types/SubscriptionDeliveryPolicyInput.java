package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class SubscriptionDeliveryPolicyInput {
  
  private SellingPlanInterval interval;

  
  private int intervalCount;

  
  private List<SellingPlanAnchorInput> anchors = Collections.emptyList();

  public SubscriptionDeliveryPolicyInput() {
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

  
  public List<SellingPlanAnchorInput> getAnchors() {
    return anchors;
  }

  public void setAnchors(List<SellingPlanAnchorInput> anchors) {
    this.anchors = anchors;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryPolicyInput{interval='" + interval + "', intervalCount='" + intervalCount + "', anchors='" + anchors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryPolicyInput that = (SubscriptionDeliveryPolicyInput) o;
    return Objects.equals(interval, that.interval) &&
        intervalCount == that.intervalCount &&
        Objects.equals(anchors, that.anchors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, intervalCount, anchors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SellingPlanInterval interval;

    
    private int intervalCount;

    
    private List<SellingPlanAnchorInput> anchors = Collections.emptyList();

    public SubscriptionDeliveryPolicyInput build() {
      SubscriptionDeliveryPolicyInput result = new SubscriptionDeliveryPolicyInput();
      result.interval = this.interval;
      result.intervalCount = this.intervalCount;
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

    
    public Builder anchors(List<SellingPlanAnchorInput> anchors) {
      this.anchors = anchors;
      return this;
    }
  }
}
