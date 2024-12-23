package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `companyContactsDelete` mutation.
 */
public class CompanyContactsDeletePayload {
  /**
   * The list of IDs of the deleted company contacts.
   */
  private List<String> deletedCompanyContactIds;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<BusinessCustomerUserError> userErrors;

  public CompanyContactsDeletePayload() {
  }

  /**
   * The list of IDs of the deleted company contacts.
   */
  public List<String> getDeletedCompanyContactIds() {
    return deletedCompanyContactIds;
  }

  public void setDeletedCompanyContactIds(List<String> deletedCompanyContactIds) {
    this.deletedCompanyContactIds = deletedCompanyContactIds;
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
    return "CompanyContactsDeletePayload{deletedCompanyContactIds='" + deletedCompanyContactIds + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyContactsDeletePayload that = (CompanyContactsDeletePayload) o;
    return Objects.equals(deletedCompanyContactIds, that.deletedCompanyContactIds) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedCompanyContactIds, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of IDs of the deleted company contacts.
     */
    private List<String> deletedCompanyContactIds;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<BusinessCustomerUserError> userErrors;

    public CompanyContactsDeletePayload build() {
      CompanyContactsDeletePayload result = new CompanyContactsDeletePayload();
      result.deletedCompanyContactIds = this.deletedCompanyContactIds;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The list of IDs of the deleted company contacts.
     */
    public Builder deletedCompanyContactIds(List<String> deletedCompanyContactIds) {
      this.deletedCompanyContactIds = deletedCompanyContactIds;
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
