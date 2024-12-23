package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update the checkboxes customizations.
 */
public class CheckoutBrandingCheckboxInput {
  /**
   * The corner radius used for checkboxes.
   */
  private CheckoutBrandingCornerRadius cornerRadius;

  public CheckoutBrandingCheckboxInput() {
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
    return "CheckoutBrandingCheckboxInput{cornerRadius='" + cornerRadius + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingCheckboxInput that = (CheckoutBrandingCheckboxInput) o;
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

    public CheckoutBrandingCheckboxInput build() {
      CheckoutBrandingCheckboxInput result = new CheckoutBrandingCheckboxInput();
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
