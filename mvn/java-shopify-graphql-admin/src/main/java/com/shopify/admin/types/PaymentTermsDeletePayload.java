package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `paymentTermsDelete` mutation.
 */
public class PaymentTermsDeletePayload {
  /**
   * The deleted payment terms ID.
   */
  private String deletedId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PaymentTermsDeleteUserError> userErrors;

  public PaymentTermsDeletePayload() {
  }

  /**
   * The deleted payment terms ID.
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
  public List<PaymentTermsDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PaymentTermsDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PaymentTermsDeletePayload{deletedId='" + deletedId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentTermsDeletePayload that = (PaymentTermsDeletePayload) o;
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
     * The deleted payment terms ID.
     */
    private String deletedId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PaymentTermsDeleteUserError> userErrors;

    public PaymentTermsDeletePayload build() {
      PaymentTermsDeletePayload result = new PaymentTermsDeletePayload();
      result.deletedId = this.deletedId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The deleted payment terms ID.
     */
    public Builder deletedId(String deletedId) {
      this.deletedId = deletedId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<PaymentTermsDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
