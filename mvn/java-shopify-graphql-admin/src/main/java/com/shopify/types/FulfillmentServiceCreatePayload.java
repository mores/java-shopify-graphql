package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentServiceCreate` mutation.
 */
public class FulfillmentServiceCreatePayload {
  /**
   * The created fulfillment service.
   */
  private FulfillmentService fulfillmentService;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public FulfillmentServiceCreatePayload() {
  }

  /**
   * The created fulfillment service.
   */
  public FulfillmentService getFulfillmentService() {
    return fulfillmentService;
  }

  public void setFulfillmentService(FulfillmentService fulfillmentService) {
    this.fulfillmentService = fulfillmentService;
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
    return "FulfillmentServiceCreatePayload{fulfillmentService='" + fulfillmentService + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentServiceCreatePayload that = (FulfillmentServiceCreatePayload) o;
    return Objects.equals(fulfillmentService, that.fulfillmentService) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentService, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The created fulfillment service.
     */
    private FulfillmentService fulfillmentService;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public FulfillmentServiceCreatePayload build() {
      FulfillmentServiceCreatePayload result = new FulfillmentServiceCreatePayload();
      result.fulfillmentService = this.fulfillmentService;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created fulfillment service.
     */
    public Builder fulfillmentService(FulfillmentService fulfillmentService) {
      this.fulfillmentService = fulfillmentService;
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
