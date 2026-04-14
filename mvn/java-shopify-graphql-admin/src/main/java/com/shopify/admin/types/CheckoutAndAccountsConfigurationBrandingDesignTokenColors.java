package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The color customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingDesignTokenColors {
  /**
   * A set of colors used together on a surface.
   */
  private CheckoutAndAccountsConfigurationBrandingPalette palette;

  public CheckoutAndAccountsConfigurationBrandingDesignTokenColors() {
  }

  /**
   * A set of colors used together on a surface.
   */
  public CheckoutAndAccountsConfigurationBrandingPalette getPalette() {
    return palette;
  }

  public void setPalette(CheckoutAndAccountsConfigurationBrandingPalette palette) {
    this.palette = palette;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingDesignTokenColors{palette='" + palette + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingDesignTokenColors that = (CheckoutAndAccountsConfigurationBrandingDesignTokenColors) o;
    return Objects.equals(palette, that.palette);
  }

  @Override
  public int hashCode() {
    return Objects.hash(palette);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A set of colors used together on a surface.
     */
    private CheckoutAndAccountsConfigurationBrandingPalette palette;

    public CheckoutAndAccountsConfigurationBrandingDesignTokenColors build() {
      CheckoutAndAccountsConfigurationBrandingDesignTokenColors result = new CheckoutAndAccountsConfigurationBrandingDesignTokenColors();
      result.palette = this.palette;
      return result;
    }

    /**
     * A set of colors used together on a surface.
     */
    public Builder palette(CheckoutAndAccountsConfigurationBrandingPalette palette) {
      this.palette = palette;
      return this;
    }
  }
}
