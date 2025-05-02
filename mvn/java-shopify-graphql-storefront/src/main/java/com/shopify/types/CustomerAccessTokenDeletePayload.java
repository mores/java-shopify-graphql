package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerAccessTokenDelete` mutation.
 */
public class CustomerAccessTokenDeletePayload {
  /**
   * The destroyed access token.
   */
  private String deletedAccessToken;

  /**
   * ID of the destroyed customer access token.
   */
  private String deletedCustomerAccessTokenId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public CustomerAccessTokenDeletePayload() {
  }

  /**
   * The destroyed access token.
   */
  public String getDeletedAccessToken() {
    return deletedAccessToken;
  }

  public void setDeletedAccessToken(String deletedAccessToken) {
    this.deletedAccessToken = deletedAccessToken;
  }

  /**
   * ID of the destroyed customer access token.
   */
  public String getDeletedCustomerAccessTokenId() {
    return deletedCustomerAccessTokenId;
  }

  public void setDeletedCustomerAccessTokenId(String deletedCustomerAccessTokenId) {
    this.deletedCustomerAccessTokenId = deletedCustomerAccessTokenId;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CustomerAccessTokenDeletePayload{deletedAccessToken='" + deletedAccessToken + "', deletedCustomerAccessTokenId='" + deletedCustomerAccessTokenId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerAccessTokenDeletePayload that = (CustomerAccessTokenDeletePayload) o;
    return Objects.equals(deletedAccessToken, that.deletedAccessToken) &&
        Objects.equals(deletedCustomerAccessTokenId, that.deletedCustomerAccessTokenId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedAccessToken, deletedCustomerAccessTokenId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The destroyed access token.
     */
    private String deletedAccessToken;

    /**
     * ID of the destroyed customer access token.
     */
    private String deletedCustomerAccessTokenId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public CustomerAccessTokenDeletePayload build() {
      CustomerAccessTokenDeletePayload result = new CustomerAccessTokenDeletePayload();
      result.deletedAccessToken = this.deletedAccessToken;
      result.deletedCustomerAccessTokenId = this.deletedCustomerAccessTokenId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The destroyed access token.
     */
    public Builder deletedAccessToken(String deletedAccessToken) {
      this.deletedAccessToken = deletedAccessToken;
      return this;
    }

    /**
     * ID of the destroyed customer access token.
     */
    public Builder deletedCustomerAccessTokenId(String deletedCustomerAccessTokenId) {
      this.deletedCustomerAccessTokenId = deletedCustomerAccessTokenId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
