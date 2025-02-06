package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `companyAddressDelete` mutation.
 */
public class CompanyAddressDeletePayload {
  /**
   * The ID of the deleted address.
   */
  private String deletedAddressId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<BusinessCustomerUserError> userErrors;

  public CompanyAddressDeletePayload() {
  }

  /**
   * The ID of the deleted address.
   */
  public String getDeletedAddressId() {
    return deletedAddressId;
  }

  public void setDeletedAddressId(String deletedAddressId) {
    this.deletedAddressId = deletedAddressId;
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
    return "CompanyAddressDeletePayload{deletedAddressId='" + deletedAddressId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyAddressDeletePayload that = (CompanyAddressDeletePayload) o;
    return Objects.equals(deletedAddressId, that.deletedAddressId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedAddressId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the deleted address.
     */
    private String deletedAddressId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<BusinessCustomerUserError> userErrors;

    public CompanyAddressDeletePayload build() {
      CompanyAddressDeletePayload result = new CompanyAddressDeletePayload();
      result.deletedAddressId = this.deletedAddressId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the deleted address.
     */
    public Builder deletedAddressId(String deletedAddressId) {
      this.deletedAddressId = deletedAddressId;
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
