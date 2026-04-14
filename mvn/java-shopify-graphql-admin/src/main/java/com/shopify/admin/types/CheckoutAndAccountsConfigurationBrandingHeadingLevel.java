package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The heading level customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingHeadingLevel {
  /**
   * The typography.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographyStyle typography;

  public CheckoutAndAccountsConfigurationBrandingHeadingLevel() {
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
    return "CheckoutAndAccountsConfigurationBrandingHeadingLevel{typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingHeadingLevel that = (CheckoutAndAccountsConfigurationBrandingHeadingLevel) o;
    return Objects.equals(typography, that.typography);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typography);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The typography.
     */
    private CheckoutAndAccountsConfigurationBrandingTypographyStyle typography;

    public CheckoutAndAccountsConfigurationBrandingHeadingLevel build() {
      CheckoutAndAccountsConfigurationBrandingHeadingLevel result = new CheckoutAndAccountsConfigurationBrandingHeadingLevel();
      result.typography = this.typography;
      return result;
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
