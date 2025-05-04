package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentOrdersSetFulfillmentDeadline` mutation.
 */
public class FulfillmentOrdersSetFulfillmentDeadlinePayload {
  /**
   * Whether the fulfillment deadline was successfully set.
   */
  private Boolean success;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<FulfillmentOrdersSetFulfillmentDeadlineUserError> userErrors;

  public FulfillmentOrdersSetFulfillmentDeadlinePayload() {
  }

  /**
   * Whether the fulfillment deadline was successfully set.
   */
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<FulfillmentOrdersSetFulfillmentDeadlineUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<FulfillmentOrdersSetFulfillmentDeadlineUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FulfillmentOrdersSetFulfillmentDeadlinePayload{success='" + success + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrdersSetFulfillmentDeadlinePayload that = (FulfillmentOrdersSetFulfillmentDeadlinePayload) o;
    return Objects.equals(success, that.success) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the fulfillment deadline was successfully set.
     */
    private Boolean success;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<FulfillmentOrdersSetFulfillmentDeadlineUserError> userErrors;

    public FulfillmentOrdersSetFulfillmentDeadlinePayload build() {
      FulfillmentOrdersSetFulfillmentDeadlinePayload result = new FulfillmentOrdersSetFulfillmentDeadlinePayload();
      result.success = this.success;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * Whether the fulfillment deadline was successfully set.
     */
    public Builder success(Boolean success) {
      this.success = success;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<FulfillmentOrdersSetFulfillmentDeadlineUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
