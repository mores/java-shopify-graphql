package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentOrderSplit` mutation.
 */
public class FulfillmentOrderSplitPayload {
  /**
   * The result of the fulfillment order splits.
   */
  private List<FulfillmentOrderSplitResult> fulfillmentOrderSplits;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<FulfillmentOrderSplitUserError> userErrors;

  public FulfillmentOrderSplitPayload() {
  }

  /**
   * The result of the fulfillment order splits.
   */
  public List<FulfillmentOrderSplitResult> getFulfillmentOrderSplits() {
    return fulfillmentOrderSplits;
  }

  public void setFulfillmentOrderSplits(List<FulfillmentOrderSplitResult> fulfillmentOrderSplits) {
    this.fulfillmentOrderSplits = fulfillmentOrderSplits;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<FulfillmentOrderSplitUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<FulfillmentOrderSplitUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderSplitPayload{fulfillmentOrderSplits='" + fulfillmentOrderSplits + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderSplitPayload that = (FulfillmentOrderSplitPayload) o;
    return Objects.equals(fulfillmentOrderSplits, that.fulfillmentOrderSplits) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrderSplits, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The result of the fulfillment order splits.
     */
    private List<FulfillmentOrderSplitResult> fulfillmentOrderSplits;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<FulfillmentOrderSplitUserError> userErrors;

    public FulfillmentOrderSplitPayload build() {
      FulfillmentOrderSplitPayload result = new FulfillmentOrderSplitPayload();
      result.fulfillmentOrderSplits = this.fulfillmentOrderSplits;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The result of the fulfillment order splits.
     */
    public Builder fulfillmentOrderSplits(
        List<FulfillmentOrderSplitResult> fulfillmentOrderSplits) {
      this.fulfillmentOrderSplits = fulfillmentOrderSplits;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<FulfillmentOrderSplitUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
