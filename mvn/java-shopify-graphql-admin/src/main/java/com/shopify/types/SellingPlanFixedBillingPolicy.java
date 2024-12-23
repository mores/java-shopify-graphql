package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The fixed selling plan billing policy defines how much of the price of the product will be billed to customer
 * at checkout. If there is an outstanding balance, it determines when it will be paid.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlanFixedBillingPolicy implements SellingPlanBillingPolicy {
  /**
   * The checkout charge when the full amount isn't charged at checkout.
   */
  private SellingPlanCheckoutCharge checkoutCharge;

  /**
   * The exact time when to capture the full payment.
   */
  private OffsetDateTime remainingBalanceChargeExactTime;

  /**
   * The period after remaining_balance_charge_trigger, before capturing the full payment. Expressed as an ISO8601 duration.
   */
  private String remainingBalanceChargeTimeAfterCheckout;

  /**
   * When to capture payment for amount due.
   */
  private SellingPlanRemainingBalanceChargeTrigger remainingBalanceChargeTrigger;

  public SellingPlanFixedBillingPolicy() {
  }

  /**
   * The checkout charge when the full amount isn't charged at checkout.
   */
  public SellingPlanCheckoutCharge getCheckoutCharge() {
    return checkoutCharge;
  }

  public void setCheckoutCharge(SellingPlanCheckoutCharge checkoutCharge) {
    this.checkoutCharge = checkoutCharge;
  }

  /**
   * The exact time when to capture the full payment.
   */
  public OffsetDateTime getRemainingBalanceChargeExactTime() {
    return remainingBalanceChargeExactTime;
  }

  public void setRemainingBalanceChargeExactTime(OffsetDateTime remainingBalanceChargeExactTime) {
    this.remainingBalanceChargeExactTime = remainingBalanceChargeExactTime;
  }

  /**
   * The period after remaining_balance_charge_trigger, before capturing the full payment. Expressed as an ISO8601 duration.
   */
  public String getRemainingBalanceChargeTimeAfterCheckout() {
    return remainingBalanceChargeTimeAfterCheckout;
  }

  public void setRemainingBalanceChargeTimeAfterCheckout(
      String remainingBalanceChargeTimeAfterCheckout) {
    this.remainingBalanceChargeTimeAfterCheckout = remainingBalanceChargeTimeAfterCheckout;
  }

  /**
   * When to capture payment for amount due.
   */
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
    /**
     * The checkout charge when the full amount isn't charged at checkout.
     */
    private SellingPlanCheckoutCharge checkoutCharge;

    /**
     * The exact time when to capture the full payment.
     */
    private OffsetDateTime remainingBalanceChargeExactTime;

    /**
     * The period after remaining_balance_charge_trigger, before capturing the full payment. Expressed as an ISO8601 duration.
     */
    private String remainingBalanceChargeTimeAfterCheckout;

    /**
     * When to capture payment for amount due.
     */
    private SellingPlanRemainingBalanceChargeTrigger remainingBalanceChargeTrigger;

    public SellingPlanFixedBillingPolicy build() {
      SellingPlanFixedBillingPolicy result = new SellingPlanFixedBillingPolicy();
      result.checkoutCharge = this.checkoutCharge;
      result.remainingBalanceChargeExactTime = this.remainingBalanceChargeExactTime;
      result.remainingBalanceChargeTimeAfterCheckout = this.remainingBalanceChargeTimeAfterCheckout;
      result.remainingBalanceChargeTrigger = this.remainingBalanceChargeTrigger;
      return result;
    }

    /**
     * The checkout charge when the full amount isn't charged at checkout.
     */
    public Builder checkoutCharge(SellingPlanCheckoutCharge checkoutCharge) {
      this.checkoutCharge = checkoutCharge;
      return this;
    }

    /**
     * The exact time when to capture the full payment.
     */
    public Builder remainingBalanceChargeExactTime(OffsetDateTime remainingBalanceChargeExactTime) {
      this.remainingBalanceChargeExactTime = remainingBalanceChargeExactTime;
      return this;
    }

    /**
     * The period after remaining_balance_charge_trigger, before capturing the full payment. Expressed as an ISO8601 duration.
     */
    public Builder remainingBalanceChargeTimeAfterCheckout(
        String remainingBalanceChargeTimeAfterCheckout) {
      this.remainingBalanceChargeTimeAfterCheckout = remainingBalanceChargeTimeAfterCheckout;
      return this;
    }

    /**
     * When to capture payment for amount due.
     */
    public Builder remainingBalanceChargeTrigger(
        SellingPlanRemainingBalanceChargeTrigger remainingBalanceChargeTrigger) {
      this.remainingBalanceChargeTrigger = remainingBalanceChargeTrigger;
      return this;
    }
  }
}
