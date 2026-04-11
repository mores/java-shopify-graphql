package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Controls the visibility of cart links displayed during checkout. These links
 * allow customers to return to their cart or continue shopping.
 *
 * For example, an electronics store might hide cart links during final checkout
 * steps to reduce distractions, or show them prominently to encourage customers to
 * add accessories before completing their purchase.
 *
 * The `CartLink` object provides visibility settings to control when and how these
 * navigation elements appear based on the merchant's checkout flow strategy.
 */
public class CheckoutBrandingCartLink {
  /**
   * Whether the cart link is visible at checkout.
   */
  private CheckoutBrandingVisibility visibility;

  public CheckoutBrandingCartLink() {
  }

  /**
   * Whether the cart link is visible at checkout.
   */
  public CheckoutBrandingVisibility getVisibility() {
    return visibility;
  }

  public void setVisibility(CheckoutBrandingVisibility visibility) {
    this.visibility = visibility;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingCartLink{visibility='" + visibility + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingCartLink that = (CheckoutBrandingCartLink) o;
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
     * Whether the cart link is visible at checkout.
     */
    private CheckoutBrandingVisibility visibility;

    public CheckoutBrandingCartLink build() {
      CheckoutBrandingCartLink result = new CheckoutBrandingCartLink();
      result.visibility = this.visibility;
      return result;
    }

    /**
     * Whether the cart link is visible at checkout.
     */
    public Builder visibility(CheckoutBrandingVisibility visibility) {
      this.visibility = visibility;
      return this;
    }
  }
}
