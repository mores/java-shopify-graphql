package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ReturnLineItemInput {
  
  private int quantity;

  
  private ReturnReason returnReason;

  
  private String returnReasonNote = "";

  
  private String fulfillmentLineItemId;

  
  private RestockingFeeInput restockingFee;

  public ReturnLineItemInput() {
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
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

  
  public String getFulfillmentLineItemId() {
    return fulfillmentLineItemId;
  }

  public void setFulfillmentLineItemId(String fulfillmentLineItemId) {
    this.fulfillmentLineItemId = fulfillmentLineItemId;
  }

  
  public RestockingFeeInput getRestockingFee() {
    return restockingFee;
  }

  public void setRestockingFee(RestockingFeeInput restockingFee) {
    this.restockingFee = restockingFee;
  }

  @Override
  public String toString() {
    return "ReturnLineItemInput{quantity='" + quantity + "', returnReason='" + returnReason + "', returnReasonNote='" + returnReasonNote + "', fulfillmentLineItemId='" + fulfillmentLineItemId + "', restockingFee='" + restockingFee + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnLineItemInput that = (ReturnLineItemInput) o;
    return quantity == that.quantity &&
        Objects.equals(returnReason, that.returnReason) &&
        Objects.equals(returnReasonNote, that.returnReasonNote) &&
        Objects.equals(fulfillmentLineItemId, that.fulfillmentLineItemId) &&
        Objects.equals(restockingFee, that.restockingFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, returnReason, returnReasonNote, fulfillmentLineItemId, restockingFee);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int quantity;

    
    private ReturnReason returnReason;

    
    private String returnReasonNote = "";

    
    private String fulfillmentLineItemId;

    
    private RestockingFeeInput restockingFee;

    public ReturnLineItemInput build() {
      ReturnLineItemInput result = new ReturnLineItemInput();
      result.quantity = this.quantity;
      result.returnReason = this.returnReason;
      result.returnReasonNote = this.returnReasonNote;
      result.fulfillmentLineItemId = this.fulfillmentLineItemId;
      result.restockingFee = this.restockingFee;
      return result;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
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

    
    public Builder fulfillmentLineItemId(String fulfillmentLineItemId) {
      this.fulfillmentLineItemId = fulfillmentLineItemId;
      return this;
    }

    
    public Builder restockingFee(RestockingFeeInput restockingFee) {
      this.restockingFee = restockingFee;
      return this;
    }
  }
}
