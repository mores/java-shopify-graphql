package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for requesting a return.
 */
public class ReturnRequestInput {
  /**
   * The ID of the order that's being returned.
   */
  private String orderId;

  /**
   * The line items that are being handled in the return.
   */
  private List<ReturnRequestLineItemInput> returnLineItems;

  /**
   * The return shipping fee to capture.
   */
  private ReturnShippingFeeInput returnShippingFee;

  public ReturnRequestInput() {
  }

  /**
   * The ID of the order that's being returned.
   */
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   * The line items that are being handled in the return.
   */
  public List<ReturnRequestLineItemInput> getReturnLineItems() {
    return returnLineItems;
  }

  public void setReturnLineItems(List<ReturnRequestLineItemInput> returnLineItems) {
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

  @Override
  public String toString() {
    return "ReturnRequestInput{orderId='" + orderId + "', returnLineItems='" + returnLineItems + "', returnShippingFee='" + returnShippingFee + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnRequestInput that = (ReturnRequestInput) o;
    return Objects.equals(orderId, that.orderId) &&
        Objects.equals(returnLineItems, that.returnLineItems) &&
        Objects.equals(returnShippingFee, that.returnShippingFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, returnLineItems, returnShippingFee);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the order that's being returned.
     */
    private String orderId;

    /**
     * The line items that are being handled in the return.
     */
    private List<ReturnRequestLineItemInput> returnLineItems;

    /**
     * The return shipping fee to capture.
     */
    private ReturnShippingFeeInput returnShippingFee;

    public ReturnRequestInput build() {
      ReturnRequestInput result = new ReturnRequestInput();
      result.orderId = this.orderId;
      result.returnLineItems = this.returnLineItems;
      result.returnShippingFee = this.returnShippingFee;
      return result;
    }

    /**
     * The ID of the order that's being returned.
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * The line items that are being handled in the return.
     */
    public Builder returnLineItems(List<ReturnRequestLineItemInput> returnLineItems) {
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
  }
}
