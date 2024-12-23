package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a return.
 */
public class ReturnInput {
  /**
   * The new line items to be added to the order.
   */
  private List<ExchangeLineItemInput> exchangeLineItems;

  /**
   * The UTC date and time when the return was first solicited by the customer.
   */
  private OffsetDateTime requestedAt;

  /**
   * The ID of the order to be returned.
   */
  private String orderId;

  /**
   * The return line items list to be handled.
   */
  private List<ReturnLineItemInput> returnLineItems;

  /**
   * The return shipping fee to capture.
   */
  private ReturnShippingFeeInput returnShippingFee;

  /**
   * When `true` the customer will receive a notification if there's an `Order.email` present.
   */
  private Boolean notifyCustomer = false;

  public ReturnInput() {
  }

  /**
   * The new line items to be added to the order.
   */
  public List<ExchangeLineItemInput> getExchangeLineItems() {
    return exchangeLineItems;
  }

  public void setExchangeLineItems(List<ExchangeLineItemInput> exchangeLineItems) {
    this.exchangeLineItems = exchangeLineItems;
  }

  /**
   * The UTC date and time when the return was first solicited by the customer.
   */
  public OffsetDateTime getRequestedAt() {
    return requestedAt;
  }

  public void setRequestedAt(OffsetDateTime requestedAt) {
    this.requestedAt = requestedAt;
  }

  /**
   * The ID of the order to be returned.
   */
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   * The return line items list to be handled.
   */
  public List<ReturnLineItemInput> getReturnLineItems() {
    return returnLineItems;
  }

  public void setReturnLineItems(List<ReturnLineItemInput> returnLineItems) {
    this.returnLineItems = returnLineItems;
  }

  /**
   * The return shipping fee to capture.
   */
  public ReturnShippingFeeInput getReturnShippingFee() {
    return returnShippingFee;
  }

  public void setReturnShippingFee(ReturnShippingFeeInput returnShippingFee) {
    this.returnShippingFee = returnShippingFee;
  }

  /**
   * When `true` the customer will receive a notification if there's an `Order.email` present.
   */
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
    /**
     * The new line items to be added to the order.
     */
    private List<ExchangeLineItemInput> exchangeLineItems;

    /**
     * The UTC date and time when the return was first solicited by the customer.
     */
    private OffsetDateTime requestedAt;

    /**
     * The ID of the order to be returned.
     */
    private String orderId;

    /**
     * The return line items list to be handled.
     */
    private List<ReturnLineItemInput> returnLineItems;

    /**
     * The return shipping fee to capture.
     */
    private ReturnShippingFeeInput returnShippingFee;

    /**
     * When `true` the customer will receive a notification if there's an `Order.email` present.
     */
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

    /**
     * The new line items to be added to the order.
     */
    public Builder exchangeLineItems(List<ExchangeLineItemInput> exchangeLineItems) {
      this.exchangeLineItems = exchangeLineItems;
      return this;
    }

    /**
     * The UTC date and time when the return was first solicited by the customer.
     */
    public Builder requestedAt(OffsetDateTime requestedAt) {
      this.requestedAt = requestedAt;
      return this;
    }

    /**
     * The ID of the order to be returned.
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * The return line items list to be handled.
     */
    public Builder returnLineItems(List<ReturnLineItemInput> returnLineItems) {
      this.returnLineItems = returnLineItems;
      return this;
    }

    /**
     * The return shipping fee to capture.
     */
    public Builder returnShippingFee(ReturnShippingFeeInput returnShippingFee) {
      this.returnShippingFee = returnShippingFee;
      return this;
    }

    /**
     * When `true` the customer will receive a notification if there's an `Order.email` present.
     */
    public Builder notifyCustomer(Boolean notifyCustomer) {
      this.notifyCustomer = notifyCustomer;
      return this;
    }
  }
}
