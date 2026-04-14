package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The Express Checkout customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingExpressCheckout {
  /**
   * The Express Checkout buttons customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingExpressCheckoutButton button;

  public CheckoutAndAccountsConfigurationBrandingExpressCheckout() {
  }

  /**
   * The Express Checkout buttons customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingExpressCheckoutButton getButton() {
    return button;
  }

  public void setButton(CheckoutAndAccountsConfigurationBrandingExpressCheckoutButton button) {
    this.button = button;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingExpressCheckout{button='" + button + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingExpressCheckout that = (CheckoutAndAccountsConfigurationBrandingExpressCheckout) o;
    return Objects.equals(button, that.button);
  }

  @Override
  public int hashCode() {
    return Objects.hash(button);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The Express Checkout buttons customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingExpressCheckoutButton button;

    public CheckoutAndAccountsConfigurationBrandingExpressCheckout build() {
      CheckoutAndAccountsConfigurationBrandingExpressCheckout result = new CheckoutAndAccountsConfigurationBrandingExpressCheckout();
      result.button = this.button;
      return result;
    }

    /**
     * The Express Checkout buttons customizations.
     */
    public Builder button(CheckoutAndAccountsConfigurationBrandingExpressCheckoutButton button) {
      this.button = button;
      return this;
    }
  }
}
