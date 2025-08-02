package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to create a refund.
 */
public class RefundInput {
  /**
   * The currency that is used to refund the order. This must be the presentment
   * currency, which is the currency used by the customer. This is a required field
   * for orders where the currency and presentment currency differ.
   */
  private CurrencyCode currency;

  /**
   * The ID of the order that's being refunded.
   */
  private String orderId;

  /**
   * An optional note that's attached to the refund.
   */
  private String note;

  /**
   * Whether to send a refund notification to the customer.
   */
  private Boolean notify;

  /**
   * The input fields that are required to reimburse shipping costs.
   */
  private ShippingRefundInput shipping;

  /**
   * A list of line items to refund.
   */
  private List<RefundLineItemInput> refundLineItems;

  /**
   * A list of duties to refund.
   */
  private List<RefundDutyInput> refundDuties;

  /**
   * A list of transactions involved in the refund.
   */
  private List<OrderTransactionInput> transactions;

  /**
   * A list of instructions to process the financial outcome of the refund.
   */
  private List<RefundMethodInput> refundMethods = Collections.emptyList();

  /**
   * An optional reason for a discrepancy between calculated and actual refund amounts.
   */
  private OrderAdjustmentInputDiscrepancyReason discrepancyReason;

  /**
   * Whether to allow the total refunded amount to surpass the amount paid for the order.
   */
  private Boolean allowOverRefunding = false;

  public RefundInput() {
  }

  /**
   * The currency that is used to refund the order. This must be the presentment
   * currency, which is the currency used by the customer. This is a required field
   * for orders where the currency and presentment currency differ.
   */
  public CurrencyCode getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyCode currency) {
    this.currency = currency;
  }

  /**
   * The ID of the order that's being refunded.
   */
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   * An optional note that's attached to the refund.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * Whether to send a refund notification to the customer.
   */
  public Boolean getNotify() {
    return notify;
  }

  public void setNotify(Boolean notify) {
    this.notify = notify;
  }

  /**
   * The input fields that are required to reimburse shipping costs.
   */
  public ShippingRefundInput getShipping() {
    return shipping;
  }

  public void setShipping(ShippingRefundInput shipping) {
    this.shipping = shipping;
  }

  /**
   * A list of line items to refund.
   */
  public List<RefundLineItemInput> getRefundLineItems() {
    return refundLineItems;
  }

  public void setRefundLineItems(List<RefundLineItemInput> refundLineItems) {
    this.refundLineItems = refundLineItems;
  }

  /**
   * A list of duties to refund.
   */
  public List<RefundDutyInput> getRefundDuties() {
    return refundDuties;
  }

  public void setRefundDuties(List<RefundDutyInput> refundDuties) {
    this.refundDuties = refundDuties;
  }

  /**
   * A list of transactions involved in the refund.
   */
  public List<OrderTransactionInput> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<OrderTransactionInput> transactions) {
    this.transactions = transactions;
  }

  /**
   * A list of instructions to process the financial outcome of the refund.
   */
  public List<RefundMethodInput> getRefundMethods() {
    return refundMethods;
  }

  public void setRefundMethods(List<RefundMethodInput> refundMethods) {
    this.refundMethods = refundMethods;
  }

  /**
   * An optional reason for a discrepancy between calculated and actual refund amounts.
   */
  public OrderAdjustmentInputDiscrepancyReason getDiscrepancyReason() {
    return discrepancyReason;
  }

  public void setDiscrepancyReason(OrderAdjustmentInputDiscrepancyReason discrepancyReason) {
    this.discrepancyReason = discrepancyReason;
  }

  /**
   * Whether to allow the total refunded amount to surpass the amount paid for the order.
   */
  public Boolean getAllowOverRefunding() {
    return allowOverRefunding;
  }

  public void setAllowOverRefunding(Boolean allowOverRefunding) {
    this.allowOverRefunding = allowOverRefunding;
  }

  @Override
  public String toString() {
    return "RefundInput{currency='" + currency + "', orderId='" + orderId + "', note='" + note + "', notify='" + notify + "', shipping='" + shipping + "', refundLineItems='" + refundLineItems + "', refundDuties='" + refundDuties + "', transactions='" + transactions + "', refundMethods='" + refundMethods + "', discrepancyReason='" + discrepancyReason + "', allowOverRefunding='" + allowOverRefunding + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RefundInput that = (RefundInput) o;
    return Objects.equals(currency, that.currency) &&
        Objects.equals(orderId, that.orderId) &&
        Objects.equals(note, that.note) &&
        Objects.equals(notify, that.notify) &&
        Objects.equals(shipping, that.shipping) &&
        Objects.equals(refundLineItems, that.refundLineItems) &&
        Objects.equals(refundDuties, that.refundDuties) &&
        Objects.equals(transactions, that.transactions) &&
        Objects.equals(refundMethods, that.refundMethods) &&
        Objects.equals(discrepancyReason, that.discrepancyReason) &&
        Objects.equals(allowOverRefunding, that.allowOverRefunding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, orderId, note, notify, shipping, refundLineItems, refundDuties, transactions, refundMethods, discrepancyReason, allowOverRefunding);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The currency that is used to refund the order. This must be the presentment
     * currency, which is the currency used by the customer. This is a required field
     * for orders where the currency and presentment currency differ.
     */
    private CurrencyCode currency;

    /**
     * The ID of the order that's being refunded.
     */
    private String orderId;

    /**
     * An optional note that's attached to the refund.
     */
    private String note;

    /**
     * Whether to send a refund notification to the customer.
     */
    private Boolean notify;

    /**
     * The input fields that are required to reimburse shipping costs.
     */
    private ShippingRefundInput shipping;

    /**
     * A list of line items to refund.
     */
    private List<RefundLineItemInput> refundLineItems;

    /**
     * A list of duties to refund.
     */
    private List<RefundDutyInput> refundDuties;

    /**
     * A list of transactions involved in the refund.
     */
    private List<OrderTransactionInput> transactions;

    /**
     * A list of instructions to process the financial outcome of the refund.
     */
    private List<RefundMethodInput> refundMethods = Collections.emptyList();

    /**
     * An optional reason for a discrepancy between calculated and actual refund amounts.
     */
    private OrderAdjustmentInputDiscrepancyReason discrepancyReason;

    /**
     * Whether to allow the total refunded amount to surpass the amount paid for the order.
     */
    private Boolean allowOverRefunding = false;

    public RefundInput build() {
      RefundInput result = new RefundInput();
      result.currency = this.currency;
      result.orderId = this.orderId;
      result.note = this.note;
      result.notify = this.notify;
      result.shipping = this.shipping;
      result.refundLineItems = this.refundLineItems;
      result.refundDuties = this.refundDuties;
      result.transactions = this.transactions;
      result.refundMethods = this.refundMethods;
      result.discrepancyReason = this.discrepancyReason;
      result.allowOverRefunding = this.allowOverRefunding;
      return result;
    }

    /**
     * The currency that is used to refund the order. This must be the presentment
     * currency, which is the currency used by the customer. This is a required field
     * for orders where the currency and presentment currency differ.
     */
    public Builder currency(CurrencyCode currency) {
      this.currency = currency;
      return this;
    }

    /**
     * The ID of the order that's being refunded.
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * An optional note that's attached to the refund.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * Whether to send a refund notification to the customer.
     */
    public Builder notify(Boolean notify) {
      this.notify = notify;
      return this;
    }

    /**
     * The input fields that are required to reimburse shipping costs.
     */
    public Builder shipping(ShippingRefundInput shipping) {
      this.shipping = shipping;
      return this;
    }

    /**
     * A list of line items to refund.
     */
    public Builder refundLineItems(List<RefundLineItemInput> refundLineItems) {
      this.refundLineItems = refundLineItems;
      return this;
    }

    /**
     * A list of duties to refund.
     */
    public Builder refundDuties(List<RefundDutyInput> refundDuties) {
      this.refundDuties = refundDuties;
      return this;
    }

    /**
     * A list of transactions involved in the refund.
     */
    public Builder transactions(List<OrderTransactionInput> transactions) {
      this.transactions = transactions;
      return this;
    }

    /**
     * A list of instructions to process the financial outcome of the refund.
     */
    public Builder refundMethods(List<RefundMethodInput> refundMethods) {
      this.refundMethods = refundMethods;
      return this;
    }

    /**
     * An optional reason for a discrepancy between calculated and actual refund amounts.
     */
    public Builder discrepancyReason(OrderAdjustmentInputDiscrepancyReason discrepancyReason) {
      this.discrepancyReason = discrepancyReason;
      return this;
    }

    /**
     * Whether to allow the total refunded amount to surpass the amount paid for the order.
     */
    public Builder allowOverRefunding(Boolean allowOverRefunding) {
      this.allowOverRefunding = allowOverRefunding;
      return this;
    }
  }
}
