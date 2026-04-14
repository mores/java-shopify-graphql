package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentOrderReportProgress` mutation.
 */
public class FulfillmentOrderReportProgressPayload {
  /**
   * The fulfillment order on which a mark as in progress update has been specified.
   */
  private FulfillmentOrder fulfillmentOrder;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<FulfillmentOrderReportProgressUserError> userErrors;

  public FulfillmentOrderReportProgressPayload() {
  }

  /**
   * The fulfillment order on which a mark as in progress update has been specified.
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
  public List<FulfillmentOrderReportProgressUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<FulfillmentOrderReportProgressUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderReportProgressPayload{fulfillmentOrder='" + fulfillmentOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderReportProgressPayload that = (FulfillmentOrderReportProgressPayload) o;
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
     * The fulfillment order on which a mark as in progress update has been specified.
     */
    private FulfillmentOrder fulfillmentOrder;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<FulfillmentOrderReportProgressUserError> userErrors;

    public FulfillmentOrderReportProgressPayload build() {
      FulfillmentOrderReportProgressPayload result = new FulfillmentOrderReportProgressPayload();
      result.fulfillmentOrder = this.fulfillmentOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The fulfillment order on which a mark as in progress update has been specified.
     */
    public Builder fulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
      this.fulfillmentOrder = fulfillmentOrder;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<FulfillmentOrderReportProgressUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
