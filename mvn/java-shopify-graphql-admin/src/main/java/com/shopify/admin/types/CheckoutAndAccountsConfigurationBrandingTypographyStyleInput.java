package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the typography.
 */
public class CheckoutAndAccountsConfigurationBrandingTypographyStyleInput {
  /**
   * The font.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographyFont font;

  /**
   * The font size.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographySize size;

  /**
   * The font weight.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographyWeight weight;

  /**
   * The letter case.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographyLetterCase letterCase;

  /**
   * The kerning.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographyKerning kerning;

  public CheckoutAndAccountsConfigurationBrandingTypographyStyleInput() {
  }

  /**
   * The font.
   */
  public CheckoutAndAccountsConfigurationBrandingTypographyFont getFont() {
    return font;
  }

  public void setFont(CheckoutAndAccountsConfigurationBrandingTypographyFont font) {
    this.font = font;
  }

  /**
   * The font size.
   */
  public CheckoutAndAccountsConfigurationBrandingTypographySize getSize() {
    return size;
  }

  public void setSize(CheckoutAndAccountsConfigurationBrandingTypographySize size) {
    this.size = size;
  }

  /**
   * The font weight.
   */
  public CheckoutAndAccountsConfigurationBrandingTypographyWeight getWeight() {
    return weight;
  }

  public void setWeight(CheckoutAndAccountsConfigurationBrandingTypographyWeight weight) {
    this.weight = weight;
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
    return "CheckoutAndAccountsConfigurationBrandingTypographyStyleInput{font='" + font + "', size='" + size + "', weight='" + weight + "', letterCase='" + letterCase + "', kerning='" + kerning + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingTypographyStyleInput that = (CheckoutAndAccountsConfigurationBrandingTypographyStyleInput) o;
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
    /**
     * The font.
     */
    private CheckoutAndAccountsConfigurationBrandingTypographyFont font;

    /**
     * The font size.
     */
    private CheckoutAndAccountsConfigurationBrandingTypographySize size;

    /**
     * The font weight.
     */
    private CheckoutAndAccountsConfigurationBrandingTypographyWeight weight;

    /**
     * The letter case.
     */
    private CheckoutAndAccountsConfigurationBrandingTypographyLetterCase letterCase;

    /**
     * The kerning.
     */
    private CheckoutAndAccountsConfigurationBrandingTypographyKerning kerning;

    public CheckoutAndAccountsConfigurationBrandingTypographyStyleInput build() {
      CheckoutAndAccountsConfigurationBrandingTypographyStyleInput result = new CheckoutAndAccountsConfigurationBrandingTypographyStyleInput();
      result.font = this.font;
      result.size = this.size;
      result.weight = this.weight;
      result.letterCase = this.letterCase;
      result.kerning = this.kerning;
      return result;
    }

    /**
     * The font.
     */
    public Builder font(CheckoutAndAccountsConfigurationBrandingTypographyFont font) {
      this.font = font;
      return this;
    }

    /**
     * The font size.
     */
    public Builder size(CheckoutAndAccountsConfigurationBrandingTypographySize size) {
      this.size = size;
      return this;
    }

    /**
     * The font weight.
     */
    public Builder weight(CheckoutAndAccountsConfigurationBrandingTypographyWeight weight) {
      this.weight = weight;
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

    /**
     * The kerning.
     */
    public Builder kerning(CheckoutAndAccountsConfigurationBrandingTypographyKerning kerning) {
      this.kerning = kerning;
      return this;
    }
  }
}
