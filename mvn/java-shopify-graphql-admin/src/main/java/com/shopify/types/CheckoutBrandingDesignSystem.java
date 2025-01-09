package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The design system allows you to set values that represent specific attributes
 * of your brand like color and font. These attributes are used throughout the user
 * interface. This brings consistency and allows you to easily make broad design changes.
 */
public class CheckoutBrandingDesignSystem {
  /**
   * The color settings for global colors and color schemes.
   */
  private CheckoutBrandingColors colors;

  /**
   * The corner radius variables.
   */
  private CheckoutBrandingCornerRadiusVariables cornerRadius;

  /**
   * The typography.
   */
  private CheckoutBrandingTypography typography;

  public CheckoutBrandingDesignSystem() {
  }

  /**
   * The color settings for global colors and color schemes.
   */
  public CheckoutBrandingColors getColors() {
    return colors;
  }

  public void setColors(CheckoutBrandingColors colors) {
    this.colors = colors;
  }

  /**
   * The corner radius variables.
   */
  public CheckoutBrandingCornerRadiusVariables getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutBrandingCornerRadiusVariables cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  /**
   * The typography.
   */
  public CheckoutBrandingTypography getTypography() {
    return typography;
  }

  public void setTypography(CheckoutBrandingTypography typography) {
    this.typography = typography;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingDesignSystem{colors='" + colors + "', cornerRadius='" + cornerRadius + "', typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingDesignSystem that = (CheckoutBrandingDesignSystem) o;
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
     * The color settings for global colors and color schemes.
     */
    private CheckoutBrandingColors colors;

    /**
     * The corner radius variables.
     */
    private CheckoutBrandingCornerRadiusVariables cornerRadius;

    /**
     * The typography.
     */
    private CheckoutBrandingTypography typography;

    public CheckoutBrandingDesignSystem build() {
      CheckoutBrandingDesignSystem result = new CheckoutBrandingDesignSystem();
      result.colors = this.colors;
      result.cornerRadius = this.cornerRadius;
      result.typography = this.typography;
      return result;
    }

    /**
     * The color settings for global colors and color schemes.
     */
    public Builder colors(CheckoutBrandingColors colors) {
      this.colors = colors;
      return this;
    }

    /**
     * The corner radius variables.
     */
    public Builder cornerRadius(CheckoutBrandingCornerRadiusVariables cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    /**
     * The typography.
     */
    public Builder typography(CheckoutBrandingTypography typography) {
      this.typography = typography;
      return this;
    }
  }
}
