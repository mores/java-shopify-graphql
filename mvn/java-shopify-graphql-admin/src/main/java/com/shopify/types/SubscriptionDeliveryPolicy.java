package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SubscriptionDeliveryPolicy {
  
  private List<SellingPlanAnchor> anchors;

  
  private SellingPlanInterval interval;

  
  private int intervalCount;

  public SubscriptionDeliveryPolicy() {
  }

  
  public List<SellingPlanAnchor> getAnchors() {
    return anchors;
  }

  public void setAnchors(List<SellingPlanAnchor> anchors) {
    this.anchors = anchors;
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

  @Override
  public String toString() {
    return "SubscriptionDeliveryPolicy{anchors='" + anchors + "', interval='" + interval + "', intervalCount='" + intervalCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryPolicy that = (SubscriptionDeliveryPolicy) o;
    return Objects.equals(anchors, that.anchors) &&
        Objects.equals(interval, that.interval) &&
        intervalCount == that.intervalCount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchors, interval, intervalCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<SellingPlanAnchor> anchors;

    
    private SellingPlanInterval interval;

    
    private int intervalCount;

    public SubscriptionDeliveryPolicy build() {
      SubscriptionDeliveryPolicy result = new SubscriptionDeliveryPolicy();
      result.anchors = this.anchors;
      result.interval = this.interval;
      result.intervalCount = this.intervalCount;
      return result;
    }

    
    public Builder anchors(List<SellingPlanAnchor> anchors) {
      this.anchors = anchors;
      return this;
    }

    
    public Builder interval(SellingPlanInterval interval) {
      this.interval = interval;
      return this;
    }

    
    public Builder intervalCount(int intervalCount) {
      this.intervalCount = intervalCount;
      return this;
    }
  }
}
