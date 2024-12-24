package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingMainSection {
  
  private CheckoutBrandingBackground background;

  
  private CheckoutBrandingSimpleBorder border;

  
  private CheckoutBrandingBorderStyle borderStyle;

  
  private CheckoutBrandingBorderWidth borderWidth;

  
  private CheckoutBrandingColorSchemeSelection colorScheme;

  
  private CheckoutBrandingCornerRadius cornerRadius;

  
  private CheckoutBrandingSpacingKeyword padding;

  
  private CheckoutBrandingShadow shadow;

  public CheckoutBrandingMainSection() {
  }

  
  public CheckoutBrandingBackground getBackground() {
    return background;
  }

  public void setBackground(CheckoutBrandingBackground background) {
    this.background = background;
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

  
  public CheckoutBrandingColorSchemeSelection getColorScheme() {
    return colorScheme;
  }

  public void setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
    this.colorScheme = colorScheme;
  }

  
  public CheckoutBrandingCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  
  public CheckoutBrandingSpacingKeyword getPadding() {
    return padding;
  }

  public void setPadding(CheckoutBrandingSpacingKeyword padding) {
    this.padding = padding;
  }

  
  public CheckoutBrandingShadow getShadow() {
    return shadow;
  }

  public void setShadow(CheckoutBrandingShadow shadow) {
    this.shadow = shadow;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingMainSection{background='" + background + "', border='" + border + "', borderStyle='" + borderStyle + "', borderWidth='" + borderWidth + "', colorScheme='" + colorScheme + "', cornerRadius='" + cornerRadius + "', padding='" + padding + "', shadow='" + shadow + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingMainSection that = (CheckoutBrandingMainSection) o;
    return Objects.equals(background, that.background) &&
        Objects.equals(border, that.border) &&
        Objects.equals(borderStyle, that.borderStyle) &&
        Objects.equals(borderWidth, that.borderWidth) &&
        Objects.equals(colorScheme, that.colorScheme) &&
        Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(padding, that.padding) &&
        Objects.equals(shadow, that.shadow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(background, border, borderStyle, borderWidth, colorScheme, cornerRadius, padding, shadow);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingBackground background;

    
    private CheckoutBrandingSimpleBorder border;

    
    private CheckoutBrandingBorderStyle borderStyle;

    
    private CheckoutBrandingBorderWidth borderWidth;

    
    private CheckoutBrandingColorSchemeSelection colorScheme;

    
    private CheckoutBrandingCornerRadius cornerRadius;

    
    private CheckoutBrandingSpacingKeyword padding;

    
    private CheckoutBrandingShadow shadow;

    public CheckoutBrandingMainSection build() {
      CheckoutBrandingMainSection result = new CheckoutBrandingMainSection();
      result.background = this.background;
      result.border = this.border;
      result.borderStyle = this.borderStyle;
      result.borderWidth = this.borderWidth;
      result.colorScheme = this.colorScheme;
      result.cornerRadius = this.cornerRadius;
      result.padding = this.padding;
      result.shadow = this.shadow;
      return result;
    }

    
    public Builder background(CheckoutBrandingBackground background) {
      this.background = background;
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

    
    public Builder colorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
      this.colorScheme = colorScheme;
      return this;
    }

    
    public Builder cornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    
    public Builder padding(CheckoutBrandingSpacingKeyword padding) {
      this.padding = padding;
      return this;
    }

    
    public Builder shadow(CheckoutBrandingShadow shadow) {
      this.shadow = shadow;
      return this;
    }
  }
}
