package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingMainSectionInput {
  
  private CheckoutBrandingColorSchemeSelection colorScheme;

  
  private CheckoutBrandingBackground background;

  
  private CheckoutBrandingCornerRadius cornerRadius;

  
  private CheckoutBrandingSimpleBorder border;

  
  private CheckoutBrandingBorderStyle borderStyle;

  
  private CheckoutBrandingBorderWidth borderWidth;

  
  private CheckoutBrandingShadow shadow;

  
  private CheckoutBrandingSpacingKeyword padding;

  public CheckoutBrandingMainSectionInput() {
  }

  
  public CheckoutBrandingColorSchemeSelection getColorScheme() {
    return colorScheme;
  }

  public void setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
    this.colorScheme = colorScheme;
  }

  
  public CheckoutBrandingBackground getBackground() {
    return background;
  }

  public void setBackground(CheckoutBrandingBackground background) {
    this.background = background;
  }

  
  public CheckoutBrandingCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  
  public CheckoutBrandingSimpleBorder getBorder() {
    return border;
  }

  public void setBorder(CheckoutBrandingSimpleBorder border) {
    this.border = border;
  }

  
  public CheckoutBrandingBorderStyle getBorderStyle() {
    return borderStyle;
  }

  public void setBorderStyle(CheckoutBrandingBorderStyle borderStyle) {
    this.borderStyle = borderStyle;
  }

  
  public CheckoutBrandingBorderWidth getBorderWidth() {
    return borderWidth;
  }

  public void setBorderWidth(CheckoutBrandingBorderWidth borderWidth) {
    this.borderWidth = borderWidth;
  }

  
  public CheckoutBrandingShadow getShadow() {
    return shadow;
  }

  public void setShadow(CheckoutBrandingShadow shadow) {
    this.shadow = shadow;
  }

  
  public CheckoutBrandingSpacingKeyword getPadding() {
    return padding;
  }

  public void setPadding(CheckoutBrandingSpacingKeyword padding) {
    this.padding = padding;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingMainSectionInput{colorScheme='" + colorScheme + "', background='" + background + "', cornerRadius='" + cornerRadius + "', border='" + border + "', borderStyle='" + borderStyle + "', borderWidth='" + borderWidth + "', shadow='" + shadow + "', padding='" + padding + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingMainSectionInput that = (CheckoutBrandingMainSectionInput) o;
    return Objects.equals(colorScheme, that.colorScheme) &&
        Objects.equals(background, that.background) &&
        Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(border, that.border) &&
        Objects.equals(borderStyle, that.borderStyle) &&
        Objects.equals(borderWidth, that.borderWidth) &&
        Objects.equals(shadow, that.shadow) &&
        Objects.equals(padding, that.padding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorScheme, background, cornerRadius, border, borderStyle, borderWidth, shadow, padding);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingColorSchemeSelection colorScheme;

    
    private CheckoutBrandingBackground background;

    
    private CheckoutBrandingCornerRadius cornerRadius;

    
    private CheckoutBrandingSimpleBorder border;

    
    private CheckoutBrandingBorderStyle borderStyle;

    
    private CheckoutBrandingBorderWidth borderWidth;

    
    private CheckoutBrandingShadow shadow;

    
    private CheckoutBrandingSpacingKeyword padding;

    public CheckoutBrandingMainSectionInput build() {
      CheckoutBrandingMainSectionInput result = new CheckoutBrandingMainSectionInput();
      result.colorScheme = this.colorScheme;
      result.background = this.background;
      result.cornerRadius = this.cornerRadius;
      result.border = this.border;
      result.borderStyle = this.borderStyle;
      result.borderWidth = this.borderWidth;
      result.shadow = this.shadow;
      result.padding = this.padding;
      return result;
    }

    
    public Builder colorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
      this.colorScheme = colorScheme;
      return this;
    }

    
    public Builder background(CheckoutBrandingBackground background) {
      this.background = background;
      return this;
    }

    
    public Builder cornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    
    public Builder border(CheckoutBrandingSimpleBorder border) {
      this.border = border;
      return this;
    }

    
    public Builder borderStyle(CheckoutBrandingBorderStyle borderStyle) {
      this.borderStyle = borderStyle;
      return this;
    }

    
    public Builder borderWidth(CheckoutBrandingBorderWidth borderWidth) {
      this.borderWidth = borderWidth;
      return this;
    }

    
    public Builder shadow(CheckoutBrandingShadow shadow) {
      this.shadow = shadow;
      return this;
    }

    
    public Builder padding(CheckoutBrandingSpacingKeyword padding) {
      this.padding = padding;
      return this;
    }
  }
}
