package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


public class ReturnInput {
  
  private List<ExchangeLineItemInput> exchangeLineItems;

  
  private OffsetDateTime requestedAt;

  
  private String orderId;

  
  private List<ReturnLineItemInput> returnLineItems;

  
  private ReturnShippingFeeInput returnShippingFee;

  
  private Boolean notifyCustomer = false;

  public ReturnInput() {
  }

  
  public List<ExchangeLineItemInput> getExchangeLineItems() {
    return exchangeLineItems;
  }

  public void setExchangeLineItems(List<ExchangeLineItemInput> exchangeLineItems) {
    this.exchangeLineItems = exchangeLineItems;
  }

  
  public OffsetDateTime getRequestedAt() {
    return requestedAt;
  }

  public void setRequestedAt(OffsetDateTime requestedAt) {
    this.requestedAt = requestedAt;
  }

  
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  
  public List<ReturnLineItemInput> getReturnLineItems() {
    return returnLineItems;
  }

  public void setReturnLineItems(List<ReturnLineItemInput> returnLineItems) {
    this.returnLineItems = returnLineItems;
  }

  
  public ReturnShippingFeeInput getReturnShippingFee() {
    return returnShippingFee;
  }

  public void setReturnShippingFee(ReturnShippingFeeInput returnShippingFee) {
    this.returnShippingFee = returnShippingFee;
  }

  
  public Boolean getNotifyCustomer() {
    return notifyCustomer;
  }

  public void setNotifyCustomer(Boolean notifyCustomer) {
    this.notifyCustomer = notifyCustomer;
  }

  @Override
  public String toString() {
    return "ReturnInput{exchangeLineItems='" + exchangeLineItems + "', requestedAt='" + requestedAt + "', orderId='" + orderId + "', returnLineItems='" + returnLineItems + "', returnShippingFee='" + returnShippingFee + "', notifyCustomer='" + notifyCustomer + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnInput that = (ReturnInput) o;
    return Objects.equals(exchangeLineItems, that.exchangeLineItems) &&
        Objects.equals(requestedAt, that.requestedAt) &&
        Objects.equals(orderId, that.orderId) &&
        Objects.equals(returnLineItems, that.returnLineItems) &&
        Objects.equals(returnShippingFee, that.returnShippingFee) &&
        Objects.equals(notifyCustomer, that.notifyCustomer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeLineItems, requestedAt, orderId, returnLineItems, returnShippingFee, notifyCustomer);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<ExchangeLineItemInput> exchangeLineItems;

    
    private OffsetDateTime requestedAt;

    
    private String orderId;

    
    private List<ReturnLineItemInput> returnLineItems;

    
    private ReturnShippingFeeInput returnShippingFee;

    
    private Boolean notifyCustomer = false;

    public ReturnInput build() {
      ReturnInput result = new ReturnInput();
      result.exchangeLineItems = this.exchangeLineItems;
      result.requestedAt = this.requestedAt;
      result.orderId = this.orderId;
      result.returnLineItems = this.returnLineItems;
      result.returnShippingFee = this.returnShippingFee;
      result.notifyCustomer = this.notifyCustomer;
      return result;
    }

    
    public Builder exchangeLineItems(List<ExchangeLineItemInput> exchangeLineItems) {
      this.exchangeLineItems = exchangeLineItems;
      return this;
    }

    
    public Builder requestedAt(OffsetDateTime requestedAt) {
      this.requestedAt = requestedAt;
      return this;
    }

    
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    
    public Builder returnLineItems(List<ReturnLineItemInput> returnLineItems) {
      this.returnLineItems = returnLineItems;
      return this;
    }

    
    public Builder returnShippingFee(ReturnShippingFeeInput returnShippingFee) {
      this.returnShippingFee = returnShippingFee;
      return this;
    }

    
    public Builder notifyCustomer(Boolean notifyCustomer) {
      this.notifyCustomer = notifyCustomer;
      return this;
    }
  }
}
