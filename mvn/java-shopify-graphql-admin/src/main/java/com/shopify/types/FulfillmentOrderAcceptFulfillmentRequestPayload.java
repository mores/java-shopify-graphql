package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentOrderAcceptFulfillmentRequest` mutation.
 */
public class FulfillmentOrderAcceptFulfillmentRequestPayload {
  /**
   * The fulfillment order whose fulfillment request was accepted.
   */
  private FulfillmentOrder fulfillmentOrder;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public FulfillmentOrderAcceptFulfillmentRequestPayload() {
  }

  /**
   * The fulfillment order whose fulfillment request was accepted.
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
    return "FulfillmentOrderAcceptFulfillmentRequestPayload{fulfillmentOrder='" + fulfillmentOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderAcceptFulfillmentRequestPayload that = (FulfillmentOrderAcceptFulfillmentRequestPayload) o;
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
     * The fulfillment order whose fulfillment request was accepted.
     */
    private FulfillmentOrder fulfillmentOrder;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public FulfillmentOrderAcceptFulfillmentRequestPayload build() {
      FulfillmentOrderAcceptFulfillmentRequestPayload result = new FulfillmentOrderAcceptFulfillmentRequestPayload();
      result.fulfillmentOrder = this.fulfillmentOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The fulfillment order whose fulfillment request was accepted.
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
