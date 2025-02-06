package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update the global customizations.
 */
public class CheckoutBrandingGlobalInput {
  /**
   * Select a global corner radius setting that overrides all other [corner radii](https://shopify.dev/docs/api/admin-graphql/latest/enums/CheckoutBrandingCornerRadius)
   * customizations.
   */
  private CheckoutBrandingGlobalCornerRadius cornerRadius;

  /**
   * The global typography customizations.
   */
  private CheckoutBrandingTypographyStyleGlobalInput typography;

  public CheckoutBrandingGlobalInput() {
  }

  /**
   * Select a global corner radius setting that overrides all other [corner radii](https://shopify.dev/docs/api/admin-graphql/latest/enums/CheckoutBrandingCornerRadius)
   * customizations.
   */
  public CheckoutBrandingGlobalCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutBrandingGlobalCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  /**
   * The global typography customizations.
   */
  public CheckoutBrandingTypographyStyleGlobalInput getTypography() {
    return typography;
  }

  public void setTypography(CheckoutBrandingTypographyStyleGlobalInput typography) {
    this.typography = typography;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingGlobalInput{cornerRadius='" + cornerRadius + "', typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingGlobalInput that = (CheckoutBrandingGlobalInput) o;
    return Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(typography, that.typography);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cornerRadius, typography);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Select a global corner radius setting that overrides all other [corner radii](https://shopify.dev/docs/api/admin-graphql/latest/enums/CheckoutBrandingCornerRadius)
     * customizations.
     */
    private CheckoutBrandingGlobalCornerRadius cornerRadius;

    /**
     * The global typography customizations.
     */
    private CheckoutBrandingTypographyStyleGlobalInput typography;

    public CheckoutBrandingGlobalInput build() {
      CheckoutBrandingGlobalInput result = new CheckoutBrandingGlobalInput();
      result.cornerRadius = this.cornerRadius;
      result.typography = this.typography;
      return result;
    }

    /**
     * Select a global corner radius setting that overrides all other [corner radii](https://shopify.dev/docs/api/admin-graphql/latest/enums/CheckoutBrandingCornerRadius)
     * customizations.
     */
    public Builder cornerRadius(CheckoutBrandingGlobalCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    /**
     * The global typography customizations.
     */
    public Builder typography(CheckoutBrandingTypographyStyleGlobalInput typography) {
      this.typography = typography;
      return this;
    }
  }
}
