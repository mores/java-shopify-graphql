package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `companyContactDelete` mutation.
 */
public class CompanyContactDeletePayload {
  /**
   * The ID of the deleted company contact.
   */
  private String deletedCompanyContactId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<BusinessCustomerUserError> userErrors;

  public CompanyContactDeletePayload() {
  }

  /**
   * The ID of the deleted company contact.
   */
  public String getDeletedCompanyContactId() {
    return deletedCompanyContactId;
  }

  public void setDeletedCompanyContactId(String deletedCompanyContactId) {
    this.deletedCompanyContactId = deletedCompanyContactId;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<BusinessCustomerUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<BusinessCustomerUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CompanyContactDeletePayload{deletedCompanyContactId='" + deletedCompanyContactId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyContactDeletePayload that = (CompanyContactDeletePayload) o;
    return Objects.equals(deletedCompanyContactId, that.deletedCompanyContactId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedCompanyContactId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the deleted company contact.
     */
    private String deletedCompanyContactId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<BusinessCustomerUserError> userErrors;

    public CompanyContactDeletePayload build() {
      CompanyContactDeletePayload result = new CompanyContactDeletePayload();
      result.deletedCompanyContactId = this.deletedCompanyContactId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the deleted company contact.
     */
    public Builder deletedCompanyContactId(String deletedCompanyContactId) {
      this.deletedCompanyContactId = deletedCompanyContactId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<BusinessCustomerUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
