package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to calculate return amounts associated with an order.
 */
public class CalculateReturnInput {
  /**
   * The ID of the order that will be returned.
   */
  private String orderId;

  /**
   * The line items from the order to include in the return.
   */
  private List<CalculateReturnLineItemInput> returnLineItems = Collections.emptyList();

  /**
   * The exchange line items to add to the order.
   */
  private List<CalculateExchangeLineItemInput> exchangeLineItems = Collections.emptyList();

  /**
   * The return shipping fee associated with the return.
   */
  private ReturnShippingFeeInput returnShippingFee;

  public CalculateReturnInput() {
  }

  /**
   * The ID of the order that will be returned.
   */
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   * The line items from the order to include in the return.
   */
  public List<CalculateReturnLineItemInput> getReturnLineItems() {
    return returnLineItems;
  }

  public void setReturnLineItems(List<CalculateReturnLineItemInput> returnLineItems) {
    this.returnLineItems = returnLineItems;
  }

  /**
   * The exchange line items to add to the order.
   */
  public List<CalculateExchangeLineItemInput> getExchangeLineItems() {
    return exchangeLineItems;
  }

  public void setExchangeLineItems(List<CalculateExchangeLineItemInput> exchangeLineItems) {
    this.exchangeLineItems = exchangeLineItems;
  }

  /**
   * The return shipping fee associated with the return.
   */
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
    /**
     * The ID of the order that will be returned.
     */
    private String orderId;

    /**
     * The line items from the order to include in the return.
     */
    private List<CalculateReturnLineItemInput> returnLineItems = Collections.emptyList();

    /**
     * The exchange line items to add to the order.
     */
    private List<CalculateExchangeLineItemInput> exchangeLineItems = Collections.emptyList();

    /**
     * The return shipping fee associated with the return.
     */
    private ReturnShippingFeeInput returnShippingFee;

    public CalculateReturnInput build() {
      CalculateReturnInput result = new CalculateReturnInput();
      result.orderId = this.orderId;
      result.returnLineItems = this.returnLineItems;
      result.exchangeLineItems = this.exchangeLineItems;
      result.returnShippingFee = this.returnShippingFee;
      return result;
    }

    /**
     * The ID of the order that will be returned.
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * The line items from the order to include in the return.
     */
    public Builder returnLineItems(List<CalculateReturnLineItemInput> returnLineItems) {
      this.returnLineItems = returnLineItems;
      return this;
    }

    /**
     * The exchange line items to add to the order.
     */
    public Builder exchangeLineItems(List<CalculateExchangeLineItemInput> exchangeLineItems) {
      this.exchangeLineItems = exchangeLineItems;
      return this;
    }

    /**
     * The return shipping fee associated with the return.
     */
    public Builder returnShippingFee(ReturnShippingFeeInput returnShippingFee) {
      this.returnShippingFee = returnShippingFee;
      return this;
    }
  }
}
