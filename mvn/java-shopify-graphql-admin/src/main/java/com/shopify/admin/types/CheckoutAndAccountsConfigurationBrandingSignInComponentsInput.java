package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the sign-in components.
 */
public class CheckoutAndAccountsConfigurationBrandingSignInComponentsInput {
  /**
   * The main customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingSignInMainInput main;

  /**
   * The header customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingSignInHeaderInput header;

  public CheckoutAndAccountsConfigurationBrandingSignInComponentsInput() {
  }

  /**
   * The main customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingSignInMainInput getMain() {
    return main;
  }

  public void setMain(CheckoutAndAccountsConfigurationBrandingSignInMainInput main) {
    this.main = main;
  }

  /**
   * The header customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingSignInHeaderInput getHeader() {
    return header;
  }

  public void setHeader(CheckoutAndAccountsConfigurationBrandingSignInHeaderInput header) {
    this.header = header;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingSignInComponentsInput{main='" + main + "', header='" + header + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingSignInComponentsInput that = (CheckoutAndAccountsConfigurationBrandingSignInComponentsInput) o;
    return Objects.equals(main, that.main) &&
        Objects.equals(header, that.header);
  }

  @Override
  public int hashCode() {
    return Objects.hash(main, header);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The main customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingSignInMainInput main;

    /**
     * The header customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingSignInHeaderInput header;

    public CheckoutAndAccountsConfigurationBrandingSignInComponentsInput build() {
      CheckoutAndAccountsConfigurationBrandingSignInComponentsInput result = new CheckoutAndAccountsConfigurationBrandingSignInComponentsInput();
      result.main = this.main;
      result.header = this.header;
      return result;
    }

    /**
     * The main customizations.
     */
    public Builder main(CheckoutAndAccountsConfigurationBrandingSignInMainInput main) {
      this.main = main;
      return this;
    }

    /**
     * The header customizations.
     */
    public Builder header(CheckoutAndAccountsConfigurationBrandingSignInHeaderInput header) {
      this.header = header;
      return this;
    }
  }
}
