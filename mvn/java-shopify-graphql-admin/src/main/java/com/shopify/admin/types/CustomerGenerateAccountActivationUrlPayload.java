package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerGenerateAccountActivationUrl` mutation.
 */
public class CustomerGenerateAccountActivationUrlPayload {
  /**
   * The generated account activation URL.
   */
  private String accountActivationUrl;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public CustomerGenerateAccountActivationUrlPayload() {
  }

  /**
   * The generated account activation URL.
   */
  public String getAccountActivationUrl() {
    return accountActivationUrl;
  }

  public void setAccountActivationUrl(String accountActivationUrl) {
    this.accountActivationUrl = accountActivationUrl;
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
    return "CustomerGenerateAccountActivationUrlPayload{accountActivationUrl='" + accountActivationUrl + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerGenerateAccountActivationUrlPayload that = (CustomerGenerateAccountActivationUrlPayload) o;
    return Objects.equals(accountActivationUrl, that.accountActivationUrl) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountActivationUrl, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The generated account activation URL.
     */
    private String accountActivationUrl;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public CustomerGenerateAccountActivationUrlPayload build() {
      CustomerGenerateAccountActivationUrlPayload result = new CustomerGenerateAccountActivationUrlPayload();
      result.accountActivationUrl = this.accountActivationUrl;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The generated account activation URL.
     */
    public Builder accountActivationUrl(String accountActivationUrl) {
      this.accountActivationUrl = accountActivationUrl;
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
