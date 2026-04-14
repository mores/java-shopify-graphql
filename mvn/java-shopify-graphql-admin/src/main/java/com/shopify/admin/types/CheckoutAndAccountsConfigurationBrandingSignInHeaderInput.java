package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the sign-in header.
 */
public class CheckoutAndAccountsConfigurationBrandingSignInHeaderInput {
  /**
   * The store logo.
   */
  private CheckoutAndAccountsConfigurationBrandingSignInLogoInput logo;

  /**
   * The padding of the header container.
   */
  private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

  public CheckoutAndAccountsConfigurationBrandingSignInHeaderInput() {
  }

  /**
   * The store logo.
   */
  public CheckoutAndAccountsConfigurationBrandingSignInLogoInput getLogo() {
    return logo;
  }

  public void setLogo(CheckoutAndAccountsConfigurationBrandingSignInLogoInput logo) {
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
    return "CheckoutAndAccountsConfigurationBrandingSignInHeaderInput{logo='" + logo + "', padding='" + padding + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingSignInHeaderInput that = (CheckoutAndAccountsConfigurationBrandingSignInHeaderInput) o;
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
    private CheckoutAndAccountsConfigurationBrandingSignInLogoInput logo;

    /**
     * The padding of the header container.
     */
    private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

    public CheckoutAndAccountsConfigurationBrandingSignInHeaderInput build() {
      CheckoutAndAccountsConfigurationBrandingSignInHeaderInput result = new CheckoutAndAccountsConfigurationBrandingSignInHeaderInput();
      result.logo = this.logo;
      result.padding = this.padding;
      return result;
    }

    /**
     * The store logo.
     */
    public Builder logo(CheckoutAndAccountsConfigurationBrandingSignInLogoInput logo) {
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
