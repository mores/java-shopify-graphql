package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OrderCreateOptionsInput {
  
  private OrderCreateInputsInventoryBehavior inventoryBehaviour = OrderCreateInputsInventoryBehavior.BYPASS;

  
  private Boolean sendReceipt = false;

  
  private Boolean sendFulfillmentReceipt = false;

  public OrderCreateOptionsInput() {
  }

  
  public OrderCreateInputsInventoryBehavior getInventoryBehaviour() {
    return inventoryBehaviour;
  }

  public void setInventoryBehaviour(OrderCreateInputsInventoryBehavior inventoryBehaviour) {
    this.inventoryBehaviour = inventoryBehaviour;
  }

  
  public Boolean getSendReceipt() {
    return sendReceipt;
  }

  public void setSendReceipt(Boolean sendReceipt) {
    this.sendReceipt = sendReceipt;
  }

  
  public Boolean getSendFulfillmentReceipt() {
    return sendFulfillmentReceipt;
  }

  public void setSendFulfillmentReceipt(Boolean sendFulfillmentReceipt) {
    this.sendFulfillmentReceipt = sendFulfillmentReceipt;
  }

  @Override
  public String toString() {
    return "OrderCreateOptionsInput{inventoryBehaviour='" + inventoryBehaviour + "', sendReceipt='" + sendReceipt + "', sendFulfillmentReceipt='" + sendFulfillmentReceipt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateOptionsInput that = (OrderCreateOptionsInput) o;
    return Objects.equals(inventoryBehaviour, that.inventoryBehaviour) &&
        Objects.equals(sendReceipt, that.sendReceipt) &&
        Objects.equals(sendFulfillmentReceipt, that.sendFulfillmentReceipt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryBehaviour, sendReceipt, sendFulfillmentReceipt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OrderCreateInputsInventoryBehavior inventoryBehaviour = OrderCreateInputsInventoryBehavior.BYPASS;

    
    private Boolean sendReceipt = false;

    
    private Boolean sendFulfillmentReceipt = false;

    public OrderCreateOptionsInput build() {
      OrderCreateOptionsInput result = new OrderCreateOptionsInput();
      result.inventoryBehaviour = this.inventoryBehaviour;
      result.sendReceipt = this.sendReceipt;
      result.sendFulfillmentReceipt = this.sendFulfillmentReceipt;
      return result;
    }

    
    public Builder inventoryBehaviour(OrderCreateInputsInventoryBehavior inventoryBehaviour) {
      this.inventoryBehaviour = inventoryBehaviour;
      return this;
    }

    
    public Builder sendReceipt(Boolean sendReceipt) {
      this.sendReceipt = sendReceipt;
      return this;
    }

    
    public Builder sendFulfillmentReceipt(Boolean sendFulfillmentReceipt) {
      this.sendFulfillmentReceipt = sendFulfillmentReceipt;
      return this;
    }
  }
}
