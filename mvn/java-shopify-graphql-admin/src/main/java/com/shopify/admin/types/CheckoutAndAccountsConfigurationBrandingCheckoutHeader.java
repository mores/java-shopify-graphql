package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The checkout header customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingCheckoutHeader {
  /**
   * The header alignment.
   */
  private CheckoutAndAccountsConfigurationBrandingHeaderAlignment alignment;

  /**
   * The background style of the header container.
   */
  private CheckoutAndAccountsConfigurationBrandingBackground background;

  /**
   * The cart link customizations for 1-page checkout. This field allows to
   * customize the cart icon that renders by default on 1-page checkout.
   */
  private CheckoutAndAccountsConfigurationBrandingHeaderCartLink cartLink;

  /**
   * The colors customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingColors colors;

  /**
   * The divided setting.
   */
  private Boolean divided;

  /**
   * The store logo.
   */
  private CheckoutAndAccountsConfigurationBrandingLogo logo;

  /**
   * The padding of the header container.
   */
  private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

  /**
   * The header position.
   */
  private CheckoutAndAccountsConfigurationBrandingHeaderPosition position;

  public CheckoutAndAccountsConfigurationBrandingCheckoutHeader() {
  }

  /**
   * The header alignment.
   */
  public CheckoutAndAccountsConfigurationBrandingHeaderAlignment getAlignment() {
    return alignment;
  }

  public void setAlignment(CheckoutAndAccountsConfigurationBrandingHeaderAlignment alignment) {
    this.alignment = alignment;
  }

  /**
   * The background style of the header container.
   */
  public CheckoutAndAccountsConfigurationBrandingBackground getBackground() {
    return background;
  }

  public void setBackground(CheckoutAndAccountsConfigurationBrandingBackground background) {
    this.background = background;
  }

  /**
   * The cart link customizations for 1-page checkout. This field allows to
   * customize the cart icon that renders by default on 1-page checkout.
   */
  public CheckoutAndAccountsConfigurationBrandingHeaderCartLink getCartLink() {
    return cartLink;
  }

  public void setCartLink(CheckoutAndAccountsConfigurationBrandingHeaderCartLink cartLink) {
    this.cartLink = cartLink;
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
   * The divided setting.
   */
  public Boolean getDivided() {
    return divided;
  }

  public void setDivided(Boolean divided) {
    this.divided = divided;
  }

  /**
   * The store logo.
   */
  public CheckoutAndAccountsConfigurationBrandingLogo getLogo() {
    return logo;
  }

  public void setLogo(CheckoutAndAccountsConfigurationBrandingLogo logo) {
    this.logo = logo;
  }

  /**
   * The padding of the header container.
   */
  public CheckoutAndAccountsConfigurationBrandingSpacingKeyword getPadding() {
    return padding;
  }

  public void setPadding(CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding) {
    this.padding = padding;
  }

  /**
   * The header position.
   */
  public CheckoutAndAccountsConfigurationBrandingHeaderPosition getPosition() {
    return position;
  }

  public void setPosition(CheckoutAndAccountsConfigurationBrandingHeaderPosition position) {
    this.position = position;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingCheckoutHeader{alignment='" + alignment + "', background='" + background + "', cartLink='" + cartLink + "', colors='" + colors + "', divided='" + divided + "', logo='" + logo + "', padding='" + padding + "', position='" + position + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCheckoutHeader that = (CheckoutAndAccountsConfigurationBrandingCheckoutHeader) o;
    return Objects.equals(alignment, that.alignment) &&
        Objects.equals(background, that.background) &&
        Objects.equals(cartLink, that.cartLink) &&
        Objects.equals(colors, that.colors) &&
        Objects.equals(divided, that.divided) &&
        Objects.equals(logo, that.logo) &&
        Objects.equals(padding, that.padding) &&
        Objects.equals(position, that.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, background, cartLink, colors, divided, logo, padding, position);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The header alignment.
     */
    private CheckoutAndAccountsConfigurationBrandingHeaderAlignment alignment;

    /**
     * The background style of the header container.
     */
    private CheckoutAndAccountsConfigurationBrandingBackground background;

    /**
     * The cart link customizations for 1-page checkout. This field allows to
     * customize the cart icon that renders by default on 1-page checkout.
     */
    private CheckoutAndAccountsConfigurationBrandingHeaderCartLink cartLink;

    /**
     * The colors customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingColors colors;

    /**
     * The divided setting.
     */
    private Boolean divided;

    /**
     * The store logo.
     */
    private CheckoutAndAccountsConfigurationBrandingLogo logo;

    /**
     * The padding of the header container.
     */
    private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

    /**
     * The header position.
     */
    private CheckoutAndAccountsConfigurationBrandingHeaderPosition position;

    public CheckoutAndAccountsConfigurationBrandingCheckoutHeader build() {
      CheckoutAndAccountsConfigurationBrandingCheckoutHeader result = new CheckoutAndAccountsConfigurationBrandingCheckoutHeader();
      result.alignment = this.alignment;
      result.background = this.background;
      result.cartLink = this.cartLink;
      result.colors = this.colors;
      result.divided = this.divided;
      result.logo = this.logo;
      result.padding = this.padding;
      result.position = this.position;
      return result;
    }

    /**
     * The header alignment.
     */
    public Builder alignment(CheckoutAndAccountsConfigurationBrandingHeaderAlignment alignment) {
      this.alignment = alignment;
      return this;
    }

    /**
     * The background style of the header container.
     */
    public Builder background(CheckoutAndAccountsConfigurationBrandingBackground background) {
      this.background = background;
      return this;
    }

    /**
     * The cart link customizations for 1-page checkout. This field allows to
     * customize the cart icon that renders by default on 1-page checkout.
     */
    public Builder cartLink(CheckoutAndAccountsConfigurationBrandingHeaderCartLink cartLink) {
      this.cartLink = cartLink;
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
     * The divided setting.
     */
    public Builder divided(Boolean divided) {
      this.divided = divided;
      return this;
    }

    /**
     * The store logo.
     */
    public Builder logo(CheckoutAndAccountsConfigurationBrandingLogo logo) {
      this.logo = logo;
      return this;
    }

    /**
     * The padding of the header container.
     */
    public Builder padding(CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding) {
      this.padding = padding;
      return this;
    }

    /**
     * The header position.
     */
    public Builder position(CheckoutAndAccountsConfigurationBrandingHeaderPosition position) {
      this.position = position;
      return this;
    }
  }
}
