package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for checkout and account configurations.
 */
public class CheckoutAndAccountsConfigurationInput {
  /**
   * The overrides to create/update in the configuration.
   */
  private List<CheckoutAndAccountsConfigurationOverrideInput> overrides;

  /**
   * The branding settings of the configuration.
   */
  private CheckoutAndAccountsConfigurationBrandingInput branding;

  public CheckoutAndAccountsConfigurationInput() {
  }

  /**
   * The overrides to create/update in the configuration.
   */
  public List<CheckoutAndAccountsConfigurationOverrideInput> getOverrides() {
    return overrides;
  }

  public void setOverrides(List<CheckoutAndAccountsConfigurationOverrideInput> overrides) {
    this.overrides = overrides;
  }

  /**
   * The branding settings of the configuration.
   */
  public CheckoutAndAccountsConfigurationBrandingInput getBranding() {
    return branding;
  }

  public void setBranding(CheckoutAndAccountsConfigurationBrandingInput branding) {
    this.branding = branding;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationInput{overrides='" + overrides + "', branding='" + branding + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationInput that = (CheckoutAndAccountsConfigurationInput) o;
    return Objects.equals(overrides, that.overrides) &&
        Objects.equals(branding, that.branding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overrides, branding);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The overrides to create/update in the configuration.
     */
    private List<CheckoutAndAccountsConfigurationOverrideInput> overrides;

    /**
     * The branding settings of the configuration.
     */
    private CheckoutAndAccountsConfigurationBrandingInput branding;

    public CheckoutAndAccountsConfigurationInput build() {
      CheckoutAndAccountsConfigurationInput result = new CheckoutAndAccountsConfigurationInput();
      result.overrides = this.overrides;
      result.branding = this.branding;
      return result;
    }

    /**
     * The overrides to create/update in the configuration.
     */
    public Builder overrides(List<CheckoutAndAccountsConfigurationOverrideInput> overrides) {
      this.overrides = overrides;
      return this;
    }

    /**
     * The branding settings of the configuration.
     */
    public Builder branding(CheckoutAndAccountsConfigurationBrandingInput branding) {
      this.branding = branding;
      return this;
    }
  }
}
