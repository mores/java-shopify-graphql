package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingTypography {
  
  private CheckoutBrandingFontGroup primary;

  
  private CheckoutBrandingFontGroup secondary;

  
  private CheckoutBrandingFontSize size;

  public CheckoutBrandingTypography() {
  }

  
  public CheckoutBrandingFontGroup getPrimary() {
    return primary;
  }

  public void setPrimary(CheckoutBrandingFontGroup primary) {
    this.primary = primary;
  }

  
  public CheckoutBrandingFontGroup getSecondary() {
    return secondary;
  }

  public void setSecondary(CheckoutBrandingFontGroup secondary) {
    this.secondary = secondary;
  }

  
  public CheckoutBrandingFontSize getSize() {
    return size;
  }

  public void setSize(CheckoutBrandingFontSize size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingTypography{primary='" + primary + "', secondary='" + secondary + "', size='" + size + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingTypography that = (CheckoutBrandingTypography) o;
    return Objects.equals(primary, that.primary) &&
        Objects.equals(secondary, that.secondary) &&
        Objects.equals(size, that.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primary, secondary, size);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingFontGroup primary;

    
    private CheckoutBrandingFontGroup secondary;

    
    private CheckoutBrandingFontSize size;

    public CheckoutBrandingTypography build() {
      CheckoutBrandingTypography result = new CheckoutBrandingTypography();
      result.primary = this.primary;
      result.secondary = this.secondary;
      result.size = this.size;
      return result;
    }

    
    public Builder primary(CheckoutBrandingFontGroup primary) {
      this.primary = primary;
      return this;
    }

    
    public Builder secondary(CheckoutBrandingFontGroup secondary) {
      this.secondary = secondary;
      return this;
    }

    
    public Builder size(CheckoutBrandingFontSize size) {
      this.size = size;
      return this;
    }
  }
}
