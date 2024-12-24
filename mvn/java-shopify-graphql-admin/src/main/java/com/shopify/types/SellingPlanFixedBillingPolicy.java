package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlanFixedBillingPolicy implements SellingPlanBillingPolicy {
  
  private SellingPlanCheckoutCharge checkoutCharge;

  
  private OffsetDateTime remainingBalanceChargeExactTime;

  
  private String remainingBalanceChargeTimeAfterCheckout;

  
  private SellingPlanRemainingBalanceChargeTrigger remainingBalanceChargeTrigger;

  public SellingPlanFixedBillingPolicy() {
  }

  
  public SellingPlanCheckoutCharge getCheckoutCharge() {
    return checkoutCharge;
  }

  public void setCheckoutCharge(SellingPlanCheckoutCharge checkoutCharge) {
    this.checkoutCharge = checkoutCharge;
  }

  
  public OffsetDateTime getRemainingBalanceChargeExactTime() {
    return remainingBalanceChargeExactTime;
  }

  public void setRemainingBalanceChargeExactTime(OffsetDateTime remainingBalanceChargeExactTime) {
    this.remainingBalanceChargeExactTime = remainingBalanceChargeExactTime;
  }

  
  public String getRemainingBalanceChargeTimeAfterCheckout() {
    return remainingBalanceChargeTimeAfterCheckout;
  }

  public void setRemainingBalanceChargeTimeAfterCheckout(
      String remainingBalanceChargeTimeAfterCheckout) {
    this.remainingBalanceChargeTimeAfterCheckout = remainingBalanceChargeTimeAfterCheckout;
  }

  
  public SellingPlanRemainingBalanceChargeTrigger getRemainingBalanceChargeTrigger() {
    return remainingBalanceChargeTrigger;
  }

  public void setRemainingBalanceChargeTrigger(
      SellingPlanRemainingBalanceChargeTrigger remainingBalanceChargeTrigger) {
    this.remainingBalanceChargeTrigger = remainingBalanceChargeTrigger;
  }

  @Override
  public String toString() {
    return "SellingPlanFixedBillingPolicy{checkoutCharge='" + checkoutCharge + "', remainingBalanceChargeExactTime='" + remainingBalanceChargeExactTime + "', remainingBalanceChargeTimeAfterCheckout='" + remainingBalanceChargeTimeAfterCheckout + "', remainingBalanceChargeTrigger='" + remainingBalanceChargeTrigger + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanFixedBillingPolicy that = (SellingPlanFixedBillingPolicy) o;
    return Objects.equals(checkoutCharge, that.checkoutCharge) &&
        Objects.equals(remainingBalanceChargeExactTime, that.remainingBalanceChargeExactTime) &&
        Objects.equals(remainingBalanceChargeTimeAfterCheckout, that.remainingBalanceChargeTimeAfterCheckout) &&
        Objects.equals(remainingBalanceChargeTrigger, that.remainingBalanceChargeTrigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutCharge, remainingBalanceChargeExactTime, remainingBalanceChargeTimeAfterCheckout, remainingBalanceChargeTrigger);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SellingPlanCheckoutCharge checkoutCharge;

    
    private OffsetDateTime remainingBalanceChargeExactTime;

    
    private String remainingBalanceChargeTimeAfterCheckout;

    
    private SellingPlanRemainingBalanceChargeTrigger remainingBalanceChargeTrigger;

    public SellingPlanFixedBillingPolicy build() {
      SellingPlanFixedBillingPolicy result = new SellingPlanFixedBillingPolicy();
      result.checkoutCharge = this.checkoutCharge;
      result.remainingBalanceChargeExactTime = this.remainingBalanceChargeExactTime;
      result.remainingBalanceChargeTimeAfterCheckout = this.remainingBalanceChargeTimeAfterCheckout;
      result.remainingBalanceChargeTrigger = this.remainingBalanceChargeTrigger;
      return result;
    }

    
    public Builder checkoutCharge(SellingPlanCheckoutCharge checkoutCharge) {
      this.checkoutCharge = checkoutCharge;
      return this;
    }

    
    public Builder remainingBalanceChargeExactTime(OffsetDateTime remainingBalanceChargeExactTime) {
      this.remainingBalanceChargeExactTime = remainingBalanceChargeExactTime;
      return this;
    }

    
    public Builder remainingBalanceChargeTimeAfterCheckout(
        String remainingBalanceChargeTimeAfterCheckout) {
      this.remainingBalanceChargeTimeAfterCheckout = remainingBalanceChargeTimeAfterCheckout;
      return this;
    }

    
    public Builder remainingBalanceChargeTrigger(
        SellingPlanRemainingBalanceChargeTrigger remainingBalanceChargeTrigger) {
      this.remainingBalanceChargeTrigger = remainingBalanceChargeTrigger;
      return this;
    }
  }
}
