package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


public class SellingPlanFixedDeliveryPolicyInput {
  
  private List<SellingPlanAnchorInput> anchors;

  
  private SellingPlanFulfillmentTrigger fulfillmentTrigger;

  
  private OffsetDateTime fulfillmentExactTime;

  
  private Integer cutoff;

  
  private SellingPlanFixedDeliveryPolicyIntent intent;

  
  private SellingPlanFixedDeliveryPolicyPreAnchorBehavior preAnchorBehavior;

  public SellingPlanFixedDeliveryPolicyInput() {
  }

  
  public List<SellingPlanAnchorInput> getAnchors() {
    return anchors;
  }

  public void setAnchors(List<SellingPlanAnchorInput> anchors) {
    this.anchors = anchors;
  }

  
  public SellingPlanFulfillmentTrigger getFulfillmentTrigger() {
    return fulfillmentTrigger;
  }

  public void setFulfillmentTrigger(SellingPlanFulfillmentTrigger fulfillmentTrigger) {
    this.fulfillmentTrigger = fulfillmentTrigger;
  }

  
  public OffsetDateTime getFulfillmentExactTime() {
    return fulfillmentExactTime;
  }

  public void setFulfillmentExactTime(OffsetDateTime fulfillmentExactTime) {
    this.fulfillmentExactTime = fulfillmentExactTime;
  }

  
  public Integer getCutoff() {
    return cutoff;
  }

  public void setCutoff(Integer cutoff) {
    this.cutoff = cutoff;
  }

  
  public SellingPlanFixedDeliveryPolicyIntent getIntent() {
    return intent;
  }

  public void setIntent(SellingPlanFixedDeliveryPolicyIntent intent) {
    this.intent = intent;
  }

  
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
    
    private List<SellingPlanAnchorInput> anchors;

    
    private SellingPlanFulfillmentTrigger fulfillmentTrigger;

    
    private OffsetDateTime fulfillmentExactTime;

    
    private Integer cutoff;

    
    private SellingPlanFixedDeliveryPolicyIntent intent;

    
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

    
    public Builder anchors(List<SellingPlanAnchorInput> anchors) {
      this.anchors = anchors;
      return this;
    }

    
    public Builder fulfillmentTrigger(SellingPlanFulfillmentTrigger fulfillmentTrigger) {
      this.fulfillmentTrigger = fulfillmentTrigger;
      return this;
    }

    
    public Builder fulfillmentExactTime(OffsetDateTime fulfillmentExactTime) {
      this.fulfillmentExactTime = fulfillmentExactTime;
      return this;
    }

    
    public Builder cutoff(Integer cutoff) {
      this.cutoff = cutoff;
      return this;
    }

    
    public Builder intent(SellingPlanFixedDeliveryPolicyIntent intent) {
      this.intent = intent;
      return this;
    }

    
    public Builder preAnchorBehavior(
        SellingPlanFixedDeliveryPolicyPreAnchorBehavior preAnchorBehavior) {
      this.preAnchorBehavior = preAnchorBehavior;
      return this;
    }
  }
}
