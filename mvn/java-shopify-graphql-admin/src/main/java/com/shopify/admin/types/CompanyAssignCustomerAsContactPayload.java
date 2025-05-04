package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `companyAssignCustomerAsContact` mutation.
 */
public class CompanyAssignCustomerAsContactPayload {
  /**
   * The created company contact.
   */
  private CompanyContact companyContact;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<BusinessCustomerUserError> userErrors;

  public CompanyAssignCustomerAsContactPayload() {
  }

  /**
   * The created company contact.
   */
  public CompanyContact getCompanyContact() {
    return companyContact;
  }

  public void setCompanyContact(CompanyContact companyContact) {
    this.companyContact = companyContact;
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
    return "CompanyAssignCustomerAsContactPayload{companyContact='" + companyContact + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyAssignCustomerAsContactPayload that = (CompanyAssignCustomerAsContactPayload) o;
    return Objects.equals(companyContact, that.companyContact) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyContact, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The created company contact.
     */
    private CompanyContact companyContact;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<BusinessCustomerUserError> userErrors;

    public CompanyAssignCustomerAsContactPayload build() {
      CompanyAssignCustomerAsContactPayload result = new CompanyAssignCustomerAsContactPayload();
      result.companyContact = this.companyContact;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created company contact.
     */
    public Builder companyContact(CompanyContact companyContact) {
      this.companyContact = companyContact;
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
