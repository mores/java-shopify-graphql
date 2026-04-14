package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The customer accounts-specific main customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingCustomerAccountsMain {
  /**
   * The colors customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingColors colors;

  /**
   * The customer accounts main section.
   */
  private CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSection section;

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsMain() {
  }

  /**
   * The colors customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingColors getColors() {
    return colors;
  }

  public void setColors(CheckoutAndAccountsConfigurationBrandingColors colors) {
    this.colors = colors;
  }

  /**
   * The customer accounts main section.
   */
  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSection getSection() {
    return section;
  }

  public void setSection(
      CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSection section) {
    this.section = section;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingCustomerAccountsMain{colors='" + colors + "', section='" + section + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCustomerAccountsMain that = (CheckoutAndAccountsConfigurationBrandingCustomerAccountsMain) o;
    return Objects.equals(colors, that.colors) &&
        Objects.equals(section, that.section);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colors, section);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The colors customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingColors colors;

    /**
     * The customer accounts main section.
     */
    private CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSection section;

    public CheckoutAndAccountsConfigurationBrandingCustomerAccountsMain build() {
      CheckoutAndAccountsConfigurationBrandingCustomerAccountsMain result = new CheckoutAndAccountsConfigurationBrandingCustomerAccountsMain();
      result.colors = this.colors;
      result.section = this.section;
      return result;
    }

    /**
     * The colors customizations.
     */
    public Builder colors(CheckoutAndAccountsConfigurationBrandingColors colors) {
      this.colors = colors;
      return this;
    }

    /**
     * The customer accounts main section.
     */
    public Builder section(
        CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSection section) {
      this.section = section;
      return this;
    }
  }
}
