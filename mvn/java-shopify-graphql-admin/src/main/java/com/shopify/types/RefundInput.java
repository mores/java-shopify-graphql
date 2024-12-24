package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class RefundInput {
  
  private CurrencyCode currency;

  
  private String orderId;

  
  private String note;

  
  private Boolean notify;

  
  private ShippingRefundInput shipping;

  
  private List<RefundLineItemInput> refundLineItems;

  
  private List<RefundDutyInput> refundDuties;

  
  private List<OrderTransactionInput> transactions;

  
  private OrderAdjustmentInputDiscrepancyReason discrepancyReason;

  public RefundInput() {
  }

  
  public CurrencyCode getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyCode currency) {
    this.currency = currency;
  }

  
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public Boolean getNotify() {
    return notify;
  }

  public void setNotify(Boolean notify) {
    this.notify = notify;
  }

  
  public ShippingRefundInput getShipping() {
    return shipping;
  }

  public void setShipping(ShippingRefundInput shipping) {
    this.shipping = shipping;
  }

  
  public List<RefundLineItemInput> getRefundLineItems() {
    return refundLineItems;
  }

  public void setRefundLineItems(List<RefundLineItemInput> refundLineItems) {
    this.refundLineItems = refundLineItems;
  }

  
  public List<RefundDutyInput> getRefundDuties() {
    return refundDuties;
  }

  public void setRefundDuties(List<RefundDutyInput> refundDuties) {
    this.refundDuties = refundDuties;
  }

  
  public List<OrderTransactionInput> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<OrderTransactionInput> transactions) {
    this.transactions = transactions;
  }

  
  public OrderAdjustmentInputDiscrepancyReason getDiscrepancyReason() {
    return discrepancyReason;
  }

  public void setDiscrepancyReason(OrderAdjustmentInputDiscrepancyReason discrepancyReason) {
    this.discrepancyReason = discrepancyReason;
  }

  @Override
  public String toString() {
    return "RefundInput{currency='" + currency + "', orderId='" + orderId + "', note='" + note + "', notify='" + notify + "', shipping='" + shipping + "', refundLineItems='" + refundLineItems + "', refundDuties='" + refundDuties + "', transactions='" + transactions + "', discrepancyReason='" + discrepancyReason + "'}";
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
        Objects.equals(discrepancyReason, that.discrepancyReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, orderId, note, notify, shipping, refundLineItems, refundDuties, transactions, discrepancyReason);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CurrencyCode currency;

    
    private String orderId;

    
    private String note;

    
    private Boolean notify;

    
    private ShippingRefundInput shipping;

    
    private List<RefundLineItemInput> refundLineItems;

    
    private List<RefundDutyInput> refundDuties;

    
    private List<OrderTransactionInput> transactions;

    
    private OrderAdjustmentInputDiscrepancyReason discrepancyReason;

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
      result.discrepancyReason = this.discrepancyReason;
      return result;
    }

    
    public Builder currency(CurrencyCode currency) {
      this.currency = currency;
      return this;
    }

    
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder notify(Boolean notify) {
      this.notify = notify;
      return this;
    }

    
    public Builder shipping(ShippingRefundInput shipping) {
      this.shipping = shipping;
      return this;
    }

    
    public Builder refundLineItems(List<RefundLineItemInput> refundLineItems) {
      this.refundLineItems = refundLineItems;
      return this;
    }

    
    public Builder refundDuties(List<RefundDutyInput> refundDuties) {
      this.refundDuties = refundDuties;
      return this;
    }

    
    public Builder transactions(List<OrderTransactionInput> transactions) {
      this.transactions = transactions;
      return this;
    }

    
    public Builder discrepancyReason(OrderAdjustmentInputDiscrepancyReason discrepancyReason) {
      this.discrepancyReason = discrepancyReason;
      return this;
    }
  }
}
