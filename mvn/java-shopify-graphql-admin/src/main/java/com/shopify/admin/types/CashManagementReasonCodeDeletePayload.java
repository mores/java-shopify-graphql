package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `cashManagementReasonCodeDelete` mutation.
 */
public class CashManagementReasonCodeDeletePayload {
  /**
   * The deleted cash management reason code gid.
   */
  private String deletedId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CashManagementReasonCodeDeleteUserError> userErrors;

  public CashManagementReasonCodeDeletePayload() {
  }

  /**
   * The deleted cash management reason code gid.
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
  public List<CashManagementReasonCodeDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CashManagementReasonCodeDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CashManagementReasonCodeDeletePayload{deletedId='" + deletedId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CashManagementReasonCodeDeletePayload that = (CashManagementReasonCodeDeletePayload) o;
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
     * The deleted cash management reason code gid.
     */
    private String deletedId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CashManagementReasonCodeDeleteUserError> userErrors;

    public CashManagementReasonCodeDeletePayload build() {
      CashManagementReasonCodeDeletePayload result = new CashManagementReasonCodeDeletePayload();
      result.deletedId = this.deletedId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The deleted cash management reason code gid.
     */
    public Builder deletedId(String deletedId) {
      this.deletedId = deletedId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CashManagementReasonCodeDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
