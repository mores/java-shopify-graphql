package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ReturnRequestLineItemInput {
  
  private String fulfillmentLineItemId;

  
  private int quantity;

  
  private RestockingFeeInput restockingFee;

  
  private ReturnReason returnReason;

  
  private String customerNote;

  public ReturnRequestLineItemInput() {
  }

  
  public String getFulfillmentLineItemId() {
    return fulfillmentLineItemId;
  }

  public void setFulfillmentLineItemId(String fulfillmentLineItemId) {
    this.fulfillmentLineItemId = fulfillmentLineItemId;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public RestockingFeeInput getRestockingFee() {
    return restockingFee;
  }

  public void setRestockingFee(RestockingFeeInput restockingFee) {
    this.restockingFee = restockingFee;
  }

  
  public ReturnReason getReturnReason() {
    return returnReason;
  }

  public void setReturnReason(ReturnReason returnReason) {
    this.returnReason = returnReason;
  }

  
  public String getCustomerNote() {
    return customerNote;
  }

  public void setCustomerNote(String customerNote) {
    this.customerNote = customerNote;
  }

  @Override
  public String toString() {
    return "ReturnRequestLineItemInput{fulfillmentLineItemId='" + fulfillmentLineItemId + "', quantity='" + quantity + "', restockingFee='" + restockingFee + "', returnReason='" + returnReason + "', customerNote='" + customerNote + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnRequestLineItemInput that = (ReturnRequestLineItemInput) o;
    return Objects.equals(fulfillmentLineItemId, that.fulfillmentLineItemId) &&
        quantity == that.quantity &&
        Objects.equals(restockingFee, that.restockingFee) &&
        Objects.equals(returnReason, that.returnReason) &&
        Objects.equals(customerNote, that.customerNote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentLineItemId, quantity, restockingFee, returnReason, customerNote);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String fulfillmentLineItemId;

    
    private int quantity;

    
    private RestockingFeeInput restockingFee;

    
    private ReturnReason returnReason;

    
    private String customerNote;

    public ReturnRequestLineItemInput build() {
      ReturnRequestLineItemInput result = new ReturnRequestLineItemInput();
      result.fulfillmentLineItemId = this.fulfillmentLineItemId;
      result.quantity = this.quantity;
      result.restockingFee = this.restockingFee;
      result.returnReason = this.returnReason;
      result.customerNote = this.customerNote;
      return result;
    }

    
    public Builder fulfillmentLineItemId(String fulfillmentLineItemId) {
      this.fulfillmentLineItemId = fulfillmentLineItemId;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder restockingFee(RestockingFeeInput restockingFee) {
      this.restockingFee = restockingFee;
      return this;
    }

    
    public Builder returnReason(ReturnReason returnReason) {
      this.returnReason = returnReason;
      return this;
    }

    
    public Builder customerNote(String customerNote) {
      this.customerNote = customerNote;
      return this;
    }
  }
}
