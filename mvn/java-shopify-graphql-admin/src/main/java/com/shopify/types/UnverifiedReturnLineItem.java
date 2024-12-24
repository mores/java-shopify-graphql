package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class UnverifiedReturnLineItem implements com.shopify.types.Node, com.shopify.types.ReturnLineItemType {
  
  private String customerNote;

  
  private String id;

  
  private int quantity;

  
  private int refundableQuantity;

  
  private int refundedQuantity;

  
  private ReturnReason returnReason;

  
  private String returnReasonNote;

  
  private MoneyV2 unitPrice;

  public UnverifiedReturnLineItem() {
  }

  
  public String getCustomerNote() {
    return customerNote;
  }

  public void setCustomerNote(String customerNote) {
    this.customerNote = customerNote;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public int getRefundableQuantity() {
    return refundableQuantity;
  }

  public void setRefundableQuantity(int refundableQuantity) {
    this.refundableQuantity = refundableQuantity;
  }

  
  public int getRefundedQuantity() {
    return refundedQuantity;
  }

  public void setRefundedQuantity(int refundedQuantity) {
    this.refundedQuantity = refundedQuantity;
  }

  
  public ReturnReason getReturnReason() {
    return returnReason;
  }

  public void setReturnReason(ReturnReason returnReason) {
    this.returnReason = returnReason;
  }

  
  public String getReturnReasonNote() {
    return returnReasonNote;
  }

  public void setReturnReasonNote(String returnReasonNote) {
    this.returnReasonNote = returnReasonNote;
  }

  
  public MoneyV2 getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(MoneyV2 unitPrice) {
    this.unitPrice = unitPrice;
  }

  @Override
  public String toString() {
    return "UnverifiedReturnLineItem{customerNote='" + customerNote + "', id='" + id + "', quantity='" + quantity + "', refundableQuantity='" + refundableQuantity + "', refundedQuantity='" + refundedQuantity + "', returnReason='" + returnReason + "', returnReasonNote='" + returnReasonNote + "', unitPrice='" + unitPrice + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UnverifiedReturnLineItem that = (UnverifiedReturnLineItem) o;
    return Objects.equals(customerNote, that.customerNote) &&
        Objects.equals(id, that.id) &&
        quantity == that.quantity &&
        refundableQuantity == that.refundableQuantity &&
        refundedQuantity == that.refundedQuantity &&
        Objects.equals(returnReason, that.returnReason) &&
        Objects.equals(returnReasonNote, that.returnReasonNote) &&
        Objects.equals(unitPrice, that.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerNote, id, quantity, refundableQuantity, refundedQuantity, returnReason, returnReasonNote, unitPrice);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String customerNote;

    
    private String id;

    
    private int quantity;

    
    private int refundableQuantity;

    
    private int refundedQuantity;

    
    private ReturnReason returnReason;

    
    private String returnReasonNote;

    
    private MoneyV2 unitPrice;

    public UnverifiedReturnLineItem build() {
      UnverifiedReturnLineItem result = new UnverifiedReturnLineItem();
      result.customerNote = this.customerNote;
      result.id = this.id;
      result.quantity = this.quantity;
      result.refundableQuantity = this.refundableQuantity;
      result.refundedQuantity = this.refundedQuantity;
      result.returnReason = this.returnReason;
      result.returnReasonNote = this.returnReasonNote;
      result.unitPrice = this.unitPrice;
      return result;
    }

    
    public Builder customerNote(String customerNote) {
      this.customerNote = customerNote;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder refundableQuantity(int refundableQuantity) {
      this.refundableQuantity = refundableQuantity;
      return this;
    }

    
    public Builder refundedQuantity(int refundedQuantity) {
      this.refundedQuantity = refundedQuantity;
      return this;
    }

    
    public Builder returnReason(ReturnReason returnReason) {
      this.returnReason = returnReason;
      return this;
    }

    
    public Builder returnReasonNote(String returnReasonNote) {
      this.returnReasonNote = returnReasonNote;
      return this;
    }

    
    public Builder unitPrice(MoneyV2 unitPrice) {
      this.unitPrice = unitPrice;
      return this;
    }
  }
}
