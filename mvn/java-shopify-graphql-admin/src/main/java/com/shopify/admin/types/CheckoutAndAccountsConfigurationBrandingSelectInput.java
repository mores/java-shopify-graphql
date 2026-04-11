package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the selects.
 */
public class CheckoutAndAccountsConfigurationBrandingSelectInput {
  /**
   * The border.
   */
  private CheckoutAndAccountsConfigurationBrandingBorder border;

  /**
   * The typography.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographyStyleInput typography;

  public CheckoutAndAccountsConfigurationBrandingSelectInput() {
  }

  /**
   * The border.
   */
  public CheckoutAndAccountsConfigurationBrandingBorder getBorder() {
    return border;
  }

  public void setBorder(CheckoutAndAccountsConfigurationBrandingBorder border) {
    this.border = border;
  }

  /**
   * The typography.
   */
  public CheckoutAndAccountsConfigurationBrandingTypographyStyleInput getTypography() {
    return typography;
  }

  public void setTypography(
      CheckoutAndAccountsConfigurationBrandingTypographyStyleInput typography) {
    this.typography = typography;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingSelectInput{border='" + border + "', typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingSelectInput that = (CheckoutAndAccountsConfigurationBrandingSelectInput) o;
    return Objects.equals(border, that.border) &&
        Objects.equals(typography, that.typography);
  }

  @Override
  public int hashCode() {
    return Objects.hash(border, typography);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The border.
     */
    private CheckoutAndAccountsConfigurationBrandingBorder border;

    /**
     * The typography.
     */
    private CheckoutAndAccountsConfigurationBrandingTypographyStyleInput typography;

    public CheckoutAndAccountsConfigurationBrandingSelectInput build() {
      CheckoutAndAccountsConfigurationBrandingSelectInput result = new CheckoutAndAccountsConfigurationBrandingSelectInput();
      result.border = this.border;
      result.typography = this.typography;
      return result;
    }

    /**
     * The border.
     */
    public Builder border(CheckoutAndAccountsConfigurationBrandingBorder border) {
      this.border = border;
      return this;
    }

    /**
     * The typography.
     */
    public Builder typography(
        CheckoutAndAccountsConfigurationBrandingTypographyStyleInput typography) {
      this.typography = typography;
      return this;
    }
  }
}
