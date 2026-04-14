package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the Customer Accounts components.
 */
public class CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsInput {
  /**
   * The footer customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooterInput footer;

  /**
   * The header customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeaderInput header;

  /**
   * The main area customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainInput main;

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsInput() {
  }

  /**
   * The footer customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooterInput getFooter() {
    return footer;
  }

  public void setFooter(
      CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooterInput footer) {
    this.footer = footer;
  }

  /**
   * The header customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeaderInput getHeader() {
    return header;
  }

  public void setHeader(
      CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeaderInput header) {
    this.header = header;
  }

  /**
   * The main area customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainInput getMain() {
    return main;
  }

  public void setMain(CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainInput main) {
    this.main = main;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsInput{footer='" + footer + "', header='" + header + "', main='" + main + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsInput that = (CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsInput) o;
    return Objects.equals(footer, that.footer) &&
        Objects.equals(header, that.header) &&
        Objects.equals(main, that.main);
  }

  @Override
  public int hashCode() {
    return Objects.hash(footer, header, main);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The footer customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooterInput footer;

    /**
     * The header customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeaderInput header;

    /**
     * The main area customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainInput main;

    public CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsInput build() {
      CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsInput result = new CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsInput();
      result.footer = this.footer;
      result.header = this.header;
      result.main = this.main;
      return result;
    }

    /**
     * The footer customizations.
     */
    public Builder footer(
        CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooterInput footer) {
      this.footer = footer;
      return this;
    }

    /**
     * The header customizations.
     */
    public Builder header(
        CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeaderInput header) {
      this.header = header;
      return this;
    }

    /**
     * The main area customizations.
     */
    public Builder main(CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainInput main) {
      this.main = main;
      return this;
    }
  }
}
