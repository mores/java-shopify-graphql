package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlanRecurringDeliveryPolicy implements SellingPlanDeliveryPolicy {
  
  private List<SellingPlanAnchor> anchors;

  
  private OffsetDateTime createdAt;

  
  private Integer cutoff;

  
  private SellingPlanRecurringDeliveryPolicyIntent intent;

  
  private SellingPlanInterval interval;

  
  private int intervalCount;

  
  private SellingPlanRecurringDeliveryPolicyPreAnchorBehavior preAnchorBehavior;

  public SellingPlanRecurringDeliveryPolicy() {
  }

  
  public List<SellingPlanAnchor> getAnchors() {
    return anchors;
  }

  public void setAnchors(List<SellingPlanAnchor> anchors) {
    this.anchors = anchors;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
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

  
  public SellingPlanRecurringDeliveryPolicyPreAnchorBehavior getPreAnchorBehavior() {
    return preAnchorBehavior;
  }

  public void setPreAnchorBehavior(
      SellingPlanRecurringDeliveryPolicyPreAnchorBehavior preAnchorBehavior) {
    this.preAnchorBehavior = preAnchorBehavior;
  }

  @Override
  public String toString() {
    return "SellingPlanRecurringDeliveryPolicy{anchors='" + anchors + "', createdAt='" + createdAt + "', cutoff='" + cutoff + "', intent='" + intent + "', interval='" + interval + "', intervalCount='" + intervalCount + "', preAnchorBehavior='" + preAnchorBehavior + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanRecurringDeliveryPolicy that = (SellingPlanRecurringDeliveryPolicy) o;
    return Objects.equals(anchors, that.anchors) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(cutoff, that.cutoff) &&
        Objects.equals(intent, that.intent) &&
        Objects.equals(interval, that.interval) &&
        intervalCount == that.intervalCount &&
        Objects.equals(preAnchorBehavior, that.preAnchorBehavior);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchors, createdAt, cutoff, intent, interval, intervalCount, preAnchorBehavior);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<SellingPlanAnchor> anchors;

    
    private OffsetDateTime createdAt;

    
    private Integer cutoff;

    
    private SellingPlanRecurringDeliveryPolicyIntent intent;

    
    private SellingPlanInterval interval;

    
    private int intervalCount;

    
    private SellingPlanRecurringDeliveryPolicyPreAnchorBehavior preAnchorBehavior;

    public SellingPlanRecurringDeliveryPolicy build() {
      SellingPlanRecurringDeliveryPolicy result = new SellingPlanRecurringDeliveryPolicy();
      result.anchors = this.anchors;
      result.createdAt = this.createdAt;
      result.cutoff = this.cutoff;
      result.intent = this.intent;
      result.interval = this.interval;
      result.intervalCount = this.intervalCount;
      result.preAnchorBehavior = this.preAnchorBehavior;
      return result;
    }

    
    public Builder anchors(List<SellingPlanAnchor> anchors) {
      this.anchors = anchors;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
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

    
    public Builder interval(SellingPlanInterval interval) {
      this.interval = interval;
      return this;
    }

    
    public Builder intervalCount(int intervalCount) {
      this.intervalCount = intervalCount;
      return this;
    }

    
    public Builder preAnchorBehavior(
        SellingPlanRecurringDeliveryPolicyPreAnchorBehavior preAnchorBehavior) {
      this.preAnchorBehavior = preAnchorBehavior;
      return this;
    }
  }
}
