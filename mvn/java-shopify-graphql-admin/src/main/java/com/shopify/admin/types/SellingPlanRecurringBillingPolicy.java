package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents a recurring selling plan billing policy.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlanRecurringBillingPolicy implements SellingPlanBillingPolicy {
  /**
   * Specific anchor dates upon which the billing interval calculations should be made.
   */
  private List<SellingPlanAnchor> anchors;

  /**
   * The date and time when the selling plan billing policy was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The billing frequency, it can be either: day, week, month or year.
   */
  private SellingPlanInterval interval;

  /**
   * The number of intervals between billings.
   */
  private int intervalCount;

  /**
   * Maximum number of billing iterations.
   */
  private Integer maxCycles;

  /**
   * Minimum number of billing iterations.
   */
  private Integer minCycles;

  public SellingPlanRecurringBillingPolicy() {
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
   * The date and time when the selling plan billing policy was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
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
  public int getIntervalCount() {
    return intervalCount;
  }

  public void setIntervalCount(int intervalCount) {
    this.intervalCount = intervalCount;
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

  /**
   * Minimum number of billing iterations.
   */
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
    /**
     * Specific anchor dates upon which the billing interval calculations should be made.
     */
    private List<SellingPlanAnchor> anchors;

    /**
     * The date and time when the selling plan billing policy was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The billing frequency, it can be either: day, week, month or year.
     */
    private SellingPlanInterval interval;

    /**
     * The number of intervals between billings.
     */
    private int intervalCount;

    /**
     * Maximum number of billing iterations.
     */
    private Integer maxCycles;

    /**
     * Minimum number of billing iterations.
     */
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

    /**
     * Specific anchor dates upon which the billing interval calculations should be made.
     */
    public Builder anchors(List<SellingPlanAnchor> anchors) {
      this.anchors = anchors;
      return this;
    }

    /**
     * The date and time when the selling plan billing policy was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
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
    public Builder intervalCount(int intervalCount) {
      this.intervalCount = intervalCount;
      return this;
    }

    /**
     * Maximum number of billing iterations.
     */
    public Builder maxCycles(Integer maxCycles) {
      this.maxCycles = maxCycles;
      return this;
    }

    /**
     * Minimum number of billing iterations.
     */
    public Builder minCycles(Integer minCycles) {
      this.minCycles = minCycles;
      return this;
    }
  }
}
