package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the incoming line item.
 */
public class IncomingRequestLineItemInput {
  /**
   * The ID of the rejected line item.
   */
  private String fulfillmentOrderLineItemId;

  /**
   * The rejection message of the line item.
   */
  private String message;

  public IncomingRequestLineItemInput() {
  }

  /**
   * The ID of the rejected line item.
   */
  public String getFulfillmentOrderLineItemId() {
    return fulfillmentOrderLineItemId;
  }

  public void setFulfillmentOrderLineItemId(String fulfillmentOrderLineItemId) {
    this.fulfillmentOrderLineItemId = fulfillmentOrderLineItemId;
  }

  /**
   * The rejection message of the line item.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "IncomingRequestLineItemInput{fulfillmentOrderLineItemId='" + fulfillmentOrderLineItemId + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IncomingRequestLineItemInput that = (IncomingRequestLineItemInput) o;
    return Objects.equals(fulfillmentOrderLineItemId, that.fulfillmentOrderLineItemId) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrderLineItemId, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the rejected line item.
     */
    private String fulfillmentOrderLineItemId;

    /**
     * The rejection message of the line item.
     */
    private String message;

    public IncomingRequestLineItemInput build() {
      IncomingRequestLineItemInput result = new IncomingRequestLineItemInput();
      result.fulfillmentOrderLineItemId = this.fulfillmentOrderLineItemId;
      result.message = this.message;
      return result;
    }

    /**
     * The ID of the rejected line item.
     */
    public Builder fulfillmentOrderLineItemId(String fulfillmentOrderLineItemId) {
      this.fulfillmentOrderLineItemId = fulfillmentOrderLineItemId;
      return this;
    }

    /**
     * The rejection message of the line item.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
