package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields which control certain side affects.
 */
public class OrderCreateOptionsInput {
  /**
   * The behaviour to use when updating inventory.
   */
  private OrderCreateInputsInventoryBehavior inventoryBehaviour = OrderCreateInputsInventoryBehavior.BYPASS;

  /**
   * Whether to send an order confirmation to the customer.
   */
  private Boolean sendReceipt = false;

  /**
   * Whether to send a shipping confirmation to the customer.
   */
  private Boolean sendFulfillmentReceipt = false;

  public OrderCreateOptionsInput() {
  }

  /**
   * The behaviour to use when updating inventory.
   */
  public OrderCreateInputsInventoryBehavior getInventoryBehaviour() {
    return inventoryBehaviour;
  }

  public void setInventoryBehaviour(OrderCreateInputsInventoryBehavior inventoryBehaviour) {
    this.inventoryBehaviour = inventoryBehaviour;
  }

  /**
   * Whether to send an order confirmation to the customer.
   */
  public Boolean getSendReceipt() {
    return sendReceipt;
  }

  public void setSendReceipt(Boolean sendReceipt) {
    this.sendReceipt = sendReceipt;
  }

  /**
   * Whether to send a shipping confirmation to the customer.
   */
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
    /**
     * The behaviour to use when updating inventory.
     */
    private OrderCreateInputsInventoryBehavior inventoryBehaviour = OrderCreateInputsInventoryBehavior.BYPASS;

    /**
     * Whether to send an order confirmation to the customer.
     */
    private Boolean sendReceipt = false;

    /**
     * Whether to send a shipping confirmation to the customer.
     */
    private Boolean sendFulfillmentReceipt = false;

    public OrderCreateOptionsInput build() {
      OrderCreateOptionsInput result = new OrderCreateOptionsInput();
      result.inventoryBehaviour = this.inventoryBehaviour;
      result.sendReceipt = this.sendReceipt;
      result.sendFulfillmentReceipt = this.sendFulfillmentReceipt;
      return result;
    }

    /**
     * The behaviour to use when updating inventory.
     */
    public Builder inventoryBehaviour(OrderCreateInputsInventoryBehavior inventoryBehaviour) {
      this.inventoryBehaviour = inventoryBehaviour;
      return this;
    }

    /**
     * Whether to send an order confirmation to the customer.
     */
    public Builder sendReceipt(Boolean sendReceipt) {
      this.sendReceipt = sendReceipt;
      return this;
    }

    /**
     * Whether to send a shipping confirmation to the customer.
     */
    public Builder sendFulfillmentReceipt(Boolean sendFulfillmentReceipt) {
      this.sendFulfillmentReceipt = sendFulfillmentReceipt;
      return this;
    }
  }
}
