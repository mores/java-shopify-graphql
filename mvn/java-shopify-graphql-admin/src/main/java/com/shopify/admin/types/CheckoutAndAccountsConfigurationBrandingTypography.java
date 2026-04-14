package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The typography customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingTypography {
  /**
   * The font group used for most components such as text, buttons and form controls.
   */
  private CheckoutAndAccountsConfigurationBrandingFontGroup primary;

  /**
   * The font group used for heading components by default.
   */
  private CheckoutAndAccountsConfigurationBrandingFontGroup secondary;

  /**
   * The font size (base size in pixels and scaling between different sizes).
   */
  private CheckoutAndAccountsConfigurationBrandingFontSize size;

  public CheckoutAndAccountsConfigurationBrandingTypography() {
  }

  /**
   * The font group used for most components such as text, buttons and form controls.
   */
  public CheckoutAndAccountsConfigurationBrandingFontGroup getPrimary() {
    return primary;
  }

  public void setPrimary(CheckoutAndAccountsConfigurationBrandingFontGroup primary) {
    this.primary = primary;
  }

  /**
   * The font group used for heading components by default.
   */
  public CheckoutAndAccountsConfigurationBrandingFontGroup getSecondary() {
    return secondary;
  }

  public void setSecondary(CheckoutAndAccountsConfigurationBrandingFontGroup secondary) {
    this.secondary = secondary;
  }

  /**
   * The font size (base size in pixels and scaling between different sizes).
   */
  public CheckoutAndAccountsConfigurationBrandingFontSize getSize() {
    return size;
  }

  public void setSize(CheckoutAndAccountsConfigurationBrandingFontSize size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingTypography{primary='" + primary + "', secondary='" + secondary + "', size='" + size + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingTypography that = (CheckoutAndAccountsConfigurationBrandingTypography) o;
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
     * The font group used for most components such as text, buttons and form controls.
     */
    private CheckoutAndAccountsConfigurationBrandingFontGroup primary;

    /**
     * The font group used for heading components by default.
     */
    private CheckoutAndAccountsConfigurationBrandingFontGroup secondary;

    /**
     * The font size (base size in pixels and scaling between different sizes).
     */
    private CheckoutAndAccountsConfigurationBrandingFontSize size;

    public CheckoutAndAccountsConfigurationBrandingTypography build() {
      CheckoutAndAccountsConfigurationBrandingTypography result = new CheckoutAndAccountsConfigurationBrandingTypography();
      result.primary = this.primary;
      result.secondary = this.secondary;
      result.size = this.size;
      return result;
    }

    /**
     * The font group used for most components such as text, buttons and form controls.
     */
    public Builder primary(CheckoutAndAccountsConfigurationBrandingFontGroup primary) {
      this.primary = primary;
      return this;
    }

    /**
     * The font group used for heading components by default.
     */
    public Builder secondary(CheckoutAndAccountsConfigurationBrandingFontGroup secondary) {
      this.secondary = secondary;
      return this;
    }

    /**
     * The font size (base size in pixels and scaling between different sizes).
     */
    public Builder size(CheckoutAndAccountsConfigurationBrandingFontSize size) {
      this.size = size;
      return this;
    }
  }
}
