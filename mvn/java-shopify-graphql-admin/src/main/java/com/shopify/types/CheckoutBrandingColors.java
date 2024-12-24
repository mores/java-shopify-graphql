package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingColors {
  
  private CheckoutBrandingColorGlobal global;

  
  private CheckoutBrandingColorSchemes schemes;

  public CheckoutBrandingColors() {
  }

  
  public CheckoutBrandingColorGlobal getGlobal() {
    return global;
  }

  public void setGlobal(CheckoutBrandingColorGlobal global) {
    this.global = global;
  }

  
  public CheckoutBrandingColorSchemes getSchemes() {
    return schemes;
  }

  public void setSchemes(CheckoutBrandingColorSchemes schemes) {
    this.schemes = schemes;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingColors{global='" + global + "', schemes='" + schemes + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingColors that = (CheckoutBrandingColors) o;
    return Objects.equals(global, that.global) &&
        Objects.equals(schemes, that.schemes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(global, schemes);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingColorGlobal global;

    
    private CheckoutBrandingColorSchemes schemes;

    public CheckoutBrandingColors build() {
      CheckoutBrandingColors result = new CheckoutBrandingColors();
      result.global = this.global;
      result.schemes = this.schemes;
      return result;
    }

    
    public Builder global(CheckoutBrandingColorGlobal global) {
      this.global = global;
      return this;
    }

    
    public Builder schemes(CheckoutBrandingColorSchemes schemes) {
      this.schemes = schemes;
      return this;
    }
  }
}
