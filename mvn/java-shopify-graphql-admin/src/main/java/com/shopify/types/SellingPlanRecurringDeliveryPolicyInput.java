package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SellingPlanRecurringDeliveryPolicyInput {
  
  private SellingPlanInterval interval;

  
  private Integer intervalCount;

  
  private List<SellingPlanAnchorInput> anchors;

  
  private Integer cutoff;

  
  private SellingPlanRecurringDeliveryPolicyIntent intent;

  
  private SellingPlanRecurringDeliveryPolicyPreAnchorBehavior preAnchorBehavior;

  public SellingPlanRecurringDeliveryPolicyInput() {
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

  
  public Integer getCutoff() {
    return cutoff;
  }

  public void setCutoff(Integer cutoff) {
    this.cutoff = cutoff;
  }

  
  public SellingPlanRecurringDeliveryPolicyIntent getIntent() {
    return intent;
  }

  public void setIntent(SellingPlanRecurringDeliveryPolicyIntent intent) {
    this.intent = intent;
  }

  
  public SellingPlanRecurringDeliveryPolicyPreAnchorBehavior getPreAnchorBehavior() {
    return preAnchorBehavior;
  }

  public void setPreAnchorBehavior(
      SellingPlanRecurringDeliveryPolicyPreAnchorBehavior preAnchorBehavior) {
    this.preAnchorBehavior = preAnchorBehavior;
  }

  @Override
  public String toString() {
    return "SellingPlanRecurringDeliveryPolicyInput{interval='" + interval + "', intervalCount='" + intervalCount + "', anchors='" + anchors + "', cutoff='" + cutoff + "', intent='" + intent + "', preAnchorBehavior='" + preAnchorBehavior + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanRecurringDeliveryPolicyInput that = (SellingPlanRecurringDeliveryPolicyInput) o;
    return Objects.equals(interval, that.interval) &&
        Objects.equals(intervalCount, that.intervalCount) &&
        Objects.equals(anchors, that.anchors) &&
        Objects.equals(cutoff, that.cutoff) &&
        Objects.equals(intent, that.intent) &&
        Objects.equals(preAnchorBehavior, that.preAnchorBehavior);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, intervalCount, anchors, cutoff, intent, preAnchorBehavior);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SellingPlanInterval interval;

    
    private Integer intervalCount;

    
    private List<SellingPlanAnchorInput> anchors;

    
    private Integer cutoff;

    
    private SellingPlanRecurringDeliveryPolicyIntent intent;

    
    private SellingPlanRecurringDeliveryPolicyPreAnchorBehavior preAnchorBehavior;

    public SellingPlanRecurringDeliveryPolicyInput build() {
      SellingPlanRecurringDeliveryPolicyInput result = new SellingPlanRecurringDeliveryPolicyInput();
      result.interval = this.interval;
      result.intervalCount = this.intervalCount;
      result.anchors = this.anchors;
      result.cutoff = this.cutoff;
      result.intent = this.intent;
      result.preAnchorBehavior = this.preAnchorBehavior;
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

    
    public Builder cutoff(Integer cutoff) {
      this.cutoff = cutoff;
      return this;
    }

    
    public Builder intent(SellingPlanRecurringDeliveryPolicyIntent intent) {
      this.intent = intent;
      return this;
    }

    
    public Builder preAnchorBehavior(
        SellingPlanRecurringDeliveryPolicyPreAnchorBehavior preAnchorBehavior) {
      this.preAnchorBehavior = preAnchorBehavior;
      return this;
    }
  }
}
