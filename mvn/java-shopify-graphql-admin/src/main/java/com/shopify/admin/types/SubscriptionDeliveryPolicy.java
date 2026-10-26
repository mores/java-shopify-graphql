package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a Subscription Delivery Policy.
 */
public class SubscriptionDeliveryPolicy {
  /**
   * The specific anchor dates upon which the delivery interval calculations should be made.
   */
  private List<SellingPlanAnchor> anchors;

  /**
   * The kind of interval that's associated with this schedule (e.g. Monthly, Weekly, etc).
   */
  private SellingPlanInterval interval;

  /**
   * The number of delivery intervals between deliveries.
   */
  private int intervalCount;

  /**
   * The multiple fulfillment configuration when the contract delivers more than
   * once per billing cycle, as derived from the billing and delivery cadences.
   * Null when each billing cycle has a single fulfillment.
   */
  private SubscriptionContractCalculationMultipleFulfillmentConfig multiFulfillment;

  public SubscriptionDeliveryPolicy() {
  }

  /**
   * The specific anchor dates upon which the delivery interval calculations should be made.
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
   * The number of delivery intervals between deliveries.
   */
  public int getIntervalCount() {
    return intervalCount;
  }

  public void setIntervalCount(int intervalCount) {
    this.intervalCount = intervalCount;
  }

  /**
   * The multiple fulfillment configuration when the contract delivers more than
   * once per billing cycle, as derived from the billing and delivery cadences.
   * Null when each billing cycle has a single fulfillment.
   */
  public SubscriptionContractCalculationMultipleFulfillmentConfig getMultiFulfillment() {
    return multiFulfillment;
  }

  public void setMultiFulfillment(
      SubscriptionContractCalculationMultipleFulfillmentConfig multiFulfillment) {
    this.multiFulfillment = multiFulfillment;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryPolicy{anchors='" + anchors + "', interval='" + interval + "', intervalCount='" + intervalCount + "', multiFulfillment='" + multiFulfillment + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryPolicy that = (SubscriptionDeliveryPolicy) o;
    return Objects.equals(anchors, that.anchors) &&
        Objects.equals(interval, that.interval) &&
        intervalCount == that.intervalCount &&
        Objects.equals(multiFulfillment, that.multiFulfillment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchors, interval, intervalCount, multiFulfillment);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The specific anchor dates upon which the delivery interval calculations should be made.
     */
    private List<SellingPlanAnchor> anchors;

    /**
     * The kind of interval that's associated with this schedule (e.g. Monthly, Weekly, etc).
     */
    private SellingPlanInterval interval;

    /**
     * The number of delivery intervals between deliveries.
     */
    private int intervalCount;

    /**
     * The multiple fulfillment configuration when the contract delivers more than
     * once per billing cycle, as derived from the billing and delivery cadences.
     * Null when each billing cycle has a single fulfillment.
     */
    private SubscriptionContractCalculationMultipleFulfillmentConfig multiFulfillment;

    public SubscriptionDeliveryPolicy build() {
      SubscriptionDeliveryPolicy result = new SubscriptionDeliveryPolicy();
      result.anchors = this.anchors;
      result.interval = this.interval;
      result.intervalCount = this.intervalCount;
      result.multiFulfillment = this.multiFulfillment;
      return result;
    }

    /**
     * The specific anchor dates upon which the delivery interval calculations should be made.
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
     * The number of delivery intervals between deliveries.
     */
    public Builder intervalCount(int intervalCount) {
      this.intervalCount = intervalCount;
      return this;
    }

    /**
     * The multiple fulfillment configuration when the contract delivers more than
     * once per billing cycle, as derived from the billing and delivery cadences.
     * Null when each billing cycle has a single fulfillment.
     */
    public Builder multiFulfillment(
        SubscriptionContractCalculationMultipleFulfillmentConfig multiFulfillment) {
      this.multiFulfillment = multiFulfillment;
      return this;
    }
  }
}
