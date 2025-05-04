package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The global customizations.
 */
public class CheckoutBrandingGlobal {
  /**
   * The global corner radius setting that overrides all other [corner radius](https://shopify.dev/docs/api/admin-graphql/latest/enums/CheckoutBrandingCornerRadius)
   * customizations.
   */
  private CheckoutBrandingGlobalCornerRadius cornerRadius;

  /**
   * The global typography customizations.
   */
  private CheckoutBrandingTypographyStyleGlobal typography;

  public CheckoutBrandingGlobal() {
  }

  /**
   * The global corner radius setting that overrides all other [corner radius](https://shopify.dev/docs/api/admin-graphql/latest/enums/CheckoutBrandingCornerRadius)
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
  public CheckoutBrandingTypographyStyleGlobal getTypography() {
    return typography;
  }

  public void setTypography(CheckoutBrandingTypographyStyleGlobal typography) {
    this.typography = typography;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingGlobal{cornerRadius='" + cornerRadius + "', typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingGlobal that = (CheckoutBrandingGlobal) o;
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
     * The global corner radius setting that overrides all other [corner radius](https://shopify.dev/docs/api/admin-graphql/latest/enums/CheckoutBrandingCornerRadius)
     * customizations.
     */
    private CheckoutBrandingGlobalCornerRadius cornerRadius;

    /**
     * The global typography customizations.
     */
    private CheckoutBrandingTypographyStyleGlobal typography;

    public CheckoutBrandingGlobal build() {
      CheckoutBrandingGlobal result = new CheckoutBrandingGlobal();
      result.cornerRadius = this.cornerRadius;
      result.typography = this.typography;
      return result;
    }

    /**
     * The global corner radius setting that overrides all other [corner radius](https://shopify.dev/docs/api/admin-graphql/latest/enums/CheckoutBrandingCornerRadius)
     * customizations.
     */
    public Builder cornerRadius(CheckoutBrandingGlobalCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    /**
     * The global typography customizations.
     */
    public Builder typography(CheckoutBrandingTypographyStyleGlobal typography) {
      this.typography = typography;
      return this;
    }
  }
}
