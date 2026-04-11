package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the order summary sections.
 */
public class CheckoutAndAccountsConfigurationBrandingOrderSummarySectionInput {
  /**
   * The colors customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingColorsInput colors;

  /**
   * The background style of the order summary sections.
   */
  private CheckoutAndAccountsConfigurationBrandingBackground background;

  /**
   * The corner radius of the order summary sections.
   */
  private CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius;

  /**
   * The border for the order summary sections.
   */
  private CheckoutAndAccountsConfigurationBrandingSimpleBorder border;

  /**
   * The border style of the order summary sections.
   */
  private CheckoutAndAccountsConfigurationBrandingBorderStyle borderStyle;

  /**
   * The border width of the order summary sections.
   */
  private CheckoutAndAccountsConfigurationBrandingBorderWidth borderWidth;

  /**
   * The shadow of the order summary sections.
   */
  private CheckoutAndAccountsConfigurationBrandingShadow shadow;

  /**
   * The padding of the order summary sections.
   */
  private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

  public CheckoutAndAccountsConfigurationBrandingOrderSummarySectionInput() {
  }

  /**
   * The colors customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingColorsInput getColors() {
    return colors;
  }

  public void setColors(CheckoutAndAccountsConfigurationBrandingColorsInput colors) {
    this.colors = colors;
  }

  /**
   * The background style of the order summary sections.
   */
  public CheckoutAndAccountsConfigurationBrandingBackground getBackground() {
    return background;
  }

  public void setBackground(CheckoutAndAccountsConfigurationBrandingBackground background) {
    this.background = background;
  }

  /**
   * The corner radius of the order summary sections.
   */
  public CheckoutAndAccountsConfigurationBrandingCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  /**
   * The border for the order summary sections.
   */
  public CheckoutAndAccountsConfigurationBrandingSimpleBorder getBorder() {
    return border;
  }

  public void setBorder(CheckoutAndAccountsConfigurationBrandingSimpleBorder border) {
    this.border = border;
  }

  /**
   * The border style of the order summary sections.
   */
  public CheckoutAndAccountsConfigurationBrandingBorderStyle getBorderStyle() {
    return borderStyle;
  }

  public void setBorderStyle(CheckoutAndAccountsConfigurationBrandingBorderStyle borderStyle) {
    this.borderStyle = borderStyle;
  }

  /**
   * The border width of the order summary sections.
   */
  public CheckoutAndAccountsConfigurationBrandingBorderWidth getBorderWidth() {
    return borderWidth;
  }

  public void setBorderWidth(CheckoutAndAccountsConfigurationBrandingBorderWidth borderWidth) {
    this.borderWidth = borderWidth;
  }

  /**
   * The shadow of the order summary sections.
   */
  public CheckoutAndAccountsConfigurationBrandingShadow getShadow() {
    return shadow;
  }

  public void setShadow(CheckoutAndAccountsConfigurationBrandingShadow shadow) {
    this.shadow = shadow;
  }

  /**
   * The padding of the order summary sections.
   */
  public CheckoutAndAccountsConfigurationBrandingSpacingKeyword getPadding() {
    return padding;
  }

  public void setPadding(CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding) {
    this.padding = padding;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingOrderSummarySectionInput{colors='" + colors + "', background='" + background + "', cornerRadius='" + cornerRadius + "', border='" + border + "', borderStyle='" + borderStyle + "', borderWidth='" + borderWidth + "', shadow='" + shadow + "', padding='" + padding + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingOrderSummarySectionInput that = (CheckoutAndAccountsConfigurationBrandingOrderSummarySectionInput) o;
    return Objects.equals(colors, that.colors) &&
        Objects.equals(background, that.background) &&
        Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(border, that.border) &&
        Objects.equals(borderStyle, that.borderStyle) &&
        Objects.equals(borderWidth, that.borderWidth) &&
        Objects.equals(shadow, that.shadow) &&
        Objects.equals(padding, that.padding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colors, background, cornerRadius, border, borderStyle, borderWidth, shadow, padding);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The colors customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingColorsInput colors;

    /**
     * The background style of the order summary sections.
     */
    private CheckoutAndAccountsConfigurationBrandingBackground background;

    /**
     * The corner radius of the order summary sections.
     */
    private CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius;

    /**
     * The border for the order summary sections.
     */
    private CheckoutAndAccountsConfigurationBrandingSimpleBorder border;

    /**
     * The border style of the order summary sections.
     */
    private CheckoutAndAccountsConfigurationBrandingBorderStyle borderStyle;

    /**
     * The border width of the order summary sections.
     */
    private CheckoutAndAccountsConfigurationBrandingBorderWidth borderWidth;

    /**
     * The shadow of the order summary sections.
     */
    private CheckoutAndAccountsConfigurationBrandingShadow shadow;

    /**
     * The padding of the order summary sections.
     */
    private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

    public CheckoutAndAccountsConfigurationBrandingOrderSummarySectionInput build() {
      CheckoutAndAccountsConfigurationBrandingOrderSummarySectionInput result = new CheckoutAndAccountsConfigurationBrandingOrderSummarySectionInput();
      result.colors = this.colors;
      result.background = this.background;
      result.cornerRadius = this.cornerRadius;
      result.border = this.border;
      result.borderStyle = this.borderStyle;
      result.borderWidth = this.borderWidth;
      result.shadow = this.shadow;
      result.padding = this.padding;
      return result;
    }

    /**
     * The colors customizations.
     */
    public Builder colors(CheckoutAndAccountsConfigurationBrandingColorsInput colors) {
      this.colors = colors;
      return this;
    }

    /**
     * The background style of the order summary sections.
     */
    public Builder background(CheckoutAndAccountsConfigurationBrandingBackground background) {
      this.background = background;
      return this;
    }

    /**
     * The corner radius of the order summary sections.
     */
    public Builder cornerRadius(CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    /**
     * The border for the order summary sections.
     */
    public Builder border(CheckoutAndAccountsConfigurationBrandingSimpleBorder border) {
      this.border = border;
      return this;
    }

    /**
     * The border style of the order summary sections.
     */
    public Builder borderStyle(CheckoutAndAccountsConfigurationBrandingBorderStyle borderStyle) {
      this.borderStyle = borderStyle;
      return this;
    }

    /**
     * The border width of the order summary sections.
     */
    public Builder borderWidth(CheckoutAndAccountsConfigurationBrandingBorderWidth borderWidth) {
      this.borderWidth = borderWidth;
      return this;
    }

    /**
     * The shadow of the order summary sections.
     */
    public Builder shadow(CheckoutAndAccountsConfigurationBrandingShadow shadow) {
      this.shadow = shadow;
      return this;
    }

    /**
     * The padding of the order summary sections.
     */
    public Builder padding(CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding) {
      this.padding = padding;
      return this;
    }
  }
}
