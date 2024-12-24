package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingButtonInput {
  
  private CheckoutBrandingBackgroundStyle background;

  
  private CheckoutBrandingSimpleBorder border;

  
  private CheckoutBrandingCornerRadius cornerRadius;

  
  private CheckoutBrandingSpacing blockPadding;

  
  private CheckoutBrandingSpacing inlinePadding;

  
  private CheckoutBrandingTypographyStyleInput typography;

  public CheckoutBrandingButtonInput() {
  }

  
  public CheckoutBrandingBackgroundStyle getBackground() {
    return background;
  }

  public void setBackground(CheckoutBrandingBackgroundStyle background) {
    this.background = background;
  }

  
  public CheckoutBrandingSimpleBorder getBorder() {
    return border;
  }

  public void setBorder(CheckoutBrandingSimpleBorder border) {
    this.border = border;
  }

  
  public CheckoutBrandingCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  
  public CheckoutBrandingSpacing getBlockPadding() {
    return blockPadding;
  }

  public void setBlockPadding(CheckoutBrandingSpacing blockPadding) {
    this.blockPadding = blockPadding;
  }

  
  public CheckoutBrandingSpacing getInlinePadding() {
    return inlinePadding;
  }

  public void setInlinePadding(CheckoutBrandingSpacing inlinePadding) {
    this.inlinePadding = inlinePadding;
  }

  
  public CheckoutBrandingTypographyStyleInput getTypography() {
    return typography;
  }

  public void setTypography(CheckoutBrandingTypographyStyleInput typography) {
    this.typography = typography;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingButtonInput{background='" + background + "', border='" + border + "', cornerRadius='" + cornerRadius + "', blockPadding='" + blockPadding + "', inlinePadding='" + inlinePadding + "', typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingButtonInput that = (CheckoutBrandingButtonInput) o;
    return Objects.equals(background, that.background) &&
        Objects.equals(border, that.border) &&
        Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(blockPadding, that.blockPadding) &&
        Objects.equals(inlinePadding, that.inlinePadding) &&
        Objects.equals(typography, that.typography);
  }

  @Override
  public int hashCode() {
    return Objects.hash(background, border, cornerRadius, blockPadding, inlinePadding, typography);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingBackgroundStyle background;

    
    private CheckoutBrandingSimpleBorder border;

    
    private CheckoutBrandingCornerRadius cornerRadius;

    
    private CheckoutBrandingSpacing blockPadding;

    
    private CheckoutBrandingSpacing inlinePadding;

    
    private CheckoutBrandingTypographyStyleInput typography;

    public CheckoutBrandingButtonInput build() {
      CheckoutBrandingButtonInput result = new CheckoutBrandingButtonInput();
      result.background = this.background;
      result.border = this.border;
      result.cornerRadius = this.cornerRadius;
      result.blockPadding = this.blockPadding;
      result.inlinePadding = this.inlinePadding;
      result.typography = this.typography;
      return result;
    }

    
    public Builder background(CheckoutBrandingBackgroundStyle background) {
      this.background = background;
      return this;
    }

    
    public Builder border(CheckoutBrandingSimpleBorder border) {
      this.border = border;
      return this;
    }

    
    public Builder cornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    
    public Builder blockPadding(CheckoutBrandingSpacing blockPadding) {
      this.blockPadding = blockPadding;
      return this;
    }

    
    public Builder inlinePadding(CheckoutBrandingSpacing inlinePadding) {
      this.inlinePadding = inlinePadding;
      return this;
    }

    
    public Builder typography(CheckoutBrandingTypographyStyleInput typography) {
      this.typography = typography;
      return this;
    }
  }
}
