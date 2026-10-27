package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for creating a requested order edit.
 */
public class RequestedOrderEditCreateInput {
  /**
   * The ID of the order to create a requested order edit for.
   */
  private String orderId;

  /**
   * The line item changes to include in the requested order edit, grouped by the type of change.
   */
  private RequestedOrderEditLineItemsInput lineItems;

  public RequestedOrderEditCreateInput() {
  }

  /**
   * The ID of the order to create a requested order edit for.
   */
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   * The line item changes to include in the requested order edit, grouped by the type of change.
   */
  public RequestedOrderEditLineItemsInput getLineItems() {
    return lineItems;
  }

  public void setLineItems(RequestedOrderEditLineItemsInput lineItems) {
    this.lineItems = lineItems;
  }

  @Override
  public String toString() {
    return "RequestedOrderEditCreateInput{orderId='" + orderId + "', lineItems='" + lineItems + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RequestedOrderEditCreateInput that = (RequestedOrderEditCreateInput) o;
    return Objects.equals(orderId, that.orderId) &&
        Objects.equals(lineItems, that.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, lineItems);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the order to create a requested order edit for.
     */
    private String orderId;

    /**
     * The line item changes to include in the requested order edit, grouped by the type of change.
     */
    private RequestedOrderEditLineItemsInput lineItems;

    public RequestedOrderEditCreateInput build() {
      RequestedOrderEditCreateInput result = new RequestedOrderEditCreateInput();
      result.orderId = this.orderId;
      result.lineItems = this.lineItems;
      return result;
    }

    /**
     * The ID of the order to create a requested order edit for.
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * The line item changes to include in the requested order edit, grouped by the type of change.
     */
    public Builder lineItems(RequestedOrderEditLineItemsInput lineItems) {
      this.lineItems = lineItems;
      return this;
    }
  }
}
