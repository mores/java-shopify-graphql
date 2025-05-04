package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a Subscription Delivery Policy.
 */
public class SubscriptionDeliveryPolicyInput {
  /**
   * The kind of interval that's associated with this schedule (e.g. Monthly, Weekly, etc).
   */
  private SellingPlanInterval interval;

  /**
   * The number of billing intervals between invoices.
   */
  private int intervalCount;

  /**
   * The specific anchor dates upon which the delivery interval calculations should be made.
   */
  private List<SellingPlanAnchorInput> anchors = Collections.emptyList();

  public SubscriptionDeliveryPolicyInput() {
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
   * The specific anchor dates upon which the delivery interval calculations should be made.
   */
  public List<SellingPlanAnchorInput> getAnchors() {
    return anchors;
  }

  public void setAnchors(List<SellingPlanAnchorInput> anchors) {
    this.anchors = anchors;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryPolicyInput{interval='" + interval + "', intervalCount='" + intervalCount + "', anchors='" + anchors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryPolicyInput that = (SubscriptionDeliveryPolicyInput) o;
    return Objects.equals(interval, that.interval) &&
        intervalCount == that.intervalCount &&
        Objects.equals(anchors, that.anchors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, intervalCount, anchors);
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
     * The specific anchor dates upon which the delivery interval calculations should be made.
     */
    private List<SellingPlanAnchorInput> anchors = Collections.emptyList();

    public SubscriptionDeliveryPolicyInput build() {
      SubscriptionDeliveryPolicyInput result = new SubscriptionDeliveryPolicyInput();
      result.interval = this.interval;
      result.intervalCount = this.intervalCount;
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
     * The specific anchor dates upon which the delivery interval calculations should be made.
     */
    public Builder anchors(List<SellingPlanAnchorInput> anchors) {
      this.anchors = anchors;
      return this;
    }
  }
}
