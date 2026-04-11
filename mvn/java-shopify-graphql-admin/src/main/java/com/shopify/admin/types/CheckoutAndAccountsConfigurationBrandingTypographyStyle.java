package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The typography customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingTypographyStyle {
  /**
   * The font.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographyFont font;

  /**
   * The kerning.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographyKerning kerning;

  /**
   * The letter case.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographyLetterCase letterCase;

  /**
   * The font size.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographySize size;

  /**
   * The font weight.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographyWeight weight;

  public CheckoutAndAccountsConfigurationBrandingTypographyStyle() {
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

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingTypographyStyle{font='" + font + "', kerning='" + kerning + "', letterCase='" + letterCase + "', size='" + size + "', weight='" + weight + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingTypographyStyle that = (CheckoutAndAccountsConfigurationBrandingTypographyStyle) o;
    return Objects.equals(font, that.font) &&
        Objects.equals(kerning, that.kerning) &&
        Objects.equals(letterCase, that.letterCase) &&
        Objects.equals(size, that.size) &&
        Objects.equals(weight, that.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(font, kerning, letterCase, size, weight);
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
     * The kerning.
     */
    private CheckoutAndAccountsConfigurationBrandingTypographyKerning kerning;

    /**
     * The letter case.
     */
    private CheckoutAndAccountsConfigurationBrandingTypographyLetterCase letterCase;

    /**
     * The font size.
     */
    private CheckoutAndAccountsConfigurationBrandingTypographySize size;

    /**
     * The font weight.
     */
    private CheckoutAndAccountsConfigurationBrandingTypographyWeight weight;

    public CheckoutAndAccountsConfigurationBrandingTypographyStyle build() {
      CheckoutAndAccountsConfigurationBrandingTypographyStyle result = new CheckoutAndAccountsConfigurationBrandingTypographyStyle();
      result.font = this.font;
      result.kerning = this.kerning;
      result.letterCase = this.letterCase;
      result.size = this.size;
      result.weight = this.weight;
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
  }
}
