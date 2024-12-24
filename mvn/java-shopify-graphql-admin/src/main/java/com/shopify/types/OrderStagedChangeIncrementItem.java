package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderStagedChangeIncrementItem implements OrderStagedChange {
  
  private int delta;

  
  private LineItem lineItem;

  public OrderStagedChangeIncrementItem() {
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

  @Override
  public String toString() {
    return "OrderStagedChangeIncrementItem{delta='" + delta + "', lineItem='" + lineItem + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderStagedChangeIncrementItem that = (OrderStagedChangeIncrementItem) o;
    return delta == that.delta &&
        Objects.equals(lineItem, that.lineItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delta, lineItem);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int delta;

    
    private LineItem lineItem;

    public OrderStagedChangeIncrementItem build() {
      OrderStagedChangeIncrementItem result = new OrderStagedChangeIncrementItem();
      result.delta = this.delta;
      result.lineItem = this.lineItem;
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
  }
}
