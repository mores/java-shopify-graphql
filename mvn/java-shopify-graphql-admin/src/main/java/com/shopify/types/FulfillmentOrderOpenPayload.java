package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentOrderOpen` mutation.
 */
public class FulfillmentOrderOpenPayload {
  /**
   * The fulfillment order that was transitioned to open and is fulfillable.
   */
  private FulfillmentOrder fulfillmentOrder;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public FulfillmentOrderOpenPayload() {
  }

  /**
   * The fulfillment order that was transitioned to open and is fulfillable.
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
    return "FulfillmentOrderOpenPayload{fulfillmentOrder='" + fulfillmentOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderOpenPayload that = (FulfillmentOrderOpenPayload) o;
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
     * The fulfillment order that was transitioned to open and is fulfillable.
     */
    private FulfillmentOrder fulfillmentOrder;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public FulfillmentOrderOpenPayload build() {
      FulfillmentOrderOpenPayload result = new FulfillmentOrderOpenPayload();
      result.fulfillmentOrder = this.fulfillmentOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The fulfillment order that was transitioned to open and is fulfillable.
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
