package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The rounding adjustment applied to total payment or refund received for an Order involving cash payments.
 */
public class CashRoundingAdjustment {
  /**
   * The rounding adjustment that can be applied to totalReceived for an Order
   * involving cash payments in shop and presentment currencies. Could be a
   * positive or negative value. Value is 0 if there's no rounding, or for non-cash payments.
   */
  private MoneyBag paymentSet;

  /**
   * The rounding adjustment that can be applied to totalRefunded for an Order
   * involving cash payments in shop and presentment currencies. Could be a
   * positive or negative value. Value is 0 if there's no rounding, or for non-cash refunds.
   */
  private MoneyBag refundSet;

  public CashRoundingAdjustment() {
  }

  /**
   * The rounding adjustment that can be applied to totalReceived for an Order
   * involving cash payments in shop and presentment currencies. Could be a
   * positive or negative value. Value is 0 if there's no rounding, or for non-cash payments.
   */
  public MoneyBag getPaymentSet() {
    return paymentSet;
  }

  public void setPaymentSet(MoneyBag paymentSet) {
    this.paymentSet = paymentSet;
  }

  /**
   * The rounding adjustment that can be applied to totalRefunded for an Order
   * involving cash payments in shop and presentment currencies. Could be a
   * positive or negative value. Value is 0 if there's no rounding, or for non-cash refunds.
   */
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
    /**
     * The rounding adjustment that can be applied to totalReceived for an Order
     * involving cash payments in shop and presentment currencies. Could be a
     * positive or negative value. Value is 0 if there's no rounding, or for non-cash payments.
     */
    private MoneyBag paymentSet;

    /**
     * The rounding adjustment that can be applied to totalRefunded for an Order
     * involving cash payments in shop and presentment currencies. Could be a
     * positive or negative value. Value is 0 if there's no rounding, or for non-cash refunds.
     */
    private MoneyBag refundSet;

    public CashRoundingAdjustment build() {
      CashRoundingAdjustment result = new CashRoundingAdjustment();
      result.paymentSet = this.paymentSet;
      result.refundSet = this.refundSet;
      return result;
    }

    /**
     * The rounding adjustment that can be applied to totalReceived for an Order
     * involving cash payments in shop and presentment currencies. Could be a
     * positive or negative value. Value is 0 if there's no rounding, or for non-cash payments.
     */
    public Builder paymentSet(MoneyBag paymentSet) {
      this.paymentSet = paymentSet;
      return this;
    }

    /**
     * The rounding adjustment that can be applied to totalRefunded for an Order
     * involving cash payments in shop and presentment currencies. Could be a
     * positive or negative value. Value is 0 if there's no rounding, or for non-cash refunds.
     */
    public Builder refundSet(MoneyBag refundSet) {
      this.refundSet = refundSet;
      return this;
    }
  }
}
