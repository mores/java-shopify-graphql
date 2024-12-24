package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingDividerStyle {
  
  private CheckoutBrandingBorderStyle borderStyle;

  
  private CheckoutBrandingBorderWidth borderWidth;

  public CheckoutBrandingDividerStyle() {
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

  @Override
  public String toString() {
    return "CheckoutBrandingDividerStyle{borderStyle='" + borderStyle + "', borderWidth='" + borderWidth + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingDividerStyle that = (CheckoutBrandingDividerStyle) o;
    return Objects.equals(borderStyle, that.borderStyle) &&
        Objects.equals(borderWidth, that.borderWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(borderStyle, borderWidth);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingBorderStyle borderStyle;

    
    private CheckoutBrandingBorderWidth borderWidth;

    public CheckoutBrandingDividerStyle build() {
      CheckoutBrandingDividerStyle result = new CheckoutBrandingDividerStyle();
      result.borderStyle = this.borderStyle;
      result.borderWidth = this.borderWidth;
      return result;
    }

    
    public Builder borderStyle(CheckoutBrandingBorderStyle borderStyle) {
      this.borderStyle = borderStyle;
      return this;
    }

    
    public Builder borderWidth(CheckoutBrandingBorderWidth borderWidth) {
      this.borderWidth = borderWidth;
      return this;
    }
  }
}
