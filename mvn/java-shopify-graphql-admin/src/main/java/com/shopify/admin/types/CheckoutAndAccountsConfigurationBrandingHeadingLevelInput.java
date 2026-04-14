package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the heading level.
 */
public class CheckoutAndAccountsConfigurationBrandingHeadingLevelInput {
  /**
   * The typography.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographyStyleInput typography;

  public CheckoutAndAccountsConfigurationBrandingHeadingLevelInput() {
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
    return "CheckoutAndAccountsConfigurationBrandingHeadingLevelInput{typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingHeadingLevelInput that = (CheckoutAndAccountsConfigurationBrandingHeadingLevelInput) o;
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
    private CheckoutAndAccountsConfigurationBrandingTypographyStyleInput typography;

    public CheckoutAndAccountsConfigurationBrandingHeadingLevelInput build() {
      CheckoutAndAccountsConfigurationBrandingHeadingLevelInput result = new CheckoutAndAccountsConfigurationBrandingHeadingLevelInput();
      result.typography = this.typography;
      return result;
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
