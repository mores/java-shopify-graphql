package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class RefundDuty {
  
  private MoneyBag amountSet;

  
  private Duty originalDuty;

  public RefundDuty() {
  }

  
  public MoneyBag getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBag amountSet) {
    this.amountSet = amountSet;
  }

  
  public Duty getOriginalDuty() {
    return originalDuty;
  }

  public void setOriginalDuty(Duty originalDuty) {
    this.originalDuty = originalDuty;
  }

  @Override
  public String toString() {
    return "RefundDuty{amountSet='" + amountSet + "', originalDuty='" + originalDuty + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RefundDuty that = (RefundDuty) o;
    return Objects.equals(amountSet, that.amountSet) &&
        Objects.equals(originalDuty, that.originalDuty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountSet, originalDuty);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyBag amountSet;

    
    private Duty originalDuty;

    public RefundDuty build() {
      RefundDuty result = new RefundDuty();
      result.amountSet = this.amountSet;
      result.originalDuty = this.originalDuty;
      return result;
    }

    
    public Builder amountSet(MoneyBag amountSet) {
      this.amountSet = amountSet;
      return this;
    }

    
    public Builder originalDuty(Duty originalDuty) {
      this.originalDuty = originalDuty;
      return this;
    }
  }
}
