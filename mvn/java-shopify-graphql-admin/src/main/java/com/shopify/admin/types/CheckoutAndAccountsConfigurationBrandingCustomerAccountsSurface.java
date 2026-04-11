package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The customer accounts-specific component customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurface {
  /**
   * The customer accounts components.
   */
  private CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponents components;

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurface() {
  }

  /**
   * The customer accounts components.
   */
  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponents getComponents() {
    return components;
  }

  public void setComponents(
      CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponents components) {
    this.components = components;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurface{components='" + components + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurface that = (CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurface) o;
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
     * The customer accounts components.
     */
    private CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponents components;

    public CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurface build() {
      CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurface result = new CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurface();
      result.components = this.components;
      return result;
    }

    /**
     * The customer accounts components.
     */
    public Builder components(
        CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponents components) {
      this.components = components;
      return this;
    }
  }
}
