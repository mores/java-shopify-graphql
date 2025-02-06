package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to create or update a fixed delivery policy.
 */
public class SellingPlanFixedDeliveryPolicyInput {
  /**
   * The specific anchor dates upon which the delivery interval calculations should be made.
   */
  private List<SellingPlanAnchorInput> anchors;

  /**
   * What triggers the fulfillment.
   */
  private SellingPlanFulfillmentTrigger fulfillmentTrigger;

  /**
   * The date and time when the fulfillment should trigger.
   */
  private OffsetDateTime fulfillmentExactTime;

  /**
   * A buffer period for orders to be included in a cycle.
   */
  private Integer cutoff;

  /**
   * Whether the delivery policy is merchant or buyer-centric.
   */
  private SellingPlanFixedDeliveryPolicyIntent intent;

  /**
   * The pre-anchor behavior.
   */
  private SellingPlanFixedDeliveryPolicyPreAnchorBehavior preAnchorBehavior;

  public SellingPlanFixedDeliveryPolicyInput() {
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
   * What triggers the fulfillment.
   */
  public SellingPlanFulfillmentTrigger getFulfillmentTrigger() {
    return fulfillmentTrigger;
  }

  public void setFulfillmentTrigger(SellingPlanFulfillmentTrigger fulfillmentTrigger) {
    this.fulfillmentTrigger = fulfillmentTrigger;
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
   * A buffer period for orders to be included in a cycle.
   */
  public Integer getCutoff() {
    return cutoff;
  }

  public void setCutoff(Integer cutoff) {
    this.cutoff = cutoff;
  }

  /**
   * Whether the delivery policy is merchant or buyer-centric.
   */
  public SellingPlanFixedDeliveryPolicyIntent getIntent() {
    return intent;
  }

  public void setIntent(SellingPlanFixedDeliveryPolicyIntent intent) {
    this.intent = intent;
  }

  /**
   * The pre-anchor behavior.
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
    return "SellingPlanFixedDeliveryPolicyInput{anchors='" + anchors + "', fulfillmentTrigger='" + fulfillmentTrigger + "', fulfillmentExactTime='" + fulfillmentExactTime + "', cutoff='" + cutoff + "', intent='" + intent + "', preAnchorBehavior='" + preAnchorBehavior + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanFixedDeliveryPolicyInput that = (SellingPlanFixedDeliveryPolicyInput) o;
    return Objects.equals(anchors, that.anchors) &&
        Objects.equals(fulfillmentTrigger, that.fulfillmentTrigger) &&
        Objects.equals(fulfillmentExactTime, that.fulfillmentExactTime) &&
        Objects.equals(cutoff, that.cutoff) &&
        Objects.equals(intent, that.intent) &&
        Objects.equals(preAnchorBehavior, that.preAnchorBehavior);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchors, fulfillmentTrigger, fulfillmentExactTime, cutoff, intent, preAnchorBehavior);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The specific anchor dates upon which the delivery interval calculations should be made.
     */
    private List<SellingPlanAnchorInput> anchors;

    /**
     * What triggers the fulfillment.
     */
    private SellingPlanFulfillmentTrigger fulfillmentTrigger;

    /**
     * The date and time when the fulfillment should trigger.
     */
    private OffsetDateTime fulfillmentExactTime;

    /**
     * A buffer period for orders to be included in a cycle.
     */
    private Integer cutoff;

    /**
     * Whether the delivery policy is merchant or buyer-centric.
     */
    private SellingPlanFixedDeliveryPolicyIntent intent;

    /**
     * The pre-anchor behavior.
     */
    private SellingPlanFixedDeliveryPolicyPreAnchorBehavior preAnchorBehavior;

    public SellingPlanFixedDeliveryPolicyInput build() {
      SellingPlanFixedDeliveryPolicyInput result = new SellingPlanFixedDeliveryPolicyInput();
      result.anchors = this.anchors;
      result.fulfillmentTrigger = this.fulfillmentTrigger;
      result.fulfillmentExactTime = this.fulfillmentExactTime;
      result.cutoff = this.cutoff;
      result.intent = this.intent;
      result.preAnchorBehavior = this.preAnchorBehavior;
      return result;
    }

    /**
     * The specific anchor dates upon which the delivery interval calculations should be made.
     */
    public Builder anchors(List<SellingPlanAnchorInput> anchors) {
      this.anchors = anchors;
      return this;
    }

    /**
     * What triggers the fulfillment.
     */
    public Builder fulfillmentTrigger(SellingPlanFulfillmentTrigger fulfillmentTrigger) {
      this.fulfillmentTrigger = fulfillmentTrigger;
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
     * A buffer period for orders to be included in a cycle.
     */
    public Builder cutoff(Integer cutoff) {
      this.cutoff = cutoff;
      return this;
    }

    /**
     * Whether the delivery policy is merchant or buyer-centric.
     */
    public Builder intent(SellingPlanFixedDeliveryPolicyIntent intent) {
      this.intent = intent;
      return this;
    }

    /**
     * The pre-anchor behavior.
     */
    public Builder preAnchorBehavior(
        SellingPlanFixedDeliveryPolicyPreAnchorBehavior preAnchorBehavior) {
      this.preAnchorBehavior = preAnchorBehavior;
      return this;
    }
  }
}
