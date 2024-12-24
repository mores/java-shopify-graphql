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
public class SellingPlanRecurringBillingPolicy implements SellingPlanBillingPolicy {
  
  private List<SellingPlanAnchor> anchors;

  
  private OffsetDateTime createdAt;

  
  private SellingPlanInterval interval;

  
  private int intervalCount;

  
  private Integer maxCycles;

  
  private Integer minCycles;

  public SellingPlanRecurringBillingPolicy() {
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

  
  public Integer getMaxCycles() {
    return maxCycles;
  }

  public void setMaxCycles(Integer maxCycles) {
    this.maxCycles = maxCycles;
  }

  
  public Integer getMinCycles() {
    return minCycles;
  }

  public void setMinCycles(Integer minCycles) {
    this.minCycles = minCycles;
  }

  @Override
  public String toString() {
    return "SellingPlanRecurringBillingPolicy{anchors='" + anchors + "', createdAt='" + createdAt + "', interval='" + interval + "', intervalCount='" + intervalCount + "', maxCycles='" + maxCycles + "', minCycles='" + minCycles + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanRecurringBillingPolicy that = (SellingPlanRecurringBillingPolicy) o;
    return Objects.equals(anchors, that.anchors) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(interval, that.interval) &&
        intervalCount == that.intervalCount &&
        Objects.equals(maxCycles, that.maxCycles) &&
        Objects.equals(minCycles, that.minCycles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchors, createdAt, interval, intervalCount, maxCycles, minCycles);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<SellingPlanAnchor> anchors;

    
    private OffsetDateTime createdAt;

    
    private SellingPlanInterval interval;

    
    private int intervalCount;

    
    private Integer maxCycles;

    
    private Integer minCycles;

    public SellingPlanRecurringBillingPolicy build() {
      SellingPlanRecurringBillingPolicy result = new SellingPlanRecurringBillingPolicy();
      result.anchors = this.anchors;
      result.createdAt = this.createdAt;
      result.interval = this.interval;
      result.intervalCount = this.intervalCount;
      result.maxCycles = this.maxCycles;
      result.minCycles = this.minCycles;
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

    
    public Builder interval(SellingPlanInterval interval) {
      this.interval = interval;
      return this;
    }

    
    public Builder intervalCount(int intervalCount) {
      this.intervalCount = intervalCount;
      return this;
    }

    
    public Builder maxCycles(Integer maxCycles) {
      this.maxCycles = maxCycles;
      return this;
    }

    
    public Builder minCycles(Integer minCycles) {
      this.minCycles = minCycles;
      return this;
    }
  }
}
