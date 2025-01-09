package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields when mutating the checkout footer settings.
 */
public class CheckoutBrandingFooterInput {
  /**
   * The input field for setting the footer position customizations.
   */
  private CheckoutBrandingFooterPosition position;

  /**
   * The divided setting.
   */
  private Boolean divided;

  /**
   * The footer alignment settings. You can set the footer native content alignment to the left, center, or right.
   */
  private CheckoutBrandingFooterAlignment alignment;

  /**
   * The input field for setting the footer content customizations.
   */
  private CheckoutBrandingFooterContentInput content;

  /**
   * The selected color scheme of the footer container.
   */
  private CheckoutBrandingColorSchemeSelection colorScheme;

  /**
   * The padding of the footer container.
   */
  private CheckoutBrandingSpacingKeyword padding;

  public CheckoutBrandingFooterInput() {
  }

  /**
   * The input field for setting the footer position customizations.
   */
  public CheckoutBrandingFooterPosition getPosition() {
    return position;
  }

  public void setPosition(CheckoutBrandingFooterPosition position) {
    this.position = position;
  }

  /**
   * The divided setting.
   */
  public Boolean getDivided() {
    return divided;
  }

  public void setDivided(Boolean divided) {
    this.divided = divided;
  }

  /**
   * The footer alignment settings. You can set the footer native content alignment to the left, center, or right.
   */
  public CheckoutBrandingFooterAlignment getAlignment() {
    return alignment;
  }

  public void setAlignment(CheckoutBrandingFooterAlignment alignment) {
    this.alignment = alignment;
  }

  /**
   * The input field for setting the footer content customizations.
   */
  public CheckoutBrandingFooterContentInput getContent() {
    return content;
  }

  public void setContent(CheckoutBrandingFooterContentInput content) {
    this.content = content;
  }

  /**
   * The selected color scheme of the footer container.
   */
  public CheckoutBrandingColorSchemeSelection getColorScheme() {
    return colorScheme;
  }

  public void setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
    this.colorScheme = colorScheme;
  }

  /**
   * The padding of the footer container.
   */
  public CheckoutBrandingSpacingKeyword getPadding() {
    return padding;
  }

  public void setPadding(CheckoutBrandingSpacingKeyword padding) {
    this.padding = padding;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingFooterInput{position='" + position + "', divided='" + divided + "', alignment='" + alignment + "', content='" + content + "', colorScheme='" + colorScheme + "', padding='" + padding + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingFooterInput that = (CheckoutBrandingFooterInput) o;
    return Objects.equals(position, that.position) &&
        Objects.equals(divided, that.divided) &&
        Objects.equals(alignment, that.alignment) &&
        Objects.equals(content, that.content) &&
        Objects.equals(colorScheme, that.colorScheme) &&
        Objects.equals(padding, that.padding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, divided, alignment, content, colorScheme, padding);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The input field for setting the footer position customizations.
     */
    private CheckoutBrandingFooterPosition position;

    /**
     * The divided setting.
     */
    private Boolean divided;

    /**
     * The footer alignment settings. You can set the footer native content alignment to the left, center, or right.
     */
    private CheckoutBrandingFooterAlignment alignment;

    /**
     * The input field for setting the footer content customizations.
     */
    private CheckoutBrandingFooterContentInput content;

    /**
     * The selected color scheme of the footer container.
     */
    private CheckoutBrandingColorSchemeSelection colorScheme;

    /**
     * The padding of the footer container.
     */
    private CheckoutBrandingSpacingKeyword padding;

    public CheckoutBrandingFooterInput build() {
      CheckoutBrandingFooterInput result = new CheckoutBrandingFooterInput();
      result.position = this.position;
      result.divided = this.divided;
      result.alignment = this.alignment;
      result.content = this.content;
      result.colorScheme = this.colorScheme;
      result.padding = this.padding;
      return result;
    }

    /**
     * The input field for setting the footer position customizations.
     */
    public Builder position(CheckoutBrandingFooterPosition position) {
      this.position = position;
      return this;
    }

    /**
     * The divided setting.
     */
    public Builder divided(Boolean divided) {
      this.divided = divided;
      return this;
    }

    /**
     * The footer alignment settings. You can set the footer native content alignment to the left, center, or right.
     */
    public Builder alignment(CheckoutBrandingFooterAlignment alignment) {
      this.alignment = alignment;
      return this;
    }

    /**
     * The input field for setting the footer content customizations.
     */
    public Builder content(CheckoutBrandingFooterContentInput content) {
      this.content = content;
      return this;
    }

    /**
     * The selected color scheme of the footer container.
     */
    public Builder colorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
      this.colorScheme = colorScheme;
      return this;
    }

    /**
     * The padding of the footer container.
     */
    public Builder padding(CheckoutBrandingSpacingKeyword padding) {
      this.padding = padding;
      return this;
    }
  }
}
