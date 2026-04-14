package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing a custom font group.
 */
public class CheckoutAndAccountsConfigurationBrandingCustomFontGroupInput {
  /**
   * The base font.
   */
  private CheckoutAndAccountsConfigurationBrandingCustomFontInput base;

  /**
   * The bold font.
   */
  private CheckoutAndAccountsConfigurationBrandingCustomFontInput bold;

  /**
   * The font loading strategy.
   */
  private CheckoutAndAccountsConfigurationBrandingFontLoadingStrategy loadingStrategy;

  public CheckoutAndAccountsConfigurationBrandingCustomFontGroupInput() {
  }

  /**
   * The base font.
   */
  public CheckoutAndAccountsConfigurationBrandingCustomFontInput getBase() {
    return base;
  }

  public void setBase(CheckoutAndAccountsConfigurationBrandingCustomFontInput base) {
    this.base = base;
  }

  /**
   * The bold font.
   */
  public CheckoutAndAccountsConfigurationBrandingCustomFontInput getBold() {
    return bold;
  }

  public void setBold(CheckoutAndAccountsConfigurationBrandingCustomFontInput bold) {
    this.bold = bold;
  }

  /**
   * The font loading strategy.
   */
  public CheckoutAndAccountsConfigurationBrandingFontLoadingStrategy getLoadingStrategy() {
    return loadingStrategy;
  }

  public void setLoadingStrategy(
      CheckoutAndAccountsConfigurationBrandingFontLoadingStrategy loadingStrategy) {
    this.loadingStrategy = loadingStrategy;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingCustomFontGroupInput{base='" + base + "', bold='" + bold + "', loadingStrategy='" + loadingStrategy + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCustomFontGroupInput that = (CheckoutAndAccountsConfigurationBrandingCustomFontGroupInput) o;
    return Objects.equals(base, that.base) &&
        Objects.equals(bold, that.bold) &&
        Objects.equals(loadingStrategy, that.loadingStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, bold, loadingStrategy);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The base font.
     */
    private CheckoutAndAccountsConfigurationBrandingCustomFontInput base;

    /**
     * The bold font.
     */
    private CheckoutAndAccountsConfigurationBrandingCustomFontInput bold;

    /**
     * The font loading strategy.
     */
    private CheckoutAndAccountsConfigurationBrandingFontLoadingStrategy loadingStrategy;

    public CheckoutAndAccountsConfigurationBrandingCustomFontGroupInput build() {
      CheckoutAndAccountsConfigurationBrandingCustomFontGroupInput result = new CheckoutAndAccountsConfigurationBrandingCustomFontGroupInput();
      result.base = this.base;
      result.bold = this.bold;
      result.loadingStrategy = this.loadingStrategy;
      return result;
    }

    /**
     * The base font.
     */
    public Builder base(CheckoutAndAccountsConfigurationBrandingCustomFontInput base) {
      this.base = base;
      return this;
    }

    /**
     * The bold font.
     */
    public Builder bold(CheckoutAndAccountsConfigurationBrandingCustomFontInput bold) {
      this.bold = bold;
      return this;
    }

    /**
     * The font loading strategy.
     */
    public Builder loadingStrategy(
        CheckoutAndAccountsConfigurationBrandingFontLoadingStrategy loadingStrategy) {
      this.loadingStrategy = loadingStrategy;
      return this;
    }
  }
}
