package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingDesignSystem {
  
  private CheckoutBrandingColors colors;

  
  private CheckoutBrandingCornerRadiusVariables cornerRadius;

  
  private CheckoutBrandingTypography typography;

  public CheckoutBrandingDesignSystem() {
  }

  
  public CheckoutBrandingColors getColors() {
    return colors;
  }

  public void setColors(CheckoutBrandingColors colors) {
    this.colors = colors;
  }

  
  public CheckoutBrandingCornerRadiusVariables getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutBrandingCornerRadiusVariables cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  
  public CheckoutBrandingTypography getTypography() {
    return typography;
  }

  public void setTypography(CheckoutBrandingTypography typography) {
    this.typography = typography;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingDesignSystem{colors='" + colors + "', cornerRadius='" + cornerRadius + "', typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingDesignSystem that = (CheckoutBrandingDesignSystem) o;
    return Objects.equals(colors, that.colors) &&
        Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(typography, that.typography);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colors, cornerRadius, typography);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingColors colors;

    
    private CheckoutBrandingCornerRadiusVariables cornerRadius;

    
    private CheckoutBrandingTypography typography;

    public CheckoutBrandingDesignSystem build() {
      CheckoutBrandingDesignSystem result = new CheckoutBrandingDesignSystem();
      result.colors = this.colors;
      result.cornerRadius = this.cornerRadius;
      result.typography = this.typography;
      return result;
    }

    
    public Builder colors(CheckoutBrandingColors colors) {
      this.colors = colors;
      return this;
    }

    
    public Builder cornerRadius(CheckoutBrandingCornerRadiusVariables cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    
    public Builder typography(CheckoutBrandingTypography typography) {
      this.typography = typography;
      return this;
    }
  }
}
