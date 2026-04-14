package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the colors.
 */
public class CheckoutAndAccountsConfigurationBrandingDesignTokensColorsInput {
  /**
   * The input to update the color palette.
   */
  private CheckoutAndAccountsConfigurationBrandingPaletteInput palette;

  public CheckoutAndAccountsConfigurationBrandingDesignTokensColorsInput() {
  }

  /**
   * The input to update the color palette.
   */
  public CheckoutAndAccountsConfigurationBrandingPaletteInput getPalette() {
    return palette;
  }

  public void setPalette(CheckoutAndAccountsConfigurationBrandingPaletteInput palette) {
    this.palette = palette;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingDesignTokensColorsInput{palette='" + palette + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingDesignTokensColorsInput that = (CheckoutAndAccountsConfigurationBrandingDesignTokensColorsInput) o;
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
     * The input to update the color palette.
     */
    private CheckoutAndAccountsConfigurationBrandingPaletteInput palette;

    public CheckoutAndAccountsConfigurationBrandingDesignTokensColorsInput build() {
      CheckoutAndAccountsConfigurationBrandingDesignTokensColorsInput result = new CheckoutAndAccountsConfigurationBrandingDesignTokensColorsInput();
      result.palette = this.palette;
      return result;
    }

    /**
     * The input to update the color palette.
     */
    public Builder palette(CheckoutAndAccountsConfigurationBrandingPaletteInput palette) {
      this.palette = palette;
      return this;
    }
  }
}
