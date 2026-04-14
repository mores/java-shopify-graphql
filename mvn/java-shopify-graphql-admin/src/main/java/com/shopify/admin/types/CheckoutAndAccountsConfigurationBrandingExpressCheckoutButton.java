package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The Express Checkout button customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingExpressCheckoutButton {
  /**
   * The corner radius.
   */
  private CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius;

  public CheckoutAndAccountsConfigurationBrandingExpressCheckoutButton() {
  }

  /**
   * The corner radius.
   */
  public CheckoutAndAccountsConfigurationBrandingCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingExpressCheckoutButton{cornerRadius='" + cornerRadius + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingExpressCheckoutButton that = (CheckoutAndAccountsConfigurationBrandingExpressCheckoutButton) o;
    return Objects.equals(cornerRadius, that.cornerRadius);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cornerRadius);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The corner radius.
     */
    private CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius;

    public CheckoutAndAccountsConfigurationBrandingExpressCheckoutButton build() {
      CheckoutAndAccountsConfigurationBrandingExpressCheckoutButton result = new CheckoutAndAccountsConfigurationBrandingExpressCheckoutButton();
      result.cornerRadius = this.cornerRadius;
      return result;
    }

    /**
     * The corner radius.
     */
    public Builder cornerRadius(CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }
  }
}
