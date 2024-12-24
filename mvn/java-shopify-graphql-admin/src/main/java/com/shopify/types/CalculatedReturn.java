package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CalculatedReturn {
  
  private List<CalculatedExchangeLineItem> exchangeLineItems;

  
  private String id;

  
  private List<CalculatedReturnLineItem> returnLineItems;

  
  private CalculatedReturnShippingFee returnShippingFee;

  public CalculatedReturn() {
  }

  
  public List<CalculatedExchangeLineItem> getExchangeLineItems() {
    return exchangeLineItems;
  }

  public void setExchangeLineItems(List<CalculatedExchangeLineItem> exchangeLineItems) {
    this.exchangeLineItems = exchangeLineItems;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public List<CalculatedReturnLineItem> getReturnLineItems() {
    return returnLineItems;
  }

  public void setReturnLineItems(List<CalculatedReturnLineItem> returnLineItems) {
    this.returnLineItems = returnLineItems;
  }

  
  public CalculatedReturnShippingFee getReturnShippingFee() {
    return returnShippingFee;
  }

  public void setReturnShippingFee(CalculatedReturnShippingFee returnShippingFee) {
    this.returnShippingFee = returnShippingFee;
  }

  @Override
  public String toString() {
    return "CalculatedReturn{exchangeLineItems='" + exchangeLineItems + "', id='" + id + "', returnLineItems='" + returnLineItems + "', returnShippingFee='" + returnShippingFee + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedReturn that = (CalculatedReturn) o;
    return Objects.equals(exchangeLineItems, that.exchangeLineItems) &&
        Objects.equals(id, that.id) &&
        Objects.equals(returnLineItems, that.returnLineItems) &&
        Objects.equals(returnShippingFee, that.returnShippingFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeLineItems, id, returnLineItems, returnShippingFee);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<CalculatedExchangeLineItem> exchangeLineItems;

    
    private String id;

    
    private List<CalculatedReturnLineItem> returnLineItems;

    
    private CalculatedReturnShippingFee returnShippingFee;

    public CalculatedReturn build() {
      CalculatedReturn result = new CalculatedReturn();
      result.exchangeLineItems = this.exchangeLineItems;
      result.id = this.id;
      result.returnLineItems = this.returnLineItems;
      result.returnShippingFee = this.returnShippingFee;
      return result;
    }

    
    public Builder exchangeLineItems(List<CalculatedExchangeLineItem> exchangeLineItems) {
      this.exchangeLineItems = exchangeLineItems;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder returnLineItems(List<CalculatedReturnLineItem> returnLineItems) {
      this.returnLineItems = returnLineItems;
      return this;
    }

    
    public Builder returnShippingFee(CalculatedReturnShippingFee returnShippingFee) {
      this.returnShippingFee = returnShippingFee;
      return this;
    }
  }
}
