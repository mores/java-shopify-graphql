package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A container for the checkout footer section customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingCheckoutFooter {
  /**
   * The footer alignment.
   */
  private CheckoutAndAccountsConfigurationBrandingFooterAlignment alignment;

  /**
   * The background style of the footer container.
   */
  private CheckoutAndAccountsConfigurationBrandingBackground background;

  /**
   * The colors customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingColors colors;

  /**
   * The footer content settings.
   */
  private CheckoutAndAccountsConfigurationBrandingFooterContent content;

  /**
   * The divided setting.
   */
  private Boolean divided;

  /**
   * The padding of the footer container.
   */
  private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

  /**
   * The footer position.
   */
  private CheckoutAndAccountsConfigurationBrandingFooterPosition position;

  public CheckoutAndAccountsConfigurationBrandingCheckoutFooter() {
  }

  /**
   * The footer alignment.
   */
  public CheckoutAndAccountsConfigurationBrandingFooterAlignment getAlignment() {
    return alignment;
  }

  public void setAlignment(CheckoutAndAccountsConfigurationBrandingFooterAlignment alignment) {
    this.alignment = alignment;
  }

  /**
   * The background style of the footer container.
   */
  public CheckoutAndAccountsConfigurationBrandingBackground getBackground() {
    return background;
  }

  public void setBackground(CheckoutAndAccountsConfigurationBrandingBackground background) {
    this.background = background;
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
   * The footer content settings.
   */
  public CheckoutAndAccountsConfigurationBrandingFooterContent getContent() {
    return content;
  }

  public void setContent(CheckoutAndAccountsConfigurationBrandingFooterContent content) {
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
  public CheckoutAndAccountsConfigurationBrandingSpacingKeyword getPadding() {
    return padding;
  }

  public void setPadding(CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding) {
    this.padding = padding;
  }

  /**
   * The footer position.
   */
  public CheckoutAndAccountsConfigurationBrandingFooterPosition getPosition() {
    return position;
  }

  public void setPosition(CheckoutAndAccountsConfigurationBrandingFooterPosition position) {
    this.position = position;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingCheckoutFooter{alignment='" + alignment + "', background='" + background + "', colors='" + colors + "', content='" + content + "', divided='" + divided + "', padding='" + padding + "', position='" + position + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCheckoutFooter that = (CheckoutAndAccountsConfigurationBrandingCheckoutFooter) o;
    return Objects.equals(alignment, that.alignment) &&
        Objects.equals(background, that.background) &&
        Objects.equals(colors, that.colors) &&
        Objects.equals(content, that.content) &&
        Objects.equals(divided, that.divided) &&
        Objects.equals(padding, that.padding) &&
        Objects.equals(position, that.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, background, colors, content, divided, padding, position);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The footer alignment.
     */
    private CheckoutAndAccountsConfigurationBrandingFooterAlignment alignment;

    /**
     * The background style of the footer container.
     */
    private CheckoutAndAccountsConfigurationBrandingBackground background;

    /**
     * The colors customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingColors colors;

    /**
     * The footer content settings.
     */
    private CheckoutAndAccountsConfigurationBrandingFooterContent content;

    /**
     * The divided setting.
     */
    private Boolean divided;

    /**
     * The padding of the footer container.
     */
    private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

    /**
     * The footer position.
     */
    private CheckoutAndAccountsConfigurationBrandingFooterPosition position;

    public CheckoutAndAccountsConfigurationBrandingCheckoutFooter build() {
      CheckoutAndAccountsConfigurationBrandingCheckoutFooter result = new CheckoutAndAccountsConfigurationBrandingCheckoutFooter();
      result.alignment = this.alignment;
      result.background = this.background;
      result.colors = this.colors;
      result.content = this.content;
      result.divided = this.divided;
      result.padding = this.padding;
      result.position = this.position;
      return result;
    }

    /**
     * The footer alignment.
     */
    public Builder alignment(CheckoutAndAccountsConfigurationBrandingFooterAlignment alignment) {
      this.alignment = alignment;
      return this;
    }

    /**
     * The background style of the footer container.
     */
    public Builder background(CheckoutAndAccountsConfigurationBrandingBackground background) {
      this.background = background;
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
     * The footer content settings.
     */
    public Builder content(CheckoutAndAccountsConfigurationBrandingFooterContent content) {
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
    public Builder padding(CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding) {
      this.padding = padding;
      return this;
    }

    /**
     * The footer position.
     */
    public Builder position(CheckoutAndAccountsConfigurationBrandingFooterPosition position) {
      this.position = position;
      return this;
    }
  }
}
