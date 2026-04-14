package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the checkboxes.
 */
public class CheckoutAndAccountsConfigurationBrandingCheckboxInput {
  /**
   * The corner radius.
   */
  private CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius;

  public CheckoutAndAccountsConfigurationBrandingCheckboxInput() {
  }

  /**
   * The corner radius.
   */
  public CheckoutAndAccountsConfigurationBrandingCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingCheckboxInput{cornerRadius='" + cornerRadius + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCheckboxInput that = (CheckoutAndAccountsConfigurationBrandingCheckboxInput) o;
    return Objects.equals(cornerRadius, that.cornerRadius);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cornerRadius);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The corner radius.
     */
    private CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius;

    public CheckoutAndAccountsConfigurationBrandingCheckboxInput build() {
      CheckoutAndAccountsConfigurationBrandingCheckboxInput result = new CheckoutAndAccountsConfigurationBrandingCheckboxInput();
      result.cornerRadius = this.cornerRadius;
      return result;
    }

    /**
     * The corner radius.
     */
    public Builder cornerRadius(CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }
  }
}
