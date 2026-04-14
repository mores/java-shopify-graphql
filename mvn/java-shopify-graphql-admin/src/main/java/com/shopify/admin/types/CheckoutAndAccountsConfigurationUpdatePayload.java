package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `checkoutAndAccountsConfigurationUpdate` mutation.
 */
public class CheckoutAndAccountsConfigurationUpdatePayload {
  /**
   * The updated configuration.
   */
  private CheckoutAndAccountsConfiguration configuration;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CheckoutAndAccountsConfigurationUserError> userErrors;

  public CheckoutAndAccountsConfigurationUpdatePayload() {
  }

  /**
   * The updated configuration.
   */
  public CheckoutAndAccountsConfiguration getConfiguration() {
    return configuration;
  }

  public void setConfiguration(CheckoutAndAccountsConfiguration configuration) {
    this.configuration = configuration;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CheckoutAndAccountsConfigurationUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CheckoutAndAccountsConfigurationUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationUpdatePayload{configuration='" + configuration + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationUpdatePayload that = (CheckoutAndAccountsConfigurationUpdatePayload) o;
    return Objects.equals(configuration, that.configuration) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configuration, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The updated configuration.
     */
    private CheckoutAndAccountsConfiguration configuration;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CheckoutAndAccountsConfigurationUserError> userErrors;

    public CheckoutAndAccountsConfigurationUpdatePayload build() {
      CheckoutAndAccountsConfigurationUpdatePayload result = new CheckoutAndAccountsConfigurationUpdatePayload();
      result.configuration = this.configuration;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated configuration.
     */
    public Builder configuration(CheckoutAndAccountsConfiguration configuration) {
      this.configuration = configuration;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CheckoutAndAccountsConfigurationUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
