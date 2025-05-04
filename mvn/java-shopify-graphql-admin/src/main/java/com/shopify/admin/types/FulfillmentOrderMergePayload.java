package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentOrderMerge` mutation.
 */
public class FulfillmentOrderMergePayload {
  /**
   * The result of the fulfillment order merges.
   */
  private List<FulfillmentOrderMergeResult> fulfillmentOrderMerges;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<FulfillmentOrderMergeUserError> userErrors;

  public FulfillmentOrderMergePayload() {
  }

  /**
   * The result of the fulfillment order merges.
   */
  public List<FulfillmentOrderMergeResult> getFulfillmentOrderMerges() {
    return fulfillmentOrderMerges;
  }

  public void setFulfillmentOrderMerges(List<FulfillmentOrderMergeResult> fulfillmentOrderMerges) {
    this.fulfillmentOrderMerges = fulfillmentOrderMerges;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<FulfillmentOrderMergeUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<FulfillmentOrderMergeUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderMergePayload{fulfillmentOrderMerges='" + fulfillmentOrderMerges + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderMergePayload that = (FulfillmentOrderMergePayload) o;
    return Objects.equals(fulfillmentOrderMerges, that.fulfillmentOrderMerges) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrderMerges, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The result of the fulfillment order merges.
     */
    private List<FulfillmentOrderMergeResult> fulfillmentOrderMerges;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<FulfillmentOrderMergeUserError> userErrors;

    public FulfillmentOrderMergePayload build() {
      FulfillmentOrderMergePayload result = new FulfillmentOrderMergePayload();
      result.fulfillmentOrderMerges = this.fulfillmentOrderMerges;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The result of the fulfillment order merges.
     */
    public Builder fulfillmentOrderMerges(
        List<FulfillmentOrderMergeResult> fulfillmentOrderMerges) {
      this.fulfillmentOrderMerges = fulfillmentOrderMerges;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<FulfillmentOrderMergeUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
