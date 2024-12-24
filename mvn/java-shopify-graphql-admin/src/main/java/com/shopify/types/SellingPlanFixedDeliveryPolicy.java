package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlanFixedDeliveryPolicy implements SellingPlanDeliveryPolicy {
  
  private List<SellingPlanAnchor> anchors;

  
  private Integer cutoff;

  
  private OffsetDateTime fulfillmentExactTime;

  
  private SellingPlanFulfillmentTrigger fulfillmentTrigger;

  
  private SellingPlanFixedDeliveryPolicyIntent intent;

  
  private SellingPlanFixedDeliveryPolicyPreAnchorBehavior preAnchorBehavior;

  public SellingPlanFixedDeliveryPolicy() {
  }

  
  public List<SellingPlanAnchor> getAnchors() {
    return anchors;
  }

  public void setAnchors(List<SellingPlanAnchor> anchors) {
    this.anchors = anchors;
  }

  
  public Integer getCutoff() {
    return cutoff;
  }

  public void setCutoff(Integer cutoff) {
    this.cutoff = cutoff;
  }

  
  public OffsetDateTime getFulfillmentExactTime() {
    return fulfillmentExactTime;
  }

  public void setFulfillmentExactTime(OffsetDateTime fulfillmentExactTime) {
    this.fulfillmentExactTime = fulfillmentExactTime;
  }

  
  public SellingPlanFulfillmentTrigger getFulfillmentTrigger() {
    return fulfillmentTrigger;
  }

  public void setFulfillmentTrigger(SellingPlanFulfillmentTrigger fulfillmentTrigger) {
    this.fulfillmentTrigger = fulfillmentTrigger;
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
    
    private List<SellingPlanAnchor> anchors;

    
    private Integer cutoff;

    
    private OffsetDateTime fulfillmentExactTime;

    
    private SellingPlanFulfillmentTrigger fulfillmentTrigger;

    
    private SellingPlanFixedDeliveryPolicyIntent intent;

    
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

    
    public Builder anchors(List<SellingPlanAnchor> anchors) {
      this.anchors = anchors;
      return this;
    }

    
    public Builder cutoff(Integer cutoff) {
      this.cutoff = cutoff;
      return this;
    }

    
    public Builder fulfillmentExactTime(OffsetDateTime fulfillmentExactTime) {
      this.fulfillmentExactTime = fulfillmentExactTime;
      return this;
    }

    
    public Builder fulfillmentTrigger(SellingPlanFulfillmentTrigger fulfillmentTrigger) {
      this.fulfillmentTrigger = fulfillmentTrigger;
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
