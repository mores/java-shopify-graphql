package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `companyContactSendWelcomeEmail` mutation.
 */
public class CompanyContactSendWelcomeEmailPayload {
  /**
   * The company contact to whom a welcome email was sent.
   */
  private CompanyContact companyContact;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<BusinessCustomerUserError> userErrors;

  public CompanyContactSendWelcomeEmailPayload() {
  }

  /**
   * The company contact to whom a welcome email was sent.
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
    return "CompanyContactSendWelcomeEmailPayload{companyContact='" + companyContact + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyContactSendWelcomeEmailPayload that = (CompanyContactSendWelcomeEmailPayload) o;
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
     * The company contact to whom a welcome email was sent.
     */
    private CompanyContact companyContact;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<BusinessCustomerUserError> userErrors;

    public CompanyContactSendWelcomeEmailPayload build() {
      CompanyContactSendWelcomeEmailPayload result = new CompanyContactSendWelcomeEmailPayload();
      result.companyContact = this.companyContact;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The company contact to whom a welcome email was sent.
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
