package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the shared settings.
 */
public class CheckoutAndAccountsConfigurationBrandingSharedInput {
  /**
   * Select a shared corner radius setting that overrides all other corner radii customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingSharedCornerRadius cornerRadius;

  /**
   * The shared typography customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleInput typography;

  /**
   * The shared color customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingSharedColorsInput colors;

  public CheckoutAndAccountsConfigurationBrandingSharedInput() {
  }

  /**
   * Select a shared corner radius setting that overrides all other corner radii customizations.
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
  public CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleInput getTypography() {
    return typography;
  }

  public void setTypography(
      CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleInput typography) {
    this.typography = typography;
  }

  /**
   * The shared color customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingSharedColorsInput getColors() {
    return colors;
  }

  public void setColors(CheckoutAndAccountsConfigurationBrandingSharedColorsInput colors) {
    this.colors = colors;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingSharedInput{cornerRadius='" + cornerRadius + "', typography='" + typography + "', colors='" + colors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingSharedInput that = (CheckoutAndAccountsConfigurationBrandingSharedInput) o;
    return Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(typography, that.typography) &&
        Objects.equals(colors, that.colors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cornerRadius, typography, colors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Select a shared corner radius setting that overrides all other corner radii customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingSharedCornerRadius cornerRadius;

    /**
     * The shared typography customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleInput typography;

    /**
     * The shared color customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingSharedColorsInput colors;

    public CheckoutAndAccountsConfigurationBrandingSharedInput build() {
      CheckoutAndAccountsConfigurationBrandingSharedInput result = new CheckoutAndAccountsConfigurationBrandingSharedInput();
      result.cornerRadius = this.cornerRadius;
      result.typography = this.typography;
      result.colors = this.colors;
      return result;
    }

    /**
     * Select a shared corner radius setting that overrides all other corner radii customizations.
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
        CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleInput typography) {
      this.typography = typography;
      return this;
    }

    /**
     * The shared color customizations.
     */
    public Builder colors(CheckoutAndAccountsConfigurationBrandingSharedColorsInput colors) {
      this.colors = colors;
      return this;
    }
  }
}
