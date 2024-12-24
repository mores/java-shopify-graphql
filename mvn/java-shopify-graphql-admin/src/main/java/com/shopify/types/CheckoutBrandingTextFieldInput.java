package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingTextFieldInput {
  
  private CheckoutBrandingBorder border;

  
  private CheckoutBrandingTypographyStyleInput typography;

  public CheckoutBrandingTextFieldInput() {
  }

  
  public CheckoutBrandingBorder getBorder() {
    return border;
  }

  public void setBorder(CheckoutBrandingBorder border) {
    this.border = border;
  }

  
  public CheckoutBrandingTypographyStyleInput getTypography() {
    return typography;
  }

  public void setTypography(CheckoutBrandingTypographyStyleInput typography) {
    this.typography = typography;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingTextFieldInput{border='" + border + "', typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingTextFieldInput that = (CheckoutBrandingTextFieldInput) o;
    return Objects.equals(border, that.border) &&
        Objects.equals(typography, that.typography);
  }

  @Override
  public int hashCode() {
    return Objects.hash(border, typography);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingBorder border;

    
    private CheckoutBrandingTypographyStyleInput typography;

    public CheckoutBrandingTextFieldInput build() {
      CheckoutBrandingTextFieldInput result = new CheckoutBrandingTextFieldInput();
      result.border = this.border;
      result.typography = this.typography;
      return result;
    }

    
    public Builder border(CheckoutBrandingBorder border) {
      this.border = border;
      return this;
    }

    
    public Builder typography(CheckoutBrandingTypographyStyleInput typography) {
      this.typography = typography;
      return this;
    }
  }
}
