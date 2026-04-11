package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The customizations for the page, content, main, and order summary dividers.
 */
public class CheckoutAndAccountsConfigurationBrandingDividerStyle {
  /**
   * The border style for the divider.
   */
  private CheckoutAndAccountsConfigurationBrandingBorderStyle borderStyle;

  /**
   * The border width for the divider.
   */
  private CheckoutAndAccountsConfigurationBrandingBorderWidth borderWidth;

  public CheckoutAndAccountsConfigurationBrandingDividerStyle() {
  }

  /**
   * The border style for the divider.
   */
  public CheckoutAndAccountsConfigurationBrandingBorderStyle getBorderStyle() {
    return borderStyle;
  }

  public void setBorderStyle(CheckoutAndAccountsConfigurationBrandingBorderStyle borderStyle) {
    this.borderStyle = borderStyle;
  }

  /**
   * The border width for the divider.
   */
  public CheckoutAndAccountsConfigurationBrandingBorderWidth getBorderWidth() {
    return borderWidth;
  }

  public void setBorderWidth(CheckoutAndAccountsConfigurationBrandingBorderWidth borderWidth) {
    this.borderWidth = borderWidth;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingDividerStyle{borderStyle='" + borderStyle + "', borderWidth='" + borderWidth + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingDividerStyle that = (CheckoutAndAccountsConfigurationBrandingDividerStyle) o;
    return Objects.equals(borderStyle, that.borderStyle) &&
        Objects.equals(borderWidth, that.borderWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(borderStyle, borderWidth);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The border style for the divider.
     */
    private CheckoutAndAccountsConfigurationBrandingBorderStyle borderStyle;

    /**
     * The border width for the divider.
     */
    private CheckoutAndAccountsConfigurationBrandingBorderWidth borderWidth;

    public CheckoutAndAccountsConfigurationBrandingDividerStyle build() {
      CheckoutAndAccountsConfigurationBrandingDividerStyle result = new CheckoutAndAccountsConfigurationBrandingDividerStyle();
      result.borderStyle = this.borderStyle;
      result.borderWidth = this.borderWidth;
      return result;
    }

    /**
     * The border style for the divider.
     */
    public Builder borderStyle(CheckoutAndAccountsConfigurationBrandingBorderStyle borderStyle) {
      this.borderStyle = borderStyle;
      return this;
    }

    /**
     * The border width for the divider.
     */
    public Builder borderWidth(CheckoutAndAccountsConfigurationBrandingBorderWidth borderWidth) {
      this.borderWidth = borderWidth;
      return this;
    }
  }
}
