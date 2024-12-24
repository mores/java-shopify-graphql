package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class SellingPlanFixedBillingPolicyInput {
  
  private SellingPlanRemainingBalanceChargeTrigger remainingBalanceChargeTrigger;

  
  private OffsetDateTime remainingBalanceChargeExactTime;

  
  private String remainingBalanceChargeTimeAfterCheckout;

  
  private SellingPlanCheckoutChargeInput checkoutCharge;

  public SellingPlanFixedBillingPolicyInput() {
  }

  
  public SellingPlanRemainingBalanceChargeTrigger getRemainingBalanceChargeTrigger() {
    return remainingBalanceChargeTrigger;
  }

  public void setRemainingBalanceChargeTrigger(
      SellingPlanRemainingBalanceChargeTrigger remainingBalanceChargeTrigger) {
    this.remainingBalanceChargeTrigger = remainingBalanceChargeTrigger;
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

  
  public SellingPlanCheckoutChargeInput getCheckoutCharge() {
    return checkoutCharge;
  }

  public void setCheckoutCharge(SellingPlanCheckoutChargeInput checkoutCharge) {
    this.checkoutCharge = checkoutCharge;
  }

  @Override
  public String toString() {
    return "SellingPlanFixedBillingPolicyInput{remainingBalanceChargeTrigger='" + remainingBalanceChargeTrigger + "', remainingBalanceChargeExactTime='" + remainingBalanceChargeExactTime + "', remainingBalanceChargeTimeAfterCheckout='" + remainingBalanceChargeTimeAfterCheckout + "', checkoutCharge='" + checkoutCharge + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanFixedBillingPolicyInput that = (SellingPlanFixedBillingPolicyInput) o;
    return Objects.equals(remainingBalanceChargeTrigger, that.remainingBalanceChargeTrigger) &&
        Objects.equals(remainingBalanceChargeExactTime, that.remainingBalanceChargeExactTime) &&
        Objects.equals(remainingBalanceChargeTimeAfterCheckout, that.remainingBalanceChargeTimeAfterCheckout) &&
        Objects.equals(checkoutCharge, that.checkoutCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remainingBalanceChargeTrigger, remainingBalanceChargeExactTime, remainingBalanceChargeTimeAfterCheckout, checkoutCharge);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SellingPlanRemainingBalanceChargeTrigger remainingBalanceChargeTrigger;

    
    private OffsetDateTime remainingBalanceChargeExactTime;

    
    private String remainingBalanceChargeTimeAfterCheckout;

    
    private SellingPlanCheckoutChargeInput checkoutCharge;

    public SellingPlanFixedBillingPolicyInput build() {
      SellingPlanFixedBillingPolicyInput result = new SellingPlanFixedBillingPolicyInput();
      result.remainingBalanceChargeTrigger = this.remainingBalanceChargeTrigger;
      result.remainingBalanceChargeExactTime = this.remainingBalanceChargeExactTime;
      result.remainingBalanceChargeTimeAfterCheckout = this.remainingBalanceChargeTimeAfterCheckout;
      result.checkoutCharge = this.checkoutCharge;
      return result;
    }

    
    public Builder remainingBalanceChargeTrigger(
        SellingPlanRemainingBalanceChargeTrigger remainingBalanceChargeTrigger) {
      this.remainingBalanceChargeTrigger = remainingBalanceChargeTrigger;
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

    
    public Builder checkoutCharge(SellingPlanCheckoutChargeInput checkoutCharge) {
      this.checkoutCharge = checkoutCharge;
      return this;
    }
  }
}
