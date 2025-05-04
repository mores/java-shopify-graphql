package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `returnClose` mutation.
 */
public class ReturnClosePayload {
  /**
   * The closed return.
   */
  private Return _return;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ReturnUserError> userErrors;

  public ReturnClosePayload() {
  }

  /**
   * The closed return.
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
    return "ReturnClosePayload{return='" + _return + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnClosePayload that = (ReturnClosePayload) o;
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
     * The closed return.
     */
    private Return _return;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ReturnUserError> userErrors;

    public ReturnClosePayload build() {
      ReturnClosePayload result = new ReturnClosePayload();
      result._return = this._return;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The closed return.
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
