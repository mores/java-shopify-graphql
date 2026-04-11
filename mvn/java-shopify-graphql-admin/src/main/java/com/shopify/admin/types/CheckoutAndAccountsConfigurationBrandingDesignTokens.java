package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The design token customizations allow you to set values that represent specific
 * attributes of your brand like color and font. These attributes are used
 * throughout the user interface. This brings consistency and allows you to easily
 * make broad design changes.
 */
public class CheckoutAndAccountsConfigurationBrandingDesignTokens {
  /**
   * The colors for global colors.
   */
  private CheckoutAndAccountsConfigurationBrandingDesignTokenColors colors;

  /**
   * The corner radius variables.
   */
  private CheckoutAndAccountsConfigurationBrandingCornerRadiusVariables cornerRadius;

  /**
   * The typography.
   */
  private CheckoutAndAccountsConfigurationBrandingTypography typography;

  public CheckoutAndAccountsConfigurationBrandingDesignTokens() {
  }

  /**
   * The colors for global colors.
   */
  public CheckoutAndAccountsConfigurationBrandingDesignTokenColors getColors() {
    return colors;
  }

  public void setColors(CheckoutAndAccountsConfigurationBrandingDesignTokenColors colors) {
    this.colors = colors;
  }

  /**
   * The corner radius variables.
   */
  public CheckoutAndAccountsConfigurationBrandingCornerRadiusVariables getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(
      CheckoutAndAccountsConfigurationBrandingCornerRadiusVariables cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  /**
   * The typography.
   */
  public CheckoutAndAccountsConfigurationBrandingTypography getTypography() {
    return typography;
  }

  public void setTypography(CheckoutAndAccountsConfigurationBrandingTypography typography) {
    this.typography = typography;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingDesignTokens{colors='" + colors + "', cornerRadius='" + cornerRadius + "', typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingDesignTokens that = (CheckoutAndAccountsConfigurationBrandingDesignTokens) o;
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
     * The colors for global colors.
     */
    private CheckoutAndAccountsConfigurationBrandingDesignTokenColors colors;

    /**
     * The corner radius variables.
     */
    private CheckoutAndAccountsConfigurationBrandingCornerRadiusVariables cornerRadius;

    /**
     * The typography.
     */
    private CheckoutAndAccountsConfigurationBrandingTypography typography;

    public CheckoutAndAccountsConfigurationBrandingDesignTokens build() {
      CheckoutAndAccountsConfigurationBrandingDesignTokens result = new CheckoutAndAccountsConfigurationBrandingDesignTokens();
      result.colors = this.colors;
      result.cornerRadius = this.cornerRadius;
      result.typography = this.typography;
      return result;
    }

    /**
     * The colors for global colors.
     */
    public Builder colors(CheckoutAndAccountsConfigurationBrandingDesignTokenColors colors) {
      this.colors = colors;
      return this;
    }

    /**
     * The corner radius variables.
     */
    public Builder cornerRadius(
        CheckoutAndAccountsConfigurationBrandingCornerRadiusVariables cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    /**
     * The typography.
     */
    public Builder typography(CheckoutAndAccountsConfigurationBrandingTypography typography) {
      this.typography = typography;
      return this;
    }
  }
}
