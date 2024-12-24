package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingFooter {
  
  private CheckoutBrandingFooterAlignment alignment;

  
  private CheckoutBrandingColorSchemeSelection colorScheme;

  
  private CheckoutBrandingFooterContent content;

  
  private Boolean divided;

  
  private CheckoutBrandingSpacingKeyword padding;

  
  private CheckoutBrandingFooterPosition position;

  public CheckoutBrandingFooter() {
  }

  
  public CheckoutBrandingFooterAlignment getAlignment() {
    return alignment;
  }

  public void setAlignment(CheckoutBrandingFooterAlignment alignment) {
    this.alignment = alignment;
  }

  
  public CheckoutBrandingColorSchemeSelection getColorScheme() {
    return colorScheme;
  }

  public void setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
    this.colorScheme = colorScheme;
  }

  
  public CheckoutBrandingFooterContent getContent() {
    return content;
  }

  public void setContent(CheckoutBrandingFooterContent content) {
    this.content = content;
  }

  
  public Boolean getDivided() {
    return divided;
  }

  public void setDivided(Boolean divided) {
    this.divided = divided;
  }

  
  public CheckoutBrandingSpacingKeyword getPadding() {
    return padding;
  }

  public void setPadding(CheckoutBrandingSpacingKeyword padding) {
    this.padding = padding;
  }

  
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
    
    private CheckoutBrandingFooterAlignment alignment;

    
    private CheckoutBrandingColorSchemeSelection colorScheme;

    
    private CheckoutBrandingFooterContent content;

    
    private Boolean divided;

    
    private CheckoutBrandingSpacingKeyword padding;

    
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

    
    public Builder alignment(CheckoutBrandingFooterAlignment alignment) {
      this.alignment = alignment;
      return this;
    }

    
    public Builder colorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
      this.colorScheme = colorScheme;
      return this;
    }

    
    public Builder content(CheckoutBrandingFooterContent content) {
      this.content = content;
      return this;
    }

    
    public Builder divided(Boolean divided) {
      this.divided = divided;
      return this;
    }

    
    public Builder padding(CheckoutBrandingSpacingKeyword padding) {
      this.padding = padding;
      return this;
    }

    
    public Builder position(CheckoutBrandingFooterPosition position) {
      this.position = position;
      return this;
    }
  }
}
