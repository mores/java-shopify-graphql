package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update the typography. Refer to the [typography
 * tutorial](https://shopify.dev/docs/apps/checkout/styling/customize-typography)
 * for more information on how to set these fields.
 */
public class CheckoutBrandingTypographyInput {
  /**
   * The font size.
   */
  private CheckoutBrandingFontSizeInput size;

  /**
   * A font group used for most components such as text, buttons and form controls.
   */
  private CheckoutBrandingFontGroupInput primary;

  /**
   * A font group used for heading components by default.
   */
  private CheckoutBrandingFontGroupInput secondary;

  public CheckoutBrandingTypographyInput() {
  }

  /**
   * The font size.
   */
  public CheckoutBrandingFontSizeInput getSize() {
    return size;
  }

  public void setSize(CheckoutBrandingFontSizeInput size) {
    this.size = size;
  }

  /**
   * A font group used for most components such as text, buttons and form controls.
   */
  public CheckoutBrandingFontGroupInput getPrimary() {
    return primary;
  }

  public void setPrimary(CheckoutBrandingFontGroupInput primary) {
    this.primary = primary;
  }

  /**
   * A font group used for heading components by default.
   */
  public CheckoutBrandingFontGroupInput getSecondary() {
    return secondary;
  }

  public void setSecondary(CheckoutBrandingFontGroupInput secondary) {
    this.secondary = secondary;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingTypographyInput{size='" + size + "', primary='" + primary + "', secondary='" + secondary + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingTypographyInput that = (CheckoutBrandingTypographyInput) o;
    return Objects.equals(size, that.size) &&
        Objects.equals(primary, that.primary) &&
        Objects.equals(secondary, that.secondary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, primary, secondary);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The font size.
     */
    private CheckoutBrandingFontSizeInput size;

    /**
     * A font group used for most components such as text, buttons and form controls.
     */
    private CheckoutBrandingFontGroupInput primary;

    /**
     * A font group used for heading components by default.
     */
    private CheckoutBrandingFontGroupInput secondary;

    public CheckoutBrandingTypographyInput build() {
      CheckoutBrandingTypographyInput result = new CheckoutBrandingTypographyInput();
      result.size = this.size;
      result.primary = this.primary;
      result.secondary = this.secondary;
      return result;
    }

    /**
     * The font size.
     */
    public Builder size(CheckoutBrandingFontSizeInput size) {
      this.size = size;
      return this;
    }

    /**
     * A font group used for most components such as text, buttons and form controls.
     */
    public Builder primary(CheckoutBrandingFontGroupInput primary) {
      this.primary = primary;
      return this;
    }

    /**
     * A font group used for heading components by default.
     */
    public Builder secondary(CheckoutBrandingFontGroupInput secondary) {
      this.secondary = secondary;
      return this;
    }
  }
}
