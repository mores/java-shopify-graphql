package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The customer accounts-specific component customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponents {
  /**
   * The footer customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooter footer;

  /**
   * The header customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeader header;

  /**
   * The main customer accounts customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingCustomerAccountsMain main;

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponents() {
  }

  /**
   * The footer customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooter getFooter() {
    return footer;
  }

  public void setFooter(CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooter footer) {
    this.footer = footer;
  }

  /**
   * The header customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeader getHeader() {
    return header;
  }

  public void setHeader(CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeader header) {
    this.header = header;
  }

  /**
   * The main customer accounts customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsMain getMain() {
    return main;
  }

  public void setMain(CheckoutAndAccountsConfigurationBrandingCustomerAccountsMain main) {
    this.main = main;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponents{footer='" + footer + "', header='" + header + "', main='" + main + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponents that = (CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponents) o;
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
    private CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooter footer;

    /**
     * The header customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeader header;

    /**
     * The main customer accounts customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingCustomerAccountsMain main;

    public CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponents build() {
      CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponents result = new CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponents();
      result.footer = this.footer;
      result.header = this.header;
      result.main = this.main;
      return result;
    }

    /**
     * The footer customizations.
     */
    public Builder footer(CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooter footer) {
      this.footer = footer;
      return this;
    }

    /**
     * The header customizations.
     */
    public Builder header(CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeader header) {
      this.header = header;
      return this;
    }

    /**
     * The main customer accounts customizations.
     */
    public Builder main(CheckoutAndAccountsConfigurationBrandingCustomerAccountsMain main) {
      this.main = main;
      return this;
    }
  }
}
