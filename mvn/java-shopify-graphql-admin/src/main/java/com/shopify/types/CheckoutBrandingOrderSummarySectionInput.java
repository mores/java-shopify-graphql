package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update the order summary sections customizations.
 */
public class CheckoutBrandingOrderSummarySectionInput {
  /**
   * The selected color scheme for the order summary sections.
   */
  private CheckoutBrandingColorSchemeSelection colorScheme;

  /**
   * The background style of the order summary sections.
   */
  private CheckoutBrandingBackground background;

  /**
   * The corner radius of the order summary sections.
   */
  private CheckoutBrandingCornerRadius cornerRadius;

  /**
   * The border for the order summary sections.
   */
  private CheckoutBrandingSimpleBorder border;

  /**
   * The border style of the order summary sections.
   */
  private CheckoutBrandingBorderStyle borderStyle;

  /**
   * The border width of the order summary sections.
   */
  private CheckoutBrandingBorderWidth borderWidth;

  /**
   * The shadow of the order summary sections.
   */
  private CheckoutBrandingShadow shadow;

  /**
   * The padding of the order summary sections.
   */
  private CheckoutBrandingSpacingKeyword padding;

  public CheckoutBrandingOrderSummarySectionInput() {
  }

  /**
   * The selected color scheme for the order summary sections.
   */
  public CheckoutBrandingColorSchemeSelection getColorScheme() {
    return colorScheme;
  }

  public void setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
    this.colorScheme = colorScheme;
  }

  /**
   * The background style of the order summary sections.
   */
  public CheckoutBrandingBackground getBackground() {
    return background;
  }

  public void setBackground(CheckoutBrandingBackground background) {
    this.background = background;
  }

  /**
   * The corner radius of the order summary sections.
   */
  public CheckoutBrandingCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  /**
   * The border for the order summary sections.
   */
  public CheckoutBrandingSimpleBorder getBorder() {
    return border;
  }

  public void setBorder(CheckoutBrandingSimpleBorder border) {
    this.border = border;
  }

  /**
   * The border style of the order summary sections.
   */
  public CheckoutBrandingBorderStyle getBorderStyle() {
    return borderStyle;
  }

  public void setBorderStyle(CheckoutBrandingBorderStyle borderStyle) {
    this.borderStyle = borderStyle;
  }

  /**
   * The border width of the order summary sections.
   */
  public CheckoutBrandingBorderWidth getBorderWidth() {
    return borderWidth;
  }

  public void setBorderWidth(CheckoutBrandingBorderWidth borderWidth) {
    this.borderWidth = borderWidth;
  }

  /**
   * The shadow of the order summary sections.
   */
  public CheckoutBrandingShadow getShadow() {
    return shadow;
  }

  public void setShadow(CheckoutBrandingShadow shadow) {
    this.shadow = shadow;
  }

  /**
   * The padding of the order summary sections.
   */
  public CheckoutBrandingSpacingKeyword getPadding() {
    return padding;
  }

  public void setPadding(CheckoutBrandingSpacingKeyword padding) {
    this.padding = padding;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingOrderSummarySectionInput{colorScheme='" + colorScheme + "', background='" + background + "', cornerRadius='" + cornerRadius + "', border='" + border + "', borderStyle='" + borderStyle + "', borderWidth='" + borderWidth + "', shadow='" + shadow + "', padding='" + padding + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingOrderSummarySectionInput that = (CheckoutBrandingOrderSummarySectionInput) o;
    return Objects.equals(colorScheme, that.colorScheme) &&
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
    return Objects.hash(colorScheme, background, cornerRadius, border, borderStyle, borderWidth, shadow, padding);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The selected color scheme for the order summary sections.
     */
    private CheckoutBrandingColorSchemeSelection colorScheme;

    /**
     * The background style of the order summary sections.
     */
    private CheckoutBrandingBackground background;

    /**
     * The corner radius of the order summary sections.
     */
    private CheckoutBrandingCornerRadius cornerRadius;

    /**
     * The border for the order summary sections.
     */
    private CheckoutBrandingSimpleBorder border;

    /**
     * The border style of the order summary sections.
     */
    private CheckoutBrandingBorderStyle borderStyle;

    /**
     * The border width of the order summary sections.
     */
    private CheckoutBrandingBorderWidth borderWidth;

    /**
     * The shadow of the order summary sections.
     */
    private CheckoutBrandingShadow shadow;

    /**
     * The padding of the order summary sections.
     */
    private CheckoutBrandingSpacingKeyword padding;

    public CheckoutBrandingOrderSummarySectionInput build() {
      CheckoutBrandingOrderSummarySectionInput result = new CheckoutBrandingOrderSummarySectionInput();
      result.colorScheme = this.colorScheme;
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
     * The selected color scheme for the order summary sections.
     */
    public Builder colorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
      this.colorScheme = colorScheme;
      return this;
    }

    /**
     * The background style of the order summary sections.
     */
    public Builder background(CheckoutBrandingBackground background) {
      this.background = background;
      return this;
    }

    /**
     * The corner radius of the order summary sections.
     */
    public Builder cornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    /**
     * The border for the order summary sections.
     */
    public Builder border(CheckoutBrandingSimpleBorder border) {
      this.border = border;
      return this;
    }

    /**
     * The border style of the order summary sections.
     */
    public Builder borderStyle(CheckoutBrandingBorderStyle borderStyle) {
      this.borderStyle = borderStyle;
      return this;
    }

    /**
     * The border width of the order summary sections.
     */
    public Builder borderWidth(CheckoutBrandingBorderWidth borderWidth) {
      this.borderWidth = borderWidth;
      return this;
    }

    /**
     * The shadow of the order summary sections.
     */
    public Builder shadow(CheckoutBrandingShadow shadow) {
      this.shadow = shadow;
      return this;
    }

    /**
     * The padding of the order summary sections.
     */
    public Builder padding(CheckoutBrandingSpacingKeyword padding) {
      this.padding = padding;
      return this;
    }
  }
}
