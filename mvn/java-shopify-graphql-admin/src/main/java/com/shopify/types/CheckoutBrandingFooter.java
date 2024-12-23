package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A container for the footer section customizations.
 */
public class CheckoutBrandingFooter {
  /**
   * The footer alignment.
   */
  private CheckoutBrandingFooterAlignment alignment;

  /**
   * The selected color scheme of the footer container.
   */
  private CheckoutBrandingColorSchemeSelection colorScheme;

  /**
   * The footer content settings.
   */
  private CheckoutBrandingFooterContent content;

  /**
   * The divided setting.
   */
  private Boolean divided;

  /**
   * The padding of the footer container.
   */
  private CheckoutBrandingSpacingKeyword padding;

  /**
   * The footer position.
   */
  private CheckoutBrandingFooterPosition position;

  public CheckoutBrandingFooter() {
  }

  /**
   * The footer alignment.
   */
  public CheckoutBrandingFooterAlignment getAlignment() {
    return alignment;
  }

  public void setAlignment(CheckoutBrandingFooterAlignment alignment) {
    this.alignment = alignment;
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
   * The footer content settings.
   */
  public CheckoutBrandingFooterContent getContent() {
    return content;
  }

  public void setContent(CheckoutBrandingFooterContent content) {
    this.content = content;
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
   * The padding of the footer container.
   */
  public CheckoutBrandingSpacingKeyword getPadding() {
    return padding;
  }

  public void setPadding(CheckoutBrandingSpacingKeyword padding) {
    this.padding = padding;
  }

  /**
   * The footer position.
   */
  public CheckoutBrandingFooterPosition getPosition() {
    return position;
  }

  public void setPosition(CheckoutBrandingFooterPosition position) {
    this.position = position;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingFooter{alignment='" + alignment + "', colorScheme='" + colorScheme + "', content='" + content + "', divided='" + divided + "', padding='" + padding + "', position='" + position + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingFooter that = (CheckoutBrandingFooter) o;
    return Objects.equals(alignment, that.alignment) &&
        Objects.equals(colorScheme, that.colorScheme) &&
        Objects.equals(content, that.content) &&
        Objects.equals(divided, that.divided) &&
        Objects.equals(padding, that.padding) &&
        Objects.equals(position, that.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, colorScheme, content, divided, padding, position);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The footer alignment.
     */
    private CheckoutBrandingFooterAlignment alignment;

    /**
     * The selected color scheme of the footer container.
     */
    private CheckoutBrandingColorSchemeSelection colorScheme;

    /**
     * The footer content settings.
     */
    private CheckoutBrandingFooterContent content;

    /**
     * The divided setting.
     */
    private Boolean divided;

    /**
     * The padding of the footer container.
     */
    private CheckoutBrandingSpacingKeyword padding;

    /**
     * The footer position.
     */
    private CheckoutBrandingFooterPosition position;

    public CheckoutBrandingFooter build() {
      CheckoutBrandingFooter result = new CheckoutBrandingFooter();
      result.alignment = this.alignment;
      result.colorScheme = this.colorScheme;
      result.content = this.content;
      result.divided = this.divided;
      result.padding = this.padding;
      result.position = this.position;
      return result;
    }

    /**
     * The footer alignment.
     */
    public Builder alignment(CheckoutBrandingFooterAlignment alignment) {
      this.alignment = alignment;
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
     * The footer content settings.
     */
    public Builder content(CheckoutBrandingFooterContent content) {
      this.content = content;
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
     * The padding of the footer container.
     */
    public Builder padding(CheckoutBrandingSpacingKeyword padding) {
      this.padding = padding;
      return this;
    }

    /**
     * The footer position.
     */
    public Builder position(CheckoutBrandingFooterPosition position) {
      this.position = position;
      return this;
    }
  }
}
