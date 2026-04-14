package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The surface-specific component customizations for checkout and customer accounts.
 */
public class CheckoutAndAccountsConfigurationBrandingSurfaces {
  /**
   * The checkout-specific component overrides.
   */
  private CheckoutAndAccountsConfigurationBrandingCheckoutSurface checkout;

  /**
   * The customer accounts-specific component overrides.
   */
  private CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurface customerAccounts;

  /**
   * The sign-in-specific component overrides.
   */
  private CheckoutAndAccountsConfigurationBrandingSignInSurface signIn;

  public CheckoutAndAccountsConfigurationBrandingSurfaces() {
  }

  /**
   * The checkout-specific component overrides.
   */
  public CheckoutAndAccountsConfigurationBrandingCheckoutSurface getCheckout() {
    return checkout;
  }

  public void setCheckout(CheckoutAndAccountsConfigurationBrandingCheckoutSurface checkout) {
    this.checkout = checkout;
  }

  /**
   * The customer accounts-specific component overrides.
   */
  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurface getCustomerAccounts() {
    return customerAccounts;
  }

  public void setCustomerAccounts(
      CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurface customerAccounts) {
    this.customerAccounts = customerAccounts;
  }

  /**
   * The sign-in-specific component overrides.
   */
  public CheckoutAndAccountsConfigurationBrandingSignInSurface getSignIn() {
    return signIn;
  }

  public void setSignIn(CheckoutAndAccountsConfigurationBrandingSignInSurface signIn) {
    this.signIn = signIn;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingSurfaces{checkout='" + checkout + "', customerAccounts='" + customerAccounts + "', signIn='" + signIn + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingSurfaces that = (CheckoutAndAccountsConfigurationBrandingSurfaces) o;
    return Objects.equals(checkout, that.checkout) &&
        Objects.equals(customerAccounts, that.customerAccounts) &&
        Objects.equals(signIn, that.signIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkout, customerAccounts, signIn);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The checkout-specific component overrides.
     */
    private CheckoutAndAccountsConfigurationBrandingCheckoutSurface checkout;

    /**
     * The customer accounts-specific component overrides.
     */
    private CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurface customerAccounts;

    /**
     * The sign-in-specific component overrides.
     */
    private CheckoutAndAccountsConfigurationBrandingSignInSurface signIn;

    public CheckoutAndAccountsConfigurationBrandingSurfaces build() {
      CheckoutAndAccountsConfigurationBrandingSurfaces result = new CheckoutAndAccountsConfigurationBrandingSurfaces();
      result.checkout = this.checkout;
      result.customerAccounts = this.customerAccounts;
      result.signIn = this.signIn;
      return result;
    }

    /**
     * The checkout-specific component overrides.
     */
    public Builder checkout(CheckoutAndAccountsConfigurationBrandingCheckoutSurface checkout) {
      this.checkout = checkout;
      return this;
    }

    /**
     * The customer accounts-specific component overrides.
     */
    public Builder customerAccounts(
        CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurface customerAccounts) {
      this.customerAccounts = customerAccounts;
      return this;
    }

    /**
     * The sign-in-specific component overrides.
     */
    public Builder signIn(CheckoutAndAccountsConfigurationBrandingSignInSurface signIn) {
      this.signIn = signIn;
      return this;
    }
  }
}
