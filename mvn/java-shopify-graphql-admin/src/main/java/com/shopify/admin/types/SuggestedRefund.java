package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a refund suggested by Shopify based on the items being reimbursed.
 * You can then use the suggested refund object to generate an actual refund.
 */
public class SuggestedRefund {
  /**
   * The total monetary value to be refunded.
   */
  private String amount;

  /**
   * The total monetary value to be refunded in shop and presentment currencies.
   */
  private MoneyBag amountSet;

  /**
   * The sum of all the discounted prices of the line items being refunded.
   */
  private MoneyBag discountedSubtotalSet;

  /**
   * The total monetary value available to refund.
   */
  private String maximumRefundable;

  /**
   * The total monetary value available to refund in shop and presentment currencies.
   */
  private MoneyBag maximumRefundableSet;

  /**
   * A list of duties to be refunded from the order.
   */
  private List<RefundDuty> refundDuties;

  /**
   * A list of line items to be refunded, along with restock instructions.
   */
  private List<RefundLineItem> refundLineItems;

  /**
   * The shipping costs to be refunded from the order.
   */
  private ShippingRefund shipping;

  /**
   * The sum of all the prices of the line items being refunded.
   */
  private String subtotal;

  /**
   * The sum of all the prices of the line items being refunded in shop and presentment currencies.
   */
  private MoneyBag subtotalSet;

  /**
   * A list of suggested order transactions.
   */
  private List<SuggestedOrderTransaction> suggestedTransactions;

  /**
   * The total cart discount amount that was applied to all line items in this refund.
   */
  private MoneyBag totalCartDiscountAmountSet;

  /**
   * The sum of all the duties being refunded from the order in shop and presentment currencies. The value must be positive.
   */
  private MoneyBag totalDutiesSet;

  /**
   * The sum of the taxes being refunded from the order in shop and presentment currencies. The value must be positive.
   */
  private MoneyBag totalTaxSet;

  /**
   * The sum of the taxes being refunded from the order. The value must be positive.
   */
  private String totalTaxes;

  public SuggestedRefund() {
  }

  /**
   * The total monetary value to be refunded.
   */
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * The total monetary value to be refunded in shop and presentment currencies.
   */
  public MoneyBag getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBag amountSet) {
    this.amountSet = amountSet;
  }

  /**
   * The sum of all the discounted prices of the line items being refunded.
   */
  public MoneyBag getDiscountedSubtotalSet() {
    return discountedSubtotalSet;
  }

  public void setDiscountedSubtotalSet(MoneyBag discountedSubtotalSet) {
    this.discountedSubtotalSet = discountedSubtotalSet;
  }

  /**
   * The total monetary value available to refund.
   */
  public String getMaximumRefundable() {
    return maximumRefundable;
  }

  public void setMaximumRefundable(String maximumRefundable) {
    this.maximumRefundable = maximumRefundable;
  }

  /**
   * The total monetary value available to refund in shop and presentment currencies.
   */
  public MoneyBag getMaximumRefundableSet() {
    return maximumRefundableSet;
  }

  public void setMaximumRefundableSet(MoneyBag maximumRefundableSet) {
    this.maximumRefundableSet = maximumRefundableSet;
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
   * A list of line items to be refunded, along with restock instructions.
   */
  public List<RefundLineItem> getRefundLineItems() {
    return refundLineItems;
  }

  public void setRefundLineItems(List<RefundLineItem> refundLineItems) {
    this.refundLineItems = refundLineItems;
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
   * The sum of all the prices of the line items being refunded.
   */
  public String getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(String subtotal) {
    this.subtotal = subtotal;
  }

  /**
   * The sum of all the prices of the line items being refunded in shop and presentment currencies.
   */
  public MoneyBag getSubtotalSet() {
    return subtotalSet;
  }

  public void setSubtotalSet(MoneyBag subtotalSet) {
    this.subtotalSet = subtotalSet;
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
  public MoneyBag getTotalCartDiscountAmountSet() {
    return totalCartDiscountAmountSet;
  }

  public void setTotalCartDiscountAmountSet(MoneyBag totalCartDiscountAmountSet) {
    this.totalCartDiscountAmountSet = totalCartDiscountAmountSet;
  }

  /**
   * The sum of all the duties being refunded from the order in shop and presentment currencies. The value must be positive.
   */
  public MoneyBag getTotalDutiesSet() {
    return totalDutiesSet;
  }

  public void setTotalDutiesSet(MoneyBag totalDutiesSet) {
    this.totalDutiesSet = totalDutiesSet;
  }

  /**
   * The sum of the taxes being refunded from the order in shop and presentment currencies. The value must be positive.
   */
  public MoneyBag getTotalTaxSet() {
    return totalTaxSet;
  }

  public void setTotalTaxSet(MoneyBag totalTaxSet) {
    this.totalTaxSet = totalTaxSet;
  }

  /**
   * The sum of the taxes being refunded from the order. The value must be positive.
   */
  public String getTotalTaxes() {
    return totalTaxes;
  }

  public void setTotalTaxes(String totalTaxes) {
    this.totalTaxes = totalTaxes;
  }

  @Override
  public String toString() {
    return "SuggestedRefund{amount='" + amount + "', amountSet='" + amountSet + "', discountedSubtotalSet='" + discountedSubtotalSet + "', maximumRefundable='" + maximumRefundable + "', maximumRefundableSet='" + maximumRefundableSet + "', refundDuties='" + refundDuties + "', refundLineItems='" + refundLineItems + "', shipping='" + shipping + "', subtotal='" + subtotal + "', subtotalSet='" + subtotalSet + "', suggestedTransactions='" + suggestedTransactions + "', totalCartDiscountAmountSet='" + totalCartDiscountAmountSet + "', totalDutiesSet='" + totalDutiesSet + "', totalTaxSet='" + totalTaxSet + "', totalTaxes='" + totalTaxes + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SuggestedRefund that = (SuggestedRefund) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(amountSet, that.amountSet) &&
        Objects.equals(discountedSubtotalSet, that.discountedSubtotalSet) &&
        Objects.equals(maximumRefundable, that.maximumRefundable) &&
        Objects.equals(maximumRefundableSet, that.maximumRefundableSet) &&
        Objects.equals(refundDuties, that.refundDuties) &&
        Objects.equals(refundLineItems, that.refundLineItems) &&
        Objects.equals(shipping, that.shipping) &&
        Objects.equals(subtotal, that.subtotal) &&
        Objects.equals(subtotalSet, that.subtotalSet) &&
        Objects.equals(suggestedTransactions, that.suggestedTransactions) &&
        Objects.equals(totalCartDiscountAmountSet, that.totalCartDiscountAmountSet) &&
        Objects.equals(totalDutiesSet, that.totalDutiesSet) &&
        Objects.equals(totalTaxSet, that.totalTaxSet) &&
        Objects.equals(totalTaxes, that.totalTaxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, amountSet, discountedSubtotalSet, maximumRefundable, maximumRefundableSet, refundDuties, refundLineItems, shipping, subtotal, subtotalSet, suggestedTransactions, totalCartDiscountAmountSet, totalDutiesSet, totalTaxSet, totalTaxes);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The total monetary value to be refunded.
     */
    private String amount;

    /**
     * The total monetary value to be refunded in shop and presentment currencies.
     */
    private MoneyBag amountSet;

    /**
     * The sum of all the discounted prices of the line items being refunded.
     */
    private MoneyBag discountedSubtotalSet;

    /**
     * The total monetary value available to refund.
     */
    private String maximumRefundable;

    /**
     * The total monetary value available to refund in shop and presentment currencies.
     */
    private MoneyBag maximumRefundableSet;

    /**
     * A list of duties to be refunded from the order.
     */
    private List<RefundDuty> refundDuties;

    /**
     * A list of line items to be refunded, along with restock instructions.
     */
    private List<RefundLineItem> refundLineItems;

    /**
     * The shipping costs to be refunded from the order.
     */
    private ShippingRefund shipping;

    /**
     * The sum of all the prices of the line items being refunded.
     */
    private String subtotal;

    /**
     * The sum of all the prices of the line items being refunded in shop and presentment currencies.
     */
    private MoneyBag subtotalSet;

    /**
     * A list of suggested order transactions.
     */
    private List<SuggestedOrderTransaction> suggestedTransactions;

    /**
     * The total cart discount amount that was applied to all line items in this refund.
     */
    private MoneyBag totalCartDiscountAmountSet;

    /**
     * The sum of all the duties being refunded from the order in shop and presentment currencies. The value must be positive.
     */
    private MoneyBag totalDutiesSet;

    /**
     * The sum of the taxes being refunded from the order in shop and presentment currencies. The value must be positive.
     */
    private MoneyBag totalTaxSet;

    /**
     * The sum of the taxes being refunded from the order. The value must be positive.
     */
    private String totalTaxes;

    public SuggestedRefund build() {
      SuggestedRefund result = new SuggestedRefund();
      result.amount = this.amount;
      result.amountSet = this.amountSet;
      result.discountedSubtotalSet = this.discountedSubtotalSet;
      result.maximumRefundable = this.maximumRefundable;
      result.maximumRefundableSet = this.maximumRefundableSet;
      result.refundDuties = this.refundDuties;
      result.refundLineItems = this.refundLineItems;
      result.shipping = this.shipping;
      result.subtotal = this.subtotal;
      result.subtotalSet = this.subtotalSet;
      result.suggestedTransactions = this.suggestedTransactions;
      result.totalCartDiscountAmountSet = this.totalCartDiscountAmountSet;
      result.totalDutiesSet = this.totalDutiesSet;
      result.totalTaxSet = this.totalTaxSet;
      result.totalTaxes = this.totalTaxes;
      return result;
    }

    /**
     * The total monetary value to be refunded.
     */
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The total monetary value to be refunded in shop and presentment currencies.
     */
    public Builder amountSet(MoneyBag amountSet) {
      this.amountSet = amountSet;
      return this;
    }

    /**
     * The sum of all the discounted prices of the line items being refunded.
     */
    public Builder discountedSubtotalSet(MoneyBag discountedSubtotalSet) {
      this.discountedSubtotalSet = discountedSubtotalSet;
      return this;
    }

    /**
     * The total monetary value available to refund.
     */
    public Builder maximumRefundable(String maximumRefundable) {
      this.maximumRefundable = maximumRefundable;
      return this;
    }

    /**
     * The total monetary value available to refund in shop and presentment currencies.
     */
    public Builder maximumRefundableSet(MoneyBag maximumRefundableSet) {
      this.maximumRefundableSet = maximumRefundableSet;
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
     * A list of line items to be refunded, along with restock instructions.
     */
    public Builder refundLineItems(List<RefundLineItem> refundLineItems) {
      this.refundLineItems = refundLineItems;
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
     * The sum of all the prices of the line items being refunded.
     */
    public Builder subtotal(String subtotal) {
      this.subtotal = subtotal;
      return this;
    }

    /**
     * The sum of all the prices of the line items being refunded in shop and presentment currencies.
     */
    public Builder subtotalSet(MoneyBag subtotalSet) {
      this.subtotalSet = subtotalSet;
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
    public Builder totalCartDiscountAmountSet(MoneyBag totalCartDiscountAmountSet) {
      this.totalCartDiscountAmountSet = totalCartDiscountAmountSet;
      return this;
    }

    /**
     * The sum of all the duties being refunded from the order in shop and presentment currencies. The value must be positive.
     */
    public Builder totalDutiesSet(MoneyBag totalDutiesSet) {
      this.totalDutiesSet = totalDutiesSet;
      return this;
    }

    /**
     * The sum of the taxes being refunded from the order in shop and presentment currencies. The value must be positive.
     */
    public Builder totalTaxSet(MoneyBag totalTaxSet) {
      this.totalTaxSet = totalTaxSet;
      return this;
    }

    /**
     * The sum of the taxes being refunded from the order. The value must be positive.
     */
    public Builder totalTaxes(String totalTaxes) {
      this.totalTaxes = totalTaxes;
      return this;
    }
  }
}
