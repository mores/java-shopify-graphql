package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update the global typography customizations.
 */
public class CheckoutBrandingTypographyStyleGlobalInput {
  /**
   * The letter case.
   */
  private CheckoutBrandingTypographyLetterCase letterCase;

  /**
   * The kerning.
   */
  private CheckoutBrandingTypographyKerning kerning;

  public CheckoutBrandingTypographyStyleGlobalInput() {
  }

  /**
   * The letter case.
   */
  public CheckoutBrandingTypographyLetterCase getLetterCase() {
    return letterCase;
  }

  public void setLetterCase(CheckoutBrandingTypographyLetterCase letterCase) {
    this.letterCase = letterCase;
  }

  /**
   * The kerning.
   */
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
    /**
     * The letter case.
     */
    private CheckoutBrandingTypographyLetterCase letterCase;

    /**
     * The kerning.
     */
    private CheckoutBrandingTypographyKerning kerning;

    public CheckoutBrandingTypographyStyleGlobalInput build() {
      CheckoutBrandingTypographyStyleGlobalInput result = new CheckoutBrandingTypographyStyleGlobalInput();
      result.letterCase = this.letterCase;
      result.kerning = this.kerning;
      return result;
    }

    /**
     * The letter case.
     */
    public Builder letterCase(CheckoutBrandingTypographyLetterCase letterCase) {
      this.letterCase = letterCase;
      return this;
    }

    /**
     * The kerning.
     */
    public Builder kerning(CheckoutBrandingTypographyKerning kerning) {
      this.kerning = kerning;
      return this;
    }
  }
}
