package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the Customer Accounts surface.
 */
public class CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceInput {
  /**
   * The Customer Accounts components.
   */
  private CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsInput components;

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceInput() {
  }

  /**
   * The Customer Accounts components.
   */
  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsInput getComponents() {
    return components;
  }

  public void setComponents(
      CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsInput components) {
    this.components = components;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceInput{components='" + components + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceInput that = (CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceInput) o;
    return Objects.equals(components, that.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(components);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The Customer Accounts components.
     */
    private CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsInput components;

    public CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceInput build() {
      CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceInput result = new CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceInput();
      result.components = this.components;
      return result;
    }

    /**
     * The Customer Accounts components.
     */
    public Builder components(
        CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsInput components) {
      this.components = components;
      return this;
    }
  }
}
