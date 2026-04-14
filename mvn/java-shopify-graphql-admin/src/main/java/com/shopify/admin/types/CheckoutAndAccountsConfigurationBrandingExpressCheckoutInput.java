package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the Express Checkout.
 */
public class CheckoutAndAccountsConfigurationBrandingExpressCheckoutInput {
  /**
   * The Express Checkout buttons customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingExpressCheckoutButtonInput button;

  public CheckoutAndAccountsConfigurationBrandingExpressCheckoutInput() {
  }

  /**
   * The Express Checkout buttons customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingExpressCheckoutButtonInput getButton() {
    return button;
  }

  public void setButton(CheckoutAndAccountsConfigurationBrandingExpressCheckoutButtonInput button) {
    this.button = button;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingExpressCheckoutInput{button='" + button + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingExpressCheckoutInput that = (CheckoutAndAccountsConfigurationBrandingExpressCheckoutInput) o;
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
    private CheckoutAndAccountsConfigurationBrandingExpressCheckoutButtonInput button;

    public CheckoutAndAccountsConfigurationBrandingExpressCheckoutInput build() {
      CheckoutAndAccountsConfigurationBrandingExpressCheckoutInput result = new CheckoutAndAccountsConfigurationBrandingExpressCheckoutInput();
      result.button = this.button;
      return result;
    }

    /**
     * The Express Checkout buttons customizations.
     */
    public Builder button(
        CheckoutAndAccountsConfigurationBrandingExpressCheckoutButtonInput button) {
      this.button = button;
      return this;
    }
  }
}
