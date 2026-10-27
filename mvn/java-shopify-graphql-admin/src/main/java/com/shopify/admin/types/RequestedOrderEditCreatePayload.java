package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `requestedOrderEditCreate` mutation.
 */
public class RequestedOrderEditCreatePayload {
  /**
   * The created requested order edit.
   */
  private RequestedOrderEdit requestedOrderEdit;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<RequestedOrderEditCreateUserError> userErrors;

  public RequestedOrderEditCreatePayload() {
  }

  /**
   * The created requested order edit.
   */
  public RequestedOrderEdit getRequestedOrderEdit() {
    return requestedOrderEdit;
  }

  public void setRequestedOrderEdit(RequestedOrderEdit requestedOrderEdit) {
    this.requestedOrderEdit = requestedOrderEdit;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<RequestedOrderEditCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<RequestedOrderEditCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "RequestedOrderEditCreatePayload{requestedOrderEdit='" + requestedOrderEdit + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RequestedOrderEditCreatePayload that = (RequestedOrderEditCreatePayload) o;
    return Objects.equals(requestedOrderEdit, that.requestedOrderEdit) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestedOrderEdit, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The created requested order edit.
     */
    private RequestedOrderEdit requestedOrderEdit;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<RequestedOrderEditCreateUserError> userErrors;

    public RequestedOrderEditCreatePayload build() {
      RequestedOrderEditCreatePayload result = new RequestedOrderEditCreatePayload();
      result.requestedOrderEdit = this.requestedOrderEdit;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created requested order edit.
     */
    public Builder requestedOrderEdit(RequestedOrderEdit requestedOrderEdit) {
      this.requestedOrderEdit = requestedOrderEdit;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<RequestedOrderEditCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
