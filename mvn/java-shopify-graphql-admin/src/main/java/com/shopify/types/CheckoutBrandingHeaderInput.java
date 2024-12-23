package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update the header customizations.
 */
public class CheckoutBrandingHeaderInput {
  /**
   * The header alignment.
   */
  private CheckoutBrandingHeaderAlignment alignment;

  /**
   * The header position.
   */
  private CheckoutBrandingHeaderPosition position;

  /**
   * The store logo.
   */
  private CheckoutBrandingLogoInput logo;

  /**
   * The background image of the header (must not be of SVG format).
   */
  private CheckoutBrandingImageInput banner;

  /**
   * The divided setting.
   */
  private Boolean divided;

  /**
   * The input for cart link customizations for 1-page checkout. This field allows
   * to customize the cart icon that renders by default on 1-page checkout.
   */
  private CheckoutBrandingHeaderCartLinkInput cartLink;

  /**
   * The selected color scheme of the header container.
   */
  private CheckoutBrandingColorSchemeSelection colorScheme;

  /**
   * The padding of the header container.
   */
  private CheckoutBrandingSpacingKeyword padding;

  public CheckoutBrandingHeaderInput() {
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
   * The header position.
   */
  public CheckoutBrandingHeaderPosition getPosition() {
    return position;
  }

  public void setPosition(CheckoutBrandingHeaderPosition position) {
    this.position = position;
  }

  /**
   * The store logo.
   */
  public CheckoutBrandingLogoInput getLogo() {
    return logo;
  }

  public void setLogo(CheckoutBrandingLogoInput logo) {
    this.logo = logo;
  }

  /**
   * The background image of the header (must not be of SVG format).
   */
  public CheckoutBrandingImageInput getBanner() {
    return banner;
  }

  public void setBanner(CheckoutBrandingImageInput banner) {
    this.banner = banner;
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
   * The input for cart link customizations for 1-page checkout. This field allows
   * to customize the cart icon that renders by default on 1-page checkout.
   */
  public CheckoutBrandingHeaderCartLinkInput getCartLink() {
    return cartLink;
  }

  public void setCartLink(CheckoutBrandingHeaderCartLinkInput cartLink) {
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
   * The padding of the header container.
   */
  public CheckoutBrandingSpacingKeyword getPadding() {
    return padding;
  }

  public void setPadding(CheckoutBrandingSpacingKeyword padding) {
    this.padding = padding;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingHeaderInput{alignment='" + alignment + "', position='" + position + "', logo='" + logo + "', banner='" + banner + "', divided='" + divided + "', cartLink='" + cartLink + "', colorScheme='" + colorScheme + "', padding='" + padding + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingHeaderInput that = (CheckoutBrandingHeaderInput) o;
    return Objects.equals(alignment, that.alignment) &&
        Objects.equals(position, that.position) &&
        Objects.equals(logo, that.logo) &&
        Objects.equals(banner, that.banner) &&
        Objects.equals(divided, that.divided) &&
        Objects.equals(cartLink, that.cartLink) &&
        Objects.equals(colorScheme, that.colorScheme) &&
        Objects.equals(padding, that.padding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, position, logo, banner, divided, cartLink, colorScheme, padding);
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
     * The header position.
     */
    private CheckoutBrandingHeaderPosition position;

    /**
     * The store logo.
     */
    private CheckoutBrandingLogoInput logo;

    /**
     * The background image of the header (must not be of SVG format).
     */
    private CheckoutBrandingImageInput banner;

    /**
     * The divided setting.
     */
    private Boolean divided;

    /**
     * The input for cart link customizations for 1-page checkout. This field allows
     * to customize the cart icon that renders by default on 1-page checkout.
     */
    private CheckoutBrandingHeaderCartLinkInput cartLink;

    /**
     * The selected color scheme of the header container.
     */
    private CheckoutBrandingColorSchemeSelection colorScheme;

    /**
     * The padding of the header container.
     */
    private CheckoutBrandingSpacingKeyword padding;

    public CheckoutBrandingHeaderInput build() {
      CheckoutBrandingHeaderInput result = new CheckoutBrandingHeaderInput();
      result.alignment = this.alignment;
      result.position = this.position;
      result.logo = this.logo;
      result.banner = this.banner;
      result.divided = this.divided;
      result.cartLink = this.cartLink;
      result.colorScheme = this.colorScheme;
      result.padding = this.padding;
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
     * The header position.
     */
    public Builder position(CheckoutBrandingHeaderPosition position) {
      this.position = position;
      return this;
    }

    /**
     * The store logo.
     */
    public Builder logo(CheckoutBrandingLogoInput logo) {
      this.logo = logo;
      return this;
    }

    /**
     * The background image of the header (must not be of SVG format).
     */
    public Builder banner(CheckoutBrandingImageInput banner) {
      this.banner = banner;
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
     * The input for cart link customizations for 1-page checkout. This field allows
     * to customize the cart icon that renders by default on 1-page checkout.
     */
    public Builder cartLink(CheckoutBrandingHeaderCartLinkInput cartLink) {
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
     * The padding of the header container.
     */
    public Builder padding(CheckoutBrandingSpacingKeyword padding) {
      this.padding = padding;
      return this;
    }
  }
}
