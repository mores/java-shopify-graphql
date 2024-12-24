package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingTypographyStyleInput {
  
  private CheckoutBrandingTypographyFont font;

  
  private CheckoutBrandingTypographySize size;

  
  private CheckoutBrandingTypographyWeight weight;

  
  private CheckoutBrandingTypographyLetterCase letterCase;

  
  private CheckoutBrandingTypographyKerning kerning;

  public CheckoutBrandingTypographyStyleInput() {
  }

  
  public CheckoutBrandingTypographyFont getFont() {
    return font;
  }

  public void setFont(CheckoutBrandingTypographyFont font) {
    this.font = font;
  }

  
  public CheckoutBrandingTypographySize getSize() {
    return size;
  }

  public void setSize(CheckoutBrandingTypographySize size) {
    this.size = size;
  }

  
  public CheckoutBrandingTypographyWeight getWeight() {
    return weight;
  }

  public void setWeight(CheckoutBrandingTypographyWeight weight) {
    this.weight = weight;
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
    return "CheckoutBrandingTypographyStyleInput{font='" + font + "', size='" + size + "', weight='" + weight + "', letterCase='" + letterCase + "', kerning='" + kerning + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingTypographyStyleInput that = (CheckoutBrandingTypographyStyleInput) o;
    return Objects.equals(font, that.font) &&
        Objects.equals(size, that.size) &&
        Objects.equals(weight, that.weight) &&
        Objects.equals(letterCase, that.letterCase) &&
        Objects.equals(kerning, that.kerning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(font, size, weight, letterCase, kerning);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingTypographyFont font;

    
    private CheckoutBrandingTypographySize size;

    
    private CheckoutBrandingTypographyWeight weight;

    
    private CheckoutBrandingTypographyLetterCase letterCase;

    
    private CheckoutBrandingTypographyKerning kerning;

    public CheckoutBrandingTypographyStyleInput build() {
      CheckoutBrandingTypographyStyleInput result = new CheckoutBrandingTypographyStyleInput();
      result.font = this.font;
      result.size = this.size;
      result.weight = this.weight;
      result.letterCase = this.letterCase;
      result.kerning = this.kerning;
      return result;
    }

    
    public Builder font(CheckoutBrandingTypographyFont font) {
      this.font = font;
      return this;
    }

    
    public Builder size(CheckoutBrandingTypographySize size) {
      this.size = size;
      return this;
    }

    
    public Builder weight(CheckoutBrandingTypographyWeight weight) {
      this.weight = weight;
      return this;
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
