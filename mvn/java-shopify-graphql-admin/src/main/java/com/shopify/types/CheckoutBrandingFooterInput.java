package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingFooterInput {
  
  private CheckoutBrandingFooterPosition position;

  
  private Boolean divided;

  
  private CheckoutBrandingFooterAlignment alignment;

  
  private CheckoutBrandingFooterContentInput content;

  
  private CheckoutBrandingColorSchemeSelection colorScheme;

  
  private CheckoutBrandingSpacingKeyword padding;

  public CheckoutBrandingFooterInput() {
  }

  
  public CheckoutBrandingFooterPosition getPosition() {
    return position;
  }

  public void setPosition(CheckoutBrandingFooterPosition position) {
    this.position = position;
  }

  
  public Boolean getDivided() {
    return divided;
  }

  public void setDivided(Boolean divided) {
    this.divided = divided;
  }

  
  public CheckoutBrandingFooterAlignment getAlignment() {
    return alignment;
  }

  public void setAlignment(CheckoutBrandingFooterAlignment alignment) {
    this.alignment = alignment;
  }

  
  public CheckoutBrandingFooterContentInput getContent() {
    return content;
  }

  public void setContent(CheckoutBrandingFooterContentInput content) {
    this.content = content;
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
    
    private CheckoutBrandingFooterPosition position;

    
    private Boolean divided;

    
    private CheckoutBrandingFooterAlignment alignment;

    
    private CheckoutBrandingFooterContentInput content;

    
    private CheckoutBrandingColorSchemeSelection colorScheme;

    
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

    
    public Builder position(CheckoutBrandingFooterPosition position) {
      this.position = position;
      return this;
    }

    
    public Builder divided(Boolean divided) {
      this.divided = divided;
      return this;
    }

    
    public Builder alignment(CheckoutBrandingFooterAlignment alignment) {
      this.alignment = alignment;
      return this;
    }

    
    public Builder content(CheckoutBrandingFooterContentInput content) {
      this.content = content;
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
