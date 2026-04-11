package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Defines the visual styling for checkbox elements throughout the checkout
 * interface, focusing on corner radius customization. This allows merchants to
 * align checkbox appearance with their overall design aesthetic.
 *
 * For example, a modern minimalist brand might prefer sharp, square checkboxes
 * while a friendly consumer brand could opt for rounded corners to create a
 * softer, more approachable feel.
 *
 * The corner radius setting ensures checkboxes integrate seamlessly with the
 * overall checkout design language and brand identity.
 */
public class CheckoutBrandingCheckbox {
  /**
   * The corner radius used for checkboxes.
   */
  private CheckoutBrandingCornerRadius cornerRadius;

  public CheckoutBrandingCheckbox() {
  }

  /**
   * The corner radius used for checkboxes.
   */
  public CheckoutBrandingCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingCheckbox{cornerRadius='" + cornerRadius + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingCheckbox that = (CheckoutBrandingCheckbox) o;
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
     * The corner radius used for checkboxes.
     */
    private CheckoutBrandingCornerRadius cornerRadius;

    public CheckoutBrandingCheckbox build() {
      CheckoutBrandingCheckbox result = new CheckoutBrandingCheckbox();
      result.cornerRadius = this.cornerRadius;
      return result;
    }

    /**
     * The corner radius used for checkboxes.
     */
    public Builder cornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }
  }
}
