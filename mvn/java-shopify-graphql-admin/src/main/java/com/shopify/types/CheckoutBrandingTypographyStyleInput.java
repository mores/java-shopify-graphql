package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update the typography customizations.
 */
public class CheckoutBrandingTypographyStyleInput {
  /**
   * The font.
   */
  private CheckoutBrandingTypographyFont font;

  /**
   * The font size.
   */
  private CheckoutBrandingTypographySize size;

  /**
   * The font weight.
   */
  private CheckoutBrandingTypographyWeight weight;

  /**
   * The letter case.
   */
  private CheckoutBrandingTypographyLetterCase letterCase;

  /**
   * The kerning.
   */
  private CheckoutBrandingTypographyKerning kerning;

  public CheckoutBrandingTypographyStyleInput() {
  }

  /**
   * The font.
   */
  public CheckoutBrandingTypographyFont getFont() {
    return font;
  }

  public void setFont(CheckoutBrandingTypographyFont font) {
    this.font = font;
  }

  /**
   * The font size.
   */
  public CheckoutBrandingTypographySize getSize() {
    return size;
  }

  public void setSize(CheckoutBrandingTypographySize size) {
    this.size = size;
  }

  /**
   * The font weight.
   */
  public CheckoutBrandingTypographyWeight getWeight() {
    return weight;
  }

  public void setWeight(CheckoutBrandingTypographyWeight weight) {
    this.weight = weight;
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
    /**
     * The font.
     */
    private CheckoutBrandingTypographyFont font;

    /**
     * The font size.
     */
    private CheckoutBrandingTypographySize size;

    /**
     * The font weight.
     */
    private CheckoutBrandingTypographyWeight weight;

    /**
     * The letter case.
     */
    private CheckoutBrandingTypographyLetterCase letterCase;

    /**
     * The kerning.
     */
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

    /**
     * The font.
     */
    public Builder font(CheckoutBrandingTypographyFont font) {
      this.font = font;
      return this;
    }

    /**
     * The font size.
     */
    public Builder size(CheckoutBrandingTypographySize size) {
      this.size = size;
      return this;
    }

    /**
     * The font weight.
     */
    public Builder weight(CheckoutBrandingTypographyWeight weight) {
      this.weight = weight;
      return this;
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
