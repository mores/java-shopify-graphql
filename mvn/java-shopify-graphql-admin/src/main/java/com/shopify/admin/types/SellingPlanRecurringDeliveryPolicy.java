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
 * Represents a recurring selling plan delivery policy.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlanRecurringDeliveryPolicy implements SellingPlanDeliveryPolicy {
  /**
   * The specific anchor dates upon which the delivery interval calculations should be made.
   */
  private List<SellingPlanAnchor> anchors;

  /**
   * The date and time when the selling plan delivery policy was created.
   */
  private OffsetDateTime createdAt;

  /**
   * Number of days which represent a buffer period for orders to be included in a cycle.
   */
  private Integer cutoff;

  /**
   * Whether the delivery policy is merchant or buyer-centric.
   * Buyer-centric delivery policies state the time when the buyer will receive the goods.
   * Merchant-centric delivery policies state the time when the fulfillment should be started.
   * Currently, only merchant-centric delivery policies are supported.
   */
  private SellingPlanRecurringDeliveryPolicyIntent intent;

  /**
   * The delivery frequency, it can be either: day, week, month or year.
   */
  private SellingPlanInterval interval;

  /**
   * The number of intervals between deliveries.
   */
  private int intervalCount;

  /**
   * The fulfillment or delivery behavior of the first fulfillment when the order
   * is placed before the anchor. The default value for this field is `ASAP`.
   */
  private SellingPlanRecurringDeliveryPolicyPreAnchorBehavior preAnchorBehavior;

  public SellingPlanRecurringDeliveryPolicy() {
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
   * The date and time when the selling plan delivery policy was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Number of days which represent a buffer period for orders to be included in a cycle.
   */
  public Integer getCutoff() {
    return cutoff;
  }

  public void setCutoff(Integer cutoff) {
    this.cutoff = cutoff;
  }

  /**
   * Whether the delivery policy is merchant or buyer-centric.
   * Buyer-centric delivery policies state the time when the buyer will receive the goods.
   * Merchant-centric delivery policies state the time when the fulfillment should be started.
   * Currently, only merchant-centric delivery policies are supported.
   */
  public SellingPlanRecurringDeliveryPolicyIntent getIntent() {
    return intent;
  }

  public void setIntent(SellingPlanRecurringDeliveryPolicyIntent intent) {
    this.intent = intent;
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

  /**
   * The fulfillment or delivery behavior of the first fulfillment when the order
   * is placed before the anchor. The default value for this field is `ASAP`.
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
    return "SellingPlanRecurringDeliveryPolicy{anchors='" + anchors + "', createdAt='" + createdAt + "', cutoff='" + cutoff + "', intent='" + intent + "', interval='" + interval + "', intervalCount='" + intervalCount + "', preAnchorBehavior='" + preAnchorBehavior + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanRecurringDeliveryPolicy that = (SellingPlanRecurringDeliveryPolicy) o;
    return Objects.equals(anchors, that.anchors) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(cutoff, that.cutoff) &&
        Objects.equals(intent, that.intent) &&
        Objects.equals(interval, that.interval) &&
        intervalCount == that.intervalCount &&
        Objects.equals(preAnchorBehavior, that.preAnchorBehavior);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchors, createdAt, cutoff, intent, interval, intervalCount, preAnchorBehavior);
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
     * The date and time when the selling plan delivery policy was created.
     */
    private OffsetDateTime createdAt;

    /**
     * Number of days which represent a buffer period for orders to be included in a cycle.
     */
    private Integer cutoff;

    /**
     * Whether the delivery policy is merchant or buyer-centric.
     * Buyer-centric delivery policies state the time when the buyer will receive the goods.
     * Merchant-centric delivery policies state the time when the fulfillment should be started.
     * Currently, only merchant-centric delivery policies are supported.
     */
    private SellingPlanRecurringDeliveryPolicyIntent intent;

    /**
     * The delivery frequency, it can be either: day, week, month or year.
     */
    private SellingPlanInterval interval;

    /**
     * The number of intervals between deliveries.
     */
    private int intervalCount;

    /**
     * The fulfillment or delivery behavior of the first fulfillment when the order
     * is placed before the anchor. The default value for this field is `ASAP`.
     */
    private SellingPlanRecurringDeliveryPolicyPreAnchorBehavior preAnchorBehavior;

    public SellingPlanRecurringDeliveryPolicy build() {
      SellingPlanRecurringDeliveryPolicy result = new SellingPlanRecurringDeliveryPolicy();
      result.anchors = this.anchors;
      result.createdAt = this.createdAt;
      result.cutoff = this.cutoff;
      result.intent = this.intent;
      result.interval = this.interval;
      result.intervalCount = this.intervalCount;
      result.preAnchorBehavior = this.preAnchorBehavior;
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
     * The date and time when the selling plan delivery policy was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * Number of days which represent a buffer period for orders to be included in a cycle.
     */
    public Builder cutoff(Integer cutoff) {
      this.cutoff = cutoff;
      return this;
    }

    /**
     * Whether the delivery policy is merchant or buyer-centric.
     * Buyer-centric delivery policies state the time when the buyer will receive the goods.
     * Merchant-centric delivery policies state the time when the fulfillment should be started.
     * Currently, only merchant-centric delivery policies are supported.
     */
    public Builder intent(SellingPlanRecurringDeliveryPolicyIntent intent) {
      this.intent = intent;
      return this;
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

    /**
     * The fulfillment or delivery behavior of the first fulfillment when the order
     * is placed before the anchor. The default value for this field is `ASAP`.
     */
    public Builder preAnchorBehavior(
        SellingPlanRecurringDeliveryPolicyPreAnchorBehavior preAnchorBehavior) {
      this.preAnchorBehavior = preAnchorBehavior;
      return this;
    }
  }
}
