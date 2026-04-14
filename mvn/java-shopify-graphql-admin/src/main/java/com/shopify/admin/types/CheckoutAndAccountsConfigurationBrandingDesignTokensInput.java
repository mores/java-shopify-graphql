package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the design tokens.
 */
public class CheckoutAndAccountsConfigurationBrandingDesignTokensInput {
  /**
   * The color customizations for global colors.
   */
  private CheckoutAndAccountsConfigurationBrandingDesignTokensColorsInput colors;

  /**
   * The typography.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographyInput typography;

  /**
   * The corner radius variables.
   */
  private CheckoutAndAccountsConfigurationBrandingCornerRadiusVariablesInput cornerRadius;

  public CheckoutAndAccountsConfigurationBrandingDesignTokensInput() {
  }

  /**
   * The color customizations for global colors.
   */
  public CheckoutAndAccountsConfigurationBrandingDesignTokensColorsInput getColors() {
    return colors;
  }

  public void setColors(CheckoutAndAccountsConfigurationBrandingDesignTokensColorsInput colors) {
    this.colors = colors;
  }

  /**
   * The typography.
   */
  public CheckoutAndAccountsConfigurationBrandingTypographyInput getTypography() {
    return typography;
  }

  public void setTypography(CheckoutAndAccountsConfigurationBrandingTypographyInput typography) {
    this.typography = typography;
  }

  /**
   * The corner radius variables.
   */
  public CheckoutAndAccountsConfigurationBrandingCornerRadiusVariablesInput getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(
      CheckoutAndAccountsConfigurationBrandingCornerRadiusVariablesInput cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingDesignTokensInput{colors='" + colors + "', typography='" + typography + "', cornerRadius='" + cornerRadius + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingDesignTokensInput that = (CheckoutAndAccountsConfigurationBrandingDesignTokensInput) o;
    return Objects.equals(colors, that.colors) &&
        Objects.equals(typography, that.typography) &&
        Objects.equals(cornerRadius, that.cornerRadius);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colors, typography, cornerRadius);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The color customizations for global colors.
     */
    private CheckoutAndAccountsConfigurationBrandingDesignTokensColorsInput colors;

    /**
     * The typography.
     */
    private CheckoutAndAccountsConfigurationBrandingTypographyInput typography;

    /**
     * The corner radius variables.
     */
    private CheckoutAndAccountsConfigurationBrandingCornerRadiusVariablesInput cornerRadius;

    public CheckoutAndAccountsConfigurationBrandingDesignTokensInput build() {
      CheckoutAndAccountsConfigurationBrandingDesignTokensInput result = new CheckoutAndAccountsConfigurationBrandingDesignTokensInput();
      result.colors = this.colors;
      result.typography = this.typography;
      result.cornerRadius = this.cornerRadius;
      return result;
    }

    /**
     * The color customizations for global colors.
     */
    public Builder colors(CheckoutAndAccountsConfigurationBrandingDesignTokensColorsInput colors) {
      this.colors = colors;
      return this;
    }

    /**
     * The typography.
     */
    public Builder typography(CheckoutAndAccountsConfigurationBrandingTypographyInput typography) {
      this.typography = typography;
      return this;
    }

    /**
     * The corner radius variables.
     */
    public Builder cornerRadius(
        CheckoutAndAccountsConfigurationBrandingCornerRadiusVariablesInput cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }
  }
}
