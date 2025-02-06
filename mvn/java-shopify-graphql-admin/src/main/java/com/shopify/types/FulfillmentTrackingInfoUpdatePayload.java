package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentTrackingInfoUpdate` mutation.
 */
public class FulfillmentTrackingInfoUpdatePayload {
  /**
   * The updated fulfillment with tracking information.
   */
  private Fulfillment fulfillment;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public FulfillmentTrackingInfoUpdatePayload() {
  }

  /**
   * The updated fulfillment with tracking information.
   */
  public Fulfillment getFulfillment() {
    return fulfillment;
  }

  public void setFulfillment(Fulfillment fulfillment) {
    this.fulfillment = fulfillment;
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
    return "FulfillmentTrackingInfoUpdatePayload{fulfillment='" + fulfillment + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentTrackingInfoUpdatePayload that = (FulfillmentTrackingInfoUpdatePayload) o;
    return Objects.equals(fulfillment, that.fulfillment) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillment, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The updated fulfillment with tracking information.
     */
    private Fulfillment fulfillment;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public FulfillmentTrackingInfoUpdatePayload build() {
      FulfillmentTrackingInfoUpdatePayload result = new FulfillmentTrackingInfoUpdatePayload();
      result.fulfillment = this.fulfillment;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated fulfillment with tracking information.
     */
    public Builder fulfillment(Fulfillment fulfillment) {
      this.fulfillment = fulfillment;
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
