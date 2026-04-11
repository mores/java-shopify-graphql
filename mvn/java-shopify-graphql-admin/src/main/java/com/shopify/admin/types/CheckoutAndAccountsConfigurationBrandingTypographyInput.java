package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the typography.
 */
public class CheckoutAndAccountsConfigurationBrandingTypographyInput {
  /**
   * The font size.
   */
  private CheckoutAndAccountsConfigurationBrandingFontSizeInput size;

  /**
   * The font group used for most components such as text, buttons and form controls.
   */
  private CheckoutAndAccountsConfigurationBrandingFontGroupInput primary;

  /**
   * The font group used for heading components by default.
   */
  private CheckoutAndAccountsConfigurationBrandingFontGroupInput secondary;

  public CheckoutAndAccountsConfigurationBrandingTypographyInput() {
  }

  /**
   * The font size.
   */
  public CheckoutAndAccountsConfigurationBrandingFontSizeInput getSize() {
    return size;
  }

  public void setSize(CheckoutAndAccountsConfigurationBrandingFontSizeInput size) {
    this.size = size;
  }

  /**
   * The font group used for most components such as text, buttons and form controls.
   */
  public CheckoutAndAccountsConfigurationBrandingFontGroupInput getPrimary() {
    return primary;
  }

  public void setPrimary(CheckoutAndAccountsConfigurationBrandingFontGroupInput primary) {
    this.primary = primary;
  }

  /**
   * The font group used for heading components by default.
   */
  public CheckoutAndAccountsConfigurationBrandingFontGroupInput getSecondary() {
    return secondary;
  }

  public void setSecondary(CheckoutAndAccountsConfigurationBrandingFontGroupInput secondary) {
    this.secondary = secondary;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingTypographyInput{size='" + size + "', primary='" + primary + "', secondary='" + secondary + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingTypographyInput that = (CheckoutAndAccountsConfigurationBrandingTypographyInput) o;
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
    private CheckoutAndAccountsConfigurationBrandingFontSizeInput size;

    /**
     * The font group used for most components such as text, buttons and form controls.
     */
    private CheckoutAndAccountsConfigurationBrandingFontGroupInput primary;

    /**
     * The font group used for heading components by default.
     */
    private CheckoutAndAccountsConfigurationBrandingFontGroupInput secondary;

    public CheckoutAndAccountsConfigurationBrandingTypographyInput build() {
      CheckoutAndAccountsConfigurationBrandingTypographyInput result = new CheckoutAndAccountsConfigurationBrandingTypographyInput();
      result.size = this.size;
      result.primary = this.primary;
      result.secondary = this.secondary;
      return result;
    }

    /**
     * The font size.
     */
    public Builder size(CheckoutAndAccountsConfigurationBrandingFontSizeInput size) {
      this.size = size;
      return this;
    }

    /**
     * The font group used for most components such as text, buttons and form controls.
     */
    public Builder primary(CheckoutAndAccountsConfigurationBrandingFontGroupInput primary) {
      this.primary = primary;
      return this;
    }

    /**
     * The font group used for heading components by default.
     */
    public Builder secondary(CheckoutAndAccountsConfigurationBrandingFontGroupInput secondary) {
      this.secondary = secondary;
      return this;
    }
  }
}
