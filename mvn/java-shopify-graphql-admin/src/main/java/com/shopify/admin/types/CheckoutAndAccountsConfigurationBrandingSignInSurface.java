package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The sign-in-specific component customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingSignInSurface {
  /**
   * The sign-in components.
   */
  private CheckoutAndAccountsConfigurationBrandingSignInComponents components;

  public CheckoutAndAccountsConfigurationBrandingSignInSurface() {
  }

  /**
   * The sign-in components.
   */
  public CheckoutAndAccountsConfigurationBrandingSignInComponents getComponents() {
    return components;
  }

  public void setComponents(CheckoutAndAccountsConfigurationBrandingSignInComponents components) {
    this.components = components;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingSignInSurface{components='" + components + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingSignInSurface that = (CheckoutAndAccountsConfigurationBrandingSignInSurface) o;
    return Objects.equals(components, that.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(components);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The sign-in components.
     */
    private CheckoutAndAccountsConfigurationBrandingSignInComponents components;

    public CheckoutAndAccountsConfigurationBrandingSignInSurface build() {
      CheckoutAndAccountsConfigurationBrandingSignInSurface result = new CheckoutAndAccountsConfigurationBrandingSignInSurface();
      result.components = this.components;
      return result;
    }

    /**
     * The sign-in components.
     */
    public Builder components(CheckoutAndAccountsConfigurationBrandingSignInComponents components) {
      this.components = components;
      return this;
    }
  }
}
