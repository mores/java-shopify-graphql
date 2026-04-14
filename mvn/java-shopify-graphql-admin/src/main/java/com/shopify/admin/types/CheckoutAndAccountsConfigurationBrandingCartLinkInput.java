package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the cart link at Checkout.
 */
public class CheckoutAndAccountsConfigurationBrandingCartLinkInput {
  /**
   * The input to update the visibility of cart links in checkout. This hides the
   * cart icon on one-page and the cart link in the breadcrumbs/buyer journey on
   * three-page checkout.
   */
  private CheckoutAndAccountsConfigurationBrandingVisibility visibility;

  public CheckoutAndAccountsConfigurationBrandingCartLinkInput() {
  }

  /**
   * The input to update the visibility of cart links in checkout. This hides the
   * cart icon on one-page and the cart link in the breadcrumbs/buyer journey on
   * three-page checkout.
   */
  public CheckoutAndAccountsConfigurationBrandingVisibility getVisibility() {
    return visibility;
  }

  public void setVisibility(CheckoutAndAccountsConfigurationBrandingVisibility visibility) {
    this.visibility = visibility;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingCartLinkInput{visibility='" + visibility + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCartLinkInput that = (CheckoutAndAccountsConfigurationBrandingCartLinkInput) o;
    return Objects.equals(visibility, that.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visibility);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The input to update the visibility of cart links in checkout. This hides the
     * cart icon on one-page and the cart link in the breadcrumbs/buyer journey on
     * three-page checkout.
     */
    private CheckoutAndAccountsConfigurationBrandingVisibility visibility;

    public CheckoutAndAccountsConfigurationBrandingCartLinkInput build() {
      CheckoutAndAccountsConfigurationBrandingCartLinkInput result = new CheckoutAndAccountsConfigurationBrandingCartLinkInput();
      result.visibility = this.visibility;
      return result;
    }

    /**
     * The input to update the visibility of cart links in checkout. This hides the
     * cart icon on one-page and the cart link in the breadcrumbs/buyer journey on
     * three-page checkout.
     */
    public Builder visibility(CheckoutAndAccountsConfigurationBrandingVisibility visibility) {
      this.visibility = visibility;
      return this;
    }
  }
}
