package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the shared typography.
 */
public class CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleInput {
  /**
   * The letter case.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographyLetterCase letterCase;

  /**
   * The kerning.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographyKerning kerning;

  public CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleInput() {
  }

  /**
   * The letter case.
   */
  public CheckoutAndAccountsConfigurationBrandingTypographyLetterCase getLetterCase() {
    return letterCase;
  }

  public void setLetterCase(
      CheckoutAndAccountsConfigurationBrandingTypographyLetterCase letterCase) {
    this.letterCase = letterCase;
  }

  /**
   * The kerning.
   */
  public CheckoutAndAccountsConfigurationBrandingTypographyKerning getKerning() {
    return kerning;
  }

  public void setKerning(CheckoutAndAccountsConfigurationBrandingTypographyKerning kerning) {
    this.kerning = kerning;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleInput{letterCase='" + letterCase + "', kerning='" + kerning + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleInput that = (CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleInput) o;
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
    private CheckoutAndAccountsConfigurationBrandingTypographyLetterCase letterCase;

    /**
     * The kerning.
     */
    private CheckoutAndAccountsConfigurationBrandingTypographyKerning kerning;

    public CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleInput build() {
      CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleInput result = new CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleInput();
      result.letterCase = this.letterCase;
      result.kerning = this.kerning;
      return result;
    }

    /**
     * The letter case.
     */
    public Builder letterCase(
        CheckoutAndAccountsConfigurationBrandingTypographyLetterCase letterCase) {
      this.letterCase = letterCase;
      return this;
    }

    /**
     * The kerning.
     */
    public Builder kerning(CheckoutAndAccountsConfigurationBrandingTypographyKerning kerning) {
      this.kerning = kerning;
      return this;
    }
  }
}
