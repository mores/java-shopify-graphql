package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The recurring delivery policy for the selling plan.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlanRecurringDeliveryPolicy implements SellingPlanDeliveryPolicy {
  /**
   * The delivery frequency, it can be either: day, week, month or year.
   */
  private SellingPlanInterval interval;

  /**
   * The number of intervals between deliveries.
   */
  private int intervalCount;

  public SellingPlanRecurringDeliveryPolicy() {
  }

  /**
   * The delivery frequency, it can be either: day, week, month or year.
   */
  public SellingPlanInterval getInterval() {
    return interval;
  }

  public void setInterval(SellingPlanInterval interval) {
    this.interval = interval;
  }

  /**
   * The number of intervals between deliveries.
   */
  public int getIntervalCount() {
    return intervalCount;
  }

  public void setIntervalCount(int intervalCount) {
    this.intervalCount = intervalCount;
  }

  @Override
  public String toString() {
    return "SellingPlanRecurringDeliveryPolicy{interval='" + interval + "', intervalCount='" + intervalCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanRecurringDeliveryPolicy that = (SellingPlanRecurringDeliveryPolicy) o;
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
     * The delivery frequency, it can be either: day, week, month or year.
     */
    private SellingPlanInterval interval;

    /**
     * The number of intervals between deliveries.
     */
    private int intervalCount;

    public SellingPlanRecurringDeliveryPolicy build() {
      SellingPlanRecurringDeliveryPolicy result = new SellingPlanRecurringDeliveryPolicy();
      result.interval = this.interval;
      result.intervalCount = this.intervalCount;
      return result;
    }

    /**
     * The delivery frequency, it can be either: day, week, month or year.
     */
    public Builder interval(SellingPlanInterval interval) {
      this.interval = interval;
      return this;
    }

    /**
     * The number of intervals between deliveries.
     */
    public Builder intervalCount(int intervalCount) {
      this.intervalCount = intervalCount;
      return this;
    }
  }
}
