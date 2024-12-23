package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The typography settings used for checkout-related text. Use these settings to customize the
 * font family and size for primary and secondary text elements.
 *
 * Refer to the [typography tutorial](https://shopify.dev/docs/apps/checkout/styling/customize-typography)
 * for further information on typography customization.
 */
public class CheckoutBrandingTypography {
  /**
   * A font group used for most components such as text, buttons and form controls.
   */
  private CheckoutBrandingFontGroup primary;

  /**
   * A font group used for heading components by default.
   */
  private CheckoutBrandingFontGroup secondary;

  /**
   * The font size design system (base size in pixels and scaling between different sizes).
   */
  private CheckoutBrandingFontSize size;

  public CheckoutBrandingTypography() {
  }

  /**
   * A font group used for most components such as text, buttons and form controls.
   */
  public CheckoutBrandingFontGroup getPrimary() {
    return primary;
  }

  public void setPrimary(CheckoutBrandingFontGroup primary) {
    this.primary = primary;
  }

  /**
   * A font group used for heading components by default.
   */
  public CheckoutBrandingFontGroup getSecondary() {
    return secondary;
  }

  public void setSecondary(CheckoutBrandingFontGroup secondary) {
    this.secondary = secondary;
  }

  /**
   * The font size design system (base size in pixels and scaling between different sizes).
   */
  public CheckoutBrandingFontSize getSize() {
    return size;
  }

  public void setSize(CheckoutBrandingFontSize size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingTypography{primary='" + primary + "', secondary='" + secondary + "', size='" + size + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingTypography that = (CheckoutBrandingTypography) o;
    return Objects.equals(primary, that.primary) &&
        Objects.equals(secondary, that.secondary) &&
        Objects.equals(size, that.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primary, secondary, size);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A font group used for most components such as text, buttons and form controls.
     */
    private CheckoutBrandingFontGroup primary;

    /**
     * A font group used for heading components by default.
     */
    private CheckoutBrandingFontGroup secondary;

    /**
     * The font size design system (base size in pixels and scaling between different sizes).
     */
    private CheckoutBrandingFontSize size;

    public CheckoutBrandingTypography build() {
      CheckoutBrandingTypography result = new CheckoutBrandingTypography();
      result.primary = this.primary;
      result.secondary = this.secondary;
      result.size = this.size;
      return result;
    }

    /**
     * A font group used for most components such as text, buttons and form controls.
     */
    public Builder primary(CheckoutBrandingFontGroup primary) {
      this.primary = primary;
      return this;
    }

    /**
     * A font group used for heading components by default.
     */
    public Builder secondary(CheckoutBrandingFontGroup secondary) {
      this.secondary = secondary;
      return this;
    }

    /**
     * The font size design system (base size in pixels and scaling between different sizes).
     */
    public Builder size(CheckoutBrandingFontSize size) {
      this.size = size;
      return this;
    }
  }
}
