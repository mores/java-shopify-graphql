package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The shared typography customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingSharedTypographyStyle {
  /**
   * The kerning.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographyKerning kerning;

  /**
   * The letter case.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographyLetterCase letterCase;

  public CheckoutAndAccountsConfigurationBrandingSharedTypographyStyle() {
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

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingSharedTypographyStyle{kerning='" + kerning + "', letterCase='" + letterCase + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingSharedTypographyStyle that = (CheckoutAndAccountsConfigurationBrandingSharedTypographyStyle) o;
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
    private CheckoutAndAccountsConfigurationBrandingTypographyKerning kerning;

    /**
     * The letter case.
     */
    private CheckoutAndAccountsConfigurationBrandingTypographyLetterCase letterCase;

    public CheckoutAndAccountsConfigurationBrandingSharedTypographyStyle build() {
      CheckoutAndAccountsConfigurationBrandingSharedTypographyStyle result = new CheckoutAndAccountsConfigurationBrandingSharedTypographyStyle();
      result.kerning = this.kerning;
      result.letterCase = this.letterCase;
      return result;
    }

    /**
     * The kerning.
     */
    public Builder kerning(CheckoutAndAccountsConfigurationBrandingTypographyKerning kerning) {
      this.kerning = kerning;
      return this;
    }

    /**
     * The letter case.
     */
    public Builder letterCase(
        CheckoutAndAccountsConfigurationBrandingTypographyLetterCase letterCase) {
      this.letterCase = letterCase;
      return this;
    }
  }
}
