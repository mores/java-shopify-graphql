package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The recurring billing policy for the selling plan.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlanRecurringBillingPolicy implements SellingPlanBillingPolicy {
  /**
   * The billing frequency, it can be either: day, week, month or year.
   */
  private SellingPlanInterval interval;

  /**
   * The number of intervals between billings.
   */
  private int intervalCount;

  public SellingPlanRecurringBillingPolicy() {
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

  @Override
  public String toString() {
    return "SellingPlanRecurringBillingPolicy{interval='" + interval + "', intervalCount='" + intervalCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanRecurringBillingPolicy that = (SellingPlanRecurringBillingPolicy) o;
    return Objects.equals(interval, that.interval) &&
        intervalCount == that.intervalCount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, intervalCount);
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
    private int intervalCount;

    public SellingPlanRecurringBillingPolicy build() {
      SellingPlanRecurringBillingPolicy result = new SellingPlanRecurringBillingPolicy();
      result.interval = this.interval;
      result.intervalCount = this.intervalCount;
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
    public Builder intervalCount(int intervalCount) {
      this.intervalCount = intervalCount;
      return this;
    }
  }
}
