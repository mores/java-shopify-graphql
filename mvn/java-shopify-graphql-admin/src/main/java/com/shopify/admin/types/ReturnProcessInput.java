package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for processing a return.
 */
public class ReturnProcessInput {
  /**
   * The ID of the return to be processed.
   */
  private String returnId;

  /**
   * The return line items list to be handled.
   */
  private List<ReturnProcessReturnLineItemInput> returnLineItems = Collections.emptyList();

  /**
   * The exchange line items list to be handled.
   */
  private List<ReturnProcessExchangeLineItemInput> exchangeLineItems = Collections.emptyList();

  /**
   * The refund duties list to be handled.
   */
  private List<RefundDutyInput> refundDuties = Collections.emptyList();

  /**
   * The shipping cost to refund.
   */
  private RefundShippingInput refundShipping;

  /**
   * ID of the tip line item.
   */
  private String tipLineId;

  /**
   * The note for the return.
   */
  private String note;

  /**
   * Whether to notify the customer about the return.
   */
  private Boolean notifyCustomer = false;

  /**
   * The financial transfer for the return.
   */
  private ReturnProcessFinancialTransferInput financialTransfer;

  public ReturnProcessInput() {
  }

  /**
   * The ID of the return to be processed.
   */
  public String getReturnId() {
    return returnId;
  }

  public void setReturnId(String returnId) {
    this.returnId = returnId;
  }

  /**
   * The return line items list to be handled.
   */
  public List<ReturnProcessReturnLineItemInput> getReturnLineItems() {
    return returnLineItems;
  }

  public void setReturnLineItems(List<ReturnProcessReturnLineItemInput> returnLineItems) {
    this.returnLineItems = returnLineItems;
  }

  /**
   * The exchange line items list to be handled.
   */
  public List<ReturnProcessExchangeLineItemInput> getExchangeLineItems() {
    return exchangeLineItems;
  }

  public void setExchangeLineItems(List<ReturnProcessExchangeLineItemInput> exchangeLineItems) {
    this.exchangeLineItems = exchangeLineItems;
  }

  /**
   * The refund duties list to be handled.
   */
  public List<RefundDutyInput> getRefundDuties() {
    return refundDuties;
  }

  public void setRefundDuties(List<RefundDutyInput> refundDuties) {
    this.refundDuties = refundDuties;
  }

  /**
   * The shipping cost to refund.
   */
  public RefundShippingInput getRefundShipping() {
    return refundShipping;
  }

  public void setRefundShipping(RefundShippingInput refundShipping) {
    this.refundShipping = refundShipping;
  }

  /**
   * ID of the tip line item.
   */
  public String getTipLineId() {
    return tipLineId;
  }

  public void setTipLineId(String tipLineId) {
    this.tipLineId = tipLineId;
  }

  /**
   * The note for the return.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * Whether to notify the customer about the return.
   */
  public Boolean getNotifyCustomer() {
    return notifyCustomer;
  }

  public void setNotifyCustomer(Boolean notifyCustomer) {
    this.notifyCustomer = notifyCustomer;
  }

  /**
   * The financial transfer for the return.
   */
  public ReturnProcessFinancialTransferInput getFinancialTransfer() {
    return financialTransfer;
  }

  public void setFinancialTransfer(ReturnProcessFinancialTransferInput financialTransfer) {
    this.financialTransfer = financialTransfer;
  }

  @Override
  public String toString() {
    return "ReturnProcessInput{returnId='" + returnId + "', returnLineItems='" + returnLineItems + "', exchangeLineItems='" + exchangeLineItems + "', refundDuties='" + refundDuties + "', refundShipping='" + refundShipping + "', tipLineId='" + tipLineId + "', note='" + note + "', notifyCustomer='" + notifyCustomer + "', financialTransfer='" + financialTransfer + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnProcessInput that = (ReturnProcessInput) o;
    return Objects.equals(returnId, that.returnId) &&
        Objects.equals(returnLineItems, that.returnLineItems) &&
        Objects.equals(exchangeLineItems, that.exchangeLineItems) &&
        Objects.equals(refundDuties, that.refundDuties) &&
        Objects.equals(refundShipping, that.refundShipping) &&
        Objects.equals(tipLineId, that.tipLineId) &&
        Objects.equals(note, that.note) &&
        Objects.equals(notifyCustomer, that.notifyCustomer) &&
        Objects.equals(financialTransfer, that.financialTransfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnId, returnLineItems, exchangeLineItems, refundDuties, refundShipping, tipLineId, note, notifyCustomer, financialTransfer);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the return to be processed.
     */
    private String returnId;

    /**
     * The return line items list to be handled.
     */
    private List<ReturnProcessReturnLineItemInput> returnLineItems = Collections.emptyList();

    /**
     * The exchange line items list to be handled.
     */
    private List<ReturnProcessExchangeLineItemInput> exchangeLineItems = Collections.emptyList();

    /**
     * The refund duties list to be handled.
     */
    private List<RefundDutyInput> refundDuties = Collections.emptyList();

    /**
     * The shipping cost to refund.
     */
    private RefundShippingInput refundShipping;

    /**
     * ID of the tip line item.
     */
    private String tipLineId;

    /**
     * The note for the return.
     */
    private String note;

    /**
     * Whether to notify the customer about the return.
     */
    private Boolean notifyCustomer = false;

    /**
     * The financial transfer for the return.
     */
    private ReturnProcessFinancialTransferInput financialTransfer;

    public ReturnProcessInput build() {
      ReturnProcessInput result = new ReturnProcessInput();
      result.returnId = this.returnId;
      result.returnLineItems = this.returnLineItems;
      result.exchangeLineItems = this.exchangeLineItems;
      result.refundDuties = this.refundDuties;
      result.refundShipping = this.refundShipping;
      result.tipLineId = this.tipLineId;
      result.note = this.note;
      result.notifyCustomer = this.notifyCustomer;
      result.financialTransfer = this.financialTransfer;
      return result;
    }

    /**
     * The ID of the return to be processed.
     */
    public Builder returnId(String returnId) {
      this.returnId = returnId;
      return this;
    }

    /**
     * The return line items list to be handled.
     */
    public Builder returnLineItems(List<ReturnProcessReturnLineItemInput> returnLineItems) {
      this.returnLineItems = returnLineItems;
      return this;
    }

    /**
     * The exchange line items list to be handled.
     */
    public Builder exchangeLineItems(List<ReturnProcessExchangeLineItemInput> exchangeLineItems) {
      this.exchangeLineItems = exchangeLineItems;
      return this;
    }

    /**
     * The refund duties list to be handled.
     */
    public Builder refundDuties(List<RefundDutyInput> refundDuties) {
      this.refundDuties = refundDuties;
      return this;
    }

    /**
     * The shipping cost to refund.
     */
    public Builder refundShipping(RefundShippingInput refundShipping) {
      this.refundShipping = refundShipping;
      return this;
    }

    /**
     * ID of the tip line item.
     */
    public Builder tipLineId(String tipLineId) {
      this.tipLineId = tipLineId;
      return this;
    }

    /**
     * The note for the return.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * Whether to notify the customer about the return.
     */
    public Builder notifyCustomer(Boolean notifyCustomer) {
      this.notifyCustomer = notifyCustomer;
      return this;
    }

    /**
     * The financial transfer for the return.
     */
    public Builder financialTransfer(ReturnProcessFinancialTransferInput financialTransfer) {
      this.financialTransfer = financialTransfer;
      return this;
    }
  }
}
