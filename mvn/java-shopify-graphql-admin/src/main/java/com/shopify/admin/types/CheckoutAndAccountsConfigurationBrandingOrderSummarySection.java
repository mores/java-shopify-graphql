package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The order summary sections customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingOrderSummarySection {
  /**
   * The background style of the order summary sections.
   */
  private CheckoutAndAccountsConfigurationBrandingBackground background;

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
   * The colors customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingColors colors;

  /**
   * The corner radius of the order summary sections.
   */
  private CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius;

  /**
   * The padding of the order summary sections.
   */
  private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

  /**
   * The shadow of the order summary sections.
   */
  private CheckoutAndAccountsConfigurationBrandingShadow shadow;

  public CheckoutAndAccountsConfigurationBrandingOrderSummarySection() {
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
   * The colors customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingColors getColors() {
    return colors;
  }

  public void setColors(CheckoutAndAccountsConfigurationBrandingColors colors) {
    this.colors = colors;
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
   * The padding of the order summary sections.
   */
  public CheckoutAndAccountsConfigurationBrandingSpacingKeyword getPadding() {
    return padding;
  }

  public void setPadding(CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding) {
    this.padding = padding;
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

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingOrderSummarySection{background='" + background + "', border='" + border + "', borderStyle='" + borderStyle + "', borderWidth='" + borderWidth + "', colors='" + colors + "', cornerRadius='" + cornerRadius + "', padding='" + padding + "', shadow='" + shadow + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingOrderSummarySection that = (CheckoutAndAccountsConfigurationBrandingOrderSummarySection) o;
    return Objects.equals(background, that.background) &&
        Objects.equals(border, that.border) &&
        Objects.equals(borderStyle, that.borderStyle) &&
        Objects.equals(borderWidth, that.borderWidth) &&
        Objects.equals(colors, that.colors) &&
        Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(padding, that.padding) &&
        Objects.equals(shadow, that.shadow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(background, border, borderStyle, borderWidth, colors, cornerRadius, padding, shadow);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The background style of the order summary sections.
     */
    private CheckoutAndAccountsConfigurationBrandingBackground background;

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
     * The colors customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingColors colors;

    /**
     * The corner radius of the order summary sections.
     */
    private CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius;

    /**
     * The padding of the order summary sections.
     */
    private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

    /**
     * The shadow of the order summary sections.
     */
    private CheckoutAndAccountsConfigurationBrandingShadow shadow;

    public CheckoutAndAccountsConfigurationBrandingOrderSummarySection build() {
      CheckoutAndAccountsConfigurationBrandingOrderSummarySection result = new CheckoutAndAccountsConfigurationBrandingOrderSummarySection();
      result.background = this.background;
      result.border = this.border;
      result.borderStyle = this.borderStyle;
      result.borderWidth = this.borderWidth;
      result.colors = this.colors;
      result.cornerRadius = this.cornerRadius;
      result.padding = this.padding;
      result.shadow = this.shadow;
      return result;
    }

    /**
     * The background style of the order summary sections.
     */
    public Builder background(CheckoutAndAccountsConfigurationBrandingBackground background) {
      this.background = background;
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
     * The colors customizations.
     */
    public Builder colors(CheckoutAndAccountsConfigurationBrandingColors colors) {
      this.colors = colors;
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
     * The padding of the order summary sections.
     */
    public Builder padding(CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding) {
      this.padding = padding;
      return this;
    }

    /**
     * The shadow of the order summary sections.
     */
    public Builder shadow(CheckoutAndAccountsConfigurationBrandingShadow shadow) {
      this.shadow = shadow;
      return this;
    }
  }
}
