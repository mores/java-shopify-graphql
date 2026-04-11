package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the content container.
 */
public class CheckoutAndAccountsConfigurationBrandingContentInput {
  /**
   * Divider style and visibility on the content container.
   */
  private CheckoutAndAccountsConfigurationBrandingContainerDividerInput divider;

  public CheckoutAndAccountsConfigurationBrandingContentInput() {
  }

  /**
   * Divider style and visibility on the content container.
   */
  public CheckoutAndAccountsConfigurationBrandingContainerDividerInput getDivider() {
    return divider;
  }

  public void setDivider(CheckoutAndAccountsConfigurationBrandingContainerDividerInput divider) {
    this.divider = divider;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingContentInput{divider='" + divider + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingContentInput that = (CheckoutAndAccountsConfigurationBrandingContentInput) o;
    return Objects.equals(divider, that.divider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(divider);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Divider style and visibility on the content container.
     */
    private CheckoutAndAccountsConfigurationBrandingContainerDividerInput divider;

    public CheckoutAndAccountsConfigurationBrandingContentInput build() {
      CheckoutAndAccountsConfigurationBrandingContentInput result = new CheckoutAndAccountsConfigurationBrandingContentInput();
      result.divider = this.divider;
      return result;
    }

    /**
     * Divider style and visibility on the content container.
     */
    public Builder divider(CheckoutAndAccountsConfigurationBrandingContainerDividerInput divider) {
      this.divider = divider;
      return this;
    }
  }
}
