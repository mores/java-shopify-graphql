package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields required to create or update a fixed billing policy.
 */
public class SellingPlanFixedBillingPolicyInput {
  /**
   * When to capture the payment for the amount due.
   */
  private SellingPlanRemainingBalanceChargeTrigger remainingBalanceChargeTrigger;

  /**
   * The date and time to capture the full payment.
   */
  private OffsetDateTime remainingBalanceChargeExactTime;

  /**
   * The period after capturing the payment for the amount due
   * (`remainingBalanceChargeTrigger`), and before capturing the full payment.
   * Expressed as an ISO8601 duration.
   */
  private String remainingBalanceChargeTimeAfterCheckout;

  /**
   * The checkout charge policy for the selling plan.
   */
  private SellingPlanCheckoutChargeInput checkoutCharge;

  public SellingPlanFixedBillingPolicyInput() {
  }

  /**
   * When to capture the payment for the amount due.
   */
  public SellingPlanRemainingBalanceChargeTrigger getRemainingBalanceChargeTrigger() {
    return remainingBalanceChargeTrigger;
  }

  public void setRemainingBalanceChargeTrigger(
      SellingPlanRemainingBalanceChargeTrigger remainingBalanceChargeTrigger) {
    this.remainingBalanceChargeTrigger = remainingBalanceChargeTrigger;
  }

  /**
   * The date and time to capture the full payment.
   */
  public OffsetDateTime getRemainingBalanceChargeExactTime() {
    return remainingBalanceChargeExactTime;
  }

  public void setRemainingBalanceChargeExactTime(OffsetDateTime remainingBalanceChargeExactTime) {
    this.remainingBalanceChargeExactTime = remainingBalanceChargeExactTime;
  }

  /**
   * The period after capturing the payment for the amount due
   * (`remainingBalanceChargeTrigger`), and before capturing the full payment.
   * Expressed as an ISO8601 duration.
   */
  public String getRemainingBalanceChargeTimeAfterCheckout() {
    return remainingBalanceChargeTimeAfterCheckout;
  }

  public void setRemainingBalanceChargeTimeAfterCheckout(
      String remainingBalanceChargeTimeAfterCheckout) {
    this.remainingBalanceChargeTimeAfterCheckout = remainingBalanceChargeTimeAfterCheckout;
  }

  /**
   * The checkout charge policy for the selling plan.
   */
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
    /**
     * When to capture the payment for the amount due.
     */
    private SellingPlanRemainingBalanceChargeTrigger remainingBalanceChargeTrigger;

    /**
     * The date and time to capture the full payment.
     */
    private OffsetDateTime remainingBalanceChargeExactTime;

    /**
     * The period after capturing the payment for the amount due
     * (`remainingBalanceChargeTrigger`), and before capturing the full payment.
     * Expressed as an ISO8601 duration.
     */
    private String remainingBalanceChargeTimeAfterCheckout;

    /**
     * The checkout charge policy for the selling plan.
     */
    private SellingPlanCheckoutChargeInput checkoutCharge;

    public SellingPlanFixedBillingPolicyInput build() {
      SellingPlanFixedBillingPolicyInput result = new SellingPlanFixedBillingPolicyInput();
      result.remainingBalanceChargeTrigger = this.remainingBalanceChargeTrigger;
      result.remainingBalanceChargeExactTime = this.remainingBalanceChargeExactTime;
      result.remainingBalanceChargeTimeAfterCheckout = this.remainingBalanceChargeTimeAfterCheckout;
      result.checkoutCharge = this.checkoutCharge;
      return result;
    }

    /**
     * When to capture the payment for the amount due.
     */
    public Builder remainingBalanceChargeTrigger(
        SellingPlanRemainingBalanceChargeTrigger remainingBalanceChargeTrigger) {
      this.remainingBalanceChargeTrigger = remainingBalanceChargeTrigger;
      return this;
    }

    /**
     * The date and time to capture the full payment.
     */
    public Builder remainingBalanceChargeExactTime(OffsetDateTime remainingBalanceChargeExactTime) {
      this.remainingBalanceChargeExactTime = remainingBalanceChargeExactTime;
      return this;
    }

    /**
     * The period after capturing the payment for the amount due
     * (`remainingBalanceChargeTrigger`), and before capturing the full payment.
     * Expressed as an ISO8601 duration.
     */
    public Builder remainingBalanceChargeTimeAfterCheckout(
        String remainingBalanceChargeTimeAfterCheckout) {
      this.remainingBalanceChargeTimeAfterCheckout = remainingBalanceChargeTimeAfterCheckout;
      return this;
    }

    /**
     * The checkout charge policy for the selling plan.
     */
    public Builder checkoutCharge(SellingPlanCheckoutChargeInput checkoutCharge) {
      this.checkoutCharge = checkoutCharge;
      return this;
    }
  }
}
