package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The sign-in-specific component customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingSignInComponents {
  /**
   * The header customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingSignInHeader header;

  /**
   * The main customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingSignInMain main;

  public CheckoutAndAccountsConfigurationBrandingSignInComponents() {
  }

  /**
   * The header customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingSignInHeader getHeader() {
    return header;
  }

  public void setHeader(CheckoutAndAccountsConfigurationBrandingSignInHeader header) {
    this.header = header;
  }

  /**
   * The main customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingSignInMain getMain() {
    return main;
  }

  public void setMain(CheckoutAndAccountsConfigurationBrandingSignInMain main) {
    this.main = main;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingSignInComponents{header='" + header + "', main='" + main + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingSignInComponents that = (CheckoutAndAccountsConfigurationBrandingSignInComponents) o;
    return Objects.equals(header, that.header) &&
        Objects.equals(main, that.main);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, main);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The header customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingSignInHeader header;

    /**
     * The main customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingSignInMain main;

    public CheckoutAndAccountsConfigurationBrandingSignInComponents build() {
      CheckoutAndAccountsConfigurationBrandingSignInComponents result = new CheckoutAndAccountsConfigurationBrandingSignInComponents();
      result.header = this.header;
      result.main = this.main;
      return result;
    }

    /**
     * The header customizations.
     */
    public Builder header(CheckoutAndAccountsConfigurationBrandingSignInHeader header) {
      this.header = header;
      return this;
    }

    /**
     * The main customizations.
     */
    public Builder main(CheckoutAndAccountsConfigurationBrandingSignInMain main) {
      this.main = main;
      return this;
    }
  }
}
