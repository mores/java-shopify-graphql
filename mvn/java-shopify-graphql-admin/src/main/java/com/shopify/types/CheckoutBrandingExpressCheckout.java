package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The Express Checkout customizations.
 */
public class CheckoutBrandingExpressCheckout {
  /**
   * The Express Checkout buttons customizations.
   */
  private CheckoutBrandingExpressCheckoutButton button;

  public CheckoutBrandingExpressCheckout() {
  }

  /**
   * The Express Checkout buttons customizations.
   */
  public CheckoutBrandingExpressCheckoutButton getButton() {
    return button;
  }

  public void setButton(CheckoutBrandingExpressCheckoutButton button) {
    this.button = button;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingExpressCheckout{button='" + button + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingExpressCheckout that = (CheckoutBrandingExpressCheckout) o;
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
    private CheckoutBrandingExpressCheckoutButton button;

    public CheckoutBrandingExpressCheckout build() {
      CheckoutBrandingExpressCheckout result = new CheckoutBrandingExpressCheckout();
      result.button = this.button;
      return result;
    }

    /**
     * The Express Checkout buttons customizations.
     */
    public Builder button(CheckoutBrandingExpressCheckoutButton button) {
      this.button = button;
      return this;
    }
  }
}
