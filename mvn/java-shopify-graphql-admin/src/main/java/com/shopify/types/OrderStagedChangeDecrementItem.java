package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An removal of items from an existing line item on the order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderStagedChangeDecrementItem implements OrderStagedChange {
  /**
   * The number of items removed.
   */
  private int delta;

  /**
   * The original line item.
   */
  private LineItem lineItem;

  /**
   * The intention to restock the removed items.
   */
  private boolean restock;

  public OrderStagedChangeDecrementItem() {
  }

  /**
   * The number of items removed.
   */
  public int getDelta() {
    return delta;
  }

  public void setDelta(int delta) {
    this.delta = delta;
  }

  /**
   * The original line item.
   */
  public LineItem getLineItem() {
    return lineItem;
  }

  public void setLineItem(LineItem lineItem) {
    this.lineItem = lineItem;
  }

  /**
   * The intention to restock the removed items.
   */
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
    /**
     * The number of items removed.
     */
    private int delta;

    /**
     * The original line item.
     */
    private LineItem lineItem;

    /**
     * The intention to restock the removed items.
     */
    private boolean restock;

    public OrderStagedChangeDecrementItem build() {
      OrderStagedChangeDecrementItem result = new OrderStagedChangeDecrementItem();
      result.delta = this.delta;
      result.lineItem = this.lineItem;
      result.restock = this.restock;
      return result;
    }

    /**
     * The number of items removed.
     */
    public Builder delta(int delta) {
      this.delta = delta;
      return this;
    }

    /**
     * The original line item.
     */
    public Builder lineItem(LineItem lineItem) {
      this.lineItem = lineItem;
      return this;
    }

    /**
     * The intention to restock the removed items.
     */
    public Builder restock(boolean restock) {
      this.restock = restock;
      return this;
    }
  }
}
