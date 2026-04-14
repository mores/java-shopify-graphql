package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The checkout-specific component customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingCheckoutSurface {
  /**
   * The checkout components.
   */
  private CheckoutAndAccountsConfigurationBrandingCheckoutComponents components;

  public CheckoutAndAccountsConfigurationBrandingCheckoutSurface() {
  }

  /**
   * The checkout components.
   */
  public CheckoutAndAccountsConfigurationBrandingCheckoutComponents getComponents() {
    return components;
  }

  public void setComponents(CheckoutAndAccountsConfigurationBrandingCheckoutComponents components) {
    this.components = components;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingCheckoutSurface{components='" + components + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCheckoutSurface that = (CheckoutAndAccountsConfigurationBrandingCheckoutSurface) o;
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
     * The checkout components.
     */
    private CheckoutAndAccountsConfigurationBrandingCheckoutComponents components;

    public CheckoutAndAccountsConfigurationBrandingCheckoutSurface build() {
      CheckoutAndAccountsConfigurationBrandingCheckoutSurface result = new CheckoutAndAccountsConfigurationBrandingCheckoutSurface();
      result.components = this.components;
      return result;
    }

    /**
     * The checkout components.
     */
    public Builder components(
        CheckoutAndAccountsConfigurationBrandingCheckoutComponents components) {
      this.components = components;
      return this;
    }
  }
}
