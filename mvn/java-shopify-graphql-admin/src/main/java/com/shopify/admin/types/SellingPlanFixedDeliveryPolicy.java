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
 * Represents a fixed selling plan delivery policy.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlanFixedDeliveryPolicy implements SellingPlanDeliveryPolicy {
  /**
   * The specific anchor dates upon which the delivery interval calculations should be made.
   */
  private List<SellingPlanAnchor> anchors;

  /**
   * A buffer period for orders to be included in next fulfillment anchor.
   */
  private Integer cutoff;

  /**
   * The date and time when the fulfillment should trigger.
   */
  private OffsetDateTime fulfillmentExactTime;

  /**
   * What triggers the fulfillment. The value must be one of ANCHOR, ASAP, EXACT_TIME, or UNKNOWN.
   */
  private SellingPlanFulfillmentTrigger fulfillmentTrigger;

  /**
   * Whether the delivery policy is merchant or buyer-centric.
   * Buyer-centric delivery policies state the time when the buyer will receive the goods.
   * Merchant-centric delivery policies state the time when the fulfillment should be started.
   * Currently, only merchant-centric delivery policies are supported.
   */
  private SellingPlanFixedDeliveryPolicyIntent intent;

  /**
   * The fulfillment or delivery behavior of the first fulfillment when the order
   * is placed before the anchor. The default value for this field is `ASAP`.
   */
  private SellingPlanFixedDeliveryPolicyPreAnchorBehavior preAnchorBehavior;

  public SellingPlanFixedDeliveryPolicy() {
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
   * A buffer period for orders to be included in next fulfillment anchor.
   */
  public Integer getCutoff() {
    return cutoff;
  }

  public void setCutoff(Integer cutoff) {
    this.cutoff = cutoff;
  }

  /**
   * The date and time when the fulfillment should trigger.
   */
  public OffsetDateTime getFulfillmentExactTime() {
    return fulfillmentExactTime;
  }

  public void setFulfillmentExactTime(OffsetDateTime fulfillmentExactTime) {
    this.fulfillmentExactTime = fulfillmentExactTime;
  }

  /**
   * What triggers the fulfillment. The value must be one of ANCHOR, ASAP, EXACT_TIME, or UNKNOWN.
   */
  public SellingPlanFulfillmentTrigger getFulfillmentTrigger() {
    return fulfillmentTrigger;
  }

  public void setFulfillmentTrigger(SellingPlanFulfillmentTrigger fulfillmentTrigger) {
    this.fulfillmentTrigger = fulfillmentTrigger;
  }

  /**
   * Whether the delivery policy is merchant or buyer-centric.
   * Buyer-centric delivery policies state the time when the buyer will receive the goods.
   * Merchant-centric delivery policies state the time when the fulfillment should be started.
   * Currently, only merchant-centric delivery policies are supported.
   */
  public SellingPlanFixedDeliveryPolicyIntent getIntent() {
    return intent;
  }

  public void setIntent(SellingPlanFixedDeliveryPolicyIntent intent) {
    this.intent = intent;
  }

  /**
   * The fulfillment or delivery behavior of the first fulfillment when the order
   * is placed before the anchor. The default value for this field is `ASAP`.
   */
  public SellingPlanFixedDeliveryPolicyPreAnchorBehavior getPreAnchorBehavior() {
    return preAnchorBehavior;
  }

  public void setPreAnchorBehavior(
      SellingPlanFixedDeliveryPolicyPreAnchorBehavior preAnchorBehavior) {
    this.preAnchorBehavior = preAnchorBehavior;
  }

  @Override
  public String toString() {
    return "SellingPlanFixedDeliveryPolicy{anchors='" + anchors + "', cutoff='" + cutoff + "', fulfillmentExactTime='" + fulfillmentExactTime + "', fulfillmentTrigger='" + fulfillmentTrigger + "', intent='" + intent + "', preAnchorBehavior='" + preAnchorBehavior + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanFixedDeliveryPolicy that = (SellingPlanFixedDeliveryPolicy) o;
    return Objects.equals(anchors, that.anchors) &&
        Objects.equals(cutoff, that.cutoff) &&
        Objects.equals(fulfillmentExactTime, that.fulfillmentExactTime) &&
        Objects.equals(fulfillmentTrigger, that.fulfillmentTrigger) &&
        Objects.equals(intent, that.intent) &&
        Objects.equals(preAnchorBehavior, that.preAnchorBehavior);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchors, cutoff, fulfillmentExactTime, fulfillmentTrigger, intent, preAnchorBehavior);
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
     * A buffer period for orders to be included in next fulfillment anchor.
     */
    private Integer cutoff;

    /**
     * The date and time when the fulfillment should trigger.
     */
    private OffsetDateTime fulfillmentExactTime;

    /**
     * What triggers the fulfillment. The value must be one of ANCHOR, ASAP, EXACT_TIME, or UNKNOWN.
     */
    private SellingPlanFulfillmentTrigger fulfillmentTrigger;

    /**
     * Whether the delivery policy is merchant or buyer-centric.
     * Buyer-centric delivery policies state the time when the buyer will receive the goods.
     * Merchant-centric delivery policies state the time when the fulfillment should be started.
     * Currently, only merchant-centric delivery policies are supported.
     */
    private SellingPlanFixedDeliveryPolicyIntent intent;

    /**
     * The fulfillment or delivery behavior of the first fulfillment when the order
     * is placed before the anchor. The default value for this field is `ASAP`.
     */
    private SellingPlanFixedDeliveryPolicyPreAnchorBehavior preAnchorBehavior;

    public SellingPlanFixedDeliveryPolicy build() {
      SellingPlanFixedDeliveryPolicy result = new SellingPlanFixedDeliveryPolicy();
      result.anchors = this.anchors;
      result.cutoff = this.cutoff;
      result.fulfillmentExactTime = this.fulfillmentExactTime;
      result.fulfillmentTrigger = this.fulfillmentTrigger;
      result.intent = this.intent;
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
     * A buffer period for orders to be included in next fulfillment anchor.
     */
    public Builder cutoff(Integer cutoff) {
      this.cutoff = cutoff;
      return this;
    }

    /**
     * The date and time when the fulfillment should trigger.
     */
    public Builder fulfillmentExactTime(OffsetDateTime fulfillmentExactTime) {
      this.fulfillmentExactTime = fulfillmentExactTime;
      return this;
    }

    /**
     * What triggers the fulfillment. The value must be one of ANCHOR, ASAP, EXACT_TIME, or UNKNOWN.
     */
    public Builder fulfillmentTrigger(SellingPlanFulfillmentTrigger fulfillmentTrigger) {
      this.fulfillmentTrigger = fulfillmentTrigger;
      return this;
    }

    /**
     * Whether the delivery policy is merchant or buyer-centric.
     * Buyer-centric delivery policies state the time when the buyer will receive the goods.
     * Merchant-centric delivery policies state the time when the fulfillment should be started.
     * Currently, only merchant-centric delivery policies are supported.
     */
    public Builder intent(SellingPlanFixedDeliveryPolicyIntent intent) {
      this.intent = intent;
      return this;
    }

    /**
     * The fulfillment or delivery behavior of the first fulfillment when the order
     * is placed before the anchor. The default value for this field is `ASAP`.
     */
    public Builder preAnchorBehavior(
        SellingPlanFixedDeliveryPolicyPreAnchorBehavior preAnchorBehavior) {
      this.preAnchorBehavior = preAnchorBehavior;
      return this;
    }
  }
}
