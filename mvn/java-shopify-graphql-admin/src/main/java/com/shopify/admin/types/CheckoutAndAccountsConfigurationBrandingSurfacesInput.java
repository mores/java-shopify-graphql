package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing surfaces branding.
 */
public class CheckoutAndAccountsConfigurationBrandingSurfacesInput {
  /**
   * The checkout surface customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceInput checkout;

  /**
   * The customer accounts surface customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceInput customerAccounts;

  /**
   * The sign-in surface customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingSignInSurfaceInput signIn;

  public CheckoutAndAccountsConfigurationBrandingSurfacesInput() {
  }

  /**
   * The checkout surface customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceInput getCheckout() {
    return checkout;
  }

  public void setCheckout(CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceInput checkout) {
    this.checkout = checkout;
  }

  /**
   * The customer accounts surface customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceInput getCustomerAccounts(
      ) {
    return customerAccounts;
  }

  public void setCustomerAccounts(
      CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceInput customerAccounts) {
    this.customerAccounts = customerAccounts;
  }

  /**
   * The sign-in surface customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingSignInSurfaceInput getSignIn() {
    return signIn;
  }

  public void setSignIn(CheckoutAndAccountsConfigurationBrandingSignInSurfaceInput signIn) {
    this.signIn = signIn;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingSurfacesInput{checkout='" + checkout + "', customerAccounts='" + customerAccounts + "', signIn='" + signIn + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingSurfacesInput that = (CheckoutAndAccountsConfigurationBrandingSurfacesInput) o;
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
     * The checkout surface customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceInput checkout;

    /**
     * The customer accounts surface customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceInput customerAccounts;

    /**
     * The sign-in surface customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingSignInSurfaceInput signIn;

    public CheckoutAndAccountsConfigurationBrandingSurfacesInput build() {
      CheckoutAndAccountsConfigurationBrandingSurfacesInput result = new CheckoutAndAccountsConfigurationBrandingSurfacesInput();
      result.checkout = this.checkout;
      result.customerAccounts = this.customerAccounts;
      result.signIn = this.signIn;
      return result;
    }

    /**
     * The checkout surface customizations.
     */
    public Builder checkout(CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceInput checkout) {
      this.checkout = checkout;
      return this;
    }

    /**
     * The customer accounts surface customizations.
     */
    public Builder customerAccounts(
        CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceInput customerAccounts) {
      this.customerAccounts = customerAccounts;
      return this;
    }

    /**
     * The sign-in surface customizations.
     */
    public Builder signIn(CheckoutAndAccountsConfigurationBrandingSignInSurfaceInput signIn) {
      this.signIn = signIn;
      return this;
    }
  }
}
