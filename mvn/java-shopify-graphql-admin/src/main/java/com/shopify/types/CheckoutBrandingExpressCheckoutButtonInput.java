package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to use to update the express checkout customizations.
 */
public class CheckoutBrandingExpressCheckoutButtonInput {
  /**
   * The corner radius used for Express Checkout buttons.
   */
  private CheckoutBrandingCornerRadius cornerRadius;

  public CheckoutBrandingExpressCheckoutButtonInput() {
  }

  /**
   * The corner radius used for Express Checkout buttons.
   */
  public CheckoutBrandingCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingExpressCheckoutButtonInput{cornerRadius='" + cornerRadius + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingExpressCheckoutButtonInput that = (CheckoutBrandingExpressCheckoutButtonInput) o;
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
     * The corner radius used for Express Checkout buttons.
     */
    private CheckoutBrandingCornerRadius cornerRadius;

    public CheckoutBrandingExpressCheckoutButtonInput build() {
      CheckoutBrandingExpressCheckoutButtonInput result = new CheckoutBrandingExpressCheckoutButtonInput();
      result.cornerRadius = this.cornerRadius;
      return result;
    }

    /**
     * The corner radius used for Express Checkout buttons.
     */
    public Builder cornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }
  }
}
