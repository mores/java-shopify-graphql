package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating the cart link customizations at checkout.
 */
public class CheckoutBrandingCartLinkInput {
  /**
   * The input to update the visibility of cart links in checkout. This hides the
   * cart icon on one-page and the cart link in the breadcrumbs/buyer journey on
   * three-page checkout.
   */
  private CheckoutBrandingVisibility visibility;

  public CheckoutBrandingCartLinkInput() {
  }

  /**
   * The input to update the visibility of cart links in checkout. This hides the
   * cart icon on one-page and the cart link in the breadcrumbs/buyer journey on
   * three-page checkout.
   */
  public CheckoutBrandingVisibility getVisibility() {
    return visibility;
  }

  public void setVisibility(CheckoutBrandingVisibility visibility) {
    this.visibility = visibility;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingCartLinkInput{visibility='" + visibility + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingCartLinkInput that = (CheckoutBrandingCartLinkInput) o;
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
    private CheckoutBrandingVisibility visibility;

    public CheckoutBrandingCartLinkInput build() {
      CheckoutBrandingCartLinkInput result = new CheckoutBrandingCartLinkInput();
      result.visibility = this.visibility;
      return result;
    }

    /**
     * The input to update the visibility of cart links in checkout. This hides the
     * cart icon on one-page and the cart link in the breadcrumbs/buyer journey on
     * three-page checkout.
     */
    public Builder visibility(CheckoutBrandingVisibility visibility) {
      this.visibility = visibility;
      return this;
    }
  }
}
