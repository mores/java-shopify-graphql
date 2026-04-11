package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The sign-in header customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingSignInHeader {
  /**
   * The store logo.
   */
  private CheckoutAndAccountsConfigurationBrandingSignInLogo logo;

  /**
   * The padding of the header container.
   */
  private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

  public CheckoutAndAccountsConfigurationBrandingSignInHeader() {
  }

  /**
   * The store logo.
   */
  public CheckoutAndAccountsConfigurationBrandingSignInLogo getLogo() {
    return logo;
  }

  public void setLogo(CheckoutAndAccountsConfigurationBrandingSignInLogo logo) {
    this.logo = logo;
  }

  /**
   * The padding of the header container.
   */
  public CheckoutAndAccountsConfigurationBrandingSpacingKeyword getPadding() {
    return padding;
  }

  public void setPadding(CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding) {
    this.padding = padding;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingSignInHeader{logo='" + logo + "', padding='" + padding + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingSignInHeader that = (CheckoutAndAccountsConfigurationBrandingSignInHeader) o;
    return Objects.equals(logo, that.logo) &&
        Objects.equals(padding, that.padding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logo, padding);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The store logo.
     */
    private CheckoutAndAccountsConfigurationBrandingSignInLogo logo;

    /**
     * The padding of the header container.
     */
    private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

    public CheckoutAndAccountsConfigurationBrandingSignInHeader build() {
      CheckoutAndAccountsConfigurationBrandingSignInHeader result = new CheckoutAndAccountsConfigurationBrandingSignInHeader();
      result.logo = this.logo;
      result.padding = this.padding;
      return result;
    }

    /**
     * The store logo.
     */
    public Builder logo(CheckoutAndAccountsConfigurationBrandingSignInLogo logo) {
      this.logo = logo;
      return this;
    }

    /**
     * The padding of the header container.
     */
    public Builder padding(CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding) {
      this.padding = padding;
      return this;
    }
  }
}
