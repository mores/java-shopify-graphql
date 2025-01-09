package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentOrderLineItemsPreparedForPickup` mutation.
 */
public class FulfillmentOrderLineItemsPreparedForPickupPayload {
  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<FulfillmentOrderLineItemsPreparedForPickupUserError> userErrors;

  public FulfillmentOrderLineItemsPreparedForPickupPayload() {
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<FulfillmentOrderLineItemsPreparedForPickupUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<FulfillmentOrderLineItemsPreparedForPickupUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderLineItemsPreparedForPickupPayload{userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderLineItemsPreparedForPickupPayload that = (FulfillmentOrderLineItemsPreparedForPickupPayload) o;
    return Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<FulfillmentOrderLineItemsPreparedForPickupUserError> userErrors;

    public FulfillmentOrderLineItemsPreparedForPickupPayload build() {
      FulfillmentOrderLineItemsPreparedForPickupPayload result = new FulfillmentOrderLineItemsPreparedForPickupPayload();
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(
        List<FulfillmentOrderLineItemsPreparedForPickupUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
