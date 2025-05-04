package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The header customizations.
 */
public class CheckoutBrandingHeader {
  /**
   * The header alignment.
   */
  private CheckoutBrandingHeaderAlignment alignment;

  /**
   * The background image of the header.
   */
  private CheckoutBrandingImage banner;

  /**
   * The cart link customizations for 1-page checkout. This field allows to
   * customize the cart icon that renders by default on 1-page checkout.
   */
  private CheckoutBrandingHeaderCartLink cartLink;

  /**
   * The selected color scheme of the header container.
   */
  private CheckoutBrandingColorSchemeSelection colorScheme;

  /**
   * The divided setting.
   */
  private Boolean divided;

  /**
   * The store logo.
   */
  private CheckoutBrandingLogo logo;

  /**
   * The padding of the header container.
   */
  private CheckoutBrandingSpacingKeyword padding;

  /**
   * The header position.
   */
  private CheckoutBrandingHeaderPosition position;

  public CheckoutBrandingHeader() {
  }

  /**
   * The header alignment.
   */
  public CheckoutBrandingHeaderAlignment getAlignment() {
    return alignment;
  }

  public void setAlignment(CheckoutBrandingHeaderAlignment alignment) {
    this.alignment = alignment;
  }

  /**
   * The background image of the header.
   */
  public CheckoutBrandingImage getBanner() {
    return banner;
  }

  public void setBanner(CheckoutBrandingImage banner) {
    this.banner = banner;
  }

  /**
   * The cart link customizations for 1-page checkout. This field allows to
   * customize the cart icon that renders by default on 1-page checkout.
   */
  public CheckoutBrandingHeaderCartLink getCartLink() {
    return cartLink;
  }

  public void setCartLink(CheckoutBrandingHeaderCartLink cartLink) {
    this.cartLink = cartLink;
  }

  /**
   * The selected color scheme of the header container.
   */
  public CheckoutBrandingColorSchemeSelection getColorScheme() {
    return colorScheme;
  }

  public void setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
    this.colorScheme = colorScheme;
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
  public CheckoutBrandingLogo getLogo() {
    return logo;
  }

  public void setLogo(CheckoutBrandingLogo logo) {
    this.logo = logo;
  }

  /**
   * The padding of the header container.
   */
  public CheckoutBrandingSpacingKeyword getPadding() {
    return padding;
  }

  public void setPadding(CheckoutBrandingSpacingKeyword padding) {
    this.padding = padding;
  }

  /**
   * The header position.
   */
  public CheckoutBrandingHeaderPosition getPosition() {
    return position;
  }

  public void setPosition(CheckoutBrandingHeaderPosition position) {
    this.position = position;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingHeader{alignment='" + alignment + "', banner='" + banner + "', cartLink='" + cartLink + "', colorScheme='" + colorScheme + "', divided='" + divided + "', logo='" + logo + "', padding='" + padding + "', position='" + position + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingHeader that = (CheckoutBrandingHeader) o;
    return Objects.equals(alignment, that.alignment) &&
        Objects.equals(banner, that.banner) &&
        Objects.equals(cartLink, that.cartLink) &&
        Objects.equals(colorScheme, that.colorScheme) &&
        Objects.equals(divided, that.divided) &&
        Objects.equals(logo, that.logo) &&
        Objects.equals(padding, that.padding) &&
        Objects.equals(position, that.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, banner, cartLink, colorScheme, divided, logo, padding, position);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The header alignment.
     */
    private CheckoutBrandingHeaderAlignment alignment;

    /**
     * The background image of the header.
     */
    private CheckoutBrandingImage banner;

    /**
     * The cart link customizations for 1-page checkout. This field allows to
     * customize the cart icon that renders by default on 1-page checkout.
     */
    private CheckoutBrandingHeaderCartLink cartLink;

    /**
     * The selected color scheme of the header container.
     */
    private CheckoutBrandingColorSchemeSelection colorScheme;

    /**
     * The divided setting.
     */
    private Boolean divided;

    /**
     * The store logo.
     */
    private CheckoutBrandingLogo logo;

    /**
     * The padding of the header container.
     */
    private CheckoutBrandingSpacingKeyword padding;

    /**
     * The header position.
     */
    private CheckoutBrandingHeaderPosition position;

    public CheckoutBrandingHeader build() {
      CheckoutBrandingHeader result = new CheckoutBrandingHeader();
      result.alignment = this.alignment;
      result.banner = this.banner;
      result.cartLink = this.cartLink;
      result.colorScheme = this.colorScheme;
      result.divided = this.divided;
      result.logo = this.logo;
      result.padding = this.padding;
      result.position = this.position;
      return result;
    }

    /**
     * The header alignment.
     */
    public Builder alignment(CheckoutBrandingHeaderAlignment alignment) {
      this.alignment = alignment;
      return this;
    }

    /**
     * The background image of the header.
     */
    public Builder banner(CheckoutBrandingImage banner) {
      this.banner = banner;
      return this;
    }

    /**
     * The cart link customizations for 1-page checkout. This field allows to
     * customize the cart icon that renders by default on 1-page checkout.
     */
    public Builder cartLink(CheckoutBrandingHeaderCartLink cartLink) {
      this.cartLink = cartLink;
      return this;
    }

    /**
     * The selected color scheme of the header container.
     */
    public Builder colorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
      this.colorScheme = colorScheme;
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
    public Builder logo(CheckoutBrandingLogo logo) {
      this.logo = logo;
      return this;
    }

    /**
     * The padding of the header container.
     */
    public Builder padding(CheckoutBrandingSpacingKeyword padding) {
      this.padding = padding;
      return this;
    }

    /**
     * The header position.
     */
    public Builder position(CheckoutBrandingHeaderPosition position) {
      this.position = position;
      return this;
    }
  }
}
