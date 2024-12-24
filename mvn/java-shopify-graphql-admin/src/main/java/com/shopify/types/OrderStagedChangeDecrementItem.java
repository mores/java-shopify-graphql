package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderStagedChangeDecrementItem implements OrderStagedChange {
  
  private int delta;

  
  private LineItem lineItem;

  
  private boolean restock;

  public OrderStagedChangeDecrementItem() {
  }

  
  public int getDelta() {
    return delta;
  }

  public void setDelta(int delta) {
    this.delta = delta;
  }

  
  public LineItem getLineItem() {
    return lineItem;
  }

  public void setLineItem(LineItem lineItem) {
    this.lineItem = lineItem;
  }

  
  public boolean getRestock() {
    return restock;
  }

  public void setRestock(boolean restock) {
    this.restock = restock;
  }

  @Override
  public String toString() {
    return "OrderStagedChangeDecrementItem{delta='" + delta + "', lineItem='" + lineItem + "', restock='" + restock + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderStagedChangeDecrementItem that = (OrderStagedChangeDecrementItem) o;
    return delta == that.delta &&
        Objects.equals(lineItem, that.lineItem) &&
        restock == that.restock;
  }

  @Override
  public int hashCode() {
    return Objects.hash(delta, lineItem, restock);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int delta;

    
    private LineItem lineItem;

    
    private boolean restock;

    public OrderStagedChangeDecrementItem build() {
      OrderStagedChangeDecrementItem result = new OrderStagedChangeDecrementItem();
      result.delta = this.delta;
      result.lineItem = this.lineItem;
      result.restock = this.restock;
      return result;
    }

    
    public Builder delta(int delta) {
      this.delta = delta;
      return this;
    }

    
    public Builder lineItem(LineItem lineItem) {
      this.lineItem = lineItem;
      return this;
    }

    
    public Builder restock(boolean restock) {
      this.restock = restock;
      return this;
    }
  }
}
