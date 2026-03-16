package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a return financial outcome suggested by Shopify based on the items
 * being reimbursed. You can then use the suggested outcome object to generate an
 * actual refund or invoice for the return.
 */
public class SuggestedReturnFinancialOutcome {
  /**
   * The sum of all the discounted prices of the line items being refunded.
   */
  private MoneyBag discountedSubtotal;

  /**
   * The financial transfer details for the return outcome.
   */
  private ReturnOutcomeFinancialTransfer financialTransfer;

  /**
   * The total monetary value available to refund in shop and presentment currencies.
   */
  private MoneyBag maximumRefundable;

  /**
   * A list of duties to be refunded from the order.
   */
  private List<RefundDuty> refundDuties;

  /**
   * The shipping costs to be refunded from the order.
   */
  private ShippingRefund shipping;

  /**
   * The sum of all the additional fees being refunded in shop and presentment currencies. The value must be positive.
   */
  private MoneyBag totalAdditionalFees;

  /**
   * The total cart discount amount that was applied to all line items in this refund.
   */
  private MoneyBag totalCartDiscountAmount;

  /**
   * The sum of all the duties being refunded from the order in shop and presentment currencies. The value must be positive.
   */
  private MoneyBag totalDuties;

  /**
   * The sum of the taxes being refunded in shop and presentment currencies. The value must be positive.
   */
  private MoneyBag totalTax;

  public SuggestedReturnFinancialOutcome() {
  }

  /**
   * The sum of all the discounted prices of the line items being refunded.
   */
  public MoneyBag getDiscountedSubtotal() {
    return discountedSubtotal;
  }

  public void setDiscountedSubtotal(MoneyBag discountedSubtotal) {
    this.discountedSubtotal = discountedSubtotal;
  }

  /**
   * The financial transfer details for the return outcome.
   */
  public ReturnOutcomeFinancialTransfer getFinancialTransfer() {
    return financialTransfer;
  }

  public void setFinancialTransfer(ReturnOutcomeFinancialTransfer financialTransfer) {
    this.financialTransfer = financialTransfer;
  }

  /**
   * The total monetary value available to refund in shop and presentment currencies.
   */
  public MoneyBag getMaximumRefundable() {
    return maximumRefundable;
  }

  public void setMaximumRefundable(MoneyBag maximumRefundable) {
    this.maximumRefundable = maximumRefundable;
  }

  /**
   * A list of duties to be refunded from the order.
   */
  public List<RefundDuty> getRefundDuties() {
    return refundDuties;
  }

  public void setRefundDuties(List<RefundDuty> refundDuties) {
    this.refundDuties = refundDuties;
  }

  /**
   * The shipping costs to be refunded from the order.
   */
  public ShippingRefund getShipping() {
    return shipping;
  }

  public void setShipping(ShippingRefund shipping) {
    this.shipping = shipping;
  }

  /**
   * The sum of all the additional fees being refunded in shop and presentment currencies. The value must be positive.
   */
  public MoneyBag getTotalAdditionalFees() {
    return totalAdditionalFees;
  }

  public void setTotalAdditionalFees(MoneyBag totalAdditionalFees) {
    this.totalAdditionalFees = totalAdditionalFees;
  }

  /**
   * The total cart discount amount that was applied to all line items in this refund.
   */
  public MoneyBag getTotalCartDiscountAmount() {
    return totalCartDiscountAmount;
  }

  public void setTotalCartDiscountAmount(MoneyBag totalCartDiscountAmount) {
    this.totalCartDiscountAmount = totalCartDiscountAmount;
  }

  /**
   * The sum of all the duties being refunded from the order in shop and presentment currencies. The value must be positive.
   */
  public MoneyBag getTotalDuties() {
    return totalDuties;
  }

  public void setTotalDuties(MoneyBag totalDuties) {
    this.totalDuties = totalDuties;
  }

  /**
   * The sum of the taxes being refunded in shop and presentment currencies. The value must be positive.
   */
  public MoneyBag getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(MoneyBag totalTax) {
    this.totalTax = totalTax;
  }

  @Override
  public String toString() {
    return "SuggestedReturnFinancialOutcome{discountedSubtotal='" + discountedSubtotal + "', financialTransfer='" + financialTransfer + "', maximumRefundable='" + maximumRefundable + "', refundDuties='" + refundDuties + "', shipping='" + shipping + "', totalAdditionalFees='" + totalAdditionalFees + "', totalCartDiscountAmount='" + totalCartDiscountAmount + "', totalDuties='" + totalDuties + "', totalTax='" + totalTax + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SuggestedReturnFinancialOutcome that = (SuggestedReturnFinancialOutcome) o;
    return Objects.equals(discountedSubtotal, that.discountedSubtotal) &&
        Objects.equals(financialTransfer, that.financialTransfer) &&
        Objects.equals(maximumRefundable, that.maximumRefundable) &&
        Objects.equals(refundDuties, that.refundDuties) &&
        Objects.equals(shipping, that.shipping) &&
        Objects.equals(totalAdditionalFees, that.totalAdditionalFees) &&
        Objects.equals(totalCartDiscountAmount, that.totalCartDiscountAmount) &&
        Objects.equals(totalDuties, that.totalDuties) &&
        Objects.equals(totalTax, that.totalTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountedSubtotal, financialTransfer, maximumRefundable, refundDuties, shipping, totalAdditionalFees, totalCartDiscountAmount, totalDuties, totalTax);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The sum of all the discounted prices of the line items being refunded.
     */
    private MoneyBag discountedSubtotal;

    /**
     * The financial transfer details for the return outcome.
     */
    private ReturnOutcomeFinancialTransfer financialTransfer;

    /**
     * The total monetary value available to refund in shop and presentment currencies.
     */
    private MoneyBag maximumRefundable;

    /**
     * A list of duties to be refunded from the order.
     */
    private List<RefundDuty> refundDuties;

    /**
     * The shipping costs to be refunded from the order.
     */
    private ShippingRefund shipping;

    /**
     * The sum of all the additional fees being refunded in shop and presentment currencies. The value must be positive.
     */
    private MoneyBag totalAdditionalFees;

    /**
     * The total cart discount amount that was applied to all line items in this refund.
     */
    private MoneyBag totalCartDiscountAmount;

    /**
     * The sum of all the duties being refunded from the order in shop and presentment currencies. The value must be positive.
     */
    private MoneyBag totalDuties;

    /**
     * The sum of the taxes being refunded in shop and presentment currencies. The value must be positive.
     */
    private MoneyBag totalTax;

    public SuggestedReturnFinancialOutcome build() {
      SuggestedReturnFinancialOutcome result = new SuggestedReturnFinancialOutcome();
      result.discountedSubtotal = this.discountedSubtotal;
      result.financialTransfer = this.financialTransfer;
      result.maximumRefundable = this.maximumRefundable;
      result.refundDuties = this.refundDuties;
      result.shipping = this.shipping;
      result.totalAdditionalFees = this.totalAdditionalFees;
      result.totalCartDiscountAmount = this.totalCartDiscountAmount;
      result.totalDuties = this.totalDuties;
      result.totalTax = this.totalTax;
      return result;
    }

    /**
     * The sum of all the discounted prices of the line items being refunded.
     */
    public Builder discountedSubtotal(MoneyBag discountedSubtotal) {
      this.discountedSubtotal = discountedSubtotal;
      return this;
    }

    /**
     * The financial transfer details for the return outcome.
     */
    public Builder financialTransfer(ReturnOutcomeFinancialTransfer financialTransfer) {
      this.financialTransfer = financialTransfer;
      return this;
    }

    /**
     * The total monetary value available to refund in shop and presentment currencies.
     */
    public Builder maximumRefundable(MoneyBag maximumRefundable) {
      this.maximumRefundable = maximumRefundable;
      return this;
    }

    /**
     * A list of duties to be refunded from the order.
     */
    public Builder refundDuties(List<RefundDuty> refundDuties) {
      this.refundDuties = refundDuties;
      return this;
    }

    /**
     * The shipping costs to be refunded from the order.
     */
    public Builder shipping(ShippingRefund shipping) {
      this.shipping = shipping;
      return this;
    }

    /**
     * The sum of all the additional fees being refunded in shop and presentment currencies. The value must be positive.
     */
    public Builder totalAdditionalFees(MoneyBag totalAdditionalFees) {
      this.totalAdditionalFees = totalAdditionalFees;
      return this;
    }

    /**
     * The total cart discount amount that was applied to all line items in this refund.
     */
    public Builder totalCartDiscountAmount(MoneyBag totalCartDiscountAmount) {
      this.totalCartDiscountAmount = totalCartDiscountAmount;
      return this;
    }

    /**
     * The sum of all the duties being refunded from the order in shop and presentment currencies. The value must be positive.
     */
    public Builder totalDuties(MoneyBag totalDuties) {
      this.totalDuties = totalDuties;
      return this;
    }

    /**
     * The sum of the taxes being refunded in shop and presentment currencies. The value must be positive.
     */
    public Builder totalTax(MoneyBag totalTax) {
      this.totalTax = totalTax;
      return this;
    }
  }
}
