package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The typography customizations.
 */
public class CheckoutBrandingTypographyStyle {
  /**
   * The font.
   */
  private CheckoutBrandingTypographyFont font;

  /**
   * The kerning.
   */
  private CheckoutBrandingTypographyKerning kerning;

  /**
   * The letter case.
   */
  private CheckoutBrandingTypographyLetterCase letterCase;

  /**
   * The font size.
   */
  private CheckoutBrandingTypographySize size;

  /**
   * The font weight.
   */
  private CheckoutBrandingTypographyWeight weight;

  public CheckoutBrandingTypographyStyle() {
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

  @Override
  public String toString() {
    return "CheckoutBrandingTypographyStyle{font='" + font + "', kerning='" + kerning + "', letterCase='" + letterCase + "', size='" + size + "', weight='" + weight + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingTypographyStyle that = (CheckoutBrandingTypographyStyle) o;
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
    private CheckoutBrandingTypographyFont font;

    /**
     * The kerning.
     */
    private CheckoutBrandingTypographyKerning kerning;

    /**
     * The letter case.
     */
    private CheckoutBrandingTypographyLetterCase letterCase;

    /**
     * The font size.
     */
    private CheckoutBrandingTypographySize size;

    /**
     * The font weight.
     */
    private CheckoutBrandingTypographyWeight weight;

    public CheckoutBrandingTypographyStyle build() {
      CheckoutBrandingTypographyStyle result = new CheckoutBrandingTypographyStyle();
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
    public Builder font(CheckoutBrandingTypographyFont font) {
      this.font = font;
      return this;
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
  }
}
