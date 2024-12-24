package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ShopifyPaymentsPayoutSummary {
  
  private MoneyV2 adjustmentsFee;

  
  private MoneyV2 adjustmentsGross;

  
  private MoneyV2 advanceFees;

  
  private MoneyV2 advanceGross;

  
  private MoneyV2 chargesFee;

  
  private MoneyV2 chargesGross;

  
  private MoneyV2 refundsFee;

  
  private MoneyV2 refundsFeeGross;

  
  private MoneyV2 reservedFundsFee;

  
  private MoneyV2 reservedFundsGross;

  
  private MoneyV2 retriedPayoutsFee;

  
  private MoneyV2 retriedPayoutsGross;

  public ShopifyPaymentsPayoutSummary() {
  }

  
  public MoneyV2 getAdjustmentsFee() {
    return adjustmentsFee;
  }

  public void setAdjustmentsFee(MoneyV2 adjustmentsFee) {
    this.adjustmentsFee = adjustmentsFee;
  }

  
  public MoneyV2 getAdjustmentsGross() {
    return adjustmentsGross;
  }

  public void setAdjustmentsGross(MoneyV2 adjustmentsGross) {
    this.adjustmentsGross = adjustmentsGross;
  }

  
  public MoneyV2 getAdvanceFees() {
    return advanceFees;
  }

  public void setAdvanceFees(MoneyV2 advanceFees) {
    this.advanceFees = advanceFees;
  }

  
  public MoneyV2 getAdvanceGross() {
    return advanceGross;
  }

  public void setAdvanceGross(MoneyV2 advanceGross) {
    this.advanceGross = advanceGross;
  }

  
  public MoneyV2 getChargesFee() {
    return chargesFee;
  }

  public void setChargesFee(MoneyV2 chargesFee) {
    this.chargesFee = chargesFee;
  }

  
  public MoneyV2 getChargesGross() {
    return chargesGross;
  }

  public void setChargesGross(MoneyV2 chargesGross) {
    this.chargesGross = chargesGross;
  }

  
  public MoneyV2 getRefundsFee() {
    return refundsFee;
  }

  public void setRefundsFee(MoneyV2 refundsFee) {
    this.refundsFee = refundsFee;
  }

  
  public MoneyV2 getRefundsFeeGross() {
    return refundsFeeGross;
  }

  public void setRefundsFeeGross(MoneyV2 refundsFeeGross) {
    this.refundsFeeGross = refundsFeeGross;
  }

  
  public MoneyV2 getReservedFundsFee() {
    return reservedFundsFee;
  }

  public void setReservedFundsFee(MoneyV2 reservedFundsFee) {
    this.reservedFundsFee = reservedFundsFee;
  }

  
  public MoneyV2 getReservedFundsGross() {
    return reservedFundsGross;
  }

  public void setReservedFundsGross(MoneyV2 reservedFundsGross) {
    this.reservedFundsGross = reservedFundsGross;
  }

  
  public MoneyV2 getRetriedPayoutsFee() {
    return retriedPayoutsFee;
  }

  public void setRetriedPayoutsFee(MoneyV2 retriedPayoutsFee) {
    this.retriedPayoutsFee = retriedPayoutsFee;
  }

  
  public MoneyV2 getRetriedPayoutsGross() {
    return retriedPayoutsGross;
  }

  public void setRetriedPayoutsGross(MoneyV2 retriedPayoutsGross) {
    this.retriedPayoutsGross = retriedPayoutsGross;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsPayoutSummary{adjustmentsFee='" + adjustmentsFee + "', adjustmentsGross='" + adjustmentsGross + "', advanceFees='" + advanceFees + "', advanceGross='" + advanceGross + "', chargesFee='" + chargesFee + "', chargesGross='" + chargesGross + "', refundsFee='" + refundsFee + "', refundsFeeGross='" + refundsFeeGross + "', reservedFundsFee='" + reservedFundsFee + "', reservedFundsGross='" + reservedFundsGross + "', retriedPayoutsFee='" + retriedPayoutsFee + "', retriedPayoutsGross='" + retriedPayoutsGross + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsPayoutSummary that = (ShopifyPaymentsPayoutSummary) o;
    return Objects.equals(adjustmentsFee, that.adjustmentsFee) &&
        Objects.equals(adjustmentsGross, that.adjustmentsGross) &&
        Objects.equals(advanceFees, that.advanceFees) &&
        Objects.equals(advanceGross, that.advanceGross) &&
        Objects.equals(chargesFee, that.chargesFee) &&
        Objects.equals(chargesGross, that.chargesGross) &&
        Objects.equals(refundsFee, that.refundsFee) &&
        Objects.equals(refundsFeeGross, that.refundsFeeGross) &&
        Objects.equals(reservedFundsFee, that.reservedFundsFee) &&
        Objects.equals(reservedFundsGross, that.reservedFundsGross) &&
        Objects.equals(retriedPayoutsFee, that.retriedPayoutsFee) &&
        Objects.equals(retriedPayoutsGross, that.retriedPayoutsGross);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustmentsFee, adjustmentsGross, advanceFees, advanceGross, chargesFee, chargesGross, refundsFee, refundsFeeGross, reservedFundsFee, reservedFundsGross, retriedPayoutsFee, retriedPayoutsGross);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyV2 adjustmentsFee;

    
    private MoneyV2 adjustmentsGross;

    
    private MoneyV2 advanceFees;

    
    private MoneyV2 advanceGross;

    
    private MoneyV2 chargesFee;

    
    private MoneyV2 chargesGross;

    
    private MoneyV2 refundsFee;

    
    private MoneyV2 refundsFeeGross;

    
    private MoneyV2 reservedFundsFee;

    
    private MoneyV2 reservedFundsGross;

    
    private MoneyV2 retriedPayoutsFee;

    
    private MoneyV2 retriedPayoutsGross;

    public ShopifyPaymentsPayoutSummary build() {
      ShopifyPaymentsPayoutSummary result = new ShopifyPaymentsPayoutSummary();
      result.adjustmentsFee = this.adjustmentsFee;
      result.adjustmentsGross = this.adjustmentsGross;
      result.advanceFees = this.advanceFees;
      result.advanceGross = this.advanceGross;
      result.chargesFee = this.chargesFee;
      result.chargesGross = this.chargesGross;
      result.refundsFee = this.refundsFee;
      result.refundsFeeGross = this.refundsFeeGross;
      result.reservedFundsFee = this.reservedFundsFee;
      result.reservedFundsGross = this.reservedFundsGross;
      result.retriedPayoutsFee = this.retriedPayoutsFee;
      result.retriedPayoutsGross = this.retriedPayoutsGross;
      return result;
    }

    
    public Builder adjustmentsFee(MoneyV2 adjustmentsFee) {
      this.adjustmentsFee = adjustmentsFee;
      return this;
    }

    
    public Builder adjustmentsGross(MoneyV2 adjustmentsGross) {
      this.adjustmentsGross = adjustmentsGross;
      return this;
    }

    
    public Builder advanceFees(MoneyV2 advanceFees) {
      this.advanceFees = advanceFees;
      return this;
    }

    
    public Builder advanceGross(MoneyV2 advanceGross) {
      this.advanceGross = advanceGross;
      return this;
    }

    
    public Builder chargesFee(MoneyV2 chargesFee) {
      this.chargesFee = chargesFee;
      return this;
    }

    
    public Builder chargesGross(MoneyV2 chargesGross) {
      this.chargesGross = chargesGross;
      return this;
    }

    
    public Builder refundsFee(MoneyV2 refundsFee) {
      this.refundsFee = refundsFee;
      return this;
    }

    
    public Builder refundsFeeGross(MoneyV2 refundsFeeGross) {
      this.refundsFeeGross = refundsFeeGross;
      return this;
    }

    
    public Builder reservedFundsFee(MoneyV2 reservedFundsFee) {
      this.reservedFundsFee = reservedFundsFee;
      return this;
    }

    
    public Builder reservedFundsGross(MoneyV2 reservedFundsGross) {
      this.reservedFundsGross = reservedFundsGross;
      return this;
    }

    
    public Builder retriedPayoutsFee(MoneyV2 retriedPayoutsFee) {
      this.retriedPayoutsFee = retriedPayoutsFee;
      return this;
    }

    
    public Builder retriedPayoutsGross(MoneyV2 retriedPayoutsGross) {
      this.retriedPayoutsGross = retriedPayoutsGross;
      return this;
    }
  }
}
