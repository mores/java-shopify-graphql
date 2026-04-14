package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentOrdersReroute` mutation.
 */
public class FulfillmentOrdersReroutePayload {
  /**
   * The fulfillment orders which contains the moved line items.
   */
  private List<FulfillmentOrder> movedFulfillmentOrders;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<FulfillmentOrdersRerouteUserError> userErrors;

  public FulfillmentOrdersReroutePayload() {
  }

  /**
   * The fulfillment orders which contains the moved line items.
   */
  public List<FulfillmentOrder> getMovedFulfillmentOrders() {
    return movedFulfillmentOrders;
  }

  public void setMovedFulfillmentOrders(List<FulfillmentOrder> movedFulfillmentOrders) {
    this.movedFulfillmentOrders = movedFulfillmentOrders;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<FulfillmentOrdersRerouteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<FulfillmentOrdersRerouteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FulfillmentOrdersReroutePayload{movedFulfillmentOrders='" + movedFulfillmentOrders + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrdersReroutePayload that = (FulfillmentOrdersReroutePayload) o;
    return Objects.equals(movedFulfillmentOrders, that.movedFulfillmentOrders) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movedFulfillmentOrders, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The fulfillment orders which contains the moved line items.
     */
    private List<FulfillmentOrder> movedFulfillmentOrders;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<FulfillmentOrdersRerouteUserError> userErrors;

    public FulfillmentOrdersReroutePayload build() {
      FulfillmentOrdersReroutePayload result = new FulfillmentOrdersReroutePayload();
      result.movedFulfillmentOrders = this.movedFulfillmentOrders;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The fulfillment orders which contains the moved line items.
     */
    public Builder movedFulfillmentOrders(List<FulfillmentOrder> movedFulfillmentOrders) {
      this.movedFulfillmentOrders = movedFulfillmentOrders;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<FulfillmentOrdersRerouteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
