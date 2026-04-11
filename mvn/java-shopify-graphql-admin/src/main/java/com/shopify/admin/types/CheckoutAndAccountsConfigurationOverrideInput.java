package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for checkout and account configuration overrides.
 */
public class CheckoutAndAccountsConfigurationOverrideInput {
  /**
   * The ID of the configuration override to update.
   */
  private String id;

  /**
   * The branding settings of the configuration.
   */
  private CheckoutAndAccountsConfigurationBrandingInput branding;

  public CheckoutAndAccountsConfigurationOverrideInput() {
  }

  /**
   * The ID of the configuration override to update.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
    return "CheckoutAndAccountsConfigurationOverrideInput{id='" + id + "', branding='" + branding + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationOverrideInput that = (CheckoutAndAccountsConfigurationOverrideInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(branding, that.branding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, branding);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the configuration override to update.
     */
    private String id;

    /**
     * The branding settings of the configuration.
     */
    private CheckoutAndAccountsConfigurationBrandingInput branding;

    public CheckoutAndAccountsConfigurationOverrideInput build() {
      CheckoutAndAccountsConfigurationOverrideInput result = new CheckoutAndAccountsConfigurationOverrideInput();
      result.id = this.id;
      result.branding = this.branding;
      return result;
    }

    /**
     * The ID of the configuration override to update.
     */
    public Builder id(String id) {
      this.id = id;
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
