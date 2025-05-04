package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a Subscription Billing Policy.
 */
public class SubscriptionBillingPolicy {
  /**
   * Specific anchor dates upon which the billing interval calculations should be made.
   */
  private List<SellingPlanAnchor> anchors;

  /**
   * The kind of interval that's associated with this schedule (e.g. Monthly, Weekly, etc).
   */
  private SellingPlanInterval interval;

  /**
   * The number of billing intervals between invoices.
   */
  private int intervalCount;

  /**
   * Maximum amount of cycles after which the subscription ends.
   */
  private Integer maxCycles;

  /**
   * Minimum amount of cycles required in the subscription.
   */
  private Integer minCycles;

  public SubscriptionBillingPolicy() {
  }

  /**
   * Specific anchor dates upon which the billing interval calculations should be made.
   */
  public List<SellingPlanAnchor> getAnchors() {
    return anchors;
  }

  public void setAnchors(List<SellingPlanAnchor> anchors) {
    this.anchors = anchors;
  }

  /**
   * The kind of interval that's associated with this schedule (e.g. Monthly, Weekly, etc).
   */
  public SellingPlanInterval getInterval() {
    return interval;
  }

  public void setInterval(SellingPlanInterval interval) {
    this.interval = interval;
  }

  /**
   * The number of billing intervals between invoices.
   */
  public int getIntervalCount() {
    return intervalCount;
  }

  public void setIntervalCount(int intervalCount) {
    this.intervalCount = intervalCount;
  }

  /**
   * Maximum amount of cycles after which the subscription ends.
   */
  public Integer getMaxCycles() {
    return maxCycles;
  }

  public void setMaxCycles(Integer maxCycles) {
    this.maxCycles = maxCycles;
  }

  /**
   * Minimum amount of cycles required in the subscription.
   */
  public Integer getMinCycles() {
    return minCycles;
  }

  public void setMinCycles(Integer minCycles) {
    this.minCycles = minCycles;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingPolicy{anchors='" + anchors + "', interval='" + interval + "', intervalCount='" + intervalCount + "', maxCycles='" + maxCycles + "', minCycles='" + minCycles + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingPolicy that = (SubscriptionBillingPolicy) o;
    return Objects.equals(anchors, that.anchors) &&
        Objects.equals(interval, that.interval) &&
        intervalCount == that.intervalCount &&
        Objects.equals(maxCycles, that.maxCycles) &&
        Objects.equals(minCycles, that.minCycles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchors, interval, intervalCount, maxCycles, minCycles);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Specific anchor dates upon which the billing interval calculations should be made.
     */
    private List<SellingPlanAnchor> anchors;

    /**
     * The kind of interval that's associated with this schedule (e.g. Monthly, Weekly, etc).
     */
    private SellingPlanInterval interval;

    /**
     * The number of billing intervals between invoices.
     */
    private int intervalCount;

    /**
     * Maximum amount of cycles after which the subscription ends.
     */
    private Integer maxCycles;

    /**
     * Minimum amount of cycles required in the subscription.
     */
    private Integer minCycles;

    public SubscriptionBillingPolicy build() {
      SubscriptionBillingPolicy result = new SubscriptionBillingPolicy();
      result.anchors = this.anchors;
      result.interval = this.interval;
      result.intervalCount = this.intervalCount;
      result.maxCycles = this.maxCycles;
      result.minCycles = this.minCycles;
      return result;
    }

    /**
     * Specific anchor dates upon which the billing interval calculations should be made.
     */
    public Builder anchors(List<SellingPlanAnchor> anchors) {
      this.anchors = anchors;
      return this;
    }

    /**
     * The kind of interval that's associated with this schedule (e.g. Monthly, Weekly, etc).
     */
    public Builder interval(SellingPlanInterval interval) {
      this.interval = interval;
      return this;
    }

    /**
     * The number of billing intervals between invoices.
     */
    public Builder intervalCount(int intervalCount) {
      this.intervalCount = intervalCount;
      return this;
    }

    /**
     * Maximum amount of cycles after which the subscription ends.
     */
    public Builder maxCycles(Integer maxCycles) {
      this.maxCycles = maxCycles;
      return this;
    }

    /**
     * Minimum amount of cycles required in the subscription.
     */
    public Builder minCycles(Integer minCycles) {
      this.minCycles = minCycles;
      return this;
    }
  }
}
