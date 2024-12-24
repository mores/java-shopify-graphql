package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingTypographyInput {
  
  private CheckoutBrandingFontSizeInput size;

  
  private CheckoutBrandingFontGroupInput primary;

  
  private CheckoutBrandingFontGroupInput secondary;

  public CheckoutBrandingTypographyInput() {
  }

  
  public CheckoutBrandingFontSizeInput getSize() {
    return size;
  }

  public void setSize(CheckoutBrandingFontSizeInput size) {
    this.size = size;
  }

  
  public CheckoutBrandingFontGroupInput getPrimary() {
    return primary;
  }

  public void setPrimary(CheckoutBrandingFontGroupInput primary) {
    this.primary = primary;
  }

  
  public CheckoutBrandingFontGroupInput getSecondary() {
    return secondary;
  }

  public void setSecondary(CheckoutBrandingFontGroupInput secondary) {
    this.secondary = secondary;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingTypographyInput{size='" + size + "', primary='" + primary + "', secondary='" + secondary + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingTypographyInput that = (CheckoutBrandingTypographyInput) o;
    return Objects.equals(size, that.size) &&
        Objects.equals(primary, that.primary) &&
        Objects.equals(secondary, that.secondary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, primary, secondary);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingFontSizeInput size;

    
    private CheckoutBrandingFontGroupInput primary;

    
    private CheckoutBrandingFontGroupInput secondary;

    public CheckoutBrandingTypographyInput build() {
      CheckoutBrandingTypographyInput result = new CheckoutBrandingTypographyInput();
      result.size = this.size;
      result.primary = this.primary;
      result.secondary = this.secondary;
      return result;
    }

    
    public Builder size(CheckoutBrandingFontSizeInput size) {
      this.size = size;
      return this;
    }

    
    public Builder primary(CheckoutBrandingFontGroupInput primary) {
      this.primary = primary;
      return this;
    }

    
    public Builder secondary(CheckoutBrandingFontGroupInput secondary) {
      this.secondary = secondary;
      return this;
    }
  }
}
