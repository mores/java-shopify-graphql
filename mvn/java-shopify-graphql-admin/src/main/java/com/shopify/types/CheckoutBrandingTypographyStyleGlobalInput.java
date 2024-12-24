package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingTypographyStyleGlobalInput {
  
  private CheckoutBrandingTypographyLetterCase letterCase;

  
  private CheckoutBrandingTypographyKerning kerning;

  public CheckoutBrandingTypographyStyleGlobalInput() {
  }

  
  public CheckoutBrandingTypographyLetterCase getLetterCase() {
    return letterCase;
  }

  public void setLetterCase(CheckoutBrandingTypographyLetterCase letterCase) {
    this.letterCase = letterCase;
  }

  
  public CheckoutBrandingTypographyKerning getKerning() {
    return kerning;
  }

  public void setKerning(CheckoutBrandingTypographyKerning kerning) {
    this.kerning = kerning;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingTypographyStyleGlobalInput{letterCase='" + letterCase + "', kerning='" + kerning + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingTypographyStyleGlobalInput that = (CheckoutBrandingTypographyStyleGlobalInput) o;
    return Objects.equals(letterCase, that.letterCase) &&
        Objects.equals(kerning, that.kerning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(letterCase, kerning);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingTypographyLetterCase letterCase;

    
    private CheckoutBrandingTypographyKerning kerning;

    public CheckoutBrandingTypographyStyleGlobalInput build() {
      CheckoutBrandingTypographyStyleGlobalInput result = new CheckoutBrandingTypographyStyleGlobalInput();
      result.letterCase = this.letterCase;
      result.kerning = this.kerning;
      return result;
    }

    
    public Builder letterCase(CheckoutBrandingTypographyLetterCase letterCase) {
      this.letterCase = letterCase;
      return this;
    }

    
    public Builder kerning(CheckoutBrandingTypographyKerning kerning) {
      this.kerning = kerning;
      return this;
    }
  }
}
