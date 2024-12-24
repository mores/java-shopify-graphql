package com.shopify.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingFontSizeInput {
  
  private Double base;

  
  private Double ratio;

  public CheckoutBrandingFontSizeInput() {
  }

  
  public Double getBase() {
    return base;
  }

  public void setBase(Double base) {
    this.base = base;
  }

  
  public Double getRatio() {
    return ratio;
  }

  public void setRatio(Double ratio) {
    this.ratio = ratio;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingFontSizeInput{base='" + base + "', ratio='" + ratio + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingFontSizeInput that = (CheckoutBrandingFontSizeInput) o;
    return Objects.equals(base, that.base) &&
        Objects.equals(ratio, that.ratio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, ratio);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Double base;

    
    private Double ratio;

    public CheckoutBrandingFontSizeInput build() {
      CheckoutBrandingFontSizeInput result = new CheckoutBrandingFontSizeInput();
      result.base = this.base;
      result.ratio = this.ratio;
      return result;
    }

    
    public Builder base(Double base) {
      this.base = base;
      return this;
    }

    
    public Builder ratio(Double ratio) {
      this.ratio = ratio;
      return this;
    }
  }
}
