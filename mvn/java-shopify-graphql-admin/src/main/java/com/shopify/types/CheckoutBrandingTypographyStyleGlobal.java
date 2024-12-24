package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingTypographyStyleGlobal {
  
  private CheckoutBrandingTypographyKerning kerning;

  
  private CheckoutBrandingTypographyLetterCase letterCase;

  public CheckoutBrandingTypographyStyleGlobal() {
  }

  
  public CheckoutBrandingTypographyKerning getKerning() {
    return kerning;
  }

  public void setKerning(CheckoutBrandingTypographyKerning kerning) {
    this.kerning = kerning;
  }

  
  public CheckoutBrandingTypographyLetterCase getLetterCase() {
    return letterCase;
  }

  public void setLetterCase(CheckoutBrandingTypographyLetterCase letterCase) {
    this.letterCase = letterCase;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingTypographyStyleGlobal{kerning='" + kerning + "', letterCase='" + letterCase + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingTypographyStyleGlobal that = (CheckoutBrandingTypographyStyleGlobal) o;
    return Objects.equals(kerning, that.kerning) &&
        Objects.equals(letterCase, that.letterCase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kerning, letterCase);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingTypographyKerning kerning;

    
    private CheckoutBrandingTypographyLetterCase letterCase;

    public CheckoutBrandingTypographyStyleGlobal build() {
      CheckoutBrandingTypographyStyleGlobal result = new CheckoutBrandingTypographyStyleGlobal();
      result.kerning = this.kerning;
      result.letterCase = this.letterCase;
      return result;
    }

    
    public Builder kerning(CheckoutBrandingTypographyKerning kerning) {
      this.kerning = kerning;
      return this;
    }

    
    public Builder letterCase(CheckoutBrandingTypographyLetterCase letterCase) {
      this.letterCase = letterCase;
      return this;
    }
  }
}
