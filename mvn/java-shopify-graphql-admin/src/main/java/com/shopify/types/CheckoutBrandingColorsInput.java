package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingColorsInput {
  
  private CheckoutBrandingColorGlobalInput global;

  
  private CheckoutBrandingColorSchemesInput schemes;

  public CheckoutBrandingColorsInput() {
  }

  
  public CheckoutBrandingColorGlobalInput getGlobal() {
    return global;
  }

  public void setGlobal(CheckoutBrandingColorGlobalInput global) {
    this.global = global;
  }

  
  public CheckoutBrandingColorSchemesInput getSchemes() {
    return schemes;
  }

  public void setSchemes(CheckoutBrandingColorSchemesInput schemes) {
    this.schemes = schemes;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingColorsInput{global='" + global + "', schemes='" + schemes + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingColorsInput that = (CheckoutBrandingColorsInput) o;
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
    
    private CheckoutBrandingColorGlobalInput global;

    
    private CheckoutBrandingColorSchemesInput schemes;

    public CheckoutBrandingColorsInput build() {
      CheckoutBrandingColorsInput result = new CheckoutBrandingColorsInput();
      result.global = this.global;
      result.schemes = this.schemes;
      return result;
    }

    
    public Builder global(CheckoutBrandingColorGlobalInput global) {
      this.global = global;
      return this;
    }

    
    public Builder schemes(CheckoutBrandingColorSchemesInput schemes) {
      this.schemes = schemes;
      return this;
    }
  }
}
