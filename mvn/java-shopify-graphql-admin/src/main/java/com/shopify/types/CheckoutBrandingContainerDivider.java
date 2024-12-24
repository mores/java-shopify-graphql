package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingContainerDivider {
  
  private CheckoutBrandingBorderStyle borderStyle;

  
  private CheckoutBrandingBorderWidth borderWidth;

  
  private CheckoutBrandingVisibility visibility;

  public CheckoutBrandingContainerDivider() {
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

  
  public CheckoutBrandingVisibility getVisibility() {
    return visibility;
  }

  public void setVisibility(CheckoutBrandingVisibility visibility) {
    this.visibility = visibility;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingContainerDivider{borderStyle='" + borderStyle + "', borderWidth='" + borderWidth + "', visibility='" + visibility + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingContainerDivider that = (CheckoutBrandingContainerDivider) o;
    return Objects.equals(borderStyle, that.borderStyle) &&
        Objects.equals(borderWidth, that.borderWidth) &&
        Objects.equals(visibility, that.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(borderStyle, borderWidth, visibility);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingBorderStyle borderStyle;

    
    private CheckoutBrandingBorderWidth borderWidth;

    
    private CheckoutBrandingVisibility visibility;

    public CheckoutBrandingContainerDivider build() {
      CheckoutBrandingContainerDivider result = new CheckoutBrandingContainerDivider();
      result.borderStyle = this.borderStyle;
      result.borderWidth = this.borderWidth;
      result.visibility = this.visibility;
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

    
    public Builder visibility(CheckoutBrandingVisibility visibility) {
      this.visibility = visibility;
      return this;
    }
  }
}
