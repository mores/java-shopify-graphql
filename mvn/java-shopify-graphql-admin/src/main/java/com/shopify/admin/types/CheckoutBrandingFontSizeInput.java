package com.shopify.admin.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update the font size.
 */
public class CheckoutBrandingFontSizeInput {
  /**
   * The base font size. Its value should be between 12.0 and 18.0.
   */
  private Double base;

  /**
   * The scale ratio used to derive all font sizes such as small and large. Its value should be between 1.0 and 1.4.
   */
  private Double ratio;

  public CheckoutBrandingFontSizeInput() {
  }

  /**
   * The base font size. Its value should be between 12.0 and 18.0.
   */
  public Double getBase() {
    return base;
  }

  public void setBase(Double base) {
    this.base = base;
  }

  /**
   * The scale ratio used to derive all font sizes such as small and large. Its value should be between 1.0 and 1.4.
   */
  public Double getRatio() {
    return ratio;
  }

  public void setRatio(Double ratio) {
    this.ratio = ratio;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingFontSizeInput{base='" + base + "', ratio='" + ratio + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingFontSizeInput that = (CheckoutBrandingFontSizeInput) o;
    return Objects.equals(base, that.base) &&
        Objects.equals(ratio, that.ratio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, ratio);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The base font size. Its value should be between 12.0 and 18.0.
     */
    private Double base;

    /**
     * The scale ratio used to derive all font sizes such as small and large. Its value should be between 1.0 and 1.4.
     */
    private Double ratio;

    public CheckoutBrandingFontSizeInput build() {
      CheckoutBrandingFontSizeInput result = new CheckoutBrandingFontSizeInput();
      result.base = this.base;
      result.ratio = this.ratio;
      return result;
    }

    /**
     * The base font size. Its value should be between 12.0 and 18.0.
     */
    public Builder base(Double base) {
      this.base = base;
      return this;
    }

    /**
     * The scale ratio used to derive all font sizes such as small and large. Its value should be between 1.0 and 1.4.
     */
    public Builder ratio(Double ratio) {
      this.ratio = ratio;
      return this;
    }
  }
}
