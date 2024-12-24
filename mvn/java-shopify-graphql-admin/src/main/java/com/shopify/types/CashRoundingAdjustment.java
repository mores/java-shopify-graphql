package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CashRoundingAdjustment {
  
  private MoneyBag paymentSet;

  
  private MoneyBag refundSet;

  public CashRoundingAdjustment() {
  }

  
  public MoneyBag getPaymentSet() {
    return paymentSet;
  }

  public void setPaymentSet(MoneyBag paymentSet) {
    this.paymentSet = paymentSet;
  }

  
  public MoneyBag getRefundSet() {
    return refundSet;
  }

  public void setRefundSet(MoneyBag refundSet) {
    this.refundSet = refundSet;
  }

  @Override
  public String toString() {
    return "CashRoundingAdjustment{paymentSet='" + paymentSet + "', refundSet='" + refundSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CashRoundingAdjustment that = (CashRoundingAdjustment) o;
    return Objects.equals(paymentSet, that.paymentSet) &&
        Objects.equals(refundSet, that.refundSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentSet, refundSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyBag paymentSet;

    
    private MoneyBag refundSet;

    public CashRoundingAdjustment build() {
      CashRoundingAdjustment result = new CashRoundingAdjustment();
      result.paymentSet = this.paymentSet;
      result.refundSet = this.refundSet;
      return result;
    }

    
    public Builder paymentSet(MoneyBag paymentSet) {
      this.paymentSet = paymentSet;
      return this;
    }

    
    public Builder refundSet(MoneyBag refundSet) {
      this.refundSet = refundSet;
      return this;
    }
  }
}
