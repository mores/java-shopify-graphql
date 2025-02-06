package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to refund a return.
 */
public class ReturnRefundInput {
  /**
   * The ID of the return.
   */
  private String returnId;

  /**
   * A list of return line items to refund.
   */
  private List<ReturnRefundLineItemInput> returnRefundLineItems;

  /**
   * The shipping amount to refund.
   */
  private RefundShippingInput refundShipping;

  /**
   * A list of duties to refund.
   */
  private List<RefundDutyInput> refundDuties;

  /**
   * A list of transactions involved in refunding the return.
   */
  private List<ReturnRefundOrderTransactionInput> orderTransactions = Collections.emptyList();

  /**
   * Whether to send a refund notification to the customer.
   */
  private Boolean notifyCustomer = false;

  public ReturnRefundInput() {
  }

  /**
   * The ID of the return.
   */
  public String getReturnId() {
    return returnId;
  }

  public void setReturnId(String returnId) {
    this.returnId = returnId;
  }

  /**
   * A list of return line items to refund.
   */
  public List<ReturnRefundLineItemInput> getReturnRefundLineItems() {
    return returnRefundLineItems;
  }

  public void setReturnRefundLineItems(List<ReturnRefundLineItemInput> returnRefundLineItems) {
    this.returnRefundLineItems = returnRefundLineItems;
  }

  /**
   * The shipping amount to refund.
   */
  public RefundShippingInput getRefundShipping() {
    return refundShipping;
  }

  public void setRefundShipping(RefundShippingInput refundShipping) {
    this.refundShipping = refundShipping;
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
   * A list of transactions involved in refunding the return.
   */
  public List<ReturnRefundOrderTransactionInput> getOrderTransactions() {
    return orderTransactions;
  }

  public void setOrderTransactions(List<ReturnRefundOrderTransactionInput> orderTransactions) {
    this.orderTransactions = orderTransactions;
  }

  /**
   * Whether to send a refund notification to the customer.
   */
  public Boolean getNotifyCustomer() {
    return notifyCustomer;
  }

  public void setNotifyCustomer(Boolean notifyCustomer) {
    this.notifyCustomer = notifyCustomer;
  }

  @Override
  public String toString() {
    return "ReturnRefundInput{returnId='" + returnId + "', returnRefundLineItems='" + returnRefundLineItems + "', refundShipping='" + refundShipping + "', refundDuties='" + refundDuties + "', orderTransactions='" + orderTransactions + "', notifyCustomer='" + notifyCustomer + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnRefundInput that = (ReturnRefundInput) o;
    return Objects.equals(returnId, that.returnId) &&
        Objects.equals(returnRefundLineItems, that.returnRefundLineItems) &&
        Objects.equals(refundShipping, that.refundShipping) &&
        Objects.equals(refundDuties, that.refundDuties) &&
        Objects.equals(orderTransactions, that.orderTransactions) &&
        Objects.equals(notifyCustomer, that.notifyCustomer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnId, returnRefundLineItems, refundShipping, refundDuties, orderTransactions, notifyCustomer);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the return.
     */
    private String returnId;

    /**
     * A list of return line items to refund.
     */
    private List<ReturnRefundLineItemInput> returnRefundLineItems;

    /**
     * The shipping amount to refund.
     */
    private RefundShippingInput refundShipping;

    /**
     * A list of duties to refund.
     */
    private List<RefundDutyInput> refundDuties;

    /**
     * A list of transactions involved in refunding the return.
     */
    private List<ReturnRefundOrderTransactionInput> orderTransactions = Collections.emptyList();

    /**
     * Whether to send a refund notification to the customer.
     */
    private Boolean notifyCustomer = false;

    public ReturnRefundInput build() {
      ReturnRefundInput result = new ReturnRefundInput();
      result.returnId = this.returnId;
      result.returnRefundLineItems = this.returnRefundLineItems;
      result.refundShipping = this.refundShipping;
      result.refundDuties = this.refundDuties;
      result.orderTransactions = this.orderTransactions;
      result.notifyCustomer = this.notifyCustomer;
      return result;
    }

    /**
     * The ID of the return.
     */
    public Builder returnId(String returnId) {
      this.returnId = returnId;
      return this;
    }

    /**
     * A list of return line items to refund.
     */
    public Builder returnRefundLineItems(List<ReturnRefundLineItemInput> returnRefundLineItems) {
      this.returnRefundLineItems = returnRefundLineItems;
      return this;
    }

    /**
     * The shipping amount to refund.
     */
    public Builder refundShipping(RefundShippingInput refundShipping) {
      this.refundShipping = refundShipping;
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
     * A list of transactions involved in refunding the return.
     */
    public Builder orderTransactions(List<ReturnRefundOrderTransactionInput> orderTransactions) {
      this.orderTransactions = orderTransactions;
      return this;
    }

    /**
     * Whether to send a refund notification to the customer.
     */
    public Builder notifyCustomer(Boolean notifyCustomer) {
      this.notifyCustomer = notifyCustomer;
      return this;
    }
  }
}
