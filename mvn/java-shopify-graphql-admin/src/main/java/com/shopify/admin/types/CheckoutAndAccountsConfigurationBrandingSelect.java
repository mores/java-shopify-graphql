package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The selects customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingSelect {
  /**
   * The border.
   */
  private CheckoutAndAccountsConfigurationBrandingBorder border;

  /**
   * The typography.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographyStyle typography;

  public CheckoutAndAccountsConfigurationBrandingSelect() {
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
  public CheckoutAndAccountsConfigurationBrandingTypographyStyle getTypography() {
    return typography;
  }

  public void setTypography(CheckoutAndAccountsConfigurationBrandingTypographyStyle typography) {
    this.typography = typography;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingSelect{border='" + border + "', typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingSelect that = (CheckoutAndAccountsConfigurationBrandingSelect) o;
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
    private CheckoutAndAccountsConfigurationBrandingTypographyStyle typography;

    public CheckoutAndAccountsConfigurationBrandingSelect build() {
      CheckoutAndAccountsConfigurationBrandingSelect result = new CheckoutAndAccountsConfigurationBrandingSelect();
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
    public Builder typography(CheckoutAndAccountsConfigurationBrandingTypographyStyle typography) {
      this.typography = typography;
      return this;
    }
  }
}
