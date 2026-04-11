package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `cashManagementReasonCodeCreate` mutation.
 */
public class CashManagementReasonCodeCreatePayload {
  /**
   * The created cash management reason code.
   */
  private CashManagementCustomReasonCode reasonCode;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CashManagementReasonCodeCreateUserError> userErrors;

  public CashManagementReasonCodeCreatePayload() {
  }

  /**
   * The created cash management reason code.
   */
  public CashManagementCustomReasonCode getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(CashManagementCustomReasonCode reasonCode) {
    this.reasonCode = reasonCode;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CashManagementReasonCodeCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CashManagementReasonCodeCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CashManagementReasonCodeCreatePayload{reasonCode='" + reasonCode + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CashManagementReasonCodeCreatePayload that = (CashManagementReasonCodeCreatePayload) o;
    return Objects.equals(reasonCode, that.reasonCode) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonCode, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The created cash management reason code.
     */
    private CashManagementCustomReasonCode reasonCode;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CashManagementReasonCodeCreateUserError> userErrors;

    public CashManagementReasonCodeCreatePayload build() {
      CashManagementReasonCodeCreatePayload result = new CashManagementReasonCodeCreatePayload();
      result.reasonCode = this.reasonCode;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created cash management reason code.
     */
    public Builder reasonCode(CashManagementCustomReasonCode reasonCode) {
      this.reasonCode = reasonCode;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CashManagementReasonCodeCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
