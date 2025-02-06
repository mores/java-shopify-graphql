package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a return refund suggested by Shopify based on the items being
 * reimbursed. You can then use the suggested refund object to generate an actual
 * refund for the return.
 */
public class SuggestedReturnRefund {
  /**
   * The total monetary value to be refunded in shop and presentment currencies.
   */
  private MoneyBag amount;

  /**
   * The sum of all the discounted prices of the line items being refunded.
   */
  private MoneyBag discountedSubtotal;

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
   * The sum of all the prices of the line items being refunded in shop and presentment currencies.
   */
  private MoneyBag subtotal;

  /**
   * A list of suggested order transactions.
   */
  private List<SuggestedOrderTransaction> suggestedTransactions;

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

  public SuggestedReturnRefund() {
  }

  /**
   * The total monetary value to be refunded in shop and presentment currencies.
   */
  public MoneyBag getAmount() {
    return amount;
  }

  public void setAmount(MoneyBag amount) {
    this.amount = amount;
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
   * The sum of all the prices of the line items being refunded in shop and presentment currencies.
   */
  public MoneyBag getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(MoneyBag subtotal) {
    this.subtotal = subtotal;
  }

  /**
   * A list of suggested order transactions.
   */
  public List<SuggestedOrderTransaction> getSuggestedTransactions() {
    return suggestedTransactions;
  }

  public void setSuggestedTransactions(List<SuggestedOrderTransaction> suggestedTransactions) {
    this.suggestedTransactions = suggestedTransactions;
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
    return "SuggestedReturnRefund{amount='" + amount + "', discountedSubtotal='" + discountedSubtotal + "', maximumRefundable='" + maximumRefundable + "', refundDuties='" + refundDuties + "', shipping='" + shipping + "', subtotal='" + subtotal + "', suggestedTransactions='" + suggestedTransactions + "', totalCartDiscountAmount='" + totalCartDiscountAmount + "', totalDuties='" + totalDuties + "', totalTax='" + totalTax + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SuggestedReturnRefund that = (SuggestedReturnRefund) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(discountedSubtotal, that.discountedSubtotal) &&
        Objects.equals(maximumRefundable, that.maximumRefundable) &&
        Objects.equals(refundDuties, that.refundDuties) &&
        Objects.equals(shipping, that.shipping) &&
        Objects.equals(subtotal, that.subtotal) &&
        Objects.equals(suggestedTransactions, that.suggestedTransactions) &&
        Objects.equals(totalCartDiscountAmount, that.totalCartDiscountAmount) &&
        Objects.equals(totalDuties, that.totalDuties) &&
        Objects.equals(totalTax, that.totalTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, discountedSubtotal, maximumRefundable, refundDuties, shipping, subtotal, suggestedTransactions, totalCartDiscountAmount, totalDuties, totalTax);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The total monetary value to be refunded in shop and presentment currencies.
     */
    private MoneyBag amount;

    /**
     * The sum of all the discounted prices of the line items being refunded.
     */
    private MoneyBag discountedSubtotal;

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
     * The sum of all the prices of the line items being refunded in shop and presentment currencies.
     */
    private MoneyBag subtotal;

    /**
     * A list of suggested order transactions.
     */
    private List<SuggestedOrderTransaction> suggestedTransactions;

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

    public SuggestedReturnRefund build() {
      SuggestedReturnRefund result = new SuggestedReturnRefund();
      result.amount = this.amount;
      result.discountedSubtotal = this.discountedSubtotal;
      result.maximumRefundable = this.maximumRefundable;
      result.refundDuties = this.refundDuties;
      result.shipping = this.shipping;
      result.subtotal = this.subtotal;
      result.suggestedTransactions = this.suggestedTransactions;
      result.totalCartDiscountAmount = this.totalCartDiscountAmount;
      result.totalDuties = this.totalDuties;
      result.totalTax = this.totalTax;
      return result;
    }

    /**
     * The total monetary value to be refunded in shop and presentment currencies.
     */
    public Builder amount(MoneyBag amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The sum of all the discounted prices of the line items being refunded.
     */
    public Builder discountedSubtotal(MoneyBag discountedSubtotal) {
      this.discountedSubtotal = discountedSubtotal;
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
     * The sum of all the prices of the line items being refunded in shop and presentment currencies.
     */
    public Builder subtotal(MoneyBag subtotal) {
      this.subtotal = subtotal;
      return this;
    }

    /**
     * A list of suggested order transactions.
     */
    public Builder suggestedTransactions(List<SuggestedOrderTransaction> suggestedTransactions) {
      this.suggestedTransactions = suggestedTransactions;
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
