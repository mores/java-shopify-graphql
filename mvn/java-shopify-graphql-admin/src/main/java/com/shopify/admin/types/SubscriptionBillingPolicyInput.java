package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a Subscription Billing Policy.
 */
public class SubscriptionBillingPolicyInput {
  /**
   * The kind of interval that's associated with this schedule (e.g. Monthly, Weekly, etc).
   */
  private SellingPlanInterval interval;

  /**
   * The number of billing intervals between invoices.
   */
  private int intervalCount;

  /**
   * Minimum amount of cycles required in the subscription.
   */
  private Integer minCycles;

  /**
   * Maximum amount of cycles required in the subscription.
   */
  private Integer maxCycles;

  /**
   * Specific anchor dates upon which the billing interval calculations should be made.
   */
  private List<SellingPlanAnchorInput> anchors = Collections.emptyList();

  public SubscriptionBillingPolicyInput() {
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
   * Minimum amount of cycles required in the subscription.
   */
  public Integer getMinCycles() {
    return minCycles;
  }

  public void setMinCycles(Integer minCycles) {
    this.minCycles = minCycles;
  }

  /**
   * Maximum amount of cycles required in the subscription.
   */
  public Integer getMaxCycles() {
    return maxCycles;
  }

  public void setMaxCycles(Integer maxCycles) {
    this.maxCycles = maxCycles;
  }

  /**
   * Specific anchor dates upon which the billing interval calculations should be made.
   */
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
    /**
     * The kind of interval that's associated with this schedule (e.g. Monthly, Weekly, etc).
     */
    private SellingPlanInterval interval;

    /**
     * The number of billing intervals between invoices.
     */
    private int intervalCount;

    /**
     * Minimum amount of cycles required in the subscription.
     */
    private Integer minCycles;

    /**
     * Maximum amount of cycles required in the subscription.
     */
    private Integer maxCycles;

    /**
     * Specific anchor dates upon which the billing interval calculations should be made.
     */
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
     * Minimum amount of cycles required in the subscription.
     */
    public Builder minCycles(Integer minCycles) {
      this.minCycles = minCycles;
      return this;
    }

    /**
     * Maximum amount of cycles required in the subscription.
     */
    public Builder maxCycles(Integer maxCycles) {
      this.maxCycles = maxCycles;
      return this;
    }

    /**
     * Specific anchor dates upon which the billing interval calculations should be made.
     */
    public Builder anchors(List<SellingPlanAnchorInput> anchors) {
      this.anchors = anchors;
      return this;
    }
  }
}
