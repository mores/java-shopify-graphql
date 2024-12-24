package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingHeaderInput {
  
  private CheckoutBrandingHeaderAlignment alignment;

  
  private CheckoutBrandingHeaderPosition position;

  
  private CheckoutBrandingLogoInput logo;

  
  private CheckoutBrandingImageInput banner;

  
  private Boolean divided;

  
  private CheckoutBrandingHeaderCartLinkInput cartLink;

  
  private CheckoutBrandingColorSchemeSelection colorScheme;

  
  private CheckoutBrandingSpacingKeyword padding;

  public CheckoutBrandingHeaderInput() {
  }

  
  public CheckoutBrandingHeaderAlignment getAlignment() {
    return alignment;
  }

  public void setAlignment(CheckoutBrandingHeaderAlignment alignment) {
    this.alignment = alignment;
  }

  
  public CheckoutBrandingHeaderPosition getPosition() {
    return position;
  }

  public void setPosition(CheckoutBrandingHeaderPosition position) {
    this.position = position;
  }

  
  public CheckoutBrandingLogoInput getLogo() {
    return logo;
  }

  public void setLogo(CheckoutBrandingLogoInput logo) {
    this.logo = logo;
  }

  
  public CheckoutBrandingImageInput getBanner() {
    return banner;
  }

  public void setBanner(CheckoutBrandingImageInput banner) {
    this.banner = banner;
  }

  
  public Boolean getDivided() {
    return divided;
  }

  public void setDivided(Boolean divided) {
    this.divided = divided;
  }

  
  public CheckoutBrandingHeaderCartLinkInput getCartLink() {
    return cartLink;
  }

  public void setCartLink(CheckoutBrandingHeaderCartLinkInput cartLink) {
    this.cartLink = cartLink;
  }

  
  public CheckoutBrandingColorSchemeSelection getColorScheme() {
    return colorScheme;
  }

  public void setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
    this.colorScheme = colorScheme;
  }

  
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
    
    private CheckoutBrandingHeaderAlignment alignment;

    
    private CheckoutBrandingHeaderPosition position;

    
    private CheckoutBrandingLogoInput logo;

    
    private CheckoutBrandingImageInput banner;

    
    private Boolean divided;

    
    private CheckoutBrandingHeaderCartLinkInput cartLink;

    
    private CheckoutBrandingColorSchemeSelection colorScheme;

    
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

    
    public Builder alignment(CheckoutBrandingHeaderAlignment alignment) {
      this.alignment = alignment;
      return this;
    }

    
    public Builder position(CheckoutBrandingHeaderPosition position) {
      this.position = position;
      return this;
    }

    
    public Builder logo(CheckoutBrandingLogoInput logo) {
      this.logo = logo;
      return this;
    }

    
    public Builder banner(CheckoutBrandingImageInput banner) {
      this.banner = banner;
      return this;
    }

    
    public Builder divided(Boolean divided) {
      this.divided = divided;
      return this;
    }

    
    public Builder cartLink(CheckoutBrandingHeaderCartLinkInput cartLink) {
      this.cartLink = cartLink;
      return this;
    }

    
    public Builder colorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
      this.colorScheme = colorScheme;
      return this;
    }

    
    public Builder padding(CheckoutBrandingSpacingKeyword padding) {
      this.padding = padding;
      return this;
    }
  }
}
