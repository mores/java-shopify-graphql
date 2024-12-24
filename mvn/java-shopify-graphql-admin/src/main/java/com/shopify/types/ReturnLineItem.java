package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ReturnLineItem implements com.shopify.types.Node, com.shopify.types.ReturnLineItemType {
  
  private String customerNote;

  
  private FulfillmentLineItem fulfillmentLineItem;

  
  private String id;

  
  private int quantity;

  
  private int refundableQuantity;

  
  private int refundedQuantity;

  
  private RestockingFee restockingFee;

  
  private ReturnReason returnReason;

  
  private String returnReasonNote;

  
  private Weight totalWeight;

  
  private MoneyBag withCodeDiscountedTotalPriceSet;

  public ReturnLineItem() {
  }

  
  public String getCustomerNote() {
    return customerNote;
  }

  public void setCustomerNote(String customerNote) {
    this.customerNote = customerNote;
  }

  
  public FulfillmentLineItem getFulfillmentLineItem() {
    return fulfillmentLineItem;
  }

  public void setFulfillmentLineItem(FulfillmentLineItem fulfillmentLineItem) {
    this.fulfillmentLineItem = fulfillmentLineItem;
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

  
  public RestockingFee getRestockingFee() {
    return restockingFee;
  }

  public void setRestockingFee(RestockingFee restockingFee) {
    this.restockingFee = restockingFee;
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

  
  public Weight getTotalWeight() {
    return totalWeight;
  }

  public void setTotalWeight(Weight totalWeight) {
    this.totalWeight = totalWeight;
  }

  
  public MoneyBag getWithCodeDiscountedTotalPriceSet() {
    return withCodeDiscountedTotalPriceSet;
  }

  public void setWithCodeDiscountedTotalPriceSet(MoneyBag withCodeDiscountedTotalPriceSet) {
    this.withCodeDiscountedTotalPriceSet = withCodeDiscountedTotalPriceSet;
  }

  @Override
  public String toString() {
    return "ReturnLineItem{customerNote='" + customerNote + "', fulfillmentLineItem='" + fulfillmentLineItem + "', id='" + id + "', quantity='" + quantity + "', refundableQuantity='" + refundableQuantity + "', refundedQuantity='" + refundedQuantity + "', restockingFee='" + restockingFee + "', returnReason='" + returnReason + "', returnReasonNote='" + returnReasonNote + "', totalWeight='" + totalWeight + "', withCodeDiscountedTotalPriceSet='" + withCodeDiscountedTotalPriceSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnLineItem that = (ReturnLineItem) o;
    return Objects.equals(customerNote, that.customerNote) &&
        Objects.equals(fulfillmentLineItem, that.fulfillmentLineItem) &&
        Objects.equals(id, that.id) &&
        quantity == that.quantity &&
        refundableQuantity == that.refundableQuantity &&
        refundedQuantity == that.refundedQuantity &&
        Objects.equals(restockingFee, that.restockingFee) &&
        Objects.equals(returnReason, that.returnReason) &&
        Objects.equals(returnReasonNote, that.returnReasonNote) &&
        Objects.equals(totalWeight, that.totalWeight) &&
        Objects.equals(withCodeDiscountedTotalPriceSet, that.withCodeDiscountedTotalPriceSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerNote, fulfillmentLineItem, id, quantity, refundableQuantity, refundedQuantity, restockingFee, returnReason, returnReasonNote, totalWeight, withCodeDiscountedTotalPriceSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String customerNote;

    
    private FulfillmentLineItem fulfillmentLineItem;

    
    private String id;

    
    private int quantity;

    
    private int refundableQuantity;

    
    private int refundedQuantity;

    
    private RestockingFee restockingFee;

    
    private ReturnReason returnReason;

    
    private String returnReasonNote;

    
    private Weight totalWeight;

    
    private MoneyBag withCodeDiscountedTotalPriceSet;

    public ReturnLineItem build() {
      ReturnLineItem result = new ReturnLineItem();
      result.customerNote = this.customerNote;
      result.fulfillmentLineItem = this.fulfillmentLineItem;
      result.id = this.id;
      result.quantity = this.quantity;
      result.refundableQuantity = this.refundableQuantity;
      result.refundedQuantity = this.refundedQuantity;
      result.restockingFee = this.restockingFee;
      result.returnReason = this.returnReason;
      result.returnReasonNote = this.returnReasonNote;
      result.totalWeight = this.totalWeight;
      result.withCodeDiscountedTotalPriceSet = this.withCodeDiscountedTotalPriceSet;
      return result;
    }

    
    public Builder customerNote(String customerNote) {
      this.customerNote = customerNote;
      return this;
    }

    
    public Builder fulfillmentLineItem(FulfillmentLineItem fulfillmentLineItem) {
      this.fulfillmentLineItem = fulfillmentLineItem;
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

    
    public Builder restockingFee(RestockingFee restockingFee) {
      this.restockingFee = restockingFee;
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

    
    public Builder totalWeight(Weight totalWeight) {
      this.totalWeight = totalWeight;
      return this;
    }

    
    public Builder withCodeDiscountedTotalPriceSet(MoneyBag withCodeDiscountedTotalPriceSet) {
      this.withCodeDiscountedTotalPriceSet = withCodeDiscountedTotalPriceSet;
      return this;
    }
  }
}
