package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class ReturnRefundInput {
  
  private String returnId;

  
  private List<ReturnRefundLineItemInput> returnRefundLineItems;

  
  private RefundShippingInput refundShipping;

  
  private List<RefundDutyInput> refundDuties;

  
  private List<ReturnRefundOrderTransactionInput> orderTransactions = Collections.emptyList();

  
  private Boolean notifyCustomer = false;

  public ReturnRefundInput() {
  }

  
  public String getReturnId() {
    return returnId;
  }

  public void setReturnId(String returnId) {
    this.returnId = returnId;
  }

  
  public List<ReturnRefundLineItemInput> getReturnRefundLineItems() {
    return returnRefundLineItems;
  }

  public void setReturnRefundLineItems(List<ReturnRefundLineItemInput> returnRefundLineItems) {
    this.returnRefundLineItems = returnRefundLineItems;
  }

  
  public RefundShippingInput getRefundShipping() {
    return refundShipping;
  }

  public void setRefundShipping(RefundShippingInput refundShipping) {
    this.refundShipping = refundShipping;
  }

  
  public List<RefundDutyInput> getRefundDuties() {
    return refundDuties;
  }

  public void setRefundDuties(List<RefundDutyInput> refundDuties) {
    this.refundDuties = refundDuties;
  }

  
  public List<ReturnRefundOrderTransactionInput> getOrderTransactions() {
    return orderTransactions;
  }

  public void setOrderTransactions(List<ReturnRefundOrderTransactionInput> orderTransactions) {
    this.orderTransactions = orderTransactions;
  }

  
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
    
    private String returnId;

    
    private List<ReturnRefundLineItemInput> returnRefundLineItems;

    
    private RefundShippingInput refundShipping;

    
    private List<RefundDutyInput> refundDuties;

    
    private List<ReturnRefundOrderTransactionInput> orderTransactions = Collections.emptyList();

    
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

    
    public Builder returnId(String returnId) {
      this.returnId = returnId;
      return this;
    }

    
    public Builder returnRefundLineItems(List<ReturnRefundLineItemInput> returnRefundLineItems) {
      this.returnRefundLineItems = returnRefundLineItems;
      return this;
    }

    
    public Builder refundShipping(RefundShippingInput refundShipping) {
      this.refundShipping = refundShipping;
      return this;
    }

    
    public Builder refundDuties(List<RefundDutyInput> refundDuties) {
      this.refundDuties = refundDuties;
      return this;
    }

    
    public Builder orderTransactions(List<ReturnRefundOrderTransactionInput> orderTransactions) {
      this.orderTransactions = orderTransactions;
      return this;
    }

    
    public Builder notifyCustomer(Boolean notifyCustomer) {
      this.notifyCustomer = notifyCustomer;
      return this;
    }
  }
}
