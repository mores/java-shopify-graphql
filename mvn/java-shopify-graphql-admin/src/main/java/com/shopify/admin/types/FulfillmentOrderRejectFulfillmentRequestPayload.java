package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentOrderRejectFulfillmentRequest` mutation.
 */
public class FulfillmentOrderRejectFulfillmentRequestPayload {
  /**
   * The fulfillment order whose fulfillment request was rejected.
   */
  private FulfillmentOrder fulfillmentOrder;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public FulfillmentOrderRejectFulfillmentRequestPayload() {
  }

  /**
   * The fulfillment order whose fulfillment request was rejected.
   */
  public FulfillmentOrder getFulfillmentOrder() {
    return fulfillmentOrder;
  }

  public void setFulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
    this.fulfillmentOrder = fulfillmentOrder;
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
    return "FulfillmentOrderRejectFulfillmentRequestPayload{fulfillmentOrder='" + fulfillmentOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderRejectFulfillmentRequestPayload that = (FulfillmentOrderRejectFulfillmentRequestPayload) o;
    return Objects.equals(fulfillmentOrder, that.fulfillmentOrder) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrder, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The fulfillment order whose fulfillment request was rejected.
     */
    private FulfillmentOrder fulfillmentOrder;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public FulfillmentOrderRejectFulfillmentRequestPayload build() {
      FulfillmentOrderRejectFulfillmentRequestPayload result = new FulfillmentOrderRejectFulfillmentRequestPayload();
      result.fulfillmentOrder = this.fulfillmentOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The fulfillment order whose fulfillment request was rejected.
     */
    public Builder fulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
      this.fulfillmentOrder = fulfillmentOrder;
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
