package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentOrderReleaseHold` mutation.
 */
public class FulfillmentOrderReleaseHoldPayload {
  /**
   * The fulfillment order on which the hold was released.
   */
  private FulfillmentOrder fulfillmentOrder;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<FulfillmentOrderReleaseHoldUserError> userErrors;

  public FulfillmentOrderReleaseHoldPayload() {
  }

  /**
   * The fulfillment order on which the hold was released.
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
  public List<FulfillmentOrderReleaseHoldUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<FulfillmentOrderReleaseHoldUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderReleaseHoldPayload{fulfillmentOrder='" + fulfillmentOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderReleaseHoldPayload that = (FulfillmentOrderReleaseHoldPayload) o;
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
     * The fulfillment order on which the hold was released.
     */
    private FulfillmentOrder fulfillmentOrder;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<FulfillmentOrderReleaseHoldUserError> userErrors;

    public FulfillmentOrderReleaseHoldPayload build() {
      FulfillmentOrderReleaseHoldPayload result = new FulfillmentOrderReleaseHoldPayload();
      result.fulfillmentOrder = this.fulfillmentOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The fulfillment order on which the hold was released.
     */
    public Builder fulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
      this.fulfillmentOrder = fulfillmentOrder;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<FulfillmentOrderReleaseHoldUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
