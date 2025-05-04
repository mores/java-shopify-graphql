package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to use to update the Express Checkout customizations.
 */
public class CheckoutBrandingExpressCheckoutInput {
  /**
   * The Express Checkout buttons customizations.
   */
  private CheckoutBrandingExpressCheckoutButtonInput button;

  public CheckoutBrandingExpressCheckoutInput() {
  }

  /**
   * The Express Checkout buttons customizations.
   */
  public CheckoutBrandingExpressCheckoutButtonInput getButton() {
    return button;
  }

  public void setButton(CheckoutBrandingExpressCheckoutButtonInput button) {
    this.button = button;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingExpressCheckoutInput{button='" + button + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingExpressCheckoutInput that = (CheckoutBrandingExpressCheckoutInput) o;
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
    private CheckoutBrandingExpressCheckoutButtonInput button;

    public CheckoutBrandingExpressCheckoutInput build() {
      CheckoutBrandingExpressCheckoutInput result = new CheckoutBrandingExpressCheckoutInput();
      result.button = this.button;
      return result;
    }

    /**
     * The Express Checkout buttons customizations.
     */
    public Builder button(CheckoutBrandingExpressCheckoutButtonInput button) {
      this.button = button;
      return this;
    }
  }
}
