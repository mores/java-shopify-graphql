package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentOrderCancel` mutation.
 */
public class FulfillmentOrderCancelPayload {
  /**
   * The fulfillment order that was marked as canceled.
   */
  private FulfillmentOrder fulfillmentOrder;

  /**
   * The fulfillment order that was created to replace the canceled fulfillment order.
   */
  private FulfillmentOrder replacementFulfillmentOrder;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public FulfillmentOrderCancelPayload() {
  }

  /**
   * The fulfillment order that was marked as canceled.
   */
  public FulfillmentOrder getFulfillmentOrder() {
    return fulfillmentOrder;
  }

  public void setFulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
    this.fulfillmentOrder = fulfillmentOrder;
  }

  /**
   * The fulfillment order that was created to replace the canceled fulfillment order.
   */
  public FulfillmentOrder getReplacementFulfillmentOrder() {
    return replacementFulfillmentOrder;
  }

  public void setReplacementFulfillmentOrder(FulfillmentOrder replacementFulfillmentOrder) {
    this.replacementFulfillmentOrder = replacementFulfillmentOrder;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderCancelPayload{fulfillmentOrder='" + fulfillmentOrder + "', replacementFulfillmentOrder='" + replacementFulfillmentOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderCancelPayload that = (FulfillmentOrderCancelPayload) o;
    return Objects.equals(fulfillmentOrder, that.fulfillmentOrder) &&
        Objects.equals(replacementFulfillmentOrder, that.replacementFulfillmentOrder) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrder, replacementFulfillmentOrder, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The fulfillment order that was marked as canceled.
     */
    private FulfillmentOrder fulfillmentOrder;

    /**
     * The fulfillment order that was created to replace the canceled fulfillment order.
     */
    private FulfillmentOrder replacementFulfillmentOrder;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public FulfillmentOrderCancelPayload build() {
      FulfillmentOrderCancelPayload result = new FulfillmentOrderCancelPayload();
      result.fulfillmentOrder = this.fulfillmentOrder;
      result.replacementFulfillmentOrder = this.replacementFulfillmentOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The fulfillment order that was marked as canceled.
     */
    public Builder fulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
      this.fulfillmentOrder = fulfillmentOrder;
      return this;
    }

    /**
     * The fulfillment order that was created to replace the canceled fulfillment order.
     */
    public Builder replacementFulfillmentOrder(FulfillmentOrder replacementFulfillmentOrder) {
      this.replacementFulfillmentOrder = replacementFulfillmentOrder;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
