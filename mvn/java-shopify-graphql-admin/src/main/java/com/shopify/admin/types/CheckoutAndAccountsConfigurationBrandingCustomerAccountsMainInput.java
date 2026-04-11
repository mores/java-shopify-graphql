package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the main container.
 */
public class CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainInput {
  /**
   * The colors customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingColorsInput colors;

  /**
   * The customizations for the main sections.
   */
  private CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionInput section;

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainInput() {
  }

  /**
   * The colors customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingColorsInput getColors() {
    return colors;
  }

  public void setColors(CheckoutAndAccountsConfigurationBrandingColorsInput colors) {
    this.colors = colors;
  }

  /**
   * The customizations for the main sections.
   */
  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionInput getSection() {
    return section;
  }

  public void setSection(
      CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionInput section) {
    this.section = section;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainInput{colors='" + colors + "', section='" + section + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainInput that = (CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainInput) o;
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
    private CheckoutAndAccountsConfigurationBrandingColorsInput colors;

    /**
     * The customizations for the main sections.
     */
    private CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionInput section;

    public CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainInput build() {
      CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainInput result = new CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainInput();
      result.colors = this.colors;
      result.section = this.section;
      return result;
    }

    /**
     * The colors customizations.
     */
    public Builder colors(CheckoutAndAccountsConfigurationBrandingColorsInput colors) {
      this.colors = colors;
      return this;
    }

    /**
     * The customizations for the main sections.
     */
    public Builder section(
        CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionInput section) {
      this.section = section;
      return this;
    }
  }
}
