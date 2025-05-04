package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to create or update a recurring billing policy.
 */
public class SellingPlanRecurringBillingPolicyInput {
  /**
   * The billing frequency, it can be either: day, week, month or year.
   */
  private SellingPlanInterval interval;

  /**
   * The number of intervals between billings.
   */
  private Integer intervalCount;

  /**
   * Specific anchor dates upon which the billing interval calculations should be made.
   */
  private List<SellingPlanAnchorInput> anchors;

  /**
   * Minimum number of billing iterations.
   */
  private Integer minCycles;

  /**
   * Maximum number of billing iterations.
   */
  private Integer maxCycles;

  public SellingPlanRecurringBillingPolicyInput() {
  }

  /**
   * The billing frequency, it can be either: day, week, month or year.
   */
  public SellingPlanInterval getInterval() {
    return interval;
  }

  public void setInterval(SellingPlanInterval interval) {
    this.interval = interval;
  }

  /**
   * The number of intervals between billings.
   */
  public Integer getIntervalCount() {
    return intervalCount;
  }

  public void setIntervalCount(Integer intervalCount) {
    this.intervalCount = intervalCount;
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

  /**
   * Minimum number of billing iterations.
   */
  public Integer getMinCycles() {
    return minCycles;
  }

  public void setMinCycles(Integer minCycles) {
    this.minCycles = minCycles;
  }

  /**
   * Maximum number of billing iterations.
   */
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
    /**
     * The billing frequency, it can be either: day, week, month or year.
     */
    private SellingPlanInterval interval;

    /**
     * The number of intervals between billings.
     */
    private Integer intervalCount;

    /**
     * Specific anchor dates upon which the billing interval calculations should be made.
     */
    private List<SellingPlanAnchorInput> anchors;

    /**
     * Minimum number of billing iterations.
     */
    private Integer minCycles;

    /**
     * Maximum number of billing iterations.
     */
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

    /**
     * The billing frequency, it can be either: day, week, month or year.
     */
    public Builder interval(SellingPlanInterval interval) {
      this.interval = interval;
      return this;
    }

    /**
     * The number of intervals between billings.
     */
    public Builder intervalCount(Integer intervalCount) {
      this.intervalCount = intervalCount;
      return this;
    }

    /**
     * Specific anchor dates upon which the billing interval calculations should be made.
     */
    public Builder anchors(List<SellingPlanAnchorInput> anchors) {
      this.anchors = anchors;
      return this;
    }

    /**
     * Minimum number of billing iterations.
     */
    public Builder minCycles(Integer minCycles) {
      this.minCycles = minCycles;
      return this;
    }

    /**
     * Maximum number of billing iterations.
     */
    public Builder maxCycles(Integer maxCycles) {
      this.maxCycles = maxCycles;
      return this;
    }
  }
}
