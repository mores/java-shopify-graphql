package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingGlobal {
  
  private CheckoutBrandingGlobalCornerRadius cornerRadius;

  
  private CheckoutBrandingTypographyStyleGlobal typography;

  public CheckoutBrandingGlobal() {
  }

  
  public CheckoutBrandingGlobalCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutBrandingGlobalCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  
  public CheckoutBrandingTypographyStyleGlobal getTypography() {
    return typography;
  }

  public void setTypography(CheckoutBrandingTypographyStyleGlobal typography) {
    this.typography = typography;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingGlobal{cornerRadius='" + cornerRadius + "', typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingGlobal that = (CheckoutBrandingGlobal) o;
    return Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(typography, that.typography);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cornerRadius, typography);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingGlobalCornerRadius cornerRadius;

    
    private CheckoutBrandingTypographyStyleGlobal typography;

    public CheckoutBrandingGlobal build() {
      CheckoutBrandingGlobal result = new CheckoutBrandingGlobal();
      result.cornerRadius = this.cornerRadius;
      result.typography = this.typography;
      return result;
    }

    
    public Builder cornerRadius(CheckoutBrandingGlobalCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    
    public Builder typography(CheckoutBrandingTypographyStyleGlobal typography) {
      this.typography = typography;
      return this;
    }
  }
}
