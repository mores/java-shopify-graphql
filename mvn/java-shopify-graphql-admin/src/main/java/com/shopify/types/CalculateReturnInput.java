package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class CalculateReturnInput {
  
  private String orderId;

  
  private List<CalculateReturnLineItemInput> returnLineItems = Collections.emptyList();

  
  private List<CalculateExchangeLineItemInput> exchangeLineItems = Collections.emptyList();

  
  private ReturnShippingFeeInput returnShippingFee;

  public CalculateReturnInput() {
  }

  
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  
  public List<CalculateReturnLineItemInput> getReturnLineItems() {
    return returnLineItems;
  }

  public void setReturnLineItems(List<CalculateReturnLineItemInput> returnLineItems) {
    this.returnLineItems = returnLineItems;
  }

  
  public List<CalculateExchangeLineItemInput> getExchangeLineItems() {
    return exchangeLineItems;
  }

  public void setExchangeLineItems(List<CalculateExchangeLineItemInput> exchangeLineItems) {
    this.exchangeLineItems = exchangeLineItems;
  }

  
  public ReturnShippingFeeInput getReturnShippingFee() {
    return returnShippingFee;
  }

  public void setReturnShippingFee(ReturnShippingFeeInput returnShippingFee) {
    this.returnShippingFee = returnShippingFee;
  }

  @Override
  public String toString() {
    return "CalculateReturnInput{orderId='" + orderId + "', returnLineItems='" + returnLineItems + "', exchangeLineItems='" + exchangeLineItems + "', returnShippingFee='" + returnShippingFee + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculateReturnInput that = (CalculateReturnInput) o;
    return Objects.equals(orderId, that.orderId) &&
        Objects.equals(returnLineItems, that.returnLineItems) &&
        Objects.equals(exchangeLineItems, that.exchangeLineItems) &&
        Objects.equals(returnShippingFee, that.returnShippingFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, returnLineItems, exchangeLineItems, returnShippingFee);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String orderId;

    
    private List<CalculateReturnLineItemInput> returnLineItems = Collections.emptyList();

    
    private List<CalculateExchangeLineItemInput> exchangeLineItems = Collections.emptyList();

    
    private ReturnShippingFeeInput returnShippingFee;

    public CalculateReturnInput build() {
      CalculateReturnInput result = new CalculateReturnInput();
      result.orderId = this.orderId;
      result.returnLineItems = this.returnLineItems;
      result.exchangeLineItems = this.exchangeLineItems;
      result.returnShippingFee = this.returnShippingFee;
      return result;
    }

    
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    
    public Builder returnLineItems(List<CalculateReturnLineItemInput> returnLineItems) {
      this.returnLineItems = returnLineItems;
      return this;
    }

    
    public Builder exchangeLineItems(List<CalculateExchangeLineItemInput> exchangeLineItems) {
      this.exchangeLineItems = exchangeLineItems;
      return this;
    }

    
    public Builder returnShippingFee(ReturnShippingFeeInput returnShippingFee) {
      this.returnShippingFee = returnShippingFee;
      return this;
    }
  }
}
