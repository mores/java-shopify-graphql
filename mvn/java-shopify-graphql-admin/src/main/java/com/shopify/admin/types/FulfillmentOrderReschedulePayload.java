package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentOrderReschedule` mutation.
 */
public class FulfillmentOrderReschedulePayload {
  /**
   * A fulfillment order with the rescheduled line items.
   *   
   * Fulfillment orders may be merged if they have the same `fulfillAt` datetime.
   *   
   * If the fulfillment order is merged then the resulting fulfillment order will be returned.
   * Otherwise the original fulfillment order will be returned with an updated `fulfillAt` datetime.
   */
  private FulfillmentOrder fulfillmentOrder;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<FulfillmentOrderRescheduleUserError> userErrors;

  public FulfillmentOrderReschedulePayload() {
  }

  /**
   * A fulfillment order with the rescheduled line items.
   *   
   * Fulfillment orders may be merged if they have the same `fulfillAt` datetime.
   *   
   * If the fulfillment order is merged then the resulting fulfillment order will be returned.
   * Otherwise the original fulfillment order will be returned with an updated `fulfillAt` datetime.
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
  public List<FulfillmentOrderRescheduleUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<FulfillmentOrderRescheduleUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderReschedulePayload{fulfillmentOrder='" + fulfillmentOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderReschedulePayload that = (FulfillmentOrderReschedulePayload) o;
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
     * A fulfillment order with the rescheduled line items.
     *   
     * Fulfillment orders may be merged if they have the same `fulfillAt` datetime.
     *   
     * If the fulfillment order is merged then the resulting fulfillment order will be returned.
     * Otherwise the original fulfillment order will be returned with an updated `fulfillAt` datetime.
     */
    private FulfillmentOrder fulfillmentOrder;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<FulfillmentOrderRescheduleUserError> userErrors;

    public FulfillmentOrderReschedulePayload build() {
      FulfillmentOrderReschedulePayload result = new FulfillmentOrderReschedulePayload();
      result.fulfillmentOrder = this.fulfillmentOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * A fulfillment order with the rescheduled line items.
     *   
     * Fulfillment orders may be merged if they have the same `fulfillAt` datetime.
     *   
     * If the fulfillment order is merged then the resulting fulfillment order will be returned.
     * Otherwise the original fulfillment order will be returned with an updated `fulfillAt` datetime.
     */
    public Builder fulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
      this.fulfillmentOrder = fulfillmentOrder;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<FulfillmentOrderRescheduleUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
