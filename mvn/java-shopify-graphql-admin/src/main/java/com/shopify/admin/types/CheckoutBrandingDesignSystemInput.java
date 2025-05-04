package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update the design system.
 */
public class CheckoutBrandingDesignSystemInput {
  /**
   * The color settings for global colors and color schemes.
   */
  private CheckoutBrandingColorsInput colors;

  /**
   * The typography.
   */
  private CheckoutBrandingTypographyInput typography;

  /**
   * The corner radius variables.
   */
  private CheckoutBrandingCornerRadiusVariablesInput cornerRadius;

  public CheckoutBrandingDesignSystemInput() {
  }

  /**
   * The color settings for global colors and color schemes.
   */
  public CheckoutBrandingColorsInput getColors() {
    return colors;
  }

  public void setColors(CheckoutBrandingColorsInput colors) {
    this.colors = colors;
  }

  /**
   * The typography.
   */
  public CheckoutBrandingTypographyInput getTypography() {
    return typography;
  }

  public void setTypography(CheckoutBrandingTypographyInput typography) {
    this.typography = typography;
  }

  /**
   * The corner radius variables.
   */
  public CheckoutBrandingCornerRadiusVariablesInput getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutBrandingCornerRadiusVariablesInput cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingDesignSystemInput{colors='" + colors + "', typography='" + typography + "', cornerRadius='" + cornerRadius + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingDesignSystemInput that = (CheckoutBrandingDesignSystemInput) o;
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
     * The color settings for global colors and color schemes.
     */
    private CheckoutBrandingColorsInput colors;

    /**
     * The typography.
     */
    private CheckoutBrandingTypographyInput typography;

    /**
     * The corner radius variables.
     */
    private CheckoutBrandingCornerRadiusVariablesInput cornerRadius;

    public CheckoutBrandingDesignSystemInput build() {
      CheckoutBrandingDesignSystemInput result = new CheckoutBrandingDesignSystemInput();
      result.colors = this.colors;
      result.typography = this.typography;
      result.cornerRadius = this.cornerRadius;
      return result;
    }

    /**
     * The color settings for global colors and color schemes.
     */
    public Builder colors(CheckoutBrandingColorsInput colors) {
      this.colors = colors;
      return this;
    }

    /**
     * The typography.
     */
    public Builder typography(CheckoutBrandingTypographyInput typography) {
      this.typography = typography;
      return this;
    }

    /**
     * The corner radius variables.
     */
    public Builder cornerRadius(CheckoutBrandingCornerRadiusVariablesInput cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }
  }
}
