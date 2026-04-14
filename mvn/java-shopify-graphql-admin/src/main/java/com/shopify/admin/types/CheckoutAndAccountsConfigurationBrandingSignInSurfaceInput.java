package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the sign-in surface.
 */
public class CheckoutAndAccountsConfigurationBrandingSignInSurfaceInput {
  /**
   * The sign-in components.
   */
  private CheckoutAndAccountsConfigurationBrandingSignInComponentsInput components;

  public CheckoutAndAccountsConfigurationBrandingSignInSurfaceInput() {
  }

  /**
   * The sign-in components.
   */
  public CheckoutAndAccountsConfigurationBrandingSignInComponentsInput getComponents() {
    return components;
  }

  public void setComponents(
      CheckoutAndAccountsConfigurationBrandingSignInComponentsInput components) {
    this.components = components;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingSignInSurfaceInput{components='" + components + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingSignInSurfaceInput that = (CheckoutAndAccountsConfigurationBrandingSignInSurfaceInput) o;
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
     * The sign-in components.
     */
    private CheckoutAndAccountsConfigurationBrandingSignInComponentsInput components;

    public CheckoutAndAccountsConfigurationBrandingSignInSurfaceInput build() {
      CheckoutAndAccountsConfigurationBrandingSignInSurfaceInput result = new CheckoutAndAccountsConfigurationBrandingSignInSurfaceInput();
      result.components = this.components;
      return result;
    }

    /**
     * The sign-in components.
     */
    public Builder components(
        CheckoutAndAccountsConfigurationBrandingSignInComponentsInput components) {
      this.components = components;
      return this;
    }
  }
}
