package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingButton {
  
  private CheckoutBrandingBackgroundStyle background;

  
  private CheckoutBrandingSpacing blockPadding;

  
  private CheckoutBrandingSimpleBorder border;

  
  private CheckoutBrandingCornerRadius cornerRadius;

  
  private CheckoutBrandingSpacing inlinePadding;

  
  private CheckoutBrandingTypographyStyle typography;

  public CheckoutBrandingButton() {
  }

  
  public CheckoutBrandingBackgroundStyle getBackground() {
    return background;
  }

  public void setBackground(CheckoutBrandingBackgroundStyle background) {
    this.background = background;
  }

  
  public CheckoutBrandingSpacing getBlockPadding() {
    return blockPadding;
  }

  public void setBlockPadding(CheckoutBrandingSpacing blockPadding) {
    this.blockPadding = blockPadding;
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

  
  public CheckoutBrandingSpacing getInlinePadding() {
    return inlinePadding;
  }

  public void setInlinePadding(CheckoutBrandingSpacing inlinePadding) {
    this.inlinePadding = inlinePadding;
  }

  
  public CheckoutBrandingTypographyStyle getTypography() {
    return typography;
  }

  public void setTypography(CheckoutBrandingTypographyStyle typography) {
    this.typography = typography;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingButton{background='" + background + "', blockPadding='" + blockPadding + "', border='" + border + "', cornerRadius='" + cornerRadius + "', inlinePadding='" + inlinePadding + "', typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingButton that = (CheckoutBrandingButton) o;
    return Objects.equals(background, that.background) &&
        Objects.equals(blockPadding, that.blockPadding) &&
        Objects.equals(border, that.border) &&
        Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(inlinePadding, that.inlinePadding) &&
        Objects.equals(typography, that.typography);
  }

  @Override
  public int hashCode() {
    return Objects.hash(background, blockPadding, border, cornerRadius, inlinePadding, typography);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingBackgroundStyle background;

    
    private CheckoutBrandingSpacing blockPadding;

    
    private CheckoutBrandingSimpleBorder border;

    
    private CheckoutBrandingCornerRadius cornerRadius;

    
    private CheckoutBrandingSpacing inlinePadding;

    
    private CheckoutBrandingTypographyStyle typography;

    public CheckoutBrandingButton build() {
      CheckoutBrandingButton result = new CheckoutBrandingButton();
      result.background = this.background;
      result.blockPadding = this.blockPadding;
      result.border = this.border;
      result.cornerRadius = this.cornerRadius;
      result.inlinePadding = this.inlinePadding;
      result.typography = this.typography;
      return result;
    }

    
    public Builder background(CheckoutBrandingBackgroundStyle background) {
      this.background = background;
      return this;
    }

    
    public Builder blockPadding(CheckoutBrandingSpacing blockPadding) {
      this.blockPadding = blockPadding;
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

    
    public Builder inlinePadding(CheckoutBrandingSpacing inlinePadding) {
      this.inlinePadding = inlinePadding;
      return this;
    }

    
    public Builder typography(CheckoutBrandingTypographyStyle typography) {
      this.typography = typography;
      return this;
    }
  }
}
