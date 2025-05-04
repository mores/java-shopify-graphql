package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The main sections customizations.
 */
public class CheckoutBrandingMainSection {
  /**
   * The background style of the main sections.
   */
  private CheckoutBrandingBackground background;

  /**
   * The border for the main sections.
   */
  private CheckoutBrandingSimpleBorder border;

  /**
   * The border style of the main sections.
   */
  private CheckoutBrandingBorderStyle borderStyle;

  /**
   * The border width of the main sections.
   */
  private CheckoutBrandingBorderWidth borderWidth;

  /**
   * The selected color scheme of the main sections.
   */
  private CheckoutBrandingColorSchemeSelection colorScheme;

  /**
   * The corner radius of the main sections.
   */
  private CheckoutBrandingCornerRadius cornerRadius;

  /**
   * The padding of the main sections.
   */
  private CheckoutBrandingSpacingKeyword padding;

  /**
   * The shadow of the main sections.
   */
  private CheckoutBrandingShadow shadow;

  public CheckoutBrandingMainSection() {
  }

  /**
   * The background style of the main sections.
   */
  public CheckoutBrandingBackground getBackground() {
    return background;
  }

  public void setBackground(CheckoutBrandingBackground background) {
    this.background = background;
  }

  /**
   * The border for the main sections.
   */
  public CheckoutBrandingSimpleBorder getBorder() {
    return border;
  }

  public void setBorder(CheckoutBrandingSimpleBorder border) {
    this.border = border;
  }

  /**
   * The border style of the main sections.
   */
  public CheckoutBrandingBorderStyle getBorderStyle() {
    return borderStyle;
  }

  public void setBorderStyle(CheckoutBrandingBorderStyle borderStyle) {
    this.borderStyle = borderStyle;
  }

  /**
   * The border width of the main sections.
   */
  public CheckoutBrandingBorderWidth getBorderWidth() {
    return borderWidth;
  }

  public void setBorderWidth(CheckoutBrandingBorderWidth borderWidth) {
    this.borderWidth = borderWidth;
  }

  /**
   * The selected color scheme of the main sections.
   */
  public CheckoutBrandingColorSchemeSelection getColorScheme() {
    return colorScheme;
  }

  public void setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
    this.colorScheme = colorScheme;
  }

  /**
   * The corner radius of the main sections.
   */
  public CheckoutBrandingCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  /**
   * The padding of the main sections.
   */
  public CheckoutBrandingSpacingKeyword getPadding() {
    return padding;
  }

  public void setPadding(CheckoutBrandingSpacingKeyword padding) {
    this.padding = padding;
  }

  /**
   * The shadow of the main sections.
   */
  public CheckoutBrandingShadow getShadow() {
    return shadow;
  }

  public void setShadow(CheckoutBrandingShadow shadow) {
    this.shadow = shadow;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingMainSection{background='" + background + "', border='" + border + "', borderStyle='" + borderStyle + "', borderWidth='" + borderWidth + "', colorScheme='" + colorScheme + "', cornerRadius='" + cornerRadius + "', padding='" + padding + "', shadow='" + shadow + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingMainSection that = (CheckoutBrandingMainSection) o;
    return Objects.equals(background, that.background) &&
        Objects.equals(border, that.border) &&
        Objects.equals(borderStyle, that.borderStyle) &&
        Objects.equals(borderWidth, that.borderWidth) &&
        Objects.equals(colorScheme, that.colorScheme) &&
        Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(padding, that.padding) &&
        Objects.equals(shadow, that.shadow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(background, border, borderStyle, borderWidth, colorScheme, cornerRadius, padding, shadow);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The background style of the main sections.
     */
    private CheckoutBrandingBackground background;

    /**
     * The border for the main sections.
     */
    private CheckoutBrandingSimpleBorder border;

    /**
     * The border style of the main sections.
     */
    private CheckoutBrandingBorderStyle borderStyle;

    /**
     * The border width of the main sections.
     */
    private CheckoutBrandingBorderWidth borderWidth;

    /**
     * The selected color scheme of the main sections.
     */
    private CheckoutBrandingColorSchemeSelection colorScheme;

    /**
     * The corner radius of the main sections.
     */
    private CheckoutBrandingCornerRadius cornerRadius;

    /**
     * The padding of the main sections.
     */
    private CheckoutBrandingSpacingKeyword padding;

    /**
     * The shadow of the main sections.
     */
    private CheckoutBrandingShadow shadow;

    public CheckoutBrandingMainSection build() {
      CheckoutBrandingMainSection result = new CheckoutBrandingMainSection();
      result.background = this.background;
      result.border = this.border;
      result.borderStyle = this.borderStyle;
      result.borderWidth = this.borderWidth;
      result.colorScheme = this.colorScheme;
      result.cornerRadius = this.cornerRadius;
      result.padding = this.padding;
      result.shadow = this.shadow;
      return result;
    }

    /**
     * The background style of the main sections.
     */
    public Builder background(CheckoutBrandingBackground background) {
      this.background = background;
      return this;
    }

    /**
     * The border for the main sections.
     */
    public Builder border(CheckoutBrandingSimpleBorder border) {
      this.border = border;
      return this;
    }

    /**
     * The border style of the main sections.
     */
    public Builder borderStyle(CheckoutBrandingBorderStyle borderStyle) {
      this.borderStyle = borderStyle;
      return this;
    }

    /**
     * The border width of the main sections.
     */
    public Builder borderWidth(CheckoutBrandingBorderWidth borderWidth) {
      this.borderWidth = borderWidth;
      return this;
    }

    /**
     * The selected color scheme of the main sections.
     */
    public Builder colorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
      this.colorScheme = colorScheme;
      return this;
    }

    /**
     * The corner radius of the main sections.
     */
    public Builder cornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    /**
     * The padding of the main sections.
     */
    public Builder padding(CheckoutBrandingSpacingKeyword padding) {
      this.padding = padding;
      return this;
    }

    /**
     * The shadow of the main sections.
     */
    public Builder shadow(CheckoutBrandingShadow shadow) {
      this.shadow = shadow;
      return this;
    }
  }
}
