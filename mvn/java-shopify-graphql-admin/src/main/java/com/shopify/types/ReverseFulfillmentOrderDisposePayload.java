package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `reverseFulfillmentOrderDispose` mutation.
 */
public class ReverseFulfillmentOrderDisposePayload {
  /**
   * The disposed reverse fulfillment order line items.
   */
  private List<ReverseFulfillmentOrderLineItem> reverseFulfillmentOrderLineItems;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ReturnUserError> userErrors;

  public ReverseFulfillmentOrderDisposePayload() {
  }

  /**
   * The disposed reverse fulfillment order line items.
   */
  public List<ReverseFulfillmentOrderLineItem> getReverseFulfillmentOrderLineItems() {
    return reverseFulfillmentOrderLineItems;
  }

  public void setReverseFulfillmentOrderLineItems(
      List<ReverseFulfillmentOrderLineItem> reverseFulfillmentOrderLineItems) {
    this.reverseFulfillmentOrderLineItems = reverseFulfillmentOrderLineItems;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ReturnUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ReturnUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ReverseFulfillmentOrderDisposePayload{reverseFulfillmentOrderLineItems='" + reverseFulfillmentOrderLineItems + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseFulfillmentOrderDisposePayload that = (ReverseFulfillmentOrderDisposePayload) o;
    return Objects.equals(reverseFulfillmentOrderLineItems, that.reverseFulfillmentOrderLineItems) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reverseFulfillmentOrderLineItems, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The disposed reverse fulfillment order line items.
     */
    private List<ReverseFulfillmentOrderLineItem> reverseFulfillmentOrderLineItems;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ReturnUserError> userErrors;

    public ReverseFulfillmentOrderDisposePayload build() {
      ReverseFulfillmentOrderDisposePayload result = new ReverseFulfillmentOrderDisposePayload();
      result.reverseFulfillmentOrderLineItems = this.reverseFulfillmentOrderLineItems;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The disposed reverse fulfillment order line items.
     */
    public Builder reverseFulfillmentOrderLineItems(
        List<ReverseFulfillmentOrderLineItem> reverseFulfillmentOrderLineItems) {
      this.reverseFulfillmentOrderLineItems = reverseFulfillmentOrderLineItems;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ReturnUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
