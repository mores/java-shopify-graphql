package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentServiceDelete` mutation.
 */
public class FulfillmentServiceDeletePayload {
  /**
   * The ID of the deleted fulfillment service.
   */
  private String deletedId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public FulfillmentServiceDeletePayload() {
  }

  /**
   * The ID of the deleted fulfillment service.
   */
  public String getDeletedId() {
    return deletedId;
  }

  public void setDeletedId(String deletedId) {
    this.deletedId = deletedId;
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
    return "FulfillmentServiceDeletePayload{deletedId='" + deletedId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentServiceDeletePayload that = (FulfillmentServiceDeletePayload) o;
    return Objects.equals(deletedId, that.deletedId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the deleted fulfillment service.
     */
    private String deletedId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public FulfillmentServiceDeletePayload build() {
      FulfillmentServiceDeletePayload result = new FulfillmentServiceDeletePayload();
      result.deletedId = this.deletedId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the deleted fulfillment service.
     */
    public Builder deletedId(String deletedId) {
      this.deletedId = deletedId;
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
