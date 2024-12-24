package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingHeader {
  
  private CheckoutBrandingHeaderAlignment alignment;

  
  private CheckoutBrandingImage banner;

  
  private CheckoutBrandingHeaderCartLink cartLink;

  
  private CheckoutBrandingColorSchemeSelection colorScheme;

  
  private Boolean divided;

  
  private CheckoutBrandingLogo logo;

  
  private CheckoutBrandingSpacingKeyword padding;

  
  private CheckoutBrandingHeaderPosition position;

  public CheckoutBrandingHeader() {
  }

  
  public CheckoutBrandingHeaderAlignment getAlignment() {
    return alignment;
  }

  public void setAlignment(CheckoutBrandingHeaderAlignment alignment) {
    this.alignment = alignment;
  }

  
  public CheckoutBrandingImage getBanner() {
    return banner;
  }

  public void setBanner(CheckoutBrandingImage banner) {
    this.banner = banner;
  }

  
  public CheckoutBrandingHeaderCartLink getCartLink() {
    return cartLink;
  }

  public void setCartLink(CheckoutBrandingHeaderCartLink cartLink) {
    this.cartLink = cartLink;
  }

  
  public CheckoutBrandingColorSchemeSelection getColorScheme() {
    return colorScheme;
  }

  public void setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
    this.colorScheme = colorScheme;
  }

  
  public Boolean getDivided() {
    return divided;
  }

  public void setDivided(Boolean divided) {
    this.divided = divided;
  }

  
  public CheckoutBrandingLogo getLogo() {
    return logo;
  }

  public void setLogo(CheckoutBrandingLogo logo) {
    this.logo = logo;
  }

  
  public CheckoutBrandingSpacingKeyword getPadding() {
    return padding;
  }

  public void setPadding(CheckoutBrandingSpacingKeyword padding) {
    this.padding = padding;
  }

  
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
    
    private CheckoutBrandingHeaderAlignment alignment;

    
    private CheckoutBrandingImage banner;

    
    private CheckoutBrandingHeaderCartLink cartLink;

    
    private CheckoutBrandingColorSchemeSelection colorScheme;

    
    private Boolean divided;

    
    private CheckoutBrandingLogo logo;

    
    private CheckoutBrandingSpacingKeyword padding;

    
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

    
    public Builder alignment(CheckoutBrandingHeaderAlignment alignment) {
      this.alignment = alignment;
      return this;
    }

    
    public Builder banner(CheckoutBrandingImage banner) {
      this.banner = banner;
      return this;
    }

    
    public Builder cartLink(CheckoutBrandingHeaderCartLink cartLink) {
      this.cartLink = cartLink;
      return this;
    }

    
    public Builder colorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
      this.colorScheme = colorScheme;
      return this;
    }

    
    public Builder divided(Boolean divided) {
      this.divided = divided;
      return this;
    }

    
    public Builder logo(CheckoutBrandingLogo logo) {
      this.logo = logo;
      return this;
    }

    
    public Builder padding(CheckoutBrandingSpacingKeyword padding) {
      this.padding = padding;
      return this;
    }

    
    public Builder position(CheckoutBrandingHeaderPosition position) {
      this.position = position;
      return this;
    }
  }
}
