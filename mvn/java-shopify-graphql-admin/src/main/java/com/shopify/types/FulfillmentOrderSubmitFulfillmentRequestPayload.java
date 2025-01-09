package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentOrderSubmitFulfillmentRequest` mutation.
 */
public class FulfillmentOrderSubmitFulfillmentRequestPayload {
  /**
   * The original fulfillment order intended to request fulfillment for.
   */
  private FulfillmentOrder originalFulfillmentOrder;

  /**
   * The fulfillment order that was submitted to the fulfillment service. This will be the same as
   * the original fulfillment order field. The exception to this is partial fulfillment requests or
   * fulfillment request for cancelled or incomplete fulfillment orders.
   */
  private FulfillmentOrder submittedFulfillmentOrder;

  /**
   * This field will only be present for partial fulfillment requests. This will represent the new
   * fulfillment order with the remaining line items not submitted to the fulfillment service.
   */
  private FulfillmentOrder unsubmittedFulfillmentOrder;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public FulfillmentOrderSubmitFulfillmentRequestPayload() {
  }

  /**
   * The original fulfillment order intended to request fulfillment for.
   */
  public FulfillmentOrder getOriginalFulfillmentOrder() {
    return originalFulfillmentOrder;
  }

  public void setOriginalFulfillmentOrder(FulfillmentOrder originalFulfillmentOrder) {
    this.originalFulfillmentOrder = originalFulfillmentOrder;
  }

  /**
   * The fulfillment order that was submitted to the fulfillment service. This will be the same as
   * the original fulfillment order field. The exception to this is partial fulfillment requests or
   * fulfillment request for cancelled or incomplete fulfillment orders.
   */
  public FulfillmentOrder getSubmittedFulfillmentOrder() {
    return submittedFulfillmentOrder;
  }

  public void setSubmittedFulfillmentOrder(FulfillmentOrder submittedFulfillmentOrder) {
    this.submittedFulfillmentOrder = submittedFulfillmentOrder;
  }

  /**
   * This field will only be present for partial fulfillment requests. This will represent the new
   * fulfillment order with the remaining line items not submitted to the fulfillment service.
   */
  public FulfillmentOrder getUnsubmittedFulfillmentOrder() {
    return unsubmittedFulfillmentOrder;
  }

  public void setUnsubmittedFulfillmentOrder(FulfillmentOrder unsubmittedFulfillmentOrder) {
    this.unsubmittedFulfillmentOrder = unsubmittedFulfillmentOrder;
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
    return "FulfillmentOrderSubmitFulfillmentRequestPayload{originalFulfillmentOrder='" + originalFulfillmentOrder + "', submittedFulfillmentOrder='" + submittedFulfillmentOrder + "', unsubmittedFulfillmentOrder='" + unsubmittedFulfillmentOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderSubmitFulfillmentRequestPayload that = (FulfillmentOrderSubmitFulfillmentRequestPayload) o;
    return Objects.equals(originalFulfillmentOrder, that.originalFulfillmentOrder) &&
        Objects.equals(submittedFulfillmentOrder, that.submittedFulfillmentOrder) &&
        Objects.equals(unsubmittedFulfillmentOrder, that.unsubmittedFulfillmentOrder) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalFulfillmentOrder, submittedFulfillmentOrder, unsubmittedFulfillmentOrder, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The original fulfillment order intended to request fulfillment for.
     */
    private FulfillmentOrder originalFulfillmentOrder;

    /**
     * The fulfillment order that was submitted to the fulfillment service. This will be the same as
     * the original fulfillment order field. The exception to this is partial fulfillment requests or
     * fulfillment request for cancelled or incomplete fulfillment orders.
     */
    private FulfillmentOrder submittedFulfillmentOrder;

    /**
     * This field will only be present for partial fulfillment requests. This will represent the new
     * fulfillment order with the remaining line items not submitted to the fulfillment service.
     */
    private FulfillmentOrder unsubmittedFulfillmentOrder;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public FulfillmentOrderSubmitFulfillmentRequestPayload build() {
      FulfillmentOrderSubmitFulfillmentRequestPayload result = new FulfillmentOrderSubmitFulfillmentRequestPayload();
      result.originalFulfillmentOrder = this.originalFulfillmentOrder;
      result.submittedFulfillmentOrder = this.submittedFulfillmentOrder;
      result.unsubmittedFulfillmentOrder = this.unsubmittedFulfillmentOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The original fulfillment order intended to request fulfillment for.
     */
    public Builder originalFulfillmentOrder(FulfillmentOrder originalFulfillmentOrder) {
      this.originalFulfillmentOrder = originalFulfillmentOrder;
      return this;
    }

    /**
     * The fulfillment order that was submitted to the fulfillment service. This will be the same as
     * the original fulfillment order field. The exception to this is partial fulfillment requests or
     * fulfillment request for cancelled or incomplete fulfillment orders.
     */
    public Builder submittedFulfillmentOrder(FulfillmentOrder submittedFulfillmentOrder) {
      this.submittedFulfillmentOrder = submittedFulfillmentOrder;
      return this;
    }

    /**
     * This field will only be present for partial fulfillment requests. This will represent the new
     * fulfillment order with the remaining line items not submitted to the fulfillment service.
     */
    public Builder unsubmittedFulfillmentOrder(FulfillmentOrder unsubmittedFulfillmentOrder) {
      this.unsubmittedFulfillmentOrder = unsubmittedFulfillmentOrder;
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
