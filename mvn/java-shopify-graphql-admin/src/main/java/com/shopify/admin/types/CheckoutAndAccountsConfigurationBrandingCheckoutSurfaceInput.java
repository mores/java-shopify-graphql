package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the Checkout surface.
 */
public class CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceInput {
  /**
   * The Checkout components.
   */
  private CheckoutAndAccountsConfigurationBrandingCheckoutComponentsInput components;

  public CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceInput() {
  }

  /**
   * The Checkout components.
   */
  public CheckoutAndAccountsConfigurationBrandingCheckoutComponentsInput getComponents() {
    return components;
  }

  public void setComponents(
      CheckoutAndAccountsConfigurationBrandingCheckoutComponentsInput components) {
    this.components = components;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceInput{components='" + components + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceInput that = (CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceInput) o;
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
     * The Checkout components.
     */
    private CheckoutAndAccountsConfigurationBrandingCheckoutComponentsInput components;

    public CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceInput build() {
      CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceInput result = new CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceInput();
      result.components = this.components;
      return result;
    }

    /**
     * The Checkout components.
     */
    public Builder components(
        CheckoutAndAccountsConfigurationBrandingCheckoutComponentsInput components) {
      this.components = components;
      return this;
    }
  }
}
