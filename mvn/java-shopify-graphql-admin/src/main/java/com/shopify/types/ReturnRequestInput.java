package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ReturnRequestInput {
  
  private String orderId;

  
  private List<ReturnRequestLineItemInput> returnLineItems;

  
  private ReturnShippingFeeInput returnShippingFee;

  public ReturnRequestInput() {
  }

  
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  
  public List<ReturnRequestLineItemInput> getReturnLineItems() {
    return returnLineItems;
  }

  public void setReturnLineItems(List<ReturnRequestLineItemInput> returnLineItems) {
    this.returnLineItems = returnLineItems;
  }

  
  public ReturnShippingFeeInput getReturnShippingFee() {
    return returnShippingFee;
  }

  public void setReturnShippingFee(ReturnShippingFeeInput returnShippingFee) {
    this.returnShippingFee = returnShippingFee;
  }

  @Override
  public String toString() {
    return "ReturnRequestInput{orderId='" + orderId + "', returnLineItems='" + returnLineItems + "', returnShippingFee='" + returnShippingFee + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnRequestInput that = (ReturnRequestInput) o;
    return Objects.equals(orderId, that.orderId) &&
        Objects.equals(returnLineItems, that.returnLineItems) &&
        Objects.equals(returnShippingFee, that.returnShippingFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, returnLineItems, returnShippingFee);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String orderId;

    
    private List<ReturnRequestLineItemInput> returnLineItems;

    
    private ReturnShippingFeeInput returnShippingFee;

    public ReturnRequestInput build() {
      ReturnRequestInput result = new ReturnRequestInput();
      result.orderId = this.orderId;
      result.returnLineItems = this.returnLineItems;
      result.returnShippingFee = this.returnShippingFee;
      return result;
    }

    
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    
    public Builder returnLineItems(List<ReturnRequestLineItemInput> returnLineItems) {
      this.returnLineItems = returnLineItems;
      return this;
    }

    
    public Builder returnShippingFee(ReturnShippingFeeInput returnShippingFee) {
      this.returnShippingFee = returnShippingFee;
      return this;
    }
  }
}
