package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingSelect {
  
  private CheckoutBrandingBorder border;

  
  private CheckoutBrandingTypographyStyle typography;

  public CheckoutBrandingSelect() {
  }

  
  public CheckoutBrandingBorder getBorder() {
    return border;
  }

  public void setBorder(CheckoutBrandingBorder border) {
    this.border = border;
  }

  
  public CheckoutBrandingTypographyStyle getTypography() {
    return typography;
  }

  public void setTypography(CheckoutBrandingTypographyStyle typography) {
    this.typography = typography;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingSelect{border='" + border + "', typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingSelect that = (CheckoutBrandingSelect) o;
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

    
    private CheckoutBrandingTypographyStyle typography;

    public CheckoutBrandingSelect build() {
      CheckoutBrandingSelect result = new CheckoutBrandingSelect();
      result.border = this.border;
      result.typography = this.typography;
      return result;
    }

    
    public Builder border(CheckoutBrandingBorder border) {
      this.border = border;
      return this;
    }

    
    public Builder typography(CheckoutBrandingTypographyStyle typography) {
      this.typography = typography;
      return this;
    }
  }
}
