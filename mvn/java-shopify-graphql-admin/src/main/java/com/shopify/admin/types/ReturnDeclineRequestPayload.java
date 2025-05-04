package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `returnDeclineRequest` mutation.
 */
public class ReturnDeclineRequestPayload {
  /**
   * The declined return.
   */
  private Return _return;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ReturnUserError> userErrors;

  public ReturnDeclineRequestPayload() {
  }

  /**
   * The declined return.
   */
  public Return getReturn() {
    return _return;
  }

  public void setReturn(Return _return) {
    this._return = _return;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ReturnUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ReturnUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ReturnDeclineRequestPayload{return='" + _return + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnDeclineRequestPayload that = (ReturnDeclineRequestPayload) o;
    return Objects.equals(_return, that._return) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_return, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The declined return.
     */
    private Return _return;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ReturnUserError> userErrors;

    public ReturnDeclineRequestPayload build() {
      ReturnDeclineRequestPayload result = new ReturnDeclineRequestPayload();
      result._return = this._return;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The declined return.
     */
    public Builder _return(Return _return) {
      this._return = _return;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ReturnUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
