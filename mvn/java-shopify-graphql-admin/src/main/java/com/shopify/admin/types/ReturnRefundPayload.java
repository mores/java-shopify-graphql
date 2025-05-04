package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `returnRefund` mutation.
 */
public class ReturnRefundPayload {
  /**
   * The created refund.
   */
  private Refund refund;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ReturnUserError> userErrors;

  public ReturnRefundPayload() {
  }

  /**
   * The created refund.
   */
  public Refund getRefund() {
    return refund;
  }

  public void setRefund(Refund refund) {
    this.refund = refund;
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
    return "ReturnRefundPayload{refund='" + refund + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnRefundPayload that = (ReturnRefundPayload) o;
    return Objects.equals(refund, that.refund) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refund, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The created refund.
     */
    private Refund refund;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ReturnUserError> userErrors;

    public ReturnRefundPayload build() {
      ReturnRefundPayload result = new ReturnRefundPayload();
      result.refund = this.refund;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created refund.
     */
    public Builder refund(Refund refund) {
      this.refund = refund;
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
