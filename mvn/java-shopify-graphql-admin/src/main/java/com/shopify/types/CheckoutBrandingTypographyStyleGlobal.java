package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The global typography customizations.
 */
public class CheckoutBrandingTypographyStyleGlobal {
  /**
   * The kerning.
   */
  private CheckoutBrandingTypographyKerning kerning;

  /**
   * The letter case.
   */
  private CheckoutBrandingTypographyLetterCase letterCase;

  public CheckoutBrandingTypographyStyleGlobal() {
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

  /**
   * The letter case.
   */
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
    /**
     * The kerning.
     */
    private CheckoutBrandingTypographyKerning kerning;

    /**
     * The letter case.
     */
    private CheckoutBrandingTypographyLetterCase letterCase;

    public CheckoutBrandingTypographyStyleGlobal build() {
      CheckoutBrandingTypographyStyleGlobal result = new CheckoutBrandingTypographyStyleGlobal();
      result.kerning = this.kerning;
      result.letterCase = this.letterCase;
      return result;
    }

    /**
     * The kerning.
     */
    public Builder kerning(CheckoutBrandingTypographyKerning kerning) {
      this.kerning = kerning;
      return this;
    }

    /**
     * The letter case.
     */
    public Builder letterCase(CheckoutBrandingTypographyLetterCase letterCase) {
      this.letterCase = letterCase;
      return this;
    }
  }
}
