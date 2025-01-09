package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to create or update a recurring delivery policy.
 */
public class SellingPlanRecurringDeliveryPolicyInput {
  /**
   * The delivery frequency, it can be either: day, week, month or year.
   */
  private SellingPlanInterval interval;

  /**
   * The number of intervals between deliveries.
   */
  private Integer intervalCount;

  /**
   * The specific anchor dates upon which the delivery interval calculations should be made.
   */
  private List<SellingPlanAnchorInput> anchors;

  /**
   * A buffer period for orders to be included in a cycle.
   */
  private Integer cutoff;

  /**
   * Intention of this delivery policy, it can be either: delivery or fulfillment.
   */
  private SellingPlanRecurringDeliveryPolicyIntent intent;

  /**
   * The pre-anchor behavior. It can be either: asap or next.
   */
  private SellingPlanRecurringDeliveryPolicyPreAnchorBehavior preAnchorBehavior;

  public SellingPlanRecurringDeliveryPolicyInput() {
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
  public Integer getIntervalCount() {
    return intervalCount;
  }

  public void setIntervalCount(Integer intervalCount) {
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

  /**
   * A buffer period for orders to be included in a cycle.
   */
  public Integer getCutoff() {
    return cutoff;
  }

  public void setCutoff(Integer cutoff) {
    this.cutoff = cutoff;
  }

  /**
   * Intention of this delivery policy, it can be either: delivery or fulfillment.
   */
  public SellingPlanRecurringDeliveryPolicyIntent getIntent() {
    return intent;
  }

  public void setIntent(SellingPlanRecurringDeliveryPolicyIntent intent) {
    this.intent = intent;
  }

  /**
   * The pre-anchor behavior. It can be either: asap or next.
   */
  public SellingPlanRecurringDeliveryPolicyPreAnchorBehavior getPreAnchorBehavior() {
    return preAnchorBehavior;
  }

  public void setPreAnchorBehavior(
      SellingPlanRecurringDeliveryPolicyPreAnchorBehavior preAnchorBehavior) {
    this.preAnchorBehavior = preAnchorBehavior;
  }

  @Override
  public String toString() {
    return "SellingPlanRecurringDeliveryPolicyInput{interval='" + interval + "', intervalCount='" + intervalCount + "', anchors='" + anchors + "', cutoff='" + cutoff + "', intent='" + intent + "', preAnchorBehavior='" + preAnchorBehavior + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanRecurringDeliveryPolicyInput that = (SellingPlanRecurringDeliveryPolicyInput) o;
    return Objects.equals(interval, that.interval) &&
        Objects.equals(intervalCount, that.intervalCount) &&
        Objects.equals(anchors, that.anchors) &&
        Objects.equals(cutoff, that.cutoff) &&
        Objects.equals(intent, that.intent) &&
        Objects.equals(preAnchorBehavior, that.preAnchorBehavior);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, intervalCount, anchors, cutoff, intent, preAnchorBehavior);
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
    private Integer intervalCount;

    /**
     * The specific anchor dates upon which the delivery interval calculations should be made.
     */
    private List<SellingPlanAnchorInput> anchors;

    /**
     * A buffer period for orders to be included in a cycle.
     */
    private Integer cutoff;

    /**
     * Intention of this delivery policy, it can be either: delivery or fulfillment.
     */
    private SellingPlanRecurringDeliveryPolicyIntent intent;

    /**
     * The pre-anchor behavior. It can be either: asap or next.
     */
    private SellingPlanRecurringDeliveryPolicyPreAnchorBehavior preAnchorBehavior;

    public SellingPlanRecurringDeliveryPolicyInput build() {
      SellingPlanRecurringDeliveryPolicyInput result = new SellingPlanRecurringDeliveryPolicyInput();
      result.interval = this.interval;
      result.intervalCount = this.intervalCount;
      result.anchors = this.anchors;
      result.cutoff = this.cutoff;
      result.intent = this.intent;
      result.preAnchorBehavior = this.preAnchorBehavior;
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
    public Builder intervalCount(Integer intervalCount) {
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

    /**
     * A buffer period for orders to be included in a cycle.
     */
    public Builder cutoff(Integer cutoff) {
      this.cutoff = cutoff;
      return this;
    }

    /**
     * Intention of this delivery policy, it can be either: delivery or fulfillment.
     */
    public Builder intent(SellingPlanRecurringDeliveryPolicyIntent intent) {
      this.intent = intent;
      return this;
    }

    /**
     * The pre-anchor behavior. It can be either: asap or next.
     */
    public Builder preAnchorBehavior(
        SellingPlanRecurringDeliveryPolicyPreAnchorBehavior preAnchorBehavior) {
      this.preAnchorBehavior = preAnchorBehavior;
      return this;
    }
  }
}
