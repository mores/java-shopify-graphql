package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The shared customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingShared {
  /**
   * The shared color customizations for semantic and functional colors.
   */
  private CheckoutAndAccountsConfigurationBrandingSharedColors colors;

  /**
   * The shared corner radius setting that overrides all other [corner radius](https://shopify.dev/docs/api/admin-graphql/latest/enums/CheckoutAndAccountsConfigurationBrandingCornerRadius)
   * customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingSharedCornerRadius cornerRadius;

  /**
   * The shared typography customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingSharedTypographyStyle typography;

  public CheckoutAndAccountsConfigurationBrandingShared() {
  }

  /**
   * The shared color customizations for semantic and functional colors.
   */
  public CheckoutAndAccountsConfigurationBrandingSharedColors getColors() {
    return colors;
  }

  public void setColors(CheckoutAndAccountsConfigurationBrandingSharedColors colors) {
    this.colors = colors;
  }

  /**
   * The shared corner radius setting that overrides all other [corner radius](https://shopify.dev/docs/api/admin-graphql/latest/enums/CheckoutAndAccountsConfigurationBrandingCornerRadius)
   * customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingSharedCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(
      CheckoutAndAccountsConfigurationBrandingSharedCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  /**
   * The shared typography customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingSharedTypographyStyle getTypography() {
    return typography;
  }

  public void setTypography(
      CheckoutAndAccountsConfigurationBrandingSharedTypographyStyle typography) {
    this.typography = typography;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingShared{colors='" + colors + "', cornerRadius='" + cornerRadius + "', typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingShared that = (CheckoutAndAccountsConfigurationBrandingShared) o;
    return Objects.equals(colors, that.colors) &&
        Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(typography, that.typography);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colors, cornerRadius, typography);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The shared color customizations for semantic and functional colors.
     */
    private CheckoutAndAccountsConfigurationBrandingSharedColors colors;

    /**
     * The shared corner radius setting that overrides all other [corner radius](https://shopify.dev/docs/api/admin-graphql/latest/enums/CheckoutAndAccountsConfigurationBrandingCornerRadius)
     * customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingSharedCornerRadius cornerRadius;

    /**
     * The shared typography customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingSharedTypographyStyle typography;

    public CheckoutAndAccountsConfigurationBrandingShared build() {
      CheckoutAndAccountsConfigurationBrandingShared result = new CheckoutAndAccountsConfigurationBrandingShared();
      result.colors = this.colors;
      result.cornerRadius = this.cornerRadius;
      result.typography = this.typography;
      return result;
    }

    /**
     * The shared color customizations for semantic and functional colors.
     */
    public Builder colors(CheckoutAndAccountsConfigurationBrandingSharedColors colors) {
      this.colors = colors;
      return this;
    }

    /**
     * The shared corner radius setting that overrides all other [corner radius](https://shopify.dev/docs/api/admin-graphql/latest/enums/CheckoutAndAccountsConfigurationBrandingCornerRadius)
     * customizations.
     */
    public Builder cornerRadius(
        CheckoutAndAccountsConfigurationBrandingSharedCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    /**
     * The shared typography customizations.
     */
    public Builder typography(
        CheckoutAndAccountsConfigurationBrandingSharedTypographyStyle typography) {
      this.typography = typography;
      return this;
    }
  }
}
