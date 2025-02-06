package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a refunded duty.
 */
public class RefundDuty {
  /**
   * The amount of a refunded duty in shop and presentment currencies.
   */
  private MoneyBag amountSet;

  /**
   * The duty associated with this refunded duty.
   */
  private Duty originalDuty;

  public RefundDuty() {
  }

  /**
   * The amount of a refunded duty in shop and presentment currencies.
   */
  public MoneyBag getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBag amountSet) {
    this.amountSet = amountSet;
  }

  /**
   * The duty associated with this refunded duty.
   */
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
    /**
     * The amount of a refunded duty in shop and presentment currencies.
     */
    private MoneyBag amountSet;

    /**
     * The duty associated with this refunded duty.
     */
    private Duty originalDuty;

    public RefundDuty build() {
      RefundDuty result = new RefundDuty();
      result.amountSet = this.amountSet;
      result.originalDuty = this.originalDuty;
      return result;
    }

    /**
     * The amount of a refunded duty in shop and presentment currencies.
     */
    public Builder amountSet(MoneyBag amountSet) {
      this.amountSet = amountSet;
      return this;
    }

    /**
     * The duty associated with this refunded duty.
     */
    public Builder originalDuty(Duty originalDuty) {
      this.originalDuty = originalDuty;
      return this;
    }
  }
}
