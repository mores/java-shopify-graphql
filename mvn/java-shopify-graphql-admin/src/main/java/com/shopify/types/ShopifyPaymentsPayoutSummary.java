package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Breakdown of the total fees and gross of each of the different types of transactions associated
 * with the payout.
 */
public class ShopifyPaymentsPayoutSummary {
  /**
   * Total fees for all adjustments including disputes.
   */
  private MoneyV2 adjustmentsFee;

  /**
   * Total gross amount for all adjustments including disputes.
   */
  private MoneyV2 adjustmentsGross;

  /**
   * Total fees for all advances.
   */
  private MoneyV2 advanceFees;

  /**
   * Total gross amount for all advances.
   */
  private MoneyV2 advanceGross;

  /**
   * Total fees for all charges.
   */
  private MoneyV2 chargesFee;

  /**
   * Total gross amount for all charges.
   */
  private MoneyV2 chargesGross;

  /**
   * Total fees for all refunds.
   */
  private MoneyV2 refundsFee;

  /**
   * Total gross amount for all refunds.
   */
  private MoneyV2 refundsFeeGross;

  /**
   * Total fees for all reserved funds.
   */
  private MoneyV2 reservedFundsFee;

  /**
   * Total gross amount for all reserved funds.
   */
  private MoneyV2 reservedFundsGross;

  /**
   * Total fees for all retried payouts.
   */
  private MoneyV2 retriedPayoutsFee;

  /**
   * Total gross amount for all retried payouts.
   */
  private MoneyV2 retriedPayoutsGross;

  public ShopifyPaymentsPayoutSummary() {
  }

  /**
   * Total fees for all adjustments including disputes.
   */
  public MoneyV2 getAdjustmentsFee() {
    return adjustmentsFee;
  }

  public void setAdjustmentsFee(MoneyV2 adjustmentsFee) {
    this.adjustmentsFee = adjustmentsFee;
  }

  /**
   * Total gross amount for all adjustments including disputes.
   */
  public MoneyV2 getAdjustmentsGross() {
    return adjustmentsGross;
  }

  public void setAdjustmentsGross(MoneyV2 adjustmentsGross) {
    this.adjustmentsGross = adjustmentsGross;
  }

  /**
   * Total fees for all advances.
   */
  public MoneyV2 getAdvanceFees() {
    return advanceFees;
  }

  public void setAdvanceFees(MoneyV2 advanceFees) {
    this.advanceFees = advanceFees;
  }

  /**
   * Total gross amount for all advances.
   */
  public MoneyV2 getAdvanceGross() {
    return advanceGross;
  }

  public void setAdvanceGross(MoneyV2 advanceGross) {
    this.advanceGross = advanceGross;
  }

  /**
   * Total fees for all charges.
   */
  public MoneyV2 getChargesFee() {
    return chargesFee;
  }

  public void setChargesFee(MoneyV2 chargesFee) {
    this.chargesFee = chargesFee;
  }

  /**
   * Total gross amount for all charges.
   */
  public MoneyV2 getChargesGross() {
    return chargesGross;
  }

  public void setChargesGross(MoneyV2 chargesGross) {
    this.chargesGross = chargesGross;
  }

  /**
   * Total fees for all refunds.
   */
  public MoneyV2 getRefundsFee() {
    return refundsFee;
  }

  public void setRefundsFee(MoneyV2 refundsFee) {
    this.refundsFee = refundsFee;
  }

  /**
   * Total gross amount for all refunds.
   */
  public MoneyV2 getRefundsFeeGross() {
    return refundsFeeGross;
  }

  public void setRefundsFeeGross(MoneyV2 refundsFeeGross) {
    this.refundsFeeGross = refundsFeeGross;
  }

  /**
   * Total fees for all reserved funds.
   */
  public MoneyV2 getReservedFundsFee() {
    return reservedFundsFee;
  }

  public void setReservedFundsFee(MoneyV2 reservedFundsFee) {
    this.reservedFundsFee = reservedFundsFee;
  }

  /**
   * Total gross amount for all reserved funds.
   */
  public MoneyV2 getReservedFundsGross() {
    return reservedFundsGross;
  }

  public void setReservedFundsGross(MoneyV2 reservedFundsGross) {
    this.reservedFundsGross = reservedFundsGross;
  }

  /**
   * Total fees for all retried payouts.
   */
  public MoneyV2 getRetriedPayoutsFee() {
    return retriedPayoutsFee;
  }

  public void setRetriedPayoutsFee(MoneyV2 retriedPayoutsFee) {
    this.retriedPayoutsFee = retriedPayoutsFee;
  }

  /**
   * Total gross amount for all retried payouts.
   */
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
    /**
     * Total fees for all adjustments including disputes.
     */
    private MoneyV2 adjustmentsFee;

    /**
     * Total gross amount for all adjustments including disputes.
     */
    private MoneyV2 adjustmentsGross;

    /**
     * Total fees for all advances.
     */
    private MoneyV2 advanceFees;

    /**
     * Total gross amount for all advances.
     */
    private MoneyV2 advanceGross;

    /**
     * Total fees for all charges.
     */
    private MoneyV2 chargesFee;

    /**
     * Total gross amount for all charges.
     */
    private MoneyV2 chargesGross;

    /**
     * Total fees for all refunds.
     */
    private MoneyV2 refundsFee;

    /**
     * Total gross amount for all refunds.
     */
    private MoneyV2 refundsFeeGross;

    /**
     * Total fees for all reserved funds.
     */
    private MoneyV2 reservedFundsFee;

    /**
     * Total gross amount for all reserved funds.
     */
    private MoneyV2 reservedFundsGross;

    /**
     * Total fees for all retried payouts.
     */
    private MoneyV2 retriedPayoutsFee;

    /**
     * Total gross amount for all retried payouts.
     */
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

    /**
     * Total fees for all adjustments including disputes.
     */
    public Builder adjustmentsFee(MoneyV2 adjustmentsFee) {
      this.adjustmentsFee = adjustmentsFee;
      return this;
    }

    /**
     * Total gross amount for all adjustments including disputes.
     */
    public Builder adjustmentsGross(MoneyV2 adjustmentsGross) {
      this.adjustmentsGross = adjustmentsGross;
      return this;
    }

    /**
     * Total fees for all advances.
     */
    public Builder advanceFees(MoneyV2 advanceFees) {
      this.advanceFees = advanceFees;
      return this;
    }

    /**
     * Total gross amount for all advances.
     */
    public Builder advanceGross(MoneyV2 advanceGross) {
      this.advanceGross = advanceGross;
      return this;
    }

    /**
     * Total fees for all charges.
     */
    public Builder chargesFee(MoneyV2 chargesFee) {
      this.chargesFee = chargesFee;
      return this;
    }

    /**
     * Total gross amount for all charges.
     */
    public Builder chargesGross(MoneyV2 chargesGross) {
      this.chargesGross = chargesGross;
      return this;
    }

    /**
     * Total fees for all refunds.
     */
    public Builder refundsFee(MoneyV2 refundsFee) {
      this.refundsFee = refundsFee;
      return this;
    }

    /**
     * Total gross amount for all refunds.
     */
    public Builder refundsFeeGross(MoneyV2 refundsFeeGross) {
      this.refundsFeeGross = refundsFeeGross;
      return this;
    }

    /**
     * Total fees for all reserved funds.
     */
    public Builder reservedFundsFee(MoneyV2 reservedFundsFee) {
      this.reservedFundsFee = reservedFundsFee;
      return this;
    }

    /**
     * Total gross amount for all reserved funds.
     */
    public Builder reservedFundsGross(MoneyV2 reservedFundsGross) {
      this.reservedFundsGross = reservedFundsGross;
      return this;
    }

    /**
     * Total fees for all retried payouts.
     */
    public Builder retriedPayoutsFee(MoneyV2 retriedPayoutsFee) {
      this.retriedPayoutsFee = retriedPayoutsFee;
      return this;
    }

    /**
     * Total gross amount for all retried payouts.
     */
    public Builder retriedPayoutsGross(MoneyV2 retriedPayoutsGross) {
      this.retriedPayoutsGross = retriedPayoutsGross;
      return this;
    }
  }
}
